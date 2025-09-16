package ej7_Composite;


import java.util.ArrayList;
import java.util.List;

class Menu implements ElementoMenu {
    private String nombreMenu;
    private List<ElementoMenu> items = new ArrayList<>();

    public Menu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public void addItem(ElementoMenu menu) {
        items.add(menu);
    }

    @Override
    public void muestra(String mensaje) {
        System.out.println(mensaje + "+Comida del día: " + nombreMenu);
        for (ElementoMenu item : items) {
            item.muestra(mensaje + "  ");
        }
    }
}
