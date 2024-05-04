/* the House Class */
import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  private boolean hasElevator;

  /*consturctor */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElavator, ArrayList<String> residents) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = residents;
    
  }

  /**
   * Getter for whether has a dinning room 
   * @return T/F has a dinning room
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * Getter for number of residents 
   * @return number of residents 
   */
  public int nResidents() {
    try{
      return this.residents.size();
  }catch (Exception e){
    System.out.println(e);
    return 0;
  }
  }

  /**
   * resident movein
   * @param name name of resident
   */
  public void moveIn(String name){
    if (isResident(name) == false){
      this.residents.add(name);
    }
  }

  /**
   * resident moveout
   * @param name the name of resident
   * @return name the name of resident who moved out
   */
  // return the name of the person who moved out
  public String moveOut(String name){
    if (isResident(name) == true){
      this.residents.remove(name);
      return name;
    }else {
      return name + "Not found";
    }
  }

  /**
   * the resident is in the house
   * @param person the resident 
   * @return T/F if the resident is the list
   */
  public boolean isResident(String person){
    if (this.residents.contains(person)){
      System.out.println(person + " is in " + name);
      return true;
    }else{
      return false;
    }
  }

  public void showOptions() {
    super.showOptions();
  }

  public void goToFloor(int floorNum) {
    if (hasElevator == true){
      super.goToFloor(floorNum);
    }
    
  }


  public static void main(String[] args) {
    // Create an ArrayList to store residents for the house
    ArrayList<String> residents = new ArrayList<>();
    residents.add("John");
    residents.add("Alice");
    
    // Create a new House instance
    House myHouse = new House("Cozy Home", "123 Main St", 2, true, true, residents);

    // Test the methods
    System.out.println("Number of residents: " + myHouse.nResidents()); 
    System.out.println("Has dining room? " + myHouse.hasDiningRoom());

    // Move in a new resident
    myHouse.moveIn("Jordan");

    // Test if a resident is in the house
    System.out.println("Is Jordan a resident? " + myHouse.isResident("Jordan"));

    // Move out a resident
    System.out.println("Moved out: " + myHouse.moveOut("Alice")); 

    // Test if a resident is still in the house
    System.out.println("Is Alice a resident? " + myHouse.isResident("Alice")); 
}
}
