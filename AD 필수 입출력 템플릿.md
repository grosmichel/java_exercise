## 1. 입출력 속도 차이
Scanner는 입력을 받을 때 정규식을 거쳐 데이터를 파싱하므로 느립니다. 반면 BufferedReader는 버퍼(메모리)에 일정한 크기의 데이터를 담아두었다가 한 번에 읽어오기 때문에 훨씬 빠릅니다.
* 입력: Scanner $\rightarrow$ BufferedReader + StringTokenizer
* 출력: System.out.println() $\rightarrow$ StringBuilder 또는 BufferedWriter

## 2. AD 필수 입출력 템플릿
AD 시험을 볼 때는 아래 구조를 기본 틀로 외워두고 시작하시는 것이 좋습니다.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception { // 예외 처리 필수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 한 줄 입력 받기
        int N = Integer.parseInt(br.readLine());
        
        // 2. 한 줄에 공백으로 구분된 여러 데이터 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[R][C];
        
        // 3. 2차원 배열 입력 받기
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
```

## 3. AD 취득을 위해 추가로 알아야 할 내장함수/클래스
IM에서 AD로 넘어갈 때는 알고리즘(DFS/BFS, 백트래킹, 완탐)을 구현해야 하므로 자료구조 클래스가 반드시 추가되어야 합니다.

### ① `java.util.StringTokenizer`
* `st.nextToken()` : 공백 단위로 구분된 다음 문자열 토큰을 가져옴
* `st.hasMoreTokens()` : 남아있는 토큰이 있는지 확인 (while문 탐색 시 활용)

### ② `java.util.Queue` & `LinkedList` (BFS 필수)
BFS(너비 우선 탐색)를 구현할 때 필수적인 자료구조입니다.
* `Queue<int[]> q = new LinkedList<>();` 형태로 생성
* `q.offer(item)` / `q.add(item)` : 큐에 요소 추가
* `q.poll()` : 큐의 맨 앞 요소를 꺼내고 반환 (비어있으면 null)
* `q.isEmpty()` : 큐가 비어있는지 확인 (boolean)

### ③ `java.util.Stack` 또는 `Deque` (DFS / 작업 처리)
* `stack.push(item)` : 스택에 요소 추가
* `stack.pop()` : 맨 위 요소 꺼내기

### ④ `java.util.PriorityQueue` (최단거리/우선순위 탐색)
* `PriorityQueue<Integer> pq = new PriorityQueue<>();` (오름차순)
* `PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());` (내림차순)