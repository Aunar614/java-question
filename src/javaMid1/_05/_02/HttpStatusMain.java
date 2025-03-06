package javaMid1._05._02;

import java.io.*;

public class HttpStatusMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("HTTP CODE : ");
        bw.flush();
        int httpCodeInput = Integer.parseInt(br.readLine());

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            bw.write("정의되지 않은 코드");
            bw.flush();
        } else {
            bw.write(status.getCode() + " " + status.getMessage() + "\n");
            bw.write("isSuccess = " + status.isSuccess() + "\n");
        }

        br.close();
        bw.close();
    }
}
