import java.util.*;

public class Dijkstra {
    static final int INF = 1000000000;

    static LinkedList<LinkedList<Integer>> edge;
    static LinkedList<LinkedList<Integer>> cost;
    static int[] dist;

    public static void dijkstra(int source) {
        int n = edge.size();
        dist = new int[n];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
        /*
         creates a priority queue of integers with a custom 
         comparator that compares two elements a and b based on
         their distances from the source node (dist[a] and dist[b]). 
         Specifically, if dist[a] is less than dist[b], then a is 
         considered to be less than b, and vice versa.
         
         
         When using a PriorityQueue with a custom comparator, 
         the value that is less according to the comparator 
         will be dequeued (removed) from the priority queue 
         first.

		 In the case of Dijkstra's algorithm, we use a 
		 PriorityQueue to keep track of the vertices that 
		 we need to process, with the vertex that has the 
		 lowest distance to the source node at the front of 
		 the queue. This allows us to efficiently process 
		 vertices in order of increasing distance from the 
		 source node.

		 The custom comparator (a, b) -> dist[a] - dist[b] 
		 compares vertices a and b based on their distances 
		 from the source node. If dist[a] is less than dist[b], 
		 then a is considered to be less than b, and will be 
		 dequeued before b. If dist[a] is equal to dist[b], 
		 then their relative order in the priority queue will 
		 depend on the insertion order.
         */
        pq.offer(source);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            for (int i = 0; i < edge.get(u).size(); i++) {
                int v = edge.get(u).get(i);
                int c = cost.get(u).get(i);
                if (dist[v] > dist[u] + c) {
                    dist[v] = dist[u] + c;
                    pq.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; // number of nodes in the graph
        int m = 7; // number of edge in the graph

        // initialize the graph with empty adjacency lists
        edge = new LinkedList<>();
        cost = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            edge.add(new LinkedList<>());
            cost.add(new LinkedList<>());
        }

        // add edges to the graph

        edge.get(0).add(1);
        cost.get(0).add(1);
        edge.get(0).add(2);
        cost.get(0).add(3);
        edge.get(0).add(3);
        cost.get(0).add(6);
        edge.get(0).add(2);
        cost.get(0).add(1);
        edge.get(0).add(4);
        cost.get(0).add(5);
        edge.get(0).add(3);
        cost.get(0).add(2);
        edge.get(0).add(4);
        cost.get(0).add(2);
        edge.get(0).add(4);
        cost.get(0).add(1);

        // run Dijkstra's algorithm from node 0
        dijkstra(0);

        // print the distances from node 0 to all other nodes
        for (int i = 0; i < n; i++) {
            System.out.printf("Distance from node %d to node %d: %d\n", 0, i, dist[i]);
        }
    }
}
