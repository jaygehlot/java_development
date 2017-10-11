package timbuchalka_interfaces;


public class MobilePhone implements Telephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int phoneNumber) {
        this.myNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now ringing " + phoneNumber + "on mobilephone");
        } else {
            System.out.println("Switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobilephone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
