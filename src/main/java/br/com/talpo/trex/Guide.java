package br.com.talpo.trex;

public enum Guide {

    ANY_CHARACTER("."),
    STARTS_WITH("^param"),
    ENDS_WITH("param$"),
    ANY_OF_THESE_CHARS("[pqr]"),
    EXCEPT_THESE_CHARS("[^pqr]"),
    RANGE("[1-4]"),
    RANGES("[a-d1-7]"),
    OR("X|Z"),
    ANY_NUMBER("\\d"),
    ANY_NON_NUMBER("\\D"),
    WHITE_SPACE("\\s"),
    NON_WHITE_SPACE("\\S"),
    WORD("\\w"),
    NON_WORD("\\W"),
    ZERO_OR_MORE("*"),
    ONE_OR_MORE("+"),
    ZERO_OR_ONE("?"),
    QUANTITY_OF("{1}"),
    QUANTITY_MIN_MAX("{1,3}"),
    FIRST_MATCH("quantifier(+,*,{})?")
    ;

    public String regex;
    Guide(String regex) {
        this.regex = regex;
    }
}
