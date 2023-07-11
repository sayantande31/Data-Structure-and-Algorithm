import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final String STRING = "--------------------";

            GraphRepresentation graphRepresentation=new GraphRepresentation();
            BreadthFirstSearch breadthFirstSearch=new BreadthFirstSearch();
            DepthFirstSearch depthFirstSearch=new DepthFirstSearch();
            /*
                              ------------
                              |          |
                        1-----2----3-----4----5
                        |          |
                        ------------
            */
//            int[][] inputArr = {{1,2}, {2, 3}, {3, 4},{1,3},{2,4},{5,4}};
            int[][] inputArr = {{1,2}, {2, 3}, {2,4},{1,6},{6,7},{6,9},{7,8},{4,5},{5,8}};
            int n=9;

            ArrayList<ArrayList<Integer>>  result = graphRepresentation.getAdjacencyList(inputArr,n);
            System.out.println("\n1 BASED\n" + STRING);
            for(int i=0;i<result.size();i++){
                System.out.println(i+" -> "+result.get(i));
            }
            ArrayList<Integer> bfsTraverseOrder =breadthFirstSearch.traverseGraph(result,n);
            System.out.println("BFS Traverse Order -> "+bfsTraverseOrder.toString());
            ArrayList<Integer> dfsTraverseOrder =depthFirstSearch.traverseGraph(n,result);
            System.out.println("DFS Traverse Order -> "+dfsTraverseOrder.toString());

            /*
                              ------------
                              |          |
                        0-----1----2-----3----4
                        |          |
                        ------------
            */
            int[][] inputArr1 = {{0,1}, {1, 2}, {2, 3},{0,2},{1,3},{3,4}};
            int n1=5;

            ArrayList<ArrayList<Integer>>  result1 = graphRepresentation.getAdjacencyList(inputArr1,n1);
            System.out.println("\n0 BASED\n" + STRING);
            for(int i=0;i<result1.size();i++){
                System.out.println(i+" -> "+result1.get(i));
            }

    }
}