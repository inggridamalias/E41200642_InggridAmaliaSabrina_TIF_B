package DFS;

/**
 *
 * @inggridamaliasabrina
 */
public class Graphdfs {
    private final int MAX_VERTS = 20;
    private final Vertexdfs vertexList[];
    private final int adjMat[][];
    private int nVerts;
    private final Stackdfs theStack;
    
    public Graphdfs() {
        vertexList = new Vertexdfs[MAX_VERTS];
        adjMat = new int [MAX_VERTS] [MAX_VERTS];
        nVerts = 0;
        for (int y = 0; y < MAX_VERTS; y++) {
            for (int x = 0; x < MAX_VERTS; x++) {
                adjMat [x][y] = 0;
            }
        }
        theStack = new Stackdfs();
    }   
    public void addVertexdfs(char label) { 
        vertexList[nVerts++] = new Vertexdfs(label);
    }
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }
    public void displayVertexdfs(int v) {
        System.out.print(vertexList[v].label);
    }
    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        }
    void addVertex(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

