package ej7_Composite;

public class MainComposite {
    public static void main(String[] args) {

        ElementoMenu plato1 = new Plato("Ravioles con ricota");
        ElementoMenu plato2 = new Plato("Ravioles de verduras");
        ElementoMenu plato3 = new Plato("Hamburgesa");

        Menu menu2 = new Menu("Submenu");
        menu2.addItem(plato3);

        Menu menu = new Menu("Menu principal");
        menu.addItem(plato1);
        menu.addItem(plato2);
        menu.addItem(menu2);



        menu.muestra("");


    }
}
