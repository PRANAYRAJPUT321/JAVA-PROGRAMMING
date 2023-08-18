class SimpleInterest{
    int amount;
    int rate;
    int time;
    int interest;
    int returnAmount;
    int Extrainterest;
void insertData(int a,int r,int t){
    amount=a;
    rate=r;
    time=t;
   System.out.println("Your Borrowed Amount is := "+amount);
    if(time > 6)
    {
        r=r+2;
    Extrainterest=(a*r*t)/100; 

    interest=(a*r*t)/100;
    System.out.println("2% Extra intrest for late returning := "+Extrainterest);
}
interest=((a*r*t)/100);
}
void returnMoney(){
    returnAmount=interest+amount;
   
}

void displayData()
{
    System.out.println( "Simple intrest is := "+interest);
    System.out.println("Returning Amount is  is := "+returnAmount);
}

public static void main(String[] args) {
    SimpleInterest a=new SimpleInterest();
    a.insertData(1000,5,8);
    a.returnMoney();
    a.displayData();
}
}