package com.company;

public class Main {

    public static void main(String[] args) {

        Planet myPlanet = Planet.MARS;
        isPlanetHabitable(myPlanet);
    }

    static void isPlanetHabitable(Planet myWorld){

        switch(myWorld) {
            case EARTH:
                System.out.println("You can definitely live here!.");
                System.out.println("This is ranked as planet number #" + myWorld.planetNumber);
                break;
            case MARS:
                System.out.println("We can't live there yet, except for Elon Musk :/");
                System.out.println("This is ranked as planet number #" + myWorld.planetNumber);
                break;
            case MOON:
                System.out.println("Jeff Bezos went there and this is not a planet :(");
                break;
            default:
                System.out.println("This is not yet a habitable planet of us!. Sorry :(.");
                break;
        }
    }

    enum Planet{
        MERCURY(1),
        VENUS(2),
        EARTH(3),
        MARS(4),
        JUPITER(5),
        SATURN(6),
        URANUS(7),
        NEPTUNE(8),
        PLUTO(9),
        MOON(0);

        int planetNumber;

        Planet(int planetNumber){
            this.planetNumber=planetNumber;
        }
    }
}
