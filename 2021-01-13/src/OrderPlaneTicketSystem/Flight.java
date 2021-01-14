package OrderPlaneTicketSystem;

public class Flight {
    private String id;
    private String flightId;            //航班ID
    private String planeType;       //机型
    private int currentSeatsNum;              //座位号
    private String departureAirPort;        //起始机场
    private String destinationAirPort;      //目的机场
    private String departureTime;           //出发时间


    public Flight(String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureTime) {
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAlrPort, String destinationAirpPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAlrPort;
        this.destinationAirPort = destinationAirpPort;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                ", 航班ID='" + flightId + '\'' +
                ", 机型='" + planeType + '\'' +
                ", 座位数=" + currentSeatsNum +
                ", 起飞机场='" + departureAirPort + '\'' +
                ", 目的机场='" + destinationAirPort + '\'' +
                ", 起飞时间='" + departureTime + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
