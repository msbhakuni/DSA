import java.util.*;

public class bfs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases-->0){
            int V = sc.nextInt();
            int E = sc.nextInt();

            // Initialize adjacency list
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i=0;i<V;i++)
                adj.add(new ArrayList<>()); //create a new list for each vertex

            //Add edges to adj list
            for(int i=0;i<E;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);  //Adding edge u->v
                adj.get(v).add(u);  //Adding edge v->u
            }

            Solution obj = new Solution();
            ArrayList<Integer> result = obj.bfsOfGraph(V,adj);

            //Print result
            for(int node : result)
                System.out.print(node+" ");
            System.out.println();
        }
        sc.close();
    }
}
class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        
        q.add(0);
        visited[0]=true;
        
        while(!q.isEmpty()){
            int temp = q.poll();
            result.add(temp);
            
            for(int x : adj.get(temp)){
                if(visited[x]==false){
                    q.add(x);
                    visited[x]= true;
                }
            }
        }
        return result;
    }
}

//INPUT   1. No of testcases 2. no of vertices 3. no of edges 4. two points having edge