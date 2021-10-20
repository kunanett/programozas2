package zh.sze14.feladat2;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Kérem egyetlen szót adjon meg parancssori argumentumként!");
        } else {
            int[] result = StringUtils.countVowelsAndConsonants(args[0]);
            System.out.printf("%s%nmagánhangzók száma: %d%nmássalhangzók száma: %d", args[0], result[0], result[1]);
        }
    }
}
