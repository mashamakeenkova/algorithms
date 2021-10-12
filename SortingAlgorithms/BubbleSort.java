public class BubbleSort {
    public static void main (String[] args ) {
        int [] arr = new int[] {1, 4, 2, 6, 8, 5, 5, 0}; 
        int [] res = bubbleSort(arr); 
        for (int i=0; i<res.length; i++) {
            System.out.print(res[i] + " "); 
        }
    }

    //sorts an input array in-place
    //runtime O8(n)
    public static int[] bubbleSort(int [] in ) {
        for (int j=0; j<in.length-1; j++) {
            for (int i=0; i<in.length-1; i++) {
                if (in[i] > in[i+1]) {
                    int temp = in[i+1]; 
                    in[i+1] = in[i]; 
                    in[i] = temp; 
                }
            }
        }
        return in; 
    }
}