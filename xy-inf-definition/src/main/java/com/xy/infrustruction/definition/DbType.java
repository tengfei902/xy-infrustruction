package com.xy.infrustruction.definition;

import com.xy.infrustruction.definition.exceptions.DbTypeNotFoundException;
import org.apache.commons.lang3.StringUtils;

public enum DbType {
    //RDBMS
    MYSQL,
    ORACLE,
    SQLSERVER,
    DB2,
    //OLAP
    TIDB,
    DORIS,
    DRUID,
    KYLIN,
    CLICKHOUSE,
    //KV
    REDIS,
    TAIR,
    HBASE,
    //IN-MEMORY
    IGNITE,
    //DOCUMENT
    ES,
    //GRAPH
    //HDFS
    HIVE;

    public static DbType parse(String dbType) {
        for(DbType type:DbType.values()) {
            if(StringUtils.equalsIgnoreCase(dbType,type.name())) {
                return type;
            }
        }
        throw new DbTypeNotFoundException("db type not found:"+dbType);
    }
}
