class RectangleArea{  
    int length;  
    int width;  
    void insert(int l, int w){  
     length=l;  
     width=w;  
    }  
    void calculateArea(){System.out.println(length*width);}   
    public static void main(String args[])
    {  
     RectangleArea r1=new RectangleArea();  
     RectangleArea r2=new RectangleArea();  
     r1.insert(11,5);  
     r2.insert(3,15);  
     r1.calculateArea();  
     r2.calculateArea();  
   }  
   }  