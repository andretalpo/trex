package br.com.talpo.trex;

public interface TRexBuilder {
    TRexBuilder anyCharacter();

    TRexBuilder startsWith();

    TRexBuilder endsWith();

    TRexBuilder number();

    TRexBuilder parameter(String param);

    TRexBuilder or();

    TRexBuilder nonNumber();

    TRexBuilder whiteSpace();

    TRexBuilder nonWhiteSpace();

    TRexBuilder quantity(int quantity);

    TRexBuilder quantity(int min, int max);

    TRexBuilder word();

    TRexBuilder nonWord();

    TRexBuilder zeroOrMore();

    TRexBuilder oneOrMore();

    TRexBuilder zeroOrOne();

    TRexBuilder anyOfTheseChars(String chars);

    TRexBuilder exceptTheseChars(String chars);

    TRexBuilder range(String min, String max);

    TRexBuilder ranges(String min1, String max1, String min2, String max2);

    String getRegex();
}
