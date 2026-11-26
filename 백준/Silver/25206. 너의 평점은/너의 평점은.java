import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double num = 0;     // 학점
        double total = 0;   // 학점 X 성적

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String object = st.nextToken();      // 과목명
            double d = Double.parseDouble(st.nextToken());  // 수강학점
            String sc = st.nextToken();     // 성적
            double score = 0;   // 성적변환
            if (!(sc.equals("P"))) {
                switch (sc) {
                    case "A+":
                        score += 4.5;
                        break;
                    case "A0":
                        score += 4.0;
                        break;
                    case "B+":
                        score += 3.5;
                        break;
                    case "B0":
                        score += 3.0;
                        break;
                    case "C+":
                        score += 2.5;
                        break;
                    case "C0":
                        score += 2.0;
                        break;
                    case "D+":
                        score += 1.5;
                        break;
                    case "D0":
                        score += 1.0;
                        break;
                    case "F":
                        score += 0.0;
                        break;
                }
                total += score * d;
                num += d;
            }
        }
       System.out.printf("%.6f", total / num);
        br.close();
    }
}