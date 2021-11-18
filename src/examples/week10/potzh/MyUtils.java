package examples.week10.potzh;

public class MyUtils {

    public static boolean isValidIP(String ip) {
        boolean valid = true;
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            valid = false;
        } else {
            for (String number : parts) {
                if (Integer.parseInt(number) < 0 || Integer.parseInt(number) > 255) {
                    valid = false;
                }
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("127.0.0.1"));
        System.out.println(isValidIP("345.23.33.44"));
    }
}
