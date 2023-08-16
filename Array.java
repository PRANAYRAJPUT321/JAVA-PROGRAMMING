class Array{

    public static void main(String[] args) {
        
    
       int []arr1=new int[]{1,2,3,4,5};
       int []arr2=new int[arr1.length];
       int []arr3=new int[arr1.length];
    

    
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr2[i]+arr1[i];
        }
    
        System.out.println("Elements of Privios array :");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i] + " ");
        }
        System.out.println("Elements of New array :");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr2[i] + " ");
        }
        System.out.println("Elements of Third array :");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr3[i] + " ");
        }
    
}
}