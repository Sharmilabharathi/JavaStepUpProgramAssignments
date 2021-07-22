import java.util.Scanner;

/**
 * @author Sharmila
 */
public class HotelRoomSelectionMain {
    public static void main(String[] args){
        System.out.println("Hotel Tariff Calculator\n"+"1. Deluxe Room\n" +
                "2. Deluxe AC Room\n" +
                "3. Suite AC Room\n");
        System.out.println("Select Room Type:");
        int roomType = new Scanner(System.in).nextInt();
        System.out.println("Hotel Name:");
        String hotelName = new Scanner(System.in).nextLine();
        System.out.println("Room Square Feet Area:");
        int numberOfSqFeet = new Scanner(System.in).nextInt();
        System.out.println("Room has TV (yes/no):");
        String tvSelection = new Scanner(System.in).nextLine();
        System.out.println("Room has Wifi (yes/no):");
        String wifiSelection = new Scanner(System.in).nextLine();

        boolean hasTV = getTvSelection(tvSelection);
        boolean hasWifi = getWifiSelection(wifiSelection);

        DeluxeRoom deluxeRoom = new DeluxeRoom(hotelName,
                numberOfSqFeet,
                hasTV,
                hasWifi);
        DeluxeSeaViewRoom deluxeACRoom = new DeluxeSeaViewRoom(hotelName,
                numberOfSqFeet,
                hasTV,
                hasWifi);
        SuiteRoom suiteRoom = new SuiteRoom(hotelName,
                numberOfSqFeet,
                hasTV,
                hasWifi);
        Integer costPerSquareFeet,calculateHotelTariff;

        if(roomType==1){
            costPerSquareFeet = deluxeRoom.getRatePerSqFeet();
            calculateHotelTariff = deluxeRoom.calculateTariff(deluxeRoom.getNumberOfSqFeet(),costPerSquareFeet);
            System.out.println("Room Tariff per day is:"+ calculateHotelTariff);
        }else if(roomType==2){
            costPerSquareFeet = deluxeACRoom.getRatePerSqFeet();
            calculateHotelTariff = deluxeACRoom.calculateTariff(deluxeACRoom.getNumberOfSqFeet(),costPerSquareFeet);
            System.out.println("Room Tariff per day is:"+ calculateHotelTariff);
        }else if(roomType==3){
            costPerSquareFeet = suiteRoom.getRatePerSqFeet();
            calculateHotelTariff = suiteRoom.calculateTariff(suiteRoom.getNumberOfSqFeet(),costPerSquareFeet);
            System.out.println("Room Tariff per day is:"+ calculateHotelTariff);
        }else{
            System.out.println("Invalid Room Type");
        }


    }

    public static Boolean getTvSelection(String hasTV){
        if(hasTV.equalsIgnoreCase("yes"))
            return true;
        else
            return false;

    }

    public static Boolean getWifiSelection(String hasWifi){
        if(hasWifi.equalsIgnoreCase("yes"))
            return true;
        else
            return false;

    }
}
