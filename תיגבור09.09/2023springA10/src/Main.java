import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void clientsReport(Rent[] rents, String[] names){
        for (int i = 0; i < names.length; i++) {
            int sum=0;
            for (int j = 0; j < rents.length; j++) {
                if (names[i].equals(rents[j].getName())){
                    System.out.println(rents[j].toString());
                    sum+=rents[j].getPrice();
                }
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
    }
}