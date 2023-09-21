class Shape{
   int getArea(){
        return 0;
    }

    class Rectangle extends Shape{
        int length;
        int breadth;
        int Area;

        void insertdata(int length,int breadth){
            a=length;
            b=breadth;
    }
    void Calculate(){
        Area=length*breadth;
    }
         void getArea(){
            return Area;
        }
    }   

}
class Testinheritance{
    public static void main(String []args){
        Rectangle Obj1=new Rectangle();
            Obj1.insertdata(2,3);
            Obj1.Calculate();
            super.getArea();
        }
    }
