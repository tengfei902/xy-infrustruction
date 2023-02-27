package com.xy.inf.acl.impl;

import com.xy.inf.acl.ACL;
import com.xy.inf.acl.model.SearchRequest;
import com.xy.inf.acl.model.SearchResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
public class MySqlAcl implements ACL {
    @Setter
    private JdbcTemplate jdbcTemplate;

    @Override
    public SearchResult<Map<String, Object>> select(SearchRequest searchRequest) {
        String sql = searchRequest.getSql();
        Object[] params = searchRequest.getParams();
        int[] paramTypes = searchRequest.getParamTypes();
        List<Map<String, Object>> records = jdbcTemplate.queryForList(sql, params, paramTypes);
        return SearchResult.success(records);
    }

    @Override
    public int update(SearchRequest request) {
        return jdbcTemplate.update(request.getSql(),request.getParams(),request.getParamTypes());
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

    @Override
    public String showCreateTable(String table) {
        return null;
    }
}
