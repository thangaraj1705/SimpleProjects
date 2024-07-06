package org.example;

public class MenuList {
    String value;
    String onclick;

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "value : " + value  +
                "onclick :" + onclick + "\n";
    }
}
