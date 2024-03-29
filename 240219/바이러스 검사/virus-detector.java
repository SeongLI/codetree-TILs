import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int sup = sc.nextInt();
        int sub = sc.nextInt();

        long cnt = N;
        for(int i = 0 ; i < N ; i++){
            int temp = arr[i];
            temp -= sup;
            // while(temp > 0){
            //     temp-= sub;
            //     cnt++;
            // }
            if(temp > 0){
                cnt += temp % sub == 0 ? temp / sub : temp / sub + 1 ;
            }
        }
        System.out.print(cnt);
    }
}