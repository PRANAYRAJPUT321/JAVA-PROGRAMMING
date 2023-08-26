class Student4{
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
        System.out.println("Name of Students is : " +name+ " Roll no = " +rollno+ " Branch is :" +branch+ " Collage name is : "+collage);
    }

    public static void main(String[] args) {
        Student4 s3=new Student4();
        Student4 s4=new Student4();

        s3.insertdata("Pranay",101,"BCA","Raisoni");
        s4.insertdata("Mukesh",102,"BCA","Raisoni");

        s3.dispalydata();
        s4.dispalydata();
    }

}