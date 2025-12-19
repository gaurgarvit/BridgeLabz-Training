public class ProfitLoss {
    public static void main(String[] args) {
        // CP and SP
        double cp= 129;
        double sp= 191;
        
        // calculation of profit using CP and SP
        double profit= sp - cp;
        
        // calculation of profit percentage
        double profitPercentage = (profit / cp) * 100;
        System.out.println("Cost Price: Rs " + cp + 
                           "\nSelling Price: Rs " + sp + 
                           "\nProfit: Rs " + profit + 
                           "\nProfit Percentage: " + profitPercentage + " %");
    }
}