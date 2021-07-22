/**
 * @author Sharmila
 */
public class SuiteRoom extends HotelRoom {
    private Integer ratePerSqFeet;

    public SuiteRoom(){}
    public SuiteRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 15;
    }

    @Override
    public Integer getRatePerSqFeet(){
        if(this.getHasWifi()){
            return ratePerSqFeet+2;
        }else{
            return ratePerSqFeet;
        }
    }
}
