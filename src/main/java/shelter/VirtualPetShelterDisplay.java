package shelter;

import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelterDisplay {

    public static void initialInstructions(){
        System.out.println("here's where the instructions are gunna go when I feel like typing them all out");

    }
    public static void mainMenu(){
        System.out.println("press 0 to view the status of your pets");
        System.out.println("press 1 to feed pets");
        System.out.println("press 2 to water pets");
        System.out.println("press 3 to entertain pets");
        System.out.println("press 4 to entertain a pet of your choosing");
        System.out.println("press 5 to adopt out a pet");
        System.out.println("press 6 to admit a new pet to the shelter");
    }

    public static void displayPetStatus(VirtualPet thisPet){
        System.out.println(thisPet.getPetName() + "--------");
        System.out.println(thisPet.getPetDescription());
        System.out.println();
        System.out.println("HUNGER: " + thisPet.getPetHunger());
        System.out.println("THIRST: " + thisPet.getPetThirst() );
        System.out.println("BOREDOM: " + thisPet.getPetBoredom());
        System.out.println();
    }
    public static void displayEntertainOnePet(String petName){
        System.out.println("you entertained " + petName + " somehow");
    }
    public static void displayAdoptPet(String petName){
        System.out.println("Looks like " + petName + " found their forever home. neat.");
    }
    public static void displayEntertainPets(){
        System.out.println("you entertained the pets. are they laughing with you or at you?");
    }
    public static void displayWaterPets(){
        System.out.println("you watered the pets. like plants.");
    }
    public static void displayFeedPets(){
        System.out.println("you fed the pets");
    }
    public static void userCommandError(){
        System.out.println("sorry, you've typed something I don't understand");
        System.out.println("please type a number between 0-6");
    }

    public static void displaySelectPet() {
        System.out.println("select your pet. eventually this command will print out pet names for you to pick from");
    }

    public static void displayAdoptionPrompt() {
        System.out.println("who is getting adopted?");
    }

    public static void displayNewPetNamePrompt() {
        System.out.println("whats the name of the pet you are admitting to the shelter?");
    }

    public static void displayNewPetDescriptionPrompt() {
        System.out.println("Please describe the new pet briefly:");
    }

    public static void displayAdmitPet(String newPetName) {
        System.out.println("I am sure that " +newPetName+ " will be very happy and safe here.");
    }
}
