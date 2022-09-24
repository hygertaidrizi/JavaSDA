package Singleton;

public class DbConfig {
    private int port;
    private String ip;
    private String password;
    private String userame;
     static DbConfig dbConfig;

    private DbConfig(){

    }
    public static DbConfig getDbConfig (){
        if (dbConfig == null){
            dbConfig = new DbConfig();
        }
        return dbConfig;

    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }
}
