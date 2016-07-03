package by.epamlab.dlx.utilities;

import by.epamlab.dlx.model.exceptions.DAOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Sergei Astapenko on 12.06.2016.
 */
public class SQLConnection {
    private static final String DATASOURCE_NAME = "jndi/connect";
    private static DataSource ds = null;

    static {
        try {
            InitialContext initContext = new InitialContext();
            Context envContext = (Context)initContext.lookup("java:/comp/env");
            ds = (DataSource)envContext.lookup("jndi/connect");
        }
        catch (NamingException e) {
            throw new DAOException("Error connection to Data Base", e);
        }
    }

    public static Connection getConnection() {
        try {
            Connection conn = ds.getConnection();
            return conn;
        }
        catch (SQLException e) {
            throw new DAOException("Error connection to Data Base", e);
        }
    }

    public static void closeResultSet(ResultSet... rs) {
        if (rs.length != 0) {
            for(ResultSet result : rs) {
                try {
                    if (result != null) {
                        result.close();
                    }
                }
                catch (SQLException e) {
                    throw new DAOException("Error Data Base resourse closing", e);
                }
            }
        }
    }

    public static void closeStatement(Statement... st) {
        for(Statement statement : st) {
            try {
                if (statement != null) {
                    statement.close();
                }
            }
            catch (SQLException e) {
                throw new DAOException("Error Data Base resourse closing", (Throwable)e);
            }
        }
    }


    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        }
        catch (SQLException e) {
            throw new DAOException("Error Data Base resourse closing", (Throwable)e);
        }
    }
}
