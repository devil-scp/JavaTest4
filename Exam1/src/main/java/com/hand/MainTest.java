package com.hand;


import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;
import com.hand.infra.util.Connationtest;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        AbstractApplicationContext context = new
                ClassPathXmlApplicationContext("config/applicationContext.xml");
        FilmService filmService = (FilmService) context.getBean("filmServiceImpl");
        if (!Connationtest.getConnation(filmService)) {
            Film film = new Film();
            String title=System.getenv("title");
            String description=System.getenv("description");
            Integer languageId=Integer.parseInt(System.getenv("languageId"));
//            String title = "This is a title111";
//            String description = "This is a title111";
//            Integer languageId = 1;
            System.out.println("Film Title:");
            System.out.println(title);
            System.out.println("Film description:");
            System.out.println(description);
            System.out.println("Film languageId:");
            System.out.println(languageId);
            film.setTitle(title);
            film.setDescription(description);
            film.setLanguageId(languageId);
            try {
                filmService.addFilmByExection(film);
            } catch (Exception e) {
                e.getMessage();
            }
            filmService.addFilmByFilm(film);
        }
        context.registerShutdownHook();
    }
}
