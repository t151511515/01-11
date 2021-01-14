package UI;

import OrderPlaneTicketSystem.Flight;
import impl.FlightServiceImpl;
import impl.IFlightService;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {
    public static void main(String[] args){
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
                    Flight flight=new Flight(id,flightId,planeType,currentSeatsNum,
                            departureAirPort,destinationAirPort,departureTime);
                    IFlightService iFlightService= new FlightServiceImpl();
                    try {
                        iFlightService.insertFlight(flight);
                    } catch (SQLException e) {
                        String errorMessage = e.getMessage();
                        if (errorMessage.startsWith("ORA-12899")) {
                            //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                            // 按指定模式在字符串查找
                            String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                            // 创建 Pattern 对象
                            Pattern r = Pattern.compile(pattern);
                            // 现在创建 matcher 对象
                            Matcher m = r.matcher(errorMessage);
                            if (m.find()) {
                                String tableName = m.group(4);
                                String columnName = m.group(5);
                                System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查，联系管理员");
                            } else {
                                System.out.println("NO MATCH");
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    IFlightService iFlightService = new FlightServiceImpl();
                    try {
                        Set<Flight> allFlights = iFlightService.getAllFlights();
                    /*
                    Set的遍历需要用到迭代器
                     */
                        for (Flight flight : allFlights) {
                            System.out.println(flight);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                case 3: {
                    System.out.println("输入相应的编号选择您要查询航班的方式：");
                    System.out.println("1，按起飞时间查询");
                    System.out.println("2，按空座信息查询");
                    System.out.println("3，按起飞第查询");
                    System.out.println("4，按目的地查询");
                    int choose = scanner.nextInt();
                    if (choose == 1) {
                        System.out.println("请输入起飞时间：");
                        String departureTime = scanner.next();
                        IFlightService iFlightService = new FlightServiceImpl();
                        try {
                            Flight flight = iFlightService.getFlightByDepartureTime(departureTime);
                            if (flight != null) {
                                System.out.println("查询结果：" + flight);
                            } else {
                                System.out.println("没有查询到该时间的航班");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                            break;
                        }
                    }
                }
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
