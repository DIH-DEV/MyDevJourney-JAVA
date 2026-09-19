package ExceptionHandling;

import java.util.Random;

public class ThrowUse {

    public static void connectToDatabase(String dbUrl) throws DatabaseConnectionException{
        System.out.println("Connecting to " + dbUrl + "...");
        boolean connectionFailed = new Random().nextBoolean();

        if (connectionFailed){
            throw new DatabaseConnectionException("Timeout Error: Unable to establish handshake with DB server.. " ,dbUrl);
        }
        System.out.println("Successfully Connected to "+ dbUrl + "!\n");

    }

    public static void main(String[] args) {
        String primaryDb = "jbd://postgresql://qweryi";
        String backupDb = "ret://postgre:yguhkmk";

        try{ connectToDatabase(primaryDb);
        }
        catch (DatabaseConnectionException e){
            System.out.println(e.getMessage() );
            System.out.println("    ");
            System.out.println("Initiating Failover Strategy");
            System.out.println("    ");
            //Initiating a failover Strategy
            System.out.println("Connecting to back up  DB "+ backupDb +"...");
            try{ connectToDatabase(backupDb);
            } catch (DatabaseConnectionException err) {
                System.out.println("Connection Error: "+ err.getMessage());
            }
        }

        finally {
            System.out.println("Rate this Experience!");
        }

    }
}
