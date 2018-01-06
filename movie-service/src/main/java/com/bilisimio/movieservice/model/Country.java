package com.bilisimio.movieservice.model;

import javax.persistence.Entity;

@Entity
class Country {
    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
