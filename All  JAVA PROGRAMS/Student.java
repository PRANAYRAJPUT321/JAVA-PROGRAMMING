class Student{ 
     int id; 
     String name; 
     } 
     class TestStudent{
     public static void main(String args[]){ 

    Student s1=new Student(); 
    Student s2=new Student(); 
    Student s3=new Student(); 

     s1.id=101; 
     s1.name="Pranay"; 
     s2.id=102; 
     s2.name="Pratik"; 
     s3.id=103; 
     s3.name="Ritik"; 
 
     System.out.println(s1.id+" "+s1.name); 
     System.out.println(s2.id+" "+s2.name); 
     System.out.println(s3.id+" "+s3.name); 
     } 
     }