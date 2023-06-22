import java.util.Scanner;

class TrippingWater{

    private static void trippingWater(int[] a,int n){

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = a[0];
        rmax[n-1] = a[n-1];

        for(int i=1;i<n;i++){

            lmax[i] = Math.max(a[i], lmax[i-1]);
        }

        for(int i=n-2;i>=0;i--){

            rmax[i] = Math.max(a[i], rmax[i+1]);
        }

        int res = 0 ;

        for(int i=0;i<n;i++){

            res += Math.min(lmax[i], rmax[i]) - a[i];
        }


        System.out.println(res);

	// Calculate the accumulated water element by element
	// consider the amount of water on i'th bar, the
	// amount of water accumulated on this particular
	// bar will be equal to min(left[i], right[i]) - arr[i]
	// .
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for(int i=0;i<n;i++){

            A[i] = sc.nextInt();
        }


        trippingWater(A,n);
    }
}