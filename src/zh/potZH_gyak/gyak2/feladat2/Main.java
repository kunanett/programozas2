package zh.potZH_gyak.gyak2.feladat2;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hiba");
            System.exit(1);
        } else {
            System.out.println("hash: " + Hash.stringHash(args[0]));
        }
    }
}
