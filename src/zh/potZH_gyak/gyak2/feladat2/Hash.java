package zh.potZH_gyak.gyak2.feladat2;

public class Hash {

    private static final int SZAZ_HAROM = 103;

    private Hash() {

    }

    public static int stringHash(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result += (int) input.charAt(i) * (i + 1);
        }
        return result % SZAZ_HAROM;
    }
}
