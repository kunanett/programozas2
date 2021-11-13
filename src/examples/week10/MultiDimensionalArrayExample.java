package examples.week10;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {

        //int[][] array = new int[3][3];

        int[][] array = {{1, 2, 3},
                {4, 5, 6}};
        System.out.println("Sorok száma: " + array.length);
        System.out.println("oszlopok száma: " + array[0].length);

        //bajárás soronként
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

        //bejárás oszloponként
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
