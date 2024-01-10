import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 격자의 크기
        int t = sc.nextInt(); // 시간
        int[][] map = new int[n+1][n+1];
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        // 상하우좌
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        String direction = sc.next();
        int dir =-1;

        if(direction.equals("U")){
            dir = 0;
        } else if(direction.equals("D")){
            dir = 1;
        } else if(direction.equals("R")){
            dir = 2;
        } else {
            dir = 3;
        }

        while(t > 0){
            int nr = row + dr[dir];
            int nc = col + dc[dir];
            if(nr <= 0 || nc <= 0 || nr > n || nc > n){
                if(dir == 0) dir = 1;
                else if(dir == 1) dir = 0;
                else if(dir == 2) dir = 3;
                else dir = 2;
                t--;
                continue;
            }
            row = nr;
            col = nc;
            t--;
        }

        System.out.print(row +" "+col);



    }
}