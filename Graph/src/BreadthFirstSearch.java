import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public ArrayList<Integer> traverseGraph(ArrayList<ArrayList<Integer>> adjascencyList,int n){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        ArrayList<Integer> bfsOrder=new ArrayList<>();

        queue.add(1);
        visited[1]=true;

        while(!queue.isEmpty()){
            int node=queue.poll();
            bfsOrder.add(node);

            for(Integer mp:adjascencyList.get(node)){
                if(visited[mp]==false){
                    visited[mp]=true;
                    queue.add(mp);
                }
            }

        }

        return bfsOrder;
    }
}
