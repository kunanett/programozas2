package zh.potZH_gyak.gyak1.feladat4;

import java.util.List;

public class Checksum {
    private Checksum() {
    }

    public static int getChecksum(List<String> lines) {
        int result = 0;

        for (String line : lines) {
            String[] numbers = line.split(" ");
            int num1 = Integer.parseInt(numbers[0].strip());
            int num2 = Integer.parseInt(numbers[numbers.length - 1].strip());
            result += num1 % num2;
        }
        return result;
    }
}
