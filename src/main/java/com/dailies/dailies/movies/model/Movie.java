package com.dailies.dailies.movies.model;

import org.hibernate.tool.hbm2ddl.SchemaExportTask;

import java.util.List;
import java.util.Set;

public class Movie {

    private String title;
    private Double time;
    private List<String> cast;
    private String description;
    private Set<String> showings;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getShowings() {
        return showings;
    }

    public void setShowings(Set<String> showings) {
        this.showings = showings;
    }
}
