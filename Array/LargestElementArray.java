public class LargestElementArray {
    public static void main(String[] args) {
        
        int[] a = {10,5,20,30,4};

        int idx_max = 0;
        int max_ele = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){

            if(a[i] > max_ele){
                idx_max = i;
                max_ele = a[i];
                
            } 

        }

        System.out.println(idx_max);
    }
}
