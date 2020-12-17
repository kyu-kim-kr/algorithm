package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P15552 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                int A = Integer.parseInt(br.readLine());
                int B = Integer.parseInt(br.readLine());
                bw.write(A + B);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
