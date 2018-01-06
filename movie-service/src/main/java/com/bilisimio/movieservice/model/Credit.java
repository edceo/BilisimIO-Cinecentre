package com.bilisimio.movieservice.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Credit {

    @ManyToOne
    private Movie movie;

    @OneToMany
    private List<Cast> casts;

    @OneToMany
    private List<Crew> crews;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public List<Crew> getCrews() {
        return crews;
    }

    public void setCrews(List<Crew> crews) {
        this.crews = crews;
    }
}
