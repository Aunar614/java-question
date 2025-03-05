package javaBasic._08._01;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String s) {
        System.out.println("페이스북에서 발송합니다 : " + s);
    }
}
