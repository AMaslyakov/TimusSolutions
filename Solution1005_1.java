import java.util.*;

public class Solution1005_1 {

  static int sum(ArrayList<Integer> a){
    int sum = 0;
    for (int w : a) {
       sum += w;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    ArrayList<Integer> right = new ArrayList<Integer>();

    ArrayList<Integer> left = new ArrayList<Integer>();


    for (int i=0;i<N;i++){
       right.add(input.nextInt());
    }
    Collections.sort(right);
    int max_w = right.get(right.size()-1);
    
    right.remove(right.size()-1);
    left.add(max_w);

    int delta = Math.abs(
      sum(left) - sum(right));

    while(true){
      int min_w = right.get(0);
      right.remove(0);
      left.add(min_w);
      int new_delta = Math.abs(sum(right) - sum(left));
      if (new_delta > delta){
        break;
      } else {
        delta = new_delta;
        continue;
      }
    }

    //System.out.println(right);
    //System.out.println(max_w);
    //System.out.println(left);
    System.out.println(delta);
  }
}
