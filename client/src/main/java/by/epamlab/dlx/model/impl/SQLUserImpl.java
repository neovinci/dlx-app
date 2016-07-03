package by.epamlab.dlx.model.impl;

import by.epamlab.dlx.model.exceptions.DAOException;
import by.epamlab.dlx.model.interfaces.IUserDAO;
import by.epamlab.dlx.utilities.SQLConnection;

import java.sql.*;

/**
 * Created by Sergei Astapenko on 12.06.2016.
 */
public class SQLUserImpl implements IUserDAO {
    public boolean isRegisteredUser(String login, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String url = "select login from dlxDB.users where login=? and password=?;";
        boolean isRegistered = false;
        try {
            conn = SQLConnection.getConnection();
            ps = conn.prepareStatement(url);
            ps.setString(1, login);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                isRegistered = true;
            }
            return isRegistered;
        } catch (SQLException e) {
            throw new DAOException("Error connection to Data Base", e);
        } finally {
            SQLConnection.closeResultSet(rs);
            SQLConnection.closeStatement(ps);
            SQLConnection.closeConnection(conn);
        }
    }
}
