package org.example;

public class Menu {

    private String id;
    private String value;
    private PopUp popup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PopUp getPopup() {
        return popup;
    }

    public void setPopup(PopUp popup) {
        this.popup = popup;
    }

    @Override
    public String toString() {
        return
                "id : " + id + '\n' +
               "value : "+ value +'\n' +
                        "Popup : " +"\n"+popup ;
    }
}
