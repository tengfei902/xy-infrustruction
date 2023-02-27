package com.xy.inf.acl;

import com.xy.inf.acl.model.SearchRequest;
import com.xy.inf.acl.model.SearchResult;

import java.util.Map;

public interface ACL {
    SearchResult<Map<String,Object>> select(SearchRequest searchRequest);

    int update(SearchRequest request);

    boolean ddl(String sql);

    String explain(String sql);

    String showCreateTable(String table);
}
