import java.io.*;

public  class Solution1607 {
    public static void main(String[] args) throws IOException {
       new Solution1607().run();
    }

    StreamTokenizer input;
    PrintWriter output;

    void run() throws IOException {
        input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        output = new PrintWriter(System.out);
        solve();
        output.flush();}

    int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    void solve() throws IOException {
            int CostPetya = nextInt();
            int PetyaAddition = nextInt();
            int CostTaxman = nextInt();
            int DiscountTaxman = nextInt();

            while (CostPetya <= CostTaxman) {
                if (CostPetya + PetyaAddition > CostTaxman){
                    CostPetya = CostTaxman;
                    break;
                }
                CostPetya += PetyaAddition;
                CostTaxman -= DiscountTaxman;
            }
            output.print(CostPetya);

            output.print("\n");
        }}