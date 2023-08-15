class Calculator1{
    int a;
    int b;
    int Add;
    int Div;
    int Mult;
    int Sub;

void Add (int a,int b){
   Add=a+b;
}

void Div (int a,int b){
    Div=a/b;
 }

 void Mult (int a,int b){
    Mult=a*b;
 }

 void Sub (int a,int b){
    Sub=a-b;
 }

 void DisplayResult(){
    System.out.println("Addition of two number is : "+Add);
    System.out.println("Division of two number is : "+Div);
    System.out.println("Multiplication of two number is : "+Mult);
     System.out.println("Substraction of two number is : "+Sub);
    
 }
public static void main(String[] args) {
    Calculator1 c1=new Calculator1();

    c1.Add(23,45);
    c1.Div(20,5);
    c1.Mult(23,45);
    c1.Sub(23,45);

    c1.DisplayResult();
}
}