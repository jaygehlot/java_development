package timbuchalka_interfaces;

/**
 * Created by jayg on 29/07/2017.
 */
public class DeskPhone implements Telephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.myNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
