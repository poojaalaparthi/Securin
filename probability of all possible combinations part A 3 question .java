
//3) probability of sums occurring 


public class Combos {
    public static void main(String[] args) {
        int[] frequency = new int[100]; 
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int sum = i + j;
                frequency[sum]++;
            }
        }
        int total = 6 * 6; // there are 6 faces on each die, and we roll two dice
        for (int i = 2; i < frequency.length; i++) {
            double probability = (double) frequency[i] / total;
            System.out.println("Sum: " + i + ", Probability: " + probability);
        }
    }
}
