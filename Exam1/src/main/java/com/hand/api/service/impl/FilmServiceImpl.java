package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.FilmMapper;

public class FilmServiceImpl implements FilmService {
    private FilmMapper filmMapper;

    public FilmServiceImpl(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }

    @Override
    public void addFilmByExection(Film film) throws Exception {
        filmMapper.insertByFilm(film);
        throw new Exception("手动抛出异常");
    }

    @Override
    public void addFilmByFilm(Film film) {
        filmMapper.insertByFilm(film);
    }

    @Override
    public Film findById(int id) {
        return filmMapper.findById(id);
    }
}
