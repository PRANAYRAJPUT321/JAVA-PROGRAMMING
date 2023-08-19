class ArraySumAvg {
    int[] numbers;

    void insertNumbers(int[] arr) {
        numbers = arr;
    }

    int findSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    double findAverage() {
        if (numbers.length == 0) {
            return 0.0;
        }
        int sum = findSum();
        return (double) sum / numbers.length;
    }

    public static void main(String[] args)
     {
        int[] data = {10, 20, 30, 40, 50};
        ArraySumAvg arrayOps = new ArraySumAvg();
        arrayOps.insertNumbers(data);

        System.out.println("Sum of numbers: " + arrayOps.findSum());
        System.out.println("Average of numbers: " + arrayOps.findAverage());
    }
}
