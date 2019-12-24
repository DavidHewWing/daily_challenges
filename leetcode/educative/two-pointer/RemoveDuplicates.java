class RemoveDuplicates {

    public static int remove(int[] arr) {
      int nonDup = 1;
      for (int i = 1; i < arr.length; i++) {
        if(arr[nonDup - 1] != arr[i]) {
          arr[nonDup] = arr[i];
          nonDup++;
        }
      }
      return nonDup;
    }
  }
  