import java.util.*;

public class Solution1005_2 {

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
    ArrayList<Integer> weights = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();

    ArrayList<Integer> left = new ArrayList<>();

    for (int i=0;i<N;i++){
       weights.add(input.nextInt());
        }

    int sum_weights = sum(weights);
    Collections.sort(weights);
    Collections.reverse(weights);
    int max_weight = weights.getFirst();



    int delta;
    if (weights.size() == 1) {
      delta = weights.getFirst();
    } else {
      if (max_weight >= sum_weights / 2) {
        delta = max_weight - sum_weights / 2;
      } else {
          weights.removeFirst();
          left.add(max_weight);
          delta =0;
        }
        //TODO  придумать как перебрать все веса до наименьшей delta
    }

    System.out.println(delta);
  }
}
