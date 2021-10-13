package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Flight flight1 = new Flight("Missile", "Air India", 250, "15/oct/2021",
                "17/oct/2021", "15:30:00", "09:00:00");
        Flight flight2 = new Flight("Bejing", "Air India", 200, "14/oct/2021",
                "15/oct/2021", "09:00:00", "20:00:00");
        Passenger passenger1 = new Passenger("John", "+91 1023456789", "xyz@gmail.com",
                "Rajiv Chowk", "Delhi", "Delhi");
        Passenger passenger2 = new Passenger("James", "+91 1234567890", "pqr@gmail.com",
                "Sector 62", "Noida", "Uttar Pradesh");
        String[] touristLocation = {"Uttarakhand", "Red Fort", "Taj Mahal", "India Gate", "Lotus Temple"};
        touristTicket ticket1 = new touristTicket(28112928667L, "Rajiv Ghandi International airport",
                "Delhi International Airport", true, flight1, passenger1, "new delhi",
                touristLocation, 30000);
        regularTicket ticket2 = new regularTicket(025897854622L, "Delhi", "America",
                true, flight2, passenger2, "Noodles", "Cold Water", "Potato Chips,Chocolates", 25000);


        System.out.println(flight1.getFlightName());
        System.out.println(passenger1.getContactDetails());
        System.out.println(passenger2.getAddressDetails());
        System.out.println(ticket1.durationOfJourney());
        System.out.println(ticket2.durationOfJourney());
        System.out.println(flight1.getFlightDetails());

        System.out.println(ticket2.getPnrNumber());
        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnrNumber());
    }
}