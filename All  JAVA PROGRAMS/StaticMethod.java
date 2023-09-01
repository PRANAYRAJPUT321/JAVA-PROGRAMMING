class StaticMethod
{  
    int rollno;  
    String name; 
    String branch; 
    static String college = "GH Raisoni";  

    static void change()
    {  
    college = "Raisoni";  
    }  
    
    StaticMethod(int r, String n ,String b)
    {  
    rollno = r;  
    name = n; 
    branch = b; 
    } 

    void display(){
        System.out.println(rollno+" "+name+"  "+branch+" "+college);
    }  

   public static void main(String args[])
   {  
   StaticMethod.change(); 

   StaticMethod s1 = new StaticMethod(101,"Pranay","BCA");  
   StaticMethod s2 = new StaticMethod(102,"Aniket","BCA");  
   StaticMethod s3 = new StaticMethod(103,"Vicky","BCA");  
     
   s1.display();  
   s2.display();  
   s3.display();  
   }  
}