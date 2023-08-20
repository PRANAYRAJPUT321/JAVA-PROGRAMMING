class IncomeTax{
    int Income;
    int Tax;

    void InsertIncome(int i){
    Income=i;
    System.out.println("Your total Income is :" + Income + "Rs");
    }

    void Taxes(){
        Tax=Income*28/100;
    }
    void DisplayTotalTax(){
        System.out.println("Tax to pay is :- " + Tax + "  Rs only");
    }

public static void main(String[] args) {
    IncomeTax I1=new IncomeTax();

    I1.InsertIncome(100000);
    I1.Taxes();
    I1.DisplayTotalTax();
}
}