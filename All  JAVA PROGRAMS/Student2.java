class Student2{  
    int rollno;  
    String name;  
    void insertRecord(int r, String n){  
     rollno=r;  
     name=n;  
    }  
    void displayInformation(){
        System.out.println(rollno);
        System.out.println(name);
    }  
   
  
    
    public static void main(String args[]){  
   Student s1=new Student();  
   Student s2=new Student();  
   Student s3=new Student(); 
   Student s4=new Student(); 
   Student s5=new Student(); 
   Student s6=new Student(); 
     s1.insertRecord(101,"Pranay");  
     s2.insertRecord(102,"Pushpak");  
     s3.insertRecord(103,"Pratik");  
     s4.insertRecord(104,"Aryan");  
     s5.insertRecord(105,"Ritik"); 
     s6.insertRecord(106,"vikas"); 
     s1.displayInformation();  
     s2.displayInformation(); 
     s3.displayInformation();  
     s4.displayInformation(); 
     s5.displayInformation(); 
     s6.displayInformation(); 
    }  
} 
   