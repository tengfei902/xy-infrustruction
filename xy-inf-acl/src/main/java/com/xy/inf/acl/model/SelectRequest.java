package com.xy.inf.acl.model;

import com.xy.infrustruction.definition.QueryCompare;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SelectRequest extends AclRequest {
    private QueryCompare compare;
}
