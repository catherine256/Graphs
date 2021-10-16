import java.util.Scanner; //import the scanner class;

public class MyGraph {
    public static void main(String[] args) {
        //adding the adjacency Matrix
        // the matrix is contained in a two-dimensional array
        int[][] matrix = {
                {0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0,1,0},
        };
        while (true) {
        System.out.println("Enter the two nodes to check if there exists an edge between them, or enter 0 to quit \n");
        Scanner vertex = new Scanner(System.in);
        int vertex1 = vertex.nextInt(); // getting Vertex 1
        int vertex2 = vertex.nextInt(); // getting Vertex 2
        if (vertex1 == 0 || vertex2 == 0) {
            break;
        } else {
            //since our graph only contains nodes 1 to 10,
            // there is need to check if the user has entered the right nodes
            if(vertex1 >= 1 && vertex1 <= 10 && vertex2 >=1 && vertex2 <= 10) {

                // getting the index of each vertex requires subtracting 1 from the user input
                // Since indices of arrays always start from 0, so we need to get the exact index
                if (matrix[vertex1 - 1][vertex2 - 1] == 1) {
                    System.out.println("\nThere exists an edge between " + vertex1 + " and " + vertex2);
                } else {
                    System.out.println("\nThere exists no edge between " + vertex1 + " and " + vertex2);
                }
            } else {
                System.out.println("Either one or all the nodes entered do not exist on the graph");
            }
        }
        }
    }

}

