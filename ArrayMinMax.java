class ArrayMinMax {
    int[] elements;

    void insertElements(int[] arr) {
        elements = arr;
    }

    int findMax() {
        if (elements.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = elements[0];
        for (int num : elements) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int findMin() {
        if (elements.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = elements[0];
        for (int num : elements) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] values = {5, 2, 9, 1, 7};
        ArrayMinMax arrayOps = new ArrayMinMax();
        arrayOps.insertElements(values);

        System.out.println("Maximum element: " + arrayOps.findMax());
        System.out.println("Minimum element: " + arrayOps.findMin());
    }
}
