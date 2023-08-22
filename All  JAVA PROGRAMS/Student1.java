 class Student1{ 
     int rollno; 
     String name; 

     void insertRecord(int r, String n){ 
     rollno=r; 
     name=n; 
     } 
     void displayInformation()
     {
        System.out.println(rollno+" "+name);
    } 
     
     public static void main(String args[]){ 
     Student1 s1=new Student1(); 
     Student1 s2=new Student1(); 
     Student1 s3=new Student1(); 

     s1.insertRecord(101,"PRANAY"); 
     s2.insertRecord(102,"PRAKSH"); 
     s3.insertRecord(103,"MUKESH");

     s1.displayInformation(); 
     s2.displayInformation(); 
     s3.displayInformation(); 
     } 
     } 