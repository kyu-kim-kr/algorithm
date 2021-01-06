package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = (int)Math.pow(a, b)%10;
            if (c == 0) {
                c = 10;
            }
            bw.write(c + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
