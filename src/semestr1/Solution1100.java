package semestr1;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1100 {

  public static void main(String[] args) throws IOException {
    new Solution1100().run();}

  StreamTokenizer input;
  PrintWriter output;

  void run() throws IOException  {
          input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
          output = new PrintWriter(System.out);
          solve();
          output.flush();}

  int nextInt() throws IOException
  { input.nextToken();
    return (int)input.nval;}

  void solve() throws IOException {
    int count_commands = nextInt();
    int[][] commands = new int[count_commands][2];
    for(int i=0; i<count_commands; i++){
        commands[i][0] = nextInt();
        commands[i][1] = nextInt();}
    Arrays.sort(commands, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
              return Integer.compare(b[1], a[1]);}
            });
    for(int[] row: commands){
        output.print(row[0]);
        output.print(" ");
        output.print(row[1]);
        output.print("\n");}
 }}