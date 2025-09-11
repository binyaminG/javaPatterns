public class Main {
    public static void monthReport(Building[] bArr, String[] clients){
        for (int i = 0; i < clients.length; i++) {
            System.out.println(clients[i]);
            //סכום התשלומים של הלקוח
            double clientSum=0;
            for (int j = 0; j < bArr.length; j++) {
                for (int k = 0; k < bArr[j].getApartments().length; k++) {
                    App app= bArr[j].getApartments()[k];
                    if (app.getOwner().equals(clients[i])){
                        System.out.println(app.toString());
                        System.out.println(app.monthCost());
                        clientSum+=app.monthCost();
                    }
                }
            }
            System.out.println(clientSum);
        }
    }

    public static void main(String[] args) {

    }
}