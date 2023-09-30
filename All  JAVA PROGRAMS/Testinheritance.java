class Car{
    void run(){
        System.out.println("Car is running");
    }
}
class Bike extends Car {
    void fun(){
        System.out.println("Bike is running");
    }
}
class Testinheritance{
    public static void main(String[]args){
        Bike obj=new Bike();
        obj.run(); 
        obj.fun(); 
    }
}