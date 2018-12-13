public class Config {

    private String url;
    private String user;
    private String password;

    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUsername() {
        return "";
    }
    public String getPassword() {
        return "";
    }

}
