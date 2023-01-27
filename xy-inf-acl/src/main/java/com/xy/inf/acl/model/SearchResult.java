package com.xy.inf.acl.model;

import lombok.Data;

import java.util.List;

@Data
public class SearchResult<T> {
    private long totalHits;
    private long offset;
    private long limit;
    private List<T> records;

    public static <T> SearchResult<T> success(List<T> records) {
        SearchResult<T> searchResult = new SearchResult<>();
        searchResult.setRecords(records);
        return searchResult;
    }
}
