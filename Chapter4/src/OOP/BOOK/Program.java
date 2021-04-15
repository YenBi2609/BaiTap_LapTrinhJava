package OOP.BOOK;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//· Create an instance of BookingRoom class
        BookingRoom objBookingRoom = new BookingRoom();
//  Accept date of check in date in this hotel
        Scanner input = new Scanner(System.in);

        System.out.println("Enter check in date (mm dd yyyy): ");

        byte day = input.nextByte();

        byte month = input.nextByte();

        short year = input.nextShort();
//· Set the check in date by passing primitive values to a method
        objBookingRoom.setBookingDate(day, month, year);
//        Create an instance of Time class and store check in time in it
        Time objTime = new Time();
//        · Accept time of check in date in this hotel

        System.out.println("Enter check in time (hh mm): ");

        objTime.hours = input.nextByte();

        objTime.minutes = input.nextByte();

//· Set the checkin time by passing an object to a method

        objBookingRoom.setCheckInTime(objTime);

//· Accept and set the type of room

        System.out.println("Enter the type of room: \n1. Single\n2. Double\n3. Twin\n");

        objBookingRoom.typeOfRoom = input.nextByte();

//· Accept and set the number of tickets

        System.out.println("Enter the number of rooms: ");

        objBookingRoom.noOfRooms = input.nextByte();

//· Display the ticket information

        objBookingRoom.displayTicketInformation();
    }
}
