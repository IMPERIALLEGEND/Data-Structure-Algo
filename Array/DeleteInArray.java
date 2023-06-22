public class DeleteInArray {
    

    public static void deleteInArray(int[] a, int d){

        int idx = 0;

        for(idx=0;idx<a.length;idx++){

            if(a[idx] == d){
                break;
            }
        }

        if(idx == a.length){
            System.out.println("Not Found");
            return;
        }

        for(int i = idx;i<a.length-1;i++){

            a[i] = a[i+1];
        }

        for(int i: a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        


        int[] a = new int[10];

        for(int i=0;i<5;i++){

            a[i] = i+1;
        }

        int d = 4;
        
        for(int i: a){
            System.out.println(i);
        }
        
        deleteInArray(a,d);
    }
}
