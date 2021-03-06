package com.kcs.auto.adverts.service.impl;

import com.kcs.auto.adverts.service.ConnectionService;
import com.sun.istack.internal.Nullable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Askew on 3/9/2017.
 */
public class ConnectionServiceImpl implements ConnectionService {

    private static final String URL = "jdbc:mysql://localhost:3306/auto_adverts";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    @Nullable
    @Override
    public Connection createConnection() {
        setJdbcClassDriver();
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private void setJdbcClassDriver() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
