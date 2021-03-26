import java.util.Date;

public class CarPart {

   private double price;
  private   String name;
   private String type;
  private   boolean isUsed;
   private boolean isOriginal;

    void setPrice(double value) {
        this.price = value;
    }

    void setName(String value) {
        this.name = value;
    }

    void setType(String value) {
        this.type = value;
    }

    void setUsed(boolean active) {
        this.isUsed = active;
    }

    void setOriginal(boolean active) {
        this.isOriginal = active;
    }
    private double getPrice(){
        return price;
    }
    private String getType(){
        return type;
    }
    private String getName(){
        return name;
    }
    private boolean isOriginal(){
        return isOriginal;
    }
    private boolean isUsed(){
        return this.isUsed;
    }
}