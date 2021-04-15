package OOP.BOOK;

public class BookingRoom {

    public BookingRoom(){
    CheckInDate = new Date();
    CheckInTime = new Time();}

    Date CheckInDate;
    Time CheckInTime;
    byte noOfRooms;
    double totalPrice;
    byte typeOfRoom;

    void getBookingDate() {
        System.out.println("Check in Date: " + CheckInDate.day + "/" + CheckInDate.month + "/" + CheckInDate.year);
    }
    void setBookingDate(byte d, byte m, short y) {

        CheckInDate.day = d;
        CheckInDate.month = m;
        CheckInDate.year = y;
    }
    void getBookingTime() {
        System.out.println("Check in Time: " + CheckInTime.hours + ":" +
                CheckInTime.minutes);
    }
    void setCheckInTime(Time obj) {
        CheckInTime.hours = obj.hours;
        CheckInTime.minutes = obj.minutes;
    }
    double getTotalPrice() {
        switch(typeOfRoom) {
            case 1:
                totalPrice = noOfRooms * 1000;
                break;
            case 2:
                totalPrice = noOfRooms * 1500;
                break;
            case 3:
                totalPrice = noOfRooms * 1600;
                break;
        }
        return totalPrice;
    }
    void displayTicketInformation() {
        System.out.println("\nFollowing is the information about the room(s) booked: ");
        System.out.println("--------------------------------------------------------");
        getBookingDate();
        getBookingTime();
        System.out.println("Number of tickets: " + noOfRooms);
        System.out.print("Type of Room: ");
        switch(typeOfRoom) {
            case 1:
                System.out.print("Single");
                break;
            case 2:
                System.out.print("Double");
                break;
            case 3:
                System.out.print("Twin");
                break;
        }
        System.out.printf("\nTotal cost of the ticket: $%.2f", getTotalPrice());
    }
}
