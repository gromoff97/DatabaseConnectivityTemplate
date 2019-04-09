import adapters.DatabaseAdapter;
import dbmanagers.DotaPickDBManager;

public class Main {

    private static void showConnState( DatabaseAdapter adapter ){
        if ( adapter.getConnectionState() )
            System.out.println("connected");
        else
            System.out.println("not connected");
    }


    public static void main(String[] args) {

        DotaPickDBManager myDb = new DotaPickDBManager();
        showConnState(myDb);

        myDb.connect();
        showConnState(myDb);

        myDb.createTables();

        myDb.disconnect();
        showConnState(myDb);
    }
}
