package impl;

import OrderPlaneTicketSystem.Flight;
import dao.IFlightDao;
import dao.IFlightIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

    public FlightServiceImpl() throws SQLException {
        this.iFlightDao=new IFlightIml();               //构造方法
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        System.out.println(flight);
        iFlightDao.insertFlight(flight);        //将对象的属性传到dao里面
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
