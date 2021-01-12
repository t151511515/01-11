package impl;

import OrderPlaneTicketSystem.Flight;

import java.util.Set;

public interface IFlightService{



    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}
