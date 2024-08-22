package commonMistake.emptyCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LocationServices {

    public static List<Location> getLocation(List<Location> list){
        //List<Location> lts=null;
       // List<Location> lts= Collections.EMPTY_LIST;
        //return lts;

        return list;
    }
    public static void main(String[] args){


        List<Location> listOfLocation= Arrays.asList(new Location("deoria",4.5,8.1),new Location("Salempur",4.8,8.3));

        List<Location> LL=getLocation(listOfLocation);

        if (LL.isEmpty()) {
            System.out.println("No locations available.");
        } else {
            System.out.println("Number of locations: " + LL.size());
        }
    }
}
