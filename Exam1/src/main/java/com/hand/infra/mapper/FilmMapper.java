package com.hand.infra.mapper;

import com.hand.domain.entity.Film;

public interface FilmMapper {
    void insertByFilm(Film film);
    Film findById(int id);
}
