/**
 * @author Sharmila
 */
public class HotelRoom {
    private String hotelName;
    private Integer numberOfSqFeet;
    private Boolean hasTV;
    private Boolean hasWifi;

    public HotelRoom(){}

    public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getNumberOfSqFeet() {
        return numberOfSqFeet;
    }

    public void setNumberOfSqFeet(Integer numberOfSqFeet) {
        this.numberOfSqFeet = numberOfSqFeet;
    }

    public Boolean getHasTV() {
        return hasTV;
    }

    public void setHasTV(Boolean hasTV) {
        this.hasTV = hasTV;
    }

    public Boolean getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(Boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Integer calculateTariff(Integer numberOfSqFeet,Integer ratePerSquareFeet){
        return numberOfSqFeet*ratePerSquareFeet;
    }

    public Integer getRatePerSqFeet(){
        return 0;
    }
}
