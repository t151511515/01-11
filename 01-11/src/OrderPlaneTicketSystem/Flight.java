package OrderPlaneTicketSystem;

public class Flight {
    private String id;
    private String planeType;       //机型
    private String departureAlrPort;        //起始机场
    private String destinationAirpORT;      //终点机场
    private String departureTime;           //飞行时间

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
