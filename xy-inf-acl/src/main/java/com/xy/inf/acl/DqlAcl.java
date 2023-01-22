package com.xy.inf.acl;

import com.xy.inf.acl.model.SearchResult;

import java.util.Map;

public interface DqlAcl {
    SearchResult<Map<String, Object>> select(String sql);
}
