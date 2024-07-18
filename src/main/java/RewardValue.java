public class RewardValue {
    private static final double miles_to_cash_rate = 0.0035;
    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / miles_to_cash_rate);
    }
    // Constructor that accepts a miles value

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        cashValue = milesValue * miles_to_cash_rate;
    }
    

    //Method to get the cash Value

    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value

    public double getMilesValue() {
        return milesValue;
    }
}