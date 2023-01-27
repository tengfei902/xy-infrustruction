package com.xy.infrustruction.definition;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
public class QueryCompare implements Serializable {
    private String compareWhere;
    private List<CompareMode> compareModes;
}
