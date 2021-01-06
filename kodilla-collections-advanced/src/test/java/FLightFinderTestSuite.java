import com.kodilla.collections.adv.immutble.exercises.homework.Flight;
import com.kodilla.collections.adv.immutble.exercises.homework.FlightFinder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FLightFinderTestSuite {
    @Test
    public  void testFindFlightFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> flightFinderList = flightFinder.findFlightsFrom("London");
        //Then
        List<Flight> expeditionList = new ArrayList<>();

        expeditionList.add(new Flight("London","Gdańsk"));
        expeditionList.add(new Flight("London","Lublin"));
        expeditionList.add(new Flight("London", "Radom"));

        assertEquals(expeditionList,flightFinderList);
        assertEquals(3,flightFinderList.size());
    }
    @Test
    public  void testFindFlightTo(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight>flightFinderList = flightFinder.findFlightTo("Warszawa");
        List<Flight> findList = new ArrayList<>();
        findList.add(new Flight("London","Warszawa"));
        assertEquals(findList,flightFinderList.size());
        assertEquals(1,flightFinderList.size());
    }

    }
