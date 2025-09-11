//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPerfectK(int[] arr, int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        if (sum%k==0)
            return true;
        return false;
    }

    public static boolean isSuperPerfect(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(!isPerfectK(arr,i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}