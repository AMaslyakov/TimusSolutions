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
  
    int delta;
    if (right.size() == 1){
      delta = right.get(0);
    }
    else {
    int max_w = Collections.max(right);
    right.remove(right.indexOf(max_w));
    left.add(max_w);
    
    delta = Math.abs(sum(left) - sum(right));

      while(true){
        int min_w = Collections.min(right);
        right.remove( right.indexOf(min_w));
        left.add(min_w);
        int new_delta = Math.abs(sum(left) - sum(right));
        if (new_delta > delta){
            break;
        } else {
            delta = new_delta;
            continue;
            } 
      }
    } 
    System.out.println(delta);
  }
}
