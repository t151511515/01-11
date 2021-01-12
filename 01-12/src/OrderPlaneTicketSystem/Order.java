package OrderPlaneTicketSystem;

import java.util.Set;

public class Order {
    private String id;
    private float jpjg;     //机票价格
    private float airPortTax;           //机场税
    private float ryf;              //燃油费
    private float hkzhx;            //航空综合险
    private float jptgx;            //机票退改险
    private float yhq;              //优惠券
    private float hszj;             //含税总价
    private Set<customer> customer;       //顾客数据总集//<>内为泛型


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpjg() {
        return jpjg;
    }

    public void setJpjg(float jpjg) {
        this.jpjg = jpjg;
    }

    public float getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(float airPortTax) {
        this.airPortTax = airPortTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Set<OrderPlaneTicketSystem.customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<OrderPlaneTicketSystem.customer> customer) {
        this.customer = customer;
    }
}
