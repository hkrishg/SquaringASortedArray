class Main {

  // Given a sorted array, create a new array containing squares of all the number
  // of the input array in the sorted order.

  // Input: [-2, -1, 0, 2, 3]
  // Output: [0, 1, 4, 4, 9]

  private static int[] makeSquare(int[] arr) {
    int n = arr.length;
    int[] squares = new int[n];
    int highestSquareIndex = n - 1;
    int left = 0, right = n - 1;
    while (left <= right) {
      int leftSquare = arr[left] * arr[left];
      int rightSquare = arr[right] * arr[right];
      if (rightSquare > leftSquare) {
        squares[highestSquareIndex] = rightSquare;
        right--;
      } else {
        squares[highestSquareIndex] = leftSquare;
        left++;
      }
      highestSquareIndex--;
    }

    return squares;
  }

  public static void main(String[] args) {

    int[] result = Main.makeSquare(new int[] { -2, -1, 0, 2, 3 });
    for (int num : result) {
      System.out.print(num + " ");
    }

    System.out.println();
  }
}