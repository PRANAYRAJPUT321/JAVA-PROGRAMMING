public class Teststring1{                                                             //class declartion
public static void main(String args[])                                                  //Main Function
 {  
String name= " Hello !! My name is Pranay";                                            // String Declarations

char ch=name.charAt(6);
int index=name.indexOf('s');
int index1 = name.indexOf("Pranay");
String namelower = name.toLowerCase();
String nameupper = name.toUpperCase();
String subString = name.substring(1,12);
String substring = name.substring(4);
String replaceString=name.replace('a','e');
name.concat("Hello !! My name is Pranay");      
name=name.concat(" From Nagpur ");    

System.out.println("Character at perticular index is :-  " + ch);                       //Index of character
System.out.println("string length is:- " + name.length());                              //String Length 
System.out.println("Checking Whether String is Empty :- " + name.isEmpty());            //Is Empty 
System.out.println("Index of Particular character is :- " + index);                     //Index of Particular character   
System.out.println("String in Lower Case :- " + namelower);                             //LowerCase
System.out.println("String in Upper Case :- " + nameupper);                             //UpperCase
System.out.println("String after Substringed From both the Ends :- " + subString);      //Substring  from Both the side
System.out.println("String after Substringed From begining:- " + substring);            //substring From Begnimg
System.out.println("Trimmed String :- " + name.trim());                                 //Trimmed String
System.out.println("Replaced String is :- " + replaceString);                           //Replace String
System.out.println("Concated String :- " + name);                                       //Concating  String
System.out.println("Index of Particular Substring  is :- " + index1);                   //Index Of Substring
}} 