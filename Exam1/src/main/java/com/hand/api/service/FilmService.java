package com.hand.api.service;

import com.hand.domain.entity.Film;
import org.springframework.transaction.annotation.Transactional;

public interface FilmService {
    @Transactional(rollbackFor = {Exception.class})
    void addFilmByExection(Film film) throws Exception;

    @Transactional(rollbackFor = {Exception.class})
    void addFilmByFilm(Film film);

    Film findById(int id);
}
