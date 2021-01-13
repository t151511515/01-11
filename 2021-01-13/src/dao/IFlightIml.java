package dao;

import OrderPlaneTicketSystem.Flight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class IFlightIml implements IFlightDao{


    public IFlightIml() throws SQLException {
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:oral";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt=conn.prepareStatement(sql);             //以下代码是将输入的数据导入数据库
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAlrPort());
        pstmt.setString(6,flight.getDestinationAirpORT());
        pstmt.setString(7,flight.getDepartureTime());
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
