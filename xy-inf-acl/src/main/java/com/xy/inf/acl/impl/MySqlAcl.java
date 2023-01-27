package com.xy.inf.acl.impl;

import com.xy.inf.acl.ACL;
import com.xy.inf.acl.model.AclRequest;
import com.xy.inf.acl.model.SearchResult;
import com.xy.inf.acl.model.SelectRequest;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

@Slf4j
public class MySqlAcl implements ACL {
    @Setter
    private JdbcTemplate jdbcTemplate;

    @Override
    public SearchResult<Map<String, Object>> select(SelectRequest selectRequest) {
        return null;
    }

    @Override
    public int update(AclRequest request) {
        return 0;
    }

    @Override
    public boolean ddl(String sql) {
        jdbcTemplate.execute(sql);
        return true;
    }

    @Override
    public String explain(String sql) {
        return null;
    }
}
