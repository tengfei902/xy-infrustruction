package com.xy.infrustruction.definition.connection;

import com.google.gson.Gson;
import com.xy.infrustruction.definition.DbType;
import com.xy.infrustruction.definition.connection.impl.RdbmsConnectInfo;

public class ConnectUtils {

    public static ConnectInfo getConnectInfo(DbType dbType,String connectConfig) {
        switch (dbType) {
            case ORACLE:
            case MYSQL:
            case SQLSERVER:
            case DB2:
                return new Gson().fromJson(connectConfig, RdbmsConnectInfo.class);
            default:
                return null;
        }
    }
}
