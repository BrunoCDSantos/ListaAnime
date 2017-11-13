/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import DTO.Anime;

/**
 *
 * @author informatica
 */
public class DAOAnime {

    String nomeArq = System.getProperty("user.home")
            + System.getProperty("file.separator") + "Anime.xml";
    public static ArrayList<Anime> retorno = new ArrayList();

    public ArrayList<Anime> carregaAnime() {

        try {
            FileInputStream fis = new FileInputStream(nomeArq);
            BufferedInputStream bis = new BufferedInputStream(fis);
            XMLDecoder xmldec = new XMLDecoder(bis);
            retorno = (ArrayList<Anime>) xmldec.readObject();

        } catch (Exception ex) {
            System.out.println("ERRO ao ler livros: " + ex.getMessage());
        }
        return retorno;
    }

    public void salvaListaAnime(ArrayList<Anime> livros) {
        try {
            FileOutputStream fos = new FileOutputStream(nomeArq);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            XMLEncoder xmlenc = new XMLEncoder(bos);
            xmlenc.writeObject(livros);
            xmlenc.close();
        } catch (Exception ex) {
            System.out.println("ERRO ao gravar Anime: " + ex.getMessage());
        }
    }

    public ArrayList<Anime> buscaAnimePorTitulo(String procurado) {
        ArrayList<Anime> retorno = new ArrayList();
        if (!procurado.equals("")) {
            ArrayList<Anime> animes = carregaAnime();
            for (Anime anime : animes) {
                if (anime.getNome().contains(procurado)) {
                    retorno.add(anime);
                }
            }
        }

        return retorno;
    }

    public Anime buscaAnimeporAutor(String procurado) {
        ArrayList<Anime> animes = carregaAnime();
        for (Anime anime : animes) {
            if (anime.getAutor().equals(procurado)) {
                return anime;
            }
        }

        return null;
    }

    public void mostrar() {
        ArrayList<Anime> animes = carregaAnime();
        for (Anime anime : animes) {
            System.out.println(anime.getNome());
        }
    }

    public void atualizaLivro(Anime novo) {
        ArrayList<Anime> animes = carregaAnime();
        Anime velho = null;
        for (Anime anime : animes) {
            if (anime.getNome() == novo.getNome()) {
                velho = anime;
                break;
            }
        }

        if (velho != null) {

            animes.remove(velho);

            animes.add(novo);
        }

        salvaListaAnime(animes);
    }

    public boolean removerAnime(Anime excluir) {
        ArrayList<Anime> animes = carregaAnime();
        boolean removido = false;
        Anime paraRemover = null;
        for (Anime anime : animes) {
            if (anime.getNome().equals(excluir.getNome())) {
                paraRemover = anime;
                removido = true;
                break;
            }
        }

        if (paraRemover != null) {
            animes.remove(paraRemover);
        }

        salvaListaAnime(animes);
        return removido;
    }

    public boolean adicionarAnime(Anime adicionar) {
        boolean existente = false;

        ArrayList<Anime> animes = carregaAnime();
        for (Anime anime : retorno) {
            if (anime.getNome().equals(adicionar.getNome())) {
                existente = true;             
                return existente;
            }
        }
        
        animes.add(adicionar);
        salvaListaAnime(animes);
        return existente;
    }

    public static void main(String[] args) {
        DAOAnime nk = new DAOAnime();

        nk.mostrar();

    }

}
