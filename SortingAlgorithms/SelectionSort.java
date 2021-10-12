public class SelectionSort {
    public static void main (String [] args) {
        int [] arr = new int[] {1, 4, 2, 90, 8, 5, 5, 0}; 
        int [] res = selectionSort(arr); 
        for (int i=0; i<res.length; i++) {
            System.out.print(res[i] + " "); 
        }

    } 

    public static int [] selectionSort(int [] in) {
        for (int i=in.length-1; i>=1; i--) {
            int max = 0; 
            int maxIndex = 0; 
            for (int j=0; j<=i; j++) {
                if (in[j] > max) {
                    max = in[j]; 
                    maxIndex = j; 
                }
            }
            in[maxIndex] = in[i]; 
            in[i] = max; 
            max = 0; 
            maxIndex = 0; 

        }

        return in; 
    }
}
