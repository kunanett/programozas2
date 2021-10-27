package zh.potZH_gyak.gyak1.feladat3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Az egyes felhőkarcolók magassága: ");
        String input = sc.nextLine();
        System.out.println("A válasz: " + SkyScrapers.process(input));
    }
}
