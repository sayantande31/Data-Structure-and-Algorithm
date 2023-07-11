import java.util.ArrayList;

public class DepthFirstSearch {

    private void dfs(int node,ArrayList<ArrayList<Integer>> adjascencyList,boolean[] vis,ArrayList<Integer> dfsorder){
        dfsorder.add(node);
        vis[node]=true;

        for(Integer n : adjascencyList.get(node)){
            if(!vis[n]){
                dfs(n,adjascencyList,vis,dfsorder);
            }
        }
    }



    public ArrayList<Integer> traverseGraph(int node,ArrayList<ArrayList<Integer>> adjascencyList){
        ArrayList<Integer> dfsorder =new ArrayList<>();
        boolean[] vis=new boolean[node+1];

        dfs(1,adjascencyList,vis,dfsorder);
        return dfsorder;
    }
}
