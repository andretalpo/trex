package br.com.talpo.trex;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;

public class EntryPoint {

    public static void main(String... args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Arrays.stream(args).forEach((arg) -> {
            switch (arg) {
                case "-h":
                case "-help":
                    System.out.println("ajudando");
                    return;
            }
        });

        System.out.println("Insira as funções que deseja:");
        Arrays.stream(TRexBuilder.class.getMethods())
                .filter(method -> !"getRegex".equals(method.getName()))
                .forEach((method) -> System.out.println(method.getName()));

        String input = "";
        TRexBuilderImpl tRexBuilder = new TRexBuilderImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            input = scanner.next();
            if (";".equals(input)) break;
            TRexBuilder.class.getMethod(input, null).invoke(tRexBuilder);
        }

        System.out.println(tRexBuilder.getRegex());

        //TODO passar parametros
    }
}
