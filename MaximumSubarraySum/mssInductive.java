class MSS {
    public static void main (String [] args) {
        int [] arr = new int[] {1, -2, 3, 5, -6, 7}; 
        mss(arr); 
    }

    //returns the largest sum of consecutive elements in the 'in' array, if this sum is negative, returns 0
    //runtime: O(n)
    public static void mss (int [] in) {
        int randmax = 0; 
        int max = 0; 
        for (int i=0; i<in.length; i++) {
            randmax += in[i]; 
            if (randmax > max) max = randmax; 
            if (randmax < 0) randmax = 0; 
        }
        System.out.println(max);
    }
}