import java.util.Date;

public class Car {
    private Date madeDate;
    private String mark;
    private String type;
    private String energyType;

    void setMadeDaten(Date value)
    {
        this.madeDate=value;
    }
    void setMark(String value)
    {
        this.mark=value;
    }
    void setType(String value)
    {
        this.type=value;
    }
    void setEnergyType(String value)
    {
        this.energyType=value;
    }
    private String getMark(){
        return mark;
    }
    private Date  getMadeDate(){
        return madeDate;
    }
    private String   getType(){
        return type;
    }
    private String  getEnergyType(){
        return energyType;
    }

}
