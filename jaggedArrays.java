import java.util.Scanner;
public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3]; 
        jagged[2] = new int[1]; 
        System.out.println("Enter elements for the jagged array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
