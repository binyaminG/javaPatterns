public class Car {
    private String id;
    private char type;
    private String brand;
    private boolean isManual;

    public Car(String id, char type, String brand, boolean isManual) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.isManual = isManual;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public boolean better (Car other){
        if (this.type>other.type)
                return true;
        if (this.type==other.type
                //רכב אוטומטי
                && this.isManual==false
                //רכב ידני
                && other.isManual==true)
            return true;
        return false;
    }
}
