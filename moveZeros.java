class Solution {

        public void swap(int i, int j, int arr[]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
        public void moveZeroes(int[] arr) {

                for (int i = 0, len = arr.length; i < len; ++i) {

                        if (arr[i] == 0) {
                                for (int j = i + 1; j < len; ++j)
                                        if (arr[j] != 0) {
                                                swap(i, j, arr);
                                                break;
                                        }

                        }
                }

        }
}
