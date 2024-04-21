import java.util.Scanner;

/**
 * adjacency_matrix
 */
public class adjacency_matrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Vertices : ");
    int n = sc.nextInt(); // number of vertices
    System.out.println("Enter the number of Edges : ");
    int m = sc.nextInt(); // number of edges

    int[][] gr = new int[n][n]; // adjacency matrix

    // Read edges
    for (int i = 0; i < m; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      gr[u][v] = 1;
      gr[v][u] = 1; // for undirected graphs
    }

    // Print the adjacency matrix
    System.out.println("Adjacency Matrix:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(gr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
