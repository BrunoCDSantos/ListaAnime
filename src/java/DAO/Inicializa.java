/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Anime;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class Inicializa {

    public static void main(String[] args) {

        ArrayList<Anime> animes = new ArrayList<Anime>();
        DAOAnime danime = new DAOAnime();
        danime.salvaListaAnime(animes);
    }

}
