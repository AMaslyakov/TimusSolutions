import java.util.Scanner;

public class Solution1068{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();

      int sum;
      if(N>0){
        sum = (N*(N+1))/2;
      }else{
        int an = Math.abs(N);
        sum = -((an*(an+1))/2)+1;
      }
      System.out.println(sum);

    }
} 
