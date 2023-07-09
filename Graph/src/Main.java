import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final String STRING = "--------------------";

            GraphRepresentation graphRepresentation=new GraphRepresentation();
        /*
                          ------------
                          |          |
                    1-----2----3-----4----5
                    |          |
                    ------------
        */
            int[][] inputArr = {{1,2}, {2, 3}, {3, 4},{1,3},{2,4},{5,4}};
            int n=5;

            ArrayList<ArrayList<Integer>>  result = graphRepresentation.getAdjacencyList(inputArr,n);
            System.out.println("\n1 BASED\n" + STRING);
            for(int i=0;i<result.size();i++){
                System.out.println(i+" -> "+result.get(i));
            }

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
            for(int i=0;i<result.size();i++){
                System.out.println(i+" -> "+result1.get(i));
            }

    }
}