public class App35 {
    public static void main(String[] args) {
        // 35.
        int[][] tablas = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Tabla de multiplicar del numero " + (i + 1));
            for (int j = 0; j < 10; j++) {
                System.out.print((i + 1) + " x " + (j + 1) + " = " + tablas[i][j] + "\t" + "\n");
            }
            System.out.println();
        }

    }
}
