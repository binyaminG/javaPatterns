public class Room {
    private String type;
    private double area;
    private int freq;

    public Room(String type, double area, int freq) {
        this.type = type;
        this.area = area;
        this.freq = freq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", area=" + area +
                ", freq=" + freq +
                '}';
    }
}
