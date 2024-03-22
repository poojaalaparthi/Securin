//1. How many total combinations are possible?
public class Combos {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.println("Die A: " + i + ", Die B: " + j + ", Sum: " + (i + j));
            }
        }
    }
}