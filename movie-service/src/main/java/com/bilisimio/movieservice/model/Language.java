package com.bilisimio.movieservice.model;

import javax.persistence.Entity;

@Entity
public class Language extends AbstractModel {
    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
