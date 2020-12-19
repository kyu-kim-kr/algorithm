package backjoon;

import java.io.*;

public class P2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[][] arr = new String[a][a];
        int count = a;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                count--;
                arr[i][j] = " ";
                if(count <= i) {
                    arr[i][j] = "*";
                }
            }
            count = a;
        }
        for (int i =0;i<a;i++) {
            for (int j=0; j<a; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
