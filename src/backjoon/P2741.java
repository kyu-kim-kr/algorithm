package backjoon;

import java.io.*;

public class P2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            bw.write((i+1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
