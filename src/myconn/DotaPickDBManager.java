package myconn;

import java.sql.SQLException;

public class DotaPickDBManager extends DatabaseAdapter {

    private static final String jdbUrl = "jdbc:postgresql://localhost:5432/DotaPickDB";
    private static final String username = "Anthony";
    private static final String password = "";

    public DotaPickDBManager() {
        super(jdbUrl, username, password);
    }

    public void createTables(){
        try {
            this.stmnt = this.conn.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS HEROES (" +
                    "ID SERIAL PRIMARY KEY," +
                    "HERO_NAME VARCHAR(40) NOT NULL UNIQUE);";

            this.stmnt.execute(query);
            this.stmnt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
