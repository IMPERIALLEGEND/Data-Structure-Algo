public class LargestSumArray {

    private static void naiveSolution(int[] A, int n){

        int lar_sum = Integer.MIN_VALUE;
        

        for(int i=0;i<n;i++){

            int sum = 0;
            for(int j=i;j<n;j++){
                sum +=A[j];
                lar_sum =  Math.max(lar_sum, sum);
            }

        }

        System.out.println(lar_sum);
    }

    private static void optimisedSolution(int[] A, int n){

        int curr_sum = 0;
        int max_sum = 0;

        for(int i=0;i<n;i++){

            curr_sum +=A[i];

            max_sum = Math.max(max_sum, curr_sum);

            if(curr_sum < 0){
                curr_sum = 0;
            }
        }

        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        
        int[] A = {-3, 4, -1, -2, 1, 5};

        int n = A.length;

        naiveSolution(A,n);
        optimisedSolution(A,n);
    }
}
