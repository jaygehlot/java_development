package timbuchalka_interfaces;

public class App {

    public static void main(String[] args) {
        Telephone jaysPhone;
        jaysPhone = new DeskPhone(123456789);
        jaysPhone.powerOn();
        jaysPhone.callPhone(123456789);
        jaysPhone.answer();

        jaysPhone = new MobilePhone(23456);  //same object but assigned a different class
        jaysPhone.powerOn();
        jaysPhone.callPhone(23456);
        jaysPhone.answer();
    }
}
