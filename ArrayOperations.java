class ArrayOperations {
    int[] arr1;
    int[] arr2;

    void insertArray() {
        arr1 = new int[]{1, 2, 3, 4, 5};
        arr2 = new int[arr1.length];
    }

    void copyArray() {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
    void displayArray() {
        System.out.println("Elements of Previous array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nElements of New array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}


