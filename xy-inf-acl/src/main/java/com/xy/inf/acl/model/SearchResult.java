package com.xy.inf.acl.model;

import lombok.Data;

import java.util.List;

@Data
public class SearchResult<T> {
    private long totalHits;
    private long offset;
    private long limit;
    private List<T> records;
}
