package homework.week3;

public class Hamming {

    private Hamming() {
    }

    public static int distance(String string1, String string2) {
        int dist = 0;
        if (string1.length() != string2.length()) {
            dist = -1;
        } else {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) != string2.charAt(i)) {
                    dist++;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        System.out.println(Hamming.distance("toned", "roses"));
    }
}
