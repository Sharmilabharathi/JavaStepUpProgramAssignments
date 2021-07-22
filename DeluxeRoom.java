/**
 * @author Sharmila
 */
public class DeluxeRoom extends HotelRoom{
    protected Integer ratePerSqFeet;

    public DeluxeRoom(){}
    public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 10;
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
