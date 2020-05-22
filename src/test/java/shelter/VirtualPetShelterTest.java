package shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
     @Test
     public void petShelterShouldExist() {

     VirtualPetShelter newShelter = new VirtualPetShelter();
     Map petShelter = newShelter.getPetShelter();
     Collection petCollection = newShelter.getAllPets();
     newShelter.addNewPet("bob","swell guy");
     VirtualPet shelterPet = newShelter.getPet("bob");
     newShelter.adoptOutPet("bob");
     newShelter.feedAllPets();
     newShelter.waterAllPets();
     newShelter.entertainAllPets();
     newShelter.tick();
     newShelter.entertainOnePet("bob");


}

     @Test
     public void virtualPetShouldExist(){
          VirtualPet underTest = new VirtualPet("Billy", "brave strong pet");
          String petName = underTest.getPetName();
          assertEquals("Billy",petName);
          String petDescription = underTest.getPetDescription();
          assertEquals("brave strong pet",underTest.getPetDescription());
          int petHunger = underTest.getPetHunger();
          int petThirst = underTest.getPetThirst();
          int petBoredom = underTest.getPetBoredom();
     }
}
