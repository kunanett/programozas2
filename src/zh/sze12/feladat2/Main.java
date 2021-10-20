package zh.sze12.feladat2;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Kérem adjon meg szavakat parancssori argumentumként!");
        }else{
            for (String word : args){
                System.out.printf("%s: %s hangrendű%n", word, StringUtils.hangrend(word));
            }
        }
    }
}
