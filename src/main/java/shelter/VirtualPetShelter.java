package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map <String,String> petData = new HashMap<>();
    Map <String,VirtualPet> petShelter = new HashMap<>();

    public Map getPetShelter() {
        return petShelter;
    }
    public Collection getAllPets() {
        Collection<VirtualPet> allPets = petShelter.values();
        return allPets;

    }

    public Map getPetData() {
        return petData;
    }

    public VirtualPet getPet(String petName) {
        return petShelter.get(petName);
    }

    public void addNewPet(String newPetName, String newPetDescription) {
        petData.put(newPetName,newPetDescription);
       VirtualPet newPet = new VirtualPet(newPetName,newPetDescription);
        petShelter.put(newPetName,newPet);
    }

    public void adoptOutPet(String adoptedPet) {
        petData.remove(adoptedPet);
    }

    public void feedAllPets() {
        for(Map.Entry<String, String> entry : petData.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetHunger(2);
        }
    }

    public void waterAllPets() {
        for(Map.Entry<String, String> entry : petData.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetThirst(2);
        }
    }

    public void entertainAllPets(){
        for(Map.Entry<String, String> entry : petData.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetBoredom(2);
        }
    }

    public void entertainOnePet(String petName) {
        VirtualPet needyPet = getPet(petName);
        needyPet.updatePetBoredom(3);
    }


    public void tick() {
        for(Map.Entry<String, String> entry : petData.entrySet()){
            VirtualPet needyPet = getPet(entry.getKey());
            needyPet.updatePetHunger(-1);
            needyPet.updatePetThirst(-1);
            needyPet.updatePetBoredom(-1);
        }
    }


}
