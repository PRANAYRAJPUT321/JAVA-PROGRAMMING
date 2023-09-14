interface printable{
    abstract void print();
}
class Pranay implements printable{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Pranay obj=new Pranay();
        obj.print();
    }
}