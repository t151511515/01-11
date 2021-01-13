package impl;

import OrderPlaneTicketSystem.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService{



    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}
