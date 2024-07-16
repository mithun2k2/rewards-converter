public class RewardValue {
    public static final double miles_to_cash_rate = 0.0035;
    public double cashValue;
    public double milesValue;

    // Constructor that accepts a cash value

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesvalue = cashValue / miles_to_cash_rate;
    }
    // Constructor that accepts a miles value

    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
        this.milesValue = milesValue;
        cashValue = milesValue * miles_to_cash_rate;
        }
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