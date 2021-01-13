package OrderPlaneTicketSystem;

public class Flight {
    private String id;
    private String flightId;            //航班ID

    private String planeType;       //机型
    private int currentSeatsNum;              //座位号

    private String departureAlrPort;        //起始机场
    private String destinationAirpPort;      //目的机场
    private String departureTime;           //出发时间
    //private String totalSeatNum;        //总的座位数据


    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAlrPort, String destinationAirpPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAlrPort = departureAlrPort;
        this.destinationAirpPort = destinationAirpPort;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureAlrPort='" + departureAlrPort + '\'' +
                ", destinationAirpORT='" + destinationAirpPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +

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

    public String getDestinationAirpPort() {
        return destinationAirpPort;
    }

    public void setDestinationAirpORT(String destinationAirpORT) {
        this.destinationAirpPort = destinationAirpORT;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
