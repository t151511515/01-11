package OrderPlaneTicketSystem;

import java.util.Date;
import java.util.Set;

public class customer {
    public String id;
    public String name;                 //名字
    public String cardID;           //身份证
    public String phone;            //电话号码
    private String custoerType;             //顾客类型：成人、儿童、婴儿
    private Date birthDate;             //出生日期
    private Set<Order> orderSet;        //一个顾客能有多个订单

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustoerType() {
        return custoerType;
    }

    public void setCustoerType(String custoerType) {
        this.custoerType = custoerType;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}
