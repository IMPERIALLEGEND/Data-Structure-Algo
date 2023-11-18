import java.util.Scanner;

class LinearProbing {
    // Function to fill the array elements into a hash table
    // using Linear Probing to handle collisions.
    public static int[] linearProbing(int hash_size, int arr[], int array_size) {
        int hash_table[] = new int[hash_size];

        // storing -1 at all indexes in the hash table.
        for (int i = 0; i < hash_size; i++)
            hash_table[i] = -1;

        // iterating over the array.
        for (int i = 0; i < array_size; i++) {
            // if the value of hash table at index (arr[i]%hashSize) is -1
            // which means empty then, we insert arr[i] at that place.
            if (hash_table[arr[i] % hash_size] == -1) {
                hash_table[arr[i] % hash_size] = arr[i];
            }
            // else we move linearly from the filled position
            // to find an index with -1 in hash table.
            else {
                int counter = 0;
                int k = (arr[i]) % hash_size;
                int flag = 0;
                // using a loop which runs until we find an index with -1
                // in hash table which means empty.
                while (counter < hash_size && hash_table[k] != -1) {
                    if (hash_table[k] == arr[i]) {
                        flag = 1;
                        break;
                    }
                    k = (k + 1) % hash_size;
                    counter++;
                }
                if (flag == 1)
                    continue;
                // if we find a position where arr[i] can be inserted
                // then we insert the element.
                if (counter < hash_size)
                    hash_table[k] = arr[i];
            }
        }
        // returning the hash table.
        return hash_table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int[] ans = new int[s];
        ans = linearProbing(s,a,n);

        for (int i = 0; i < s; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
