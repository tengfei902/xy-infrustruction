package com.xy.inf.acl.impl;

import com.xy.inf.acl.ACL;
import com.xy.inf.acl.model.SearchRequest;
import com.xy.inf.acl.model.SearchResult;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class EsAcl implements ACL {

    @Override
    public SearchResult<Map<String, Object>> select(SearchRequest searchRequest) {
        return null;
    }

    @Override
    public int update(SearchRequest request) {
        return 0;
    }

    @Override
    public boolean ddl(String sql) {
        return false;
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
