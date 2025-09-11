public class Rent {
    private String name;
    private Car car;
    private Date pickDate;
    private Date returnDate;

    public Rent(String name, Car car, Date pickDate, Date returnDate) {
        this.name = name;
        this.car = car;
        this.pickDate = pickDate;
        this.returnDate = returnDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getPickDate() {
        return pickDate;
    }

    public void setPickDate(Date pickDate) {
        this.pickDate = pickDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", pickDate=" + pickDate +
                ", returnDate=" + returnDate +
                '}';
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getPrice(){
        //משתנה שסופר את הימים
        int days= pickDate.difference(returnDate);
        switch (this.car.getType()){
            case 'A':
                return 100*days;
            case 'B':
                return 150*days;
            case 'C':
                return 180*days;
            case 'D':
                return 240*days;
            default:
                return 0;//ערך של שגיאה
        }
    }
}
