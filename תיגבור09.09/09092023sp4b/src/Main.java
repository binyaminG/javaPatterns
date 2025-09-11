import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String[] notPopular(Bus[] b, int num){
        //שמים את הגודל המקסימלי האפשרי
        String [] nPopular=new String[b.length];
        int cnt=0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].getPassengers()<num){
                nPopular[cnt]=b[i].getPlateNumber();
                cnt++;
            }
        }
        return Arrays.copyOf(nPopular,cnt);
    }
    public static void main(String[] args) {

    }
}