//PART B 
//re-attach the spots off the dicee


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};
        int[] New_Die_A = new int[6];
        int[] New_Die_B = new int[6];

        undoom_dice(Die_A, Die_B, New_Die_A, New_Die_B);

        System.out.println("New Die A: " + Arrays.toString(New_Die_A));
        System.out.println("New Die B: " + Arrays.toString(New_Die_B));
    }

    public static void undoom_dice(int[] Die_A, int[] Die_B, int[] New_Die_A, int[] New_Die_B) {
        for (int i = 0; i < 6; ++i) {
            New_Die_A[i] = Math.min(Die_A[i], 4);  //  no more than 4 spots on each face
            New_Die_B[i] = Math.min(Die_B[i], 6);  //  Die B can have up to 6 spots on a face
        }
    }
}