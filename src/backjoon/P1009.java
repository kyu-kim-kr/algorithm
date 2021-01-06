package backjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        BigInteger bigNum;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bigNum = (BigInteger.valueOf(a).pow(b)).remainder(BigInteger.TEN);
            if (bigNum == BigInteger.ZERO) {
                bigNum = BigInteger.TEN;
            }

            bw.write(bigNum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
