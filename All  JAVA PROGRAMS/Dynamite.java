class Dynamite{
    int id;
    String name;

    void  Dynamite(int i,String n)
    {
        i=id;
        n=name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }

public static void main(String[] args) {
    Dynamite d1=new Dynamite();
    Dynamite d2=new Dynamite();
    Dynamite d3=new Dynamite();
    Dynamite d4=new Dynamite();
    Dynamite d5=new Dynamite();

    d1.display();
    d2.display();
    d3.display();
    d4.display();
    d5.display();
}
}