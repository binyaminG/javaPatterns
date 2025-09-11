import java.util.Arrays;

public class App {
    private String appNum;
    private String owner;
    private Room[] rooms;
    private double rate;

    public App(String appNum, String owner, Room[] rooms, double rate) {
        this.appNum = appNum;
        this.owner = owner;
        this.rooms = rooms;
        this.rate = rate;
    }

    public String getAppNum() {
        return appNum;
    }

    public void setAppNum(String appNum) {
        this.appNum = appNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "App{" +
                "appNum='" + appNum + '\'' +
                ", owner='" + owner + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                ", rate=" + rate +
                '}';
    }

    public double monthCost(){
        // area*rate*freq
        double sum=0.0;
        for (int i = 0; i < rooms.length; i++) {
            sum += this.rate
                    *this.rooms[i].getArea()
                    *this.rooms[i].getFreq();
        }
        return sum;
    }

}
