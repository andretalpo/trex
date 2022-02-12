package br.com.talpo.trex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TRexBuilderImplTest {

    @Test
    public void deveBaterRegexComTexto() {
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

        String match = "";
        while (matcherFalso.find()) {
            match = match + matcherFalso.group();
        }

        assertEquals("", match);

        while (matcherVerdadeiro.find()) {
            match = match + matcherVerdadeiro.group();
        }

        assertEquals("12", match);
    }
}
