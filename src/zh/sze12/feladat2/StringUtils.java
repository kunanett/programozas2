package zh.sze12.feladat2;

public class StringUtils {
    public static String hangrend(String input) {
        String magas = "eéiíüűöő";
        String mely = "aáoóuú";
        String hangrend = "";
        boolean vanBenneMagas = false;
        boolean vanBenneMely = false;

        for (char c : input.toLowerCase().toCharArray()) {
            if (magas.contains(String.valueOf(c))) {
                vanBenneMagas = true;
            }
            if (mely.contains(String.valueOf(c))) {
                vanBenneMely = true;
            }
        }

        if (vanBenneMagas && vanBenneMely) {
            hangrend = "vegyes";
        } else if (vanBenneMagas) {
            hangrend = "magas";
        } else if (vanBenneMely) {
            hangrend = "mély";
        } else {
            hangrend = "semmilyen";
        }
        return hangrend;
    }
}
