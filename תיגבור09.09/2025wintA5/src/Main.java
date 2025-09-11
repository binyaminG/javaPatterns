//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isNIce(int[] arr){
        //בודק אם זוגי, אם כן מחזיר F
        if (arr.length%2==0)
            return false;
        int right=0, left=0;
        for (int i = 0; i < arr.length/2; i++) {
            left+=arr[i];
            right+=arr[arr.length-1-i];
        }
        if (left==right&&arr[arr.length/2]==left)
            return true;
        return false;
    }



    public static void main(String[] args) {
    }
}