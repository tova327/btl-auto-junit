package pageObject;

public enum Menu {
    A("מיצוי זכויות"),
    B("קצבאות והטבות"),
    C("דמי ביטוח"),
    D("יצירת קשר");

    private final String value;
    Menu(String s) {
        value = s;
    }
    public String getValue(){
        return value;
    }
}
