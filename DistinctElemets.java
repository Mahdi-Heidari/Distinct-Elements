package distinctelemets;

import java.util.Scanner;

public class DistinctElemets {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] nom = new int[4];

        System.out.print("Enter 4 Integers:\t");

        for (int i = 0; i < nom.length; i++) {
            nom[i] = reader.nextInt();
        }
        for (int i = 0; i < nom.length; i++) {

            int j;
            for (j = 0; j < i; j++) {
                if (nom[i] == nom[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(nom[i] + " ");
            }
        }
        System.out.println("Unique Number(s)!");

    }

}
