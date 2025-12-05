public class Vehicle {  
    public void refuel(String fuelType){
        System.out.println("Refueling vehicle with "+fuelType);
    }
    // Stub method to refuel a vehicle with a specific type and amount of fuel (in liters)
    public void refuel(String fuelType, int liters) 
	{
      System.out.println("Refueling vehicle with " +liters+ " liters of " +fuelType+ ".");
    }

    // Stub method to refuel a vehicle with a specific type and amount of fuel (in gallons)
    public void refuel(String fuelType, double gallons) {
        System.out.println("Refueling vehicle with " +gallons+ " gallons of " +fuelType+ ".");
    }

    // Stub method to refuel multiple types of fuel (String array)
    public void refuel(String[] fuelTypes) {
        System.out.print("Refueling vehicle with multiple types of fuel: ");
        for (String fuel : fuelTypes) {
            System.out.print(fuel + " ");
        }
        System.out.println();
    }

    // Stub method to refuel multiple types of fuel with respective amounts (String array and int array)
    public void refuel(String[] fuelTypes, int[] amounts) {
        System.out.print("Refueling vehicle with multiple types and amounts of fuel: ");
        for (int i = 0; i < fuelTypes.length; i++) {
            System.out.print(amounts[i] + " liters of " + fuelTypes[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        // Testing stub methods
        vehicle.refuel("gasoline");
        vehicle.refuel("diesel", 50);
        vehicle.refuel("natural gas", 20.5);

        String[] fuelTypes = {"gasoline", "diesel", "natural gas"};
        int[] amounts={40,60,30};

        vehicle.refuel(fuelTypes);
        vehicle.refuel(fuelTypes,amounts);
    }
}
