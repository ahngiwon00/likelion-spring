package com.dao;

import java.sql.Connection;

public class LocalUserDaoImpl extends UserDaoAbstract{
    @Override
    public Connection makeConnection() throws Exception {
        return null;
    }
}
