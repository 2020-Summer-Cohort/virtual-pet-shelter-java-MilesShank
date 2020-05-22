package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    static VirtualPetShelter myShelter = new VirtualPetShelter();


    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        shelterSetup();
        initialInstructions();


    }
    public static void shelterSetup(){
        VirtualPet honeyFace = new VirtualPet("Honeyface","Very small, likes people");
        myShelter.addNewPet(honeyFace.getPetName(), honeyFace.getPetDescription());
        VirtualPet badgerNose = new VirtualPet("BadgerNose","Eats lots of carrots ^");
        myShelter.addNewPet(badgerNose.getPetName(), badgerNose.getPetDescription());
        VirtualPet bigOlBuster = new VirtualPet("Big Ol' Buster","HUGE rabbit. Just, ginormous.");
        myShelter.addNewPet(bigOlBuster.getPetName(),bigOlBuster.getPetDescription());
    }

    public static void initialInstructions(){
        System.out.println("here's where the instructions are gunna go when I feel like typing them all out");

    }

    public static void gameLoop(String userInput){
       myShelter.tick();
    }

    public static void gameLoop(int userInput){
        myShelter.tick();
    }
  //  public static void displayFeedPets(){
  //      System.out.println("you fed the pets");
  //  }
    public static void feedPets(){
        myShelter.feedAllPets();
    }

   // public static void displayWaterPets(){
  //      System.out.println("you watered the pets. like plants.");
  //  }

    public static void waterPets(){
        myShelter.waterAllPets();
    }
 //   public static void displayEntertainPets(){
  //      System.out.println("you entertained the pets. are they laughing with you or at you?");
 //   }

    public static void entertainPets(){
        myShelter.entertainAllPets();
    }

 //   public static void displayEntertainOnePet(String petName){
  //      System.out.println("you entertained " + petName + " somehow");
   // }
    public static void entertainOnePet(String petName){
        myShelter.entertainOnePet(petName);
    }
//    public static void displayAdoptPet(String petName){
 //       System.out.println("Looks like " + petName + " found their forever home. neat.");
 //   }
    public static void adoptPet(String petName){
        myShelter.adoptOutPet(petName);
    }
    public static void admitPet(String petName,String petDescription){
        VirtualPet newPet = new VirtualPet(petName, petDescription);
        myShelter.addNewPet(petName, petDescription);
    }
    public static void exit(){
        System.exit(0);
    }
}
