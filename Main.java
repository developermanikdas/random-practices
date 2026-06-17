// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    // public static int binarySearch(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start <= end){
    //         if((arr[(start+end)/2]) == target){
    //             return (start+end)/2;
    //         }else if((arr[(start+end)/2]) < target){
    //             start = (start+end)/2 + 1;
    //         }else{
    //             end = (start+end)/2 -1;
    //         }
    //     }
    //         return -1;
    // }

    // public static void pair(int[] arr){
    //     for(int i = 0; i < arr.length -1; i++){
    //         for(int j=i+1; j < arr.length; j++){
    //             System.out.print(" (" + arr[i] + "," + arr[j] + ") ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void subArray(int[] arr) {
        int maxSubarray = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                System.out.print("[");

                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);

                    if (i < end) {
                        System.out.print(" ");
                    }
                }

                maxSubarray++;

                System.out.println("]");
            }
        }
        System.out.println(maxSubarray);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
        subArray(arr);
    }
}