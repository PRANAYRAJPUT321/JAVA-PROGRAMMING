class ArrayOperations{
    int arr1[];
    int arr2[];

    void InsertArray(){
     int   []arr1=new int[]{1,2,3,4,5};
      int  []arr2=new int[arr1.length];
    }

    void CopyArray(){
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
    }

    void DisplayArray()
    {
        System.out.println("Elements of Privios array :");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1 + " ");
        }
        System.out.println("Elements of New array :");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr2 + " ");
        }
    }

    public static void main(String[] args)
    {
       ArrayOperations a1=new ArrayOperations();

       a1.InsertArray();
       
       a1.CopyArray();

       a1.DisplayArray();
    }

}
