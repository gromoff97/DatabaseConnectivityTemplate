package myconn;

public class DotaPickDBManager extends DatabaseAdapter {

    public DotaPickDBManager() {
        super("jdbc:postgresql://localhost:5432/DotaPickDB",
                "Anthony",
                "");
    }

}
