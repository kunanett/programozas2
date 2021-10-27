package zh.potZH_gyak.gyak1.feladat1;

public class Main {
    public static void main(String[] args) {
        Monitor m0 = new Monitor("1024x 768");
        Monitor m2 = new Monitor("1920x1080");

        System.out.println(m0);
        System.out.println(m0.getHeight());
        System.out.println(m0.getWidth());

        System.out.println(m2.getNumberOfPixels());
        System.out.println(m0.isFullHD());
        System.out.println(m2.isFullHD());

        System.out.println(m0.getRatio());
        System.out.println(m0.compare(m0));
    }
}
