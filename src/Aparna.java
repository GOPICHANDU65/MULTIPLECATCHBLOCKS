public class Aparna {


    public static void main(String[]args){
try {
    String chandu= System.getProperty("key");;
    System.out.println(chandu.toUpperCase());
    System.out.println("system " + System.getProperty("key"));
    System.out.println("chandu".toUpperCase());
}catch (Exception e){
    System.out.println("catch the exception"+e.getMessage().toUpperCase());

}finally {
    System.out.println("exception handling".toUpperCase());
}
    }
}
