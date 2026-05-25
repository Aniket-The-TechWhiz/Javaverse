import java.util.Arrays;
import java.util.Scanner;

class User {
    private String vehicleNumber; 
    private int slotNumber;       

    public User(String vehicleNumber, int slotNumber) {
        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    @Override
    public String toString() {
        return "User[Vehicle: " + vehicleNumber + ", Slot: " + slotNumber + "]";
    }
}

public class ParkingLot {
    private User arr[];

    public ParkingLot(int size) {
        arr = new User[size]; 
    }

    public boolean checkFreeSpaceOrNot(int number) {
        try {
            return arr[number - 1] == null; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Spot " + number + " does not exist!");
            throw new IllegalArgumentException("Invalid parking spot number provided.", e);
        }
    }

    public void bookParkingLot(int number, String vehicleNumber) {
        try {
            if (checkFreeSpaceOrNot(number)) {
                arr[number - 1] = new User(vehicleNumber, number);
                System.out.println("Parking Booked successfully for vehicle: " + vehicleNumber);
            } else {
                System.out.println("Already Occupied by: " + arr[number - 1].getVehicleNumber());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }              
    }

    public void bookParkingLot(String vehicleNumber) {
        boolean booked = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == null) { 
                int spotNumber = i + 1;
                arr[i] = new User(vehicleNumber, spotNumber); 
                System.out.println("Parking Booked automatically at spot: " + spotNumber + " for vehicle: " + vehicleNumber);
                booked = true;
                break;             
            }
        }

        if (!booked) {
            System.out.println("Booking failed: Parking slots are full!");
        }
    }

    public void freeParkingLot(int number) {
        if (number < 1 || number > arr.length) {
            System.out.println("Error: Spot " + number + " does not exist!");
            return;
        }

        int index = number - 1;

        if (arr[index] != null) {
            System.out.println("Success: Spot " + number + " (Vehicle: " + arr[index].getVehicleNumber() + ") is now free.");
            arr[index] = null; 
        } else {
            System.out.println("Alert: Spot " + number + " is already vacant!");
        }
    }

    public int[] showUnbookedParkingLot() {
        int cnt = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                cnt++;
            }
        }
        
        int unbooked[] = new int[cnt];
        int index = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                unbooked[index] = i + 1; 
                index++; 
            }
        }
        return unbooked;
    }

    public User getUserBySpot(int number) {
        if (number < 1 || number > arr.length) {
            System.out.println("Invalid spot number.");
            return null;
        }
        return arr[number - 1]; 
    }

    public User getUserByVehicle(String vehicleNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {
                return arr[i];
            }
        }
        return null; 
    }

    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter total parking lot capacity: ");
    int size = scanner.nextInt();
    scanner.nextLine(); 

    ParkingLot lot = new ParkingLot(size);
    boolean exit = false;

    while (!exit) {
            System.out.println("\n===== PARKING LOT SYSTEM =====");
            System.out.println("1. Book Automatic Spot (From Last)");
            System.out.println("2. Book Specific Spot");
            System.out.println("3. Free a Spot");
            System.out.println("4. Show Unbooked Spots");
            System.out.println("5. Search Vehicle Location");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String v1 = scanner.nextLine();
                    lot.bookParkingLot(v1);
                    break;
                case 2:
                    System.out.print("Enter Spot Number: ");
                    int spot = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Vehicle Number: ");
                    String v2 = scanner.nextLine();
                    lot.bookParkingLot(spot, v2);
                    break;
                case 3:
                    System.out.print("Enter Spot Number to free: ");
                    int freeSpot = scanner.nextInt();
                    lot.freeParkingLot(freeSpot);
                    break;
                case 4:
                    System.out.println("Available slots: " + Arrays.toString(lot.showUnbookedParkingLot()));
                    break;
                case 5:
                    System.out.print("Enter Vehicle Number to search: ");
                    String searchV = scanner.nextLine();
                    User user = lot.getUserByVehicle(searchV);
                    if (user != null) {
                        System.out.println("Vehicle found at slot: " + user.getSlotNumber());
                    } else {
                        System.out.println("Vehicle not found inside the lot.");
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }
        scanner.close();
    }
}