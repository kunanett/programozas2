package zh.potZH_gyak.gyak1.feladat4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("src/zh/potZH_gyak/gyak1/feladat4/pelda.txt");
        System.out.println(Checksum.getChecksum(lines));
    }
}
