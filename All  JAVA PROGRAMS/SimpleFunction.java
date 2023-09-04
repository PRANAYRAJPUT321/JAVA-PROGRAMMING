class SimpleFunction {
    int a ;
    int b;
    int c;

    void insert (int a,int b){
        a=a;
        b=b;
    }

    void mult(){
        c=a*b;
    }

    void display(){
        System.out.println(c);
    }
public static void main(String[] args) {
    SimpleFunction s1=new SimpleFunction();

    s1.insert(2,3);
    s1.display();
}
}