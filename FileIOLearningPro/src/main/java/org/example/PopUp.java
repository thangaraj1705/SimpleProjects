package org.example;

import java.util.List;

public class PopUp {
    private List<MenuList> menuitem;


    public List<MenuList> getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(List<MenuList> menuitem) {
        this.menuitem = menuitem;
    }

    @Override
    public String toString() {
        return
                "menuitem : "+"\n" + menuitem;
    }
}
