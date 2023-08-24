class Student3{
    String name;
    int rollno;
    String branch;
    String collage;

    void insertdata (String n,int r,String b,String c){
        name =n;
        rollno=r;
        branch=b;
        collage=c;
    }
    void dispalydata(){
        System.out.println("Name of Students is"+name+"Roll no = "+rollno+"Branch is :"+branch+"Collage name is : "+collage);
    }

}