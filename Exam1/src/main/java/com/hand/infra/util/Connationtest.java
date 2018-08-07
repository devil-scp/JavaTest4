package com.hand.infra.util;

import static java.lang.Thread.sleep;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.Film;

public class Connationtest {
    public static boolean getConnation(FilmService filmService) {
        boolean flag = true;
        while (flag) {
            try {
                Film film = filmService.findById(1);
                System.out.println("The connection is successful!!");
                flag = false;
            } catch (Exception e) {
                System.out.println("Trying to connect to mysql!!");
                try {
                    sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return flag;
    }
}
