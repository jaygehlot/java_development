package accessmodifiers;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 19/07/14
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */

class Hotel {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class SuperHotel extends Hotel {
    public void book() {
        bookings--;
    }

    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }

    public static void main(String args[]) {
        Hotel hotel = new SuperHotel();
        //hotel.book(2);   // due to polymorphism, this line will look at the Hotel class book method,
                          //which doesn't have an argument
        System.out.print(hotel.bookings);
    }
}

