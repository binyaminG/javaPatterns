//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean superEven(int num){
        if (num<0)
            return false;
        int cntDig=0;
        while (num>0){
            int digit=num%10;
            if (digit%2==1)
                return false;
            cntDig++;
        }
        if ((cntDig % 2) == 0)
            return true;
        return false;
    }

    public static boolean superEvenArr(int[] nrr){
        if (nrr.length%2==1)
            return false;
        int cnt=0;
        for (int i = 0; i < nrr.length; i++) {
            if (superEven(nrr[i]))
                cnt++;
            if (cnt > nrr.length/2)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}