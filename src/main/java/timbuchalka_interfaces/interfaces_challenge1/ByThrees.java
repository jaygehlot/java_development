package timbuchalka_interfaces.interfaces_challenge1;

public class ByThrees implements Series {

    int val;

    ByThrees() {
        val = 0;
    }


    @Override
    public int getNext() {
        return val +=3;
    }
}
