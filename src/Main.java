import myconn.DatabaseAdapter;

public class Main {

    private static void showConnState( DatabaseAdapter adapter ){
        if ( adapter.getConnectionState() )
            System.out.println("connected");
        else
            System.out.println("not connected");
    }


    public static void main(String[] args) {

        DatabaseAdapter myAdapater = new DatabaseAdapter(
                "jdbc:postgresql://localhost:5432/DotaPickDB",
                "Anthony",
                ""
        );
        showConnState(myAdapater);

        myAdapater.connect();
        showConnState(myAdapater);

        myAdapater.disconnect();
        showConnState(myAdapater);
    }
}
