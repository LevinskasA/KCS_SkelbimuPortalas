package com.kcs.auto.adverts.service.impl;

import com.kcs.auto.adverts.service.ConnectionService;
import com.kcs.auto.adverts.service.LoginService;
import com.kcs.auto.adverts.utils.SecurityUtils;

import java.sql.*;

/**
 * Created by Askew on 3/10/2017.
 */
public class LoginServiceImpl implements LoginService{

    @Override
    public boolean isUserHavePermissions(String email, String passwordHash) {
        boolean isHaveAccess = false;

        ConnectionService connectionService = new ConnectionServiceImpl();

        Connection connection = connectionService.createConnection();

        if (connection != null){
            try {
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM login WHERE user_email = ?");
                statement.setString(1, email);

                ResultSet resultSet = statement.executeQuery();
                // if email exists
                if(resultSet.next()){
                    String dbHash = resultSet.getString("USER_PASSWORD");
                    isHaveAccess = dbHash.equals(passwordHash);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isHaveAccess;
    }
}
