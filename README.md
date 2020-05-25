# Virtual Pet Shelter

This app uses 4 classes to simulate a virtual pet shelter <br>
<b>VirtualPet </b> this is the base class for "pets" which go in the shelter. <br>
Pets have a name and a description.<br>
A pet has 3 needs: Boredom, Hunger, and Thirst.<br>
Aside from the getters all methods are dedicated to updating the integers for those needs.<br>
<br>
<b> VirtualPetShelter </b> is a class which stores multiple virtual pets using maps and collections. <br>
getPetShelter() returns  a collection of virtual pets which have been added to the shelter.<br>
getPetData() returns a map of pet names and descriptions. <br>
the _AllPets() methods (feedAllPets, waterAllPets, entertainAllPets) iterate through the petData map
and use it to update the needs of all pets at once. <br>
entertainOnePet looks up a pet by its unique name and updates its boredom level individually. <br>
tick() iterates through all shelter pets and updates their 3 needs. <br>
addNewPet() creates a new virtualPet based on user specifications.<br>
adoptOutPet() removes a pet from both petData and petShelter.
<br>
<br>
<b>VirtualPetShelterApp</b> is a class for initial shelter setup as well as interpreting user input. <br>
the method gameLoop() calls tick() for the virtualPets in petShelter<br>
 gameLoop() can be adapted in the future to add new relevant features. <br>
 shelterSetup() adds a handful of virtual pets to the shelter for the user to interact with <br>
 determineAction() uses a switch case to execute the proper methods depending on what the user inputs to the console. <br>
 Most other methods are used to call petShelter methods which update the needs and shelter status of pets. <br>
<br>
<br>
<b>VirtualPetShelterDisplay</b> is a class specifically for console output. <br>
Each switch case in VirtualPetShelterApp calls methods from VirtualPetShelterDisplay to write text out to the console. <br>
This class is mostly for organizational purposes so that VirtualPetShelterApp reads more legibly, <br>
and could be more easily adapted to use a different method of output. <br>
Miles Shank, May 2020<br>

