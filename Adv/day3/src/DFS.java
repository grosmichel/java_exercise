import java.util.Scanner;
public class DFS {

    static int n;
    static int m;
    static int[][] mat;
    static int[] visited;
    static int cnt = 0;

    static void dfs(int curr_node){
        // 현재 노드 방문 처리
        visited[curr_node] = 1;

        // 1번 노드부터 n번 노드까지 연결 여부 확인
        for(int i = 1; i <= n; i++){
            if(mat[curr_node][i] == 1 && visited[i] == 0){
                dfs(i); // 연결된 미방문 노드로 계속 탐색
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        mat = new int[n+1][n+1];
        visited = new int[n+1];
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            mat[r][c] = 1;
            mat[c][r] = 1;
        }
        // Please write your code here.
        dfs(1);
        for(int i=0;i<n+1;i++){
            if(visited[i] == 1){
                cnt += 1;
            }
        }
        System.out.println(cnt-1);
    }
}