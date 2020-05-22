package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map <String,String> petShelter = new HashMap<>();

    public Collection getAllPets() {
        return null;

    }

    public Map getPetShelter() {
        return petShelter;
    }

    public VirtualPet getPet(String petName) {
        return null;
    }

    public void addNewPet(String newPetName, String newPetDescription) {
        petShelter.put(newPetName,newPetDescription);
    }

    public void adoptOutPet(String adoptedPet) {
        petShelter.remove(adoptedPet);
    }

    public void feedAllPets() {
        for(Map.Entry<String, String> entry : petShelter.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetHunger(2);
        }
    }

    public void waterAllPets() {
        for(Map.Entry<String, String> entry : petShelter.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetThirst(2);
        }
    }

    public void entertainAllPets(){
        for(Map.Entry<String, String> entry : petShelter.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetBoredom(2);
        }
    }

    public void entertainOnePet(String petName) {
        VirtualPet needyPet = getPet(petName);
        needyPet.updatePetBoredom(3);
    }


    public void tick() {
        for(Map.Entry<String, String> entry : petShelter.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetHunger(-1);
            needyPet.updatePetThirst(-1);
            needyPet.updatePetBoredom(-1);
        }
    }

}
