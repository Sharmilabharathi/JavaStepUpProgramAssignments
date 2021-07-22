/**
 * @author Sharmila
 */
public class SuiteRoom extends HotelRoom {
    private Integer ratePerSqFeet;

    public SuiteRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, Integer ratePerSqFeet) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 15;
    }

    @Override
    public Integer getRatePerSqFeet(){
        HotelRoom hotelRoom = new HotelRoom();
        if(hotelRoom.getHasWifi()){
            return ratePerSqFeet+2;
        }else{
            return ratePerSqFeet;
        }
    }
}
