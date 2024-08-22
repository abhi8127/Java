package commonMistake.emptyCollection;

public class Location {
    private String name;
    private double latitude;
    private double longitude;

    Location(String Name,double Latitude,double Longitude){
        this.name=Name;
        this.latitude=Latitude;
        this.longitude=Longitude;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
