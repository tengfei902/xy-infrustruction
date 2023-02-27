package com.xy.infrustruction.connection;

import com.google.gson.Gson;
import com.xy.infrustruction.definition.connection.impl.RdbmsConnectInfo;
import org.junit.Test;

public class ConnectInfoTest {

    @Test
    public void testBuildRdbmsConnectInfo() {
        RdbmsConnectInfo rdbmsConnectInfo = RdbmsConnectInfo.builder().host("127.0.0.1").port(3306).schema("jh").username("root").password("123456").build();
        System.out.println(new Gson().toJson(rdbmsConnectInfo));
    }
}
