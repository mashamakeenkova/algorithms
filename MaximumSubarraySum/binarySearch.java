public class binarySearch {
    public static void main (String[] args) {
        int [] arr = new int[] {1, 2, 4, 6, 9}; 
        int res = binSearch(arr, 3); 
        System.out.println(res);
    }

    //returns position of s in sorted array, if s not in array, returns -1
    public static int binSearch(int [] in, int s) {
        int left = 0; 
        int right = in.length-1; 
        while (left <= right) {
            int mid = (left + right)/2; 
            if (in[mid] == s) return mid; 
            else if (in[mid] > s) right = mid -1; 
            else left = mid +1;  
        }
        return -1; 
    }
}
