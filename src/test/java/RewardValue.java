public class RewardValue {
    private double cashValue;
    private double milesValue;

//Constructors

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.convert_from_cash_to_miles();
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.convert_from_miles_to_cash();
    }

//Getters

    public double getCashValue() {
        return Double.parseDouble(String.format("%.4f", cashValue));
    }

    public double getMilesValue() {
        return Double.parseDouble(String.format("%.4f", milesValue));
    }

//    function

    void convert_from_cash_to_miles() {
        this.milesValue = cashValue / 0.0035;
    }

    void convert_from_miles_to_cash() {
        this.cashValue = milesValue * 0.0035;
    }


}