# Project text:
"
* The Economic Model.Hotel, where Dunno and Kozlik went to spend the night,
* was famous for its cheapness. For fifty cents here you could get a
* completely comfortable room for the night, which was almost half the
* price than in any other hotel. This explained that the Economic Model.Hotel
* never experienced a shortage of residents. Everyone, having read the
* inscription on the sign: “The cheapest rooms in the world,”
* went to this hotel without hesitation. By paying fifty cents. Dunno and
* Kozlik received the key and, having found their number, found themselves
* in a small, clean room. There was a table, several chairs, a wardrobe,
* a washstand with a mirror against the wall, and even a TV in the corner.
* Having opened the closet and put their hats on the shelf, Dunno and Kozlik
* wanted to settle down to rest, but at that time the bell rang and in the
* place where there is usually an electric switch, a red peephole began to blink.
* Looking at this light signal, Dunno and Kozlik noticed how a flat metal tongue
* with a recess at the end stuck out from a hole in the wall, and a luminous
* inscription blinked under it: “Santik.
  "

# PROJECT STRUCTURE

## This project is for a basic hotel with name "ЭКОНОМИКА", rooms and  workers.

## The hotel class creates a hotel and has methods for adding rooms setting room price, setting receptionist and adding appliances to rooms

## The room class works with the room.

### creates rooms and adds appliances to it has other methods for setting the bookedState, price etc

## I made abstract class for person because i dont wanna be able to create objects of person.

### just to create a common base for methods and variables both in workers and guests to avoid repetition and maintain SOLID principles.

## The receptionist extends worker. I specially created the receptionist class because of the functions he might have in future like interactions with the guest.

## I have four interfaces :

### Onable,ringeable, Occupyable and blinkeable.

#### I did this to enable unrelated classes implement the same methods and to enable muntiple inheritance.

#### for example, ringeable is implemented in both telephone and bell, while peepHole implements both Onable and blinkeable.

#### the occupyable interface is implemented by appliances which canbe occupied like shelf and wardrobe and has a method to set if its occupied or not

## for the enums

### Gender and  Position

#### I want their values to be  constants that i can enumerate and use the ordinals for loops later in the project. And also for simplicity purposes.

## The main class creates a Hotel Object and Guests(Kozlic and Dunno as from lab ) and receptionist and demonstrates some of the methods in guest and hotel. 
