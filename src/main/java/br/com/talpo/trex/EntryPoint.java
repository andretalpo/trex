package br.com.talpo.trex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryPoint {

    public static void main(String... args) {
        String regex = new TRexBuilderImpl()
                .startsWith()
                .number()
                .quantity(2)
                .getRegex();

        String testeFalso = "Oi meu chapa";
        String testeVerdadeiro = "12 meu chapa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcherFalso = pattern.matcher(testeFalso);
        Matcher matcherVerdadeiro = pattern.matcher(testeVerdadeiro);

        System.out.println("Regex: " + regex);

        System.out.println("Teste incorreto: ");
        while (matcherFalso.find()) {
            System.out.println(matcherFalso.group());
        }

        System.out.println("Teste correto: ");
        while (matcherVerdadeiro.find()) {
            System.out.println(matcherVerdadeiro.group());
        }
    }
}
