package myconn;

public class DotaPickDBManager extends DatabaseAdapter {

    private static final String jdbUrl = "jdbc:postgresql://localhost:5432/DotaPickDB";
    private static final String username = "Anthony";
    private static final String password = "";

    public DotaPickDBManager() {
        super(jdbUrl, username, password);
    }

}
