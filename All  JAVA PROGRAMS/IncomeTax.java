class IncomeTax{
    int Income;
    int Tax;

    void InsertIncome(int i){
    Income=i;
    }

    void Taxes(){
        Tax=Income*28/100;
    }
    void DisplayTotalTax(){
        System.out.println("Tax to pay is"+Tax);
    }

public static void main(String[] args) {
    
}
}