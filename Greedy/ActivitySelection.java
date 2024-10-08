//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class ActivitySelection
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends




class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    static class Pair {
        int s;
        int e;
        Pair(int s, int e){
            this.s = s;
            this.e = e;
        }
    }
    public int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.e - p2.e);
        
        for(int i=0; i<n; i++){
            pq.add(new Pair(start[i], end[i]));
        }
        
        int prev_e = 0;
        int count=0;
        
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            //System.out.println(p.s+" "+p.e);
            if(prev_e < p.s){
                prev_e = p.e;
                count++;
            }
        }
        
        return count;
    }
}