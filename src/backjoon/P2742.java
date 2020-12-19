package backjoon;

import java.io.*;

public class P2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = a; i >= 1; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
