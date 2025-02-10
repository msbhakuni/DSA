import java.util.*;

public class dfsStack {
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
            ArrayList<Integer> result = obj.dfsOfGraph(V,adj);

            //Print result
            for(int node : result)
                System.out.print(node+" ");
            System.out.println();
        }
        sc.close();
    }
}
class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];
        
        stack.push(0);

        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!visited[node]){
                visited[node] = true;
                result.add(node);
            }
            for(int i=adj.get(node).size()-1; i>=0; i--){
                int neigh = adj.get(node).get(i);
                if(!visited[neigh])
                    stack.push(neigh);
            }
        }
        return result;
    }
}

/*INPUT   1. No of testcases 2. no of vertices 3. no of edges 4. two points having edge
saving it as adjaceny list
e.g 
1
5
4
0 2
0 3
0 1
2 4
output = 0 2 4 3 1
*/