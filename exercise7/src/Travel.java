public class Travel {

    private String City;
    private String Landmark;
    private int Budget;
    private int PocketMoney;

    public Travel (String city, int pocketMoney,int budget,String landmark){
        this.City = city;
        this.Budget = budget;
        this.PocketMoney = pocketMoney;
        this.Landmark=landmark;
    }

    private int SumOfMoney(){
        return this.Budget + this.PocketMoney;
    };


    public String GetCityAndLandmark(){
        return "You travel to " + City + " and you are going to visit the most beautiful landmark: " + Landmark;
    };

    public String GetBudgetAndPocketMoney() {
        return "You have total money: " + SumOfMoney();
    }

}
