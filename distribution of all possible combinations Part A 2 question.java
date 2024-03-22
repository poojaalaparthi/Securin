 // 2) display the distribution of all possible combinations
public class Combos {
    public static void main(String[] args) {
        int[] frequency = new int[100];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int sum = i + j;
                frequency[sum]++;
            }
        }
        for (int i = 2; i < frequency.length; i++) {
            System.out.println("Sum: " + i + ", Frequency: " + frequency[i]);
        }
    }
}