public class Teststring1{  
public static void main(String args[]) 
 {  

String name= " Hello !! My name is Pranay";  

char ch=name.charAt(6);
int index=name.indexOf('s');
String namelower = name.toLowerCase();
String nameupper = name.toUpperCase();

System.out.println("Character at perticular index is :-  " + ch); 
System.out.println("string length is:- "+ name.length());
System.out.println("Checking Whether String is Empty :- " + name.isEmpty()); 
System.out.println("Index of Particular character is :- " + index);
System.out.println("String in Lower Case :- " + namelower);
System.out.println("String in Upper Case :- " + nameupper);
System.out.println("Trimmed String :- " + name.trim());
}} 