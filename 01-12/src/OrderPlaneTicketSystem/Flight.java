package OrderPlaneTicketSystem;

public class Flight {
    private String id;
    private String planeType;       //机型
    private String departureAlrPort;        //起始机场
    private String destinationAirpORT;      //目的机场
    private String departureTime;           //出发时间
    private int currentSeatsNum;              //座位号
    private String totalSeatNum;        //总的座位数据
    private String flightId;            //航班ID

    public Flight(String id, String planeType, String departureAlrPort, String destinationAirpORT, String departureTime, int currentSeatsNum, String totalSeatNum, String flightId) {
        this.id = id;
        this.planeType = planeType;
        this.departureAlrPort = departureAlrPort;
        this.destinationAirpORT = destinationAirpORT;
        this.departureTime = departureTime;
        this.currentSeatsNum = currentSeatsNum;
        this.totalSeatNum = totalSeatNum;
        this.flightId = flightId;
    }

    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureTime) {
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureAlrPort='" + departureAlrPort + '\'' +
                ", destinationAirpORT='" + destinationAirpORT + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", totalSeatNum='" + totalSeatNum + '\'' +
                ", flightId='" + flightId + '\'' +
                '}';
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getTotalSeatNum() {
        return totalSeatNum;
    }

    public void setTotalSeatNum(String totalSeatNum) {
        this.totalSeatNum = totalSeatNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAlrPort() {
        return departureAlrPort;
    }

    public void setDepartureAlrPort(String departureAlrPort) {
        this.departureAlrPort = departureAlrPort;
    }

    public String getDestinationAirpORT() {
        return destinationAirpORT;
    }

    public void setDestinationAirpORT(String destinationAirpORT) {
        this.destinationAirpORT = destinationAirpORT;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
