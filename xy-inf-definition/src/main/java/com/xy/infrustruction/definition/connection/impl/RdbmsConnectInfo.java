package com.xy.infrustruction.definition.connection.impl;

import com.xy.infrustruction.definition.connection.ConnectInfo;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RdbmsConnectInfo implements ConnectInfo {
    private String host;
    private Integer port;
    private String schema;
    private String username;
    private String password;
}