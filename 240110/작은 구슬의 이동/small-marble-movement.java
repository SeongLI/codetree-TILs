import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 격자의 크기
        int t = sc.nextInt(); // 시간
        int[][] map = new int[n+1][n+1];
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        // 상우하좌
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};

        String direction = sc.next();
        int dir =-1;

        if(direction.equals("U")){
            dir = 0;
        } else if(direction.equals("D")){
            dir = 2;
        } else if(direction.equals("R")){
            dir = 1;
        } else {
            dir = 3;
        }

        while(t > 0){
            System.out.println("row : " + row + " col : " + col);
            t--;
            int nr = row + dr[dir];
            int nc = col + dc[dir];
            if(nr <= 0 || nc <= 0 || nr > n || nc > n){
                dir = (dir+2) % 4;
            }else{
                row = nr;
                col = nc;
            }
        }

        System.out.print(row +" "+col);

    }
}