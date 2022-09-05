package io.katon.api.common;

import java.util.Optional;

public class Metadata {
    private Integer total;
    private Integer limit;
    private Integer offset;
    private Optional<String> filter;

    public Metadata(Integer total, Integer limit, Integer offset, Optional<String> filter) {
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.filter = filter;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Optional<String> getFilter() {
        return this.filter;
    }

    public void setFilter(Optional<String> filter) {
        this.filter = filter;
    }

}
