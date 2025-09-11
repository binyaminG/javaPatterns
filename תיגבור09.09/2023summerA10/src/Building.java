import java.util.Arrays;

public class Building {
    private String address;
    private App[] apartments;

    public Building(String address, App[] apartments) {
        this.address = address;
        this.apartments = apartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public App[] getApartments() {
        return apartments;
    }

    public void setApartments(App[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
