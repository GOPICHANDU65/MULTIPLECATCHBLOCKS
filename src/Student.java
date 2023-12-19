public class Student {
    public static void main(String[] args) {
        SchoolFee schoolfee = new SchoolFee();

        try {
            int NoDue= schoolfee.getHallticket(30000,30000);
            System.out.println("fee nill");

        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}