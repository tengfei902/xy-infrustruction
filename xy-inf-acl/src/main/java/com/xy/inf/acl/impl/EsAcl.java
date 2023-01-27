package com.xy.inf.acl.impl;

import com.xy.inf.acl.ACL;
import com.xy.inf.acl.model.AclRequest;
import com.xy.inf.acl.model.SearchResult;
import com.xy.inf.acl.model.SelectRequest;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class EsAcl implements ACL {

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
        return false;
    }

    @Override
    public String explain(String sql) {
        return null;
    }
}
