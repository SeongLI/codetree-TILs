import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int row = 0;
        int col = 0;
        for(int i = 0 ; i < N ; i++){
            String st = sc.next();
            int num = sc.nextInt();

            // 동서남북
            if(st.equals("E")){
                col += num;
            }else if(st.equals("W")){
                col -= num;
            }else if(st.equals("S")){
                row -= num;
            }else{
                row += num;
            }
        }
        System.out.print(col + " " + row);

    }
}