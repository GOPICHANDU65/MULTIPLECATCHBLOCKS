
public class SchoolFee  {

    int schoolfee;

    public int getHallticket(int PayedAmmount, int schoolfee) throws Exception{
        if(schoolfee - PayedAmmount == 0){
            System.out.println("ALLOW TO WRITE EXAM");
        }else{
          throw new Exception ("due fee students are not allowed to write exam");

        }


        return PayedAmmount;
    }
}
