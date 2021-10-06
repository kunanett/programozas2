package examples.week5;

public class CommandLineArgsExample {
    public static void main(String[] args) {
        if (args.length != 2){
            throw new IllegalArgumentException("Két számot adjon meg!");
        }else{
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            System.out.printf("A két szám összege: %d", number1+number2);
        }
    }
}

