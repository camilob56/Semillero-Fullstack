package tiendaLinea;

import javax.swing.JOptionPane;

import tiendaLinea.implementaciones.Biografia;
import tiendaLinea.implementaciones.Camiseta;
import tiendaLinea.implementaciones.Laptop;
import tiendaLinea.implementaciones.LibroTexto;
import tiendaLinea.implementaciones.Novela;
import tiendaLinea.implementaciones.Pantalon;
import tiendaLinea.implementaciones.Smartphone;
import tiendaLinea.implementaciones.Television;
import tiendaLinea.implementaciones.Zapatos;

public class App {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        String[] opciones = {"Porductos de electronica", "Porductos de lectura", "Porductos de vestir", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione la categoria del producto:","Menú de categorias de productos",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
        // Categorias de productos
        switch(seleccion){
            // electronica
            case 0:
                String[] opciones1 = {"Smartphone", "Laptop", "Television", "Salir"};
                int seleccion1 = JOptionPane.showOptionDialog(null,"Seleccione el tipo de producto:","Menú de tipos de productos",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones1,opciones1[0]);
                // productos
                switch(seleccion1){
                    // Smartphone
                    case 0:
                    while (true) {
                        String[] opciones2 = {"Ver detalles del celular", "Mostrar precio del celular", "Salir"};
                        int seleccion2 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones2,
                            opciones2[0]
                        );
                        // menu Smartphone
                        switch (seleccion2) {
                            case 0:
                                Smartphone celular = new Smartphone("Apple", 2000.0334, "iPhone XS", "iOS");
                                celular.mostrarDetalles();
                                break;
                            case 1:
                                celular = new Smartphone("Apple", 2000.0334, "iPhone XS", "iOS");
                                double precio = celular.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio del Smartphone es: " + precio);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                                break;
                        }
                    }
                    // Laptop
                    case 1:
                    while (true) {
                        String[] opciones3 = {"Ver detalles de la latop", "Mostrar precio de la latop", "Salir"};
                        int seleccion3 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones3,
                            opciones3[0]
                        );
                        // menu laptop
                        switch (seleccion3) {
                            case 0:
                                Laptop laptop = new Laptop("Dell", 999.99, "XPS 15", "Windows 10");
                                laptop.mostrarDetalles();
                            break;
                            case 1:
                                laptop = new Laptop("Dell", 999.99, "XPS 15", "Windows 10");
                                double precio = laptop.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio la laptop es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;

                        }
                    }
                    // Television
                    case 2:
                    while (true) {
                        String[] opciones4 = {"Ver detalles de la television", "Mostrar precio de la television", "Salir"};
                        int seleccion4 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones4,
                            opciones4[0]
                        );
                        // menu television
                        switch (seleccion4) {
                            case 0:
                                Television television = new Television ("Sony", 1099.99, "Bravia X900H", "LED");
                                television.mostrarDetalles();
                            break;
                            case 1:
                                television = new Television ("Sony", 1099.99, "Bravia X900H", "LED");
                                double precio = television.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio la television es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;

                        }
                    }
                    
                    

                }
            break;

            // Lectura
            case 1:
                String[] opciones5 = {"Novela", "Biografia", "Libro de texto", "Salir"};
                int seleccion5 = JOptionPane.showOptionDialog(null,"Seleccione el tipo de producto:","Menú de tipos de productos",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones5,opciones5[0]);
                // productos
                switch(seleccion5){
                    // Novela
                    case 0:
                    while (true) {
                        String[] opciones6 = {"Ver detalles de la novela", "Mostrar precio de la novela", "Salir"};
                        int seleccion6 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones6,
                            opciones6[0]
                        );
                        // menu novela
                        switch (seleccion6) {
                            case 0:
                                Novela novela = new Novela("Cien años de soledad", 29.99, "Gabriel García Márquez", 432);
                                novela.mostrarDetalles();
                            break;
                            case 1:
                                novela = new Novela("Cien años de soledad", 29.99, "Gabriel García Márquez", 432);
                                double precio = novela.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio la novela es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;
                        }
                    }
                    // Biografia
                    case 1:
                    while (true) {
                        String[] opciones7 = {"Ver detalles de la biografia", "Mostrar precio de la biografia", "Salir"};
                        int seleccion7 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones7,
                            opciones7[0]
                        );
                        // menu biografia
                        switch (seleccion7) {
                            case 0:
                                Biografia biografia = new Biografia("Steve Jobs: La biografía", 24.99, "Walter Isaacson", "Steve Jobs");
                                biografia.mostrarDetalles();
                            break;
                            case 1:
                                biografia = new Biografia("Steve Jobs: La biografía", 24.99, "Walter Isaacson", "Steve Jobs");
                                double precio = biografia.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio la biografia es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;
                        }
                    }
                    // Libro de texto
                    case 2:
                    while (true) {
                        String[] opciones8 = {"Ver detalles del libro de texto", "Mostrar precio del libro de texto", "Salir"};
                        int seleccion8 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones8,
                            opciones8[0]
                        );
                        // menu libro de texto
                        switch (seleccion8) {
                            case 0:
                                LibroTexto libroT = new LibroTexto("Matemáticas Avanzadas", 49.99, "John Smith", "Álgebra Lineal");
                                libroT.mostrarDetalles();
                            break;
                            case 1:
                                libroT = new LibroTexto("Matemáticas Avanzadas", 49.99, "John Smith", "Álgebra Lineal");
                                double precio = libroT.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio el libro de texto es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;
                        }
                    }
                }
            break;


            // Vestir - Ropa
            case 2:
                String[] opciones9 = {"Camiseta", "Pantalon", "Zapatos", "Salir"};
                int seleccion9 = JOptionPane.showOptionDialog(null,"Seleccione el tipo de producto:","Menú de tipos de productos",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones9,opciones9[0]);
                // productos
                switch(seleccion9){
                    // Camiseta
                    case 0:
                    while (true) {
                        String[] opciones10 = {"Ver detalles de la camiseta", "Mostrar precio de la camiseta", "Salir"};
                        int seleccion10 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones10,
                            opciones10[0]
                        );
                        switch (seleccion10) {
                            case 0:
                                Camiseta camiseta = new Camiseta("Manga corta", 19.99, "L", "Rojo");
                                camiseta.mostrarDetalles();
                            break;
                            case 1:
                                camiseta = new Camiseta("Manga corta", 19.99, "L", "Rojo");
                                double precio = camiseta.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio la camiseta es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;
                        }    
                    }

                    // Pantalon
                    case 1:
                    while (true) {
                        String[] opciones11 = {"Ver detalles de el pantalon", "Mostrar precio de el pantalon", "Salir"};
                        int seleccion11 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones11,
                            opciones11[0]
                        );
                        // menu pantalon
                        switch (seleccion11) {
                            case 0:
                                Pantalon pantalon = new Pantalon("Jeans", 39.99, "M", "Casual");
                                pantalon.mostrarDetalles();
                            break;
                            case 1:
                                pantalon = new Pantalon("Jeans", 39.99, "M", "Casual");
                                double precio = pantalon.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio de el pantalon es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;
                        }
                    }
                    
                    // Zapatos
                    case 2:
                    while (true) {
                        String[] opciones12 = {"Ver detalles de los zapatos", "Mostrar precio de los zapatos", "Salir"};
                        int seleccion12 = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione una acción:",
                            "Menú de opciones",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opciones12,
                            opciones12[0]
                        );
                        // menu zapatos
                        switch (seleccion12) {
                            case 0:
                                Zapatos zapatos = new Zapatos("Botas", 79.99, "42", "Cuero");
                                zapatos.mostrarDetalles();
                            break;
                            case 1:
                                zapatos = new Zapatos("Botas", 79.99, "42", "Cuero");
                                double precio = zapatos.calcularPrecio();
                                JOptionPane.showMessageDialog(null, "El precio el libro de los zapatos es: " + precio);
                            break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha salido del programa", "Salir", JOptionPane.PLAIN_MESSAGE);
                                System.exit(0);
                            break;
                        }
                    }



                }
            break;


        }



    }

}
