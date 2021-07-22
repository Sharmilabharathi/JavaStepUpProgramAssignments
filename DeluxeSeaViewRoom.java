/**
 * @author Sharmila
 */
public class DeluxeSeaViewRoom extends DeluxeRoom{

    public DeluxeSeaViewRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi){
      super(hotelName, numberOfSqFeet, hasTV, hasWifi);
      this.ratePerSqFeet=12;
    }
}
