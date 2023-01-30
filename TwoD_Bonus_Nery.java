import java.util.Scanner;
public class TwoD_Bonus_Nery {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int a = sc.nextInt();

        System.out.print("Enter the columns: ");
        int b = sc.nextInt();

        int[][] num= new int[a][b];
        for (int rows = 0; rows < a; rows++) {
            for (int index = 0; index < b; index++) {
                System.out.println("Enter element for row [" + (rows+1) + "] column ["+ (index+1) + "]");
                num[rows][index] = sc.nextInt();
            }
        }

        int i, j, temp;
        int n=num.length;
        int m=num[0].length;
        for (i = 0; i < n * m - 1; ++i) {
            for (j = 0; j < n * m - 1 - i; ++j) {
                if (num[j / m][j % m] > num[(j + 1) / m][(j + 1) % m]) {
                temp = num[(j + 1) / m][(j + 1) % m];
                num[(j + 1) / m][(j + 1) % m] = num[j / m][j % m];
                num[j / m][j % m] = temp;
                }
            }
        }

        System.out.println("The 2d sort is: ");
        for (int c = 0; c < a; c++) {
            for (int d = 0; d < b; d++) {
                System.out.print(num[c][d] + " ");
            }
        }

    }
}
