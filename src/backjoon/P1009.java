package backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        ArrayList<Integer> remain = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            remain.add(a);
            int A = a;
            int count = 0;

            while (a != 10) {
                count++;
                if ((a * A) % 10 == A && count > 1) {
                    break;
                }
                remain.add((a * A) % 10);
                a = (a * A) % 10;
            }

            if (a == 10) {
                remain.add(10);
            }

            int indexOfRemain = b % remain.size() - 1;
            if (indexOfRemain == -1) {
                indexOfRemain = remain.size() - 1;
            }
            bw.write(remain.get(indexOfRemain) + "\n");
            remain.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
