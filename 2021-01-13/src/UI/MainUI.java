package UI;

import OrderPlaneTicketSystem.Flight;
import impl.FlightServiceImpl;
import impl.IFlightService;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入相应的数字进行操作：");
            System.out.println("按1：录入航班信息");
            System.out.println("按2：显示所有航班信息");
            System.out.println("按3：查询航班信息");
            System.out.println("按4：机票预订");
            System.out.println("按5：机票退订");
            System.out.println("按6：退出系统");

            int choice= scanner.nextInt();
            switch (choice){
                case 1:{
                    String id= UUID.randomUUID().toString().replace("-","");        //原地址有-，超出了存储范围，需要去掉
                    System.out.println("请输入航班编号：");
                    String flightId=scanner.next();
                    System.out.println("请输入机型：");
                    String planeType=scanner.next();
                    System.out.println("请输入座位数：");
                    int currentSeatsNum=scanner.nextInt();
                    System.out.println("请输入起飞机场：");
                    String departureAirPort=scanner.next();
                    System.out.println("请输入目的机场：");
                    String destinationAirPort=scanner.next();
                    System.out.println("请输入起飞时间：");
                    String departureTime=scanner.next();
                    Flight flight=new Flight(id,flightId,planeType,currentSeatsNum,departureAirPort,destinationAirPort,departureTime);
                    IFlightService iFlightService=new FlightServiceImpl();
                    iFlightService.insertFlight(flight);
                    break;
                }
                case 2:break;
                case 3:break;
                case 4:break;
                case 5:break;
                case 6:return;
                default: {
                    System.out.println("输入错误，请重新输入");
                    break;
                }
            }
        }
    }
}
