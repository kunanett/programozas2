package zh.potZH_gyak.gyak2.feladat1;

public class Main {
    public static void main(String[] args) {
        Processor p1 = new Processor("Intel Core i5-2500 @ 3.30GHz");
        Processor p2 = new Processor("Intel Core i5-2500K @ 3.30GHz");
        Processor p3 = new Processor("amd");

        System.out.println(p1.getClockSpeed());
        System.out.println(p3.getClockSpeed());
        System.out.println(p1.cmpClockSpeed(p2));
    }
}
