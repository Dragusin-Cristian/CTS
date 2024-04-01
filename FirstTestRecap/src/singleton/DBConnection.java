package singleton;

public class DBConnection {
    private static DBConnection connetion;
    private String token;

    private DBConnection() {
        token = "Some randome token";
    }

    public static DBConnection getConnetion(){
        if(connetion == null){
            connetion = new DBConnection();
        }
        return connetion;
    }

    public void showToken(){
        System.out.println(this.token);
    }
}
