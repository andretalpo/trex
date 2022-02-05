package br.com.talpo.trex;

public class TRexBuilderImpl implements TRexBuilder {

    private String regex = "";

    @Override
    public TRexBuilder anyCharacter() {
        regex = regex + ".";
        return this;
    }

    @Override
    public TRexBuilder startsWith() {
        regex = regex + "^";
        return this;
    }

    @Override
    public TRexBuilder endsWith() {
        regex = regex + "$";
        return this;
    }

    @Override
    public TRexBuilder number() {
        regex = regex + "\\d";
        return this;
    }

    @Override
    public TRexBuilder parameter(String param) {
        regex = regex + param;
        return this;
    }

    @Override
    public TRexBuilder or() {
        regex = regex + "|";
        return this;
    }

    @Override
    public TRexBuilder nonNumber() {
        regex = regex + "\\D";
        return this;
    }

    @Override
    public TRexBuilder whiteSpace() {
        regex = regex + "\\s";
        return this;
    }

    @Override
    public TRexBuilder nonWhiteSpace() {
        regex = regex + "\\S";
        return this;
    }

    @Override
    public TRexBuilder quantity(int quantity) {
        regex = regex + "{" + quantity + "}";
        return this;
    }

    @Override
    public TRexBuilder quantity(int min, int max) {
        regex = regex + "{" + min + "," + max + "}";
        return this;
    }

    @Override
    public TRexBuilder word() {
        regex = regex + "\\w";
        return this;
    }

    @Override
    public TRexBuilder nonWord() {
        regex = regex + "\\W";
        return this;
    }

    @Override
    public TRexBuilder zeroOrMore() {
        regex = regex + "*";
        return this;
    }

    @Override
    public TRexBuilder oneOrMore() {
        regex = regex + "+";
        return this;
    }

    @Override
    public TRexBuilder zeroOrOne() {
        regex = regex + "?";
        return this;
    }

    @Override
    public TRexBuilder anyOfTheseChars(String chars) {
        regex = regex + "[" + chars + "]";
        return this;
    }

    @Override
    public TRexBuilder exceptTheseChars(String chars) {
        regex = regex + "[^" + chars + "]";
        return this;
    }

    @Override
    public TRexBuilder range(String min, String max) {
        regex = regex + "[" + min + "-" + max + "]";
        return this;
    }

    @Override
    public TRexBuilder ranges(String min1, String max1, String min2, String max2) {
        regex = regex + "[" + min1 + "-" + max1 + min2 + "-" + max2 + "]";
        return this;
    }

    @Override
    public String getRegex() {
        return this.regex;
    }
}
