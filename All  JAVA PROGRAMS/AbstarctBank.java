abstract class AbstractBank{

    AbstractBank(){
        System.out.println("Welcome to Bank");
    }

    abstract int GetRoi();
}
   
   class SBI extends AbstractBank{
        int GetRoi(){
            return 8;
        }
    }

class TestAbstractBank{
    
public static void main(String[] args) {
AbstractBank obj=new AbstractBank();
   AbstractBank b;

      b=new SBI(); 
  
        System.out.println("Rate of Interest is: "+b.GetRoi()+" %"); 
   
    }
}