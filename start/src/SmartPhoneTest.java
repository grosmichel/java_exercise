class SmartPhone {
    static double osVer = 1.0;
    String number;
    void call(String to){ // 파라미터 변수
        String msg = "띠"; // 로컬 변수
        for(int i=0; i<3; i++){ // 로컬 변수
            System.out.println(msg);
        }
    }
}

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone sphone = new SmartPhone();
        sphone.number = "010";
        System.out.println(sphone.osVer+" : "+sphone.number);
        sphone.call("011");

        SmartPhone sphone2 = new SmartPhone();
        sphone2.number = "010-111-1111";
        System.out.println(sphone2.osVer+" : "+sphone2.number);

        SmartPhone.osVer = 2.0;
        System.out.println(sphone.osVer+" : "+sphone.number);
    }
}