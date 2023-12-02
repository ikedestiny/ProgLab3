package Model;

import Appliances.*;
import People.Guest;
import People.Receptionist;
import RootOfModel.Gender;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Hotel hotel = new Hotel("ЭКОНОМИЧЕСКАЯ", new Receptionist("Vivian", 25, Gender.FEMALE));
        hotel.setRoomsPrice(50);
        hotel.fillSomeRooms(100);
        hotel.addAppliance(new Bell());
        hotel.addAppliance(new PeepHoleBulb());
        hotel.addAppliance(new Chair());
        hotel.addAppliance(new Wardrobe());
        hotel.addAppliance(new TV());
        hotel.addAppliance(new Telephone());
        hotel.addAppliance(new Closet());
        hotel.addAppliance(new Shelf());

        Guest guests = new Guest("Dunno", 25, Gender.MALE);
        Guest guests1 = new Guest("Kozlik", 25, Gender.MALE);

        hotel.getReceptionist().welcomeGuest(guests, hotel);
        guests.bookRoom(hotel, 100);
        guests1.bookRoom(hotel, 100);
        guests1.getRoom().setBooked(true);
        hotel.getReceptionist().giveGuestKey(guests);

        guests.openCloset();
        guests.getSettled();
        guests1.layOnBed();
        guests.layOnBed();

        guests.getRoom().ringBell();
        guests.getRoom().blinkHole();
        guests.call(hotel.getReceptionist());

        System.out.println(hotel.getReceptionist().toString());


    }
}
