class Counter{
    static int count = 0 ;

    Counter()
    {
count ++ ;  
System.out.println(count);
  }

  void Dispaly(){
System.out.println(count);
  }

  public static void main(String[] args) {
    Counter c1=new Counter();
    Counter c2=new Counter();
    Counter c3=new Counter();

    c1.Dispaly();
    c2.Dispaly();
    c3.Dispaly();
  }
}