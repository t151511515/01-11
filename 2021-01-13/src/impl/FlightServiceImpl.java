package impl;

import OrderPlaneTicketSystem.Flight;
import dao.IFlightDao;
import dao.IFlightIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;  //因为要给FlightImpl传值，然而两层之间要用接口进行通信需要通过接口，所以需要创建接口这个成员变量

    public FlightServiceImpl()  {
        iFlightDao=new IFlightIml();               //构造方法就是给成员变量赋值
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        System.out.println(flight);
        iFlightDao.insertFlight(flight);        //将对象的属性传到dao里面
    }

    @Override
    public Set<Flight> getAllFlights() {
        return iFlightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return iFlightDao.getFlightByDepartureTime(departureTime);
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
