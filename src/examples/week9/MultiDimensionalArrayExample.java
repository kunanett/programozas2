package examples.week9;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {

        //int[][] array = new int[3][3];

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Sorok száma: " + array.length);
        System.out.println("oszlopok száma: " + array[0].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
