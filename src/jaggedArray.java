public class jaggedArray {
    public static void main(String[] args) {
                // Declare a 2D ragged array
                int[][] jaggedArray = new int[3][];

                // Initialize each row with different lengths
                jaggedArray[0] = new int[]{1, 2, 3};
                jaggedArray[1] = new int[]{4, 5};
                jaggedArray[2] = new int[]{6, 7, 8, 9};

                // Access and print elements
                for (int i = 0; i < jaggedArray.length; i++) {
                    for (int j = 0; j < jaggedArray[i].length; j++) {
                        System.out.print(jaggedArray[i][j] + " ");
                    }
                    System.out.println();
                }
    }
}