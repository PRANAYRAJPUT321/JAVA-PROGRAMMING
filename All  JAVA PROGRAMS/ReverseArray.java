class ReverseArray {
    int[] numbers;

    void insertNumbers(int[] arr) {
        numbers = arr;
    }

    void reverseArray() {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        ReverseArray arrayOps = new ReverseArray();
        arrayOps.insertNumbers(data);

        System.out.println("Original Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        arrayOps.reverseArray();

        System.out.println("\nReversed Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
