import java.util.ArrayList;

public class GraphRepresentation {

    public ArrayList<ArrayList<Integer>> getAdjacencyList(int[][] inputArr,int n) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0 ; i<inputArr.length ; i++){
            adjacencyList.get(inputArr[i][0]).add(inputArr[i][1]);
            adjacencyList.get(inputArr[i][1]).add(inputArr[i][0]);
        }
        return adjacencyList;
    }

}
