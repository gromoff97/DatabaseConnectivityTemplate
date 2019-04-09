package myconn;

import java.sql.*;

public class DatabaseAdapter {

    private Connection conn;

    private String jdbUrl;
    private String username;
    private String password;

    private boolean isConnected = false;

    public DatabaseAdapter(String gotJdbUrl, String gotUsername, String gotPassword){
        this.jdbUrl = gotJdbUrl;
        this.username = gotUsername;
        this.password = gotPassword;
    }

    public void connect(){
        try {
            this.conn = DriverManager.getConnection(this.jdbUrl, this.username, this.password);
            setConnectionState(true);
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }

    public boolean getConnectionState( ){
        return this.isConnected;
    }

    private void setConnectionState( boolean state ){
        this.isConnected = state;
    }

    public void disconnect( ){
        try {
            if ( null != this.conn ) this.conn.close();
            setConnectionState(false);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
