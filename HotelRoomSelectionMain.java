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
        Integer roomType = new Scanner(System.in).nextInt();
        System.out.println("Hotel Name:");
        String hotelName = new Scanner(System.in).nextLine();
        System.out.println("Room Square Feet Area:");
        Integer numberOfSqFeet = new Scanner(System.in).nextInt();
        System.out.println("Room has TV (yes/no):");
        String tvSelection = new Scanner(System.in).nextLine();
        System.out.println("Room has Wifi (yes/no):");
        String wifiSelection = new Scanner(System.in).nextLine();

        Boolean hasTV = getTvSelection(tvSelection);
        Boolean hasWifi = getWifiSelection(wifiSelection);

        HotelRoom hotelRoom = new HotelRoom(hotelName,numberOfSqFeet,hasTV,hasWifi);
        DeluxeRoom deluxeRoom;
        DeluxeSeaViewRoom deluxeACRoom;
        SuiteRoom suiteRoom;

        if(roomType==1){
            deluxeRoom = new DeluxeRoom();
            Integer costPerSquareFeet = deluxeRoom.getRatePerSqFeet();
            Integer calculateHotelTarrif = deluxeRoom.calculateTariff(hotelRoom.getNumberOfSqFeet(),costPerSquareFeet);
            System.out.println("Room Tariff per day is:"+calculateHotelTarrif);
        }


    }

    public static Boolean getTvSelection(String hasTV){
        if(hasTV.equals("yes")){
             return true;
        }else{
            return false;
        }

    }

    public static Boolean getWifiSelection(String hasWifi){
        if(hasWifi.equals("yes")){
            return true;
        }else{
            return false;
        }

    }
}
