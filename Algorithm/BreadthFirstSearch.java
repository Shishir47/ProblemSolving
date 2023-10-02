import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	 private static LinkedList<Integer> edge[]= new LinkedList[100];
	 private static LinkedList<Integer> cost[]= new LinkedList[100];
	 private static int infinity= Integer.MAX_VALUE;
	 
	  public static int bfs(int source, int destination) {
	        int[] d = new int[100];
	        for (int i = 0; i < 100; i++) {
	            d[i] = infinity;
	        }

	        Queue<Integer> q = new LinkedList<>();
	        q.add(source);
	        d[source] = 0;

	        while (!q.isEmpty()) {
	            int u = q.poll();
	            int ucost = d[u];

	            for (int i = 0; i < edge[u].size(); i++) {
	                int v = edge[u].get(i);
	                int vcost = cost[u].get(i) + ucost;

	                // updating - this part is also called relaxing
	                if (d[v] > vcost) {
	                    d[v] = vcost;
	                    q.add(v);
	                }
	            }
	        }

	        return d[destination];
	    }
	public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            edge[i] = new LinkedList<>();
            cost[i] = new LinkedList<>();
        }
        
        //edge[i].add(j) means add edge from i to j
        //cost[i].add(cost); means add cost from edge i to j with cost;
        edge[0].add(1);
        cost[0].add(1);
        edge[0].add(2);
        cost[0].add(3);
        edge[0].add(3);
        cost[0].add(6);
        edge[1].add(2);
        cost[1].add(1);
        edge[1].add(4);
        cost[1].add(5);
        edge[2].add(3);
        cost[2].add(2);
        edge[2].add(4);
        cost[2].add(2);
        edge[3].add(4);
        cost[3].add(1);
        
        
        
        int shortestPath = bfs(2, 4);
        System.out.println(shortestPath);
	}

}
