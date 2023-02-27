package com.xy.inf.acl.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchRequest {
    private String sql;
    private Object[] params;
    private int[] paramTypes;
}
