package com.xy.inf.acl;

import com.xy.inf.acl.model.AclRequest;
import com.xy.inf.acl.model.SelectRequest;
import com.xy.inf.acl.model.SearchResult;

import java.util.Map;

public interface ACL {
    SearchResult<Map<String,Object>> select(SelectRequest selectRequest);

    int update(AclRequest request);

    boolean ddl(String sql);

    String explain(String sql);
}
