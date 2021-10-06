package examples.week5;

import java.util.Arrays;
import java.util.List;

public class Feladat4Main {
    /**
     * Adott egy mellékelt  tablazat.txt, minden sorban néhány szám van, tabulátorjellel elválasztva.
     * Számítsuk ki a táblázat ellenőrzőösszegét: minden sorban határozzuk meg a legnagyobb és legkisebb szám különbségét,
     * majd soronként vegyük ezen különbségek összegét
     */


    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("src/examples/week5/tablazat.txt");
    }
}
