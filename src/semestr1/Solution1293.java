import java.util.Scanner;

public class Solution1293 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int A = input.nextInt();
    int B = input.nextInt();
    int area = 2 * A * B  * N;
    System.out.println(area);
  }
}
