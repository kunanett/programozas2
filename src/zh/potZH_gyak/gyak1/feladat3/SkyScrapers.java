package zh.potZH_gyak.gyak1.feladat3;

public class SkyScrapers {

    private SkyScrapers() {

    }

    public static int process(String skyScrapers) {
        int result = 0;
        for (int i = 0; i < skyScrapers.length() - 1; i++) {
            int skyScraper1 = Integer.parseInt(String.valueOf(skyScrapers.charAt(i)));
            int skyScraper2 = Integer.parseInt(String.valueOf(skyScrapers.charAt(i + 1)));
            result += Math.abs(skyScraper1 -skyScraper2);
        }
        return result;
    }
}
