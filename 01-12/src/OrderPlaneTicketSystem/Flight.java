package OrderPlaneTicketSystem;

public class Flight {
    private String id;
    private String planeType;       //机型
    private String departureAlrPort;        //起始机场
    private String destinationAirpORT;      //目的机场
    private String departureTime;           //出发时间
    private String seatNo;              //座位号
    private String totalSeatNum;        //总的座位数据

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
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
