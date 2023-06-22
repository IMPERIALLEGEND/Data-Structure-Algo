public class MergeTwoSortedArray {

    private static void naiveSolution(int[] a,int[] b,int n1,int n2){

        int[] res = new int[n1+n2];

        int i=0;
        int j=0;
        int k = 0;

        while(i<n1 && j<n2){

            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
            }
            else{
                res[k] = b[j];
                j++;
            }
            k++;
        }


        while(i<n1){
                res[k] = a[i];
                k++;
                i++;
        }


        while(j<n2){
                res[k] = b[j];
                k++;
                j++;
        }


        for(int ele: res){
            System.out.println(ele);
        }

    }
    public static void main(String[] args) {
        
        int[] a = {1,3,4,6};
        int[] b = {2,5,7};

        int n1 = a.length;
        int n2 = b.length;

        naiveSolution(a,b,n1,n2);
    }
}
