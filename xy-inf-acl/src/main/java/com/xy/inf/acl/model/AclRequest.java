package com.xy.inf.acl.model;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Builder
@Data
public class AclRequest {
    private String sql;
    private Map<String,Object> params;
}
