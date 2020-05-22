package shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
     @Test
     public void petShelterShouldExist() {

     VirtualPetShelter newShelter = new VirtualPetShelter();
     Map petData = newShelter.getPetData();
     Map petShelter = newShelter.getPetShelter();
     Collection petCollection = newShelter.getAllPets();
     newShelter.addNewPet("bob","swell guy");
     VirtualPet shelterPet = newShelter.getPet("bob");
     assertEquals(5, shelterPet.getPetHunger());
     newShelter.feedAllPets();
     assertEquals(7,shelterPet.getPetHunger());
     assertEquals(5,shelterPet.getPetThirst());
     newShelter.waterAllPets();
     assertEquals(7,shelterPet.getPetThirst());
     assertEquals(5,shelterPet.getPetBoredom());
     newShelter.entertainAllPets();
     assertEquals(7,shelterPet.getPetBoredom());
     newShelter.tick();
     assertEquals(6,shelterPet.getPetHunger());
     assertEquals(6,shelterPet.getPetThirst());
     assertEquals(6,shelterPet.getPetBoredom());
     newShelter.entertainOnePet("bob");
     assertEquals(9,shelterPet.getPetBoredom());
          newShelter.adoptOutPet("bob");

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
