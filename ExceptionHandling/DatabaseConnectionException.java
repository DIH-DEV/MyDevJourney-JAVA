package ExceptionHandling;

public class DatabaseConnectionException extends RuntimeException{
    private final String databaseUrl;
    public DatabaseConnectionException(String message,String databaseUrl) {
        super(message);
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

//    public void setDatabaseUrl(String databaseUrl) {
//        this.databaseUrl = databaseUrl;

}
