package javaMid1._05._01;

import java.io.*;

public class AuthGradeMain2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] : ");
        bw.flush();
        String grade = br.readLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        bw.write("당신의 등급은 " + authGrade.getDescription() + "입니다.\n");
        bw.flush();

        bw.write("== 메뉴 목록 ==\n");
        if (authGrade.getLevel() > 0) {
            bw.write("- 메인 화면\n");
        }
        if (authGrade.getLevel() > 1) {
            bw.write("- 이메일 관리 화면\n");
        }
        if (authGrade.getLevel() > 2) {
            bw.write("- 관리자 화면\n");
        }

        br.close();
        bw.close();
    }
}
