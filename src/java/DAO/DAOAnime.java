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
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class DAOAnime {

    String nomeArq = System.getProperty("user.home")
            + System.getProperty("file.separator") + "livros.xml";
    static ArrayList<Anime> retorno = new ArrayList();

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

    public void salvaAnime(ArrayList<Anime> livros) {
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
        for (Anime livro : animes) {
            if (livro.getAutor().equals(procurado)) {
                return livro;
            }
        }

        return null;
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

        salvaAnime(animes);
    }

    public void removerAnime(Anime excluir) {
        ArrayList<Anime> animes = carregaAnime();
        Anime paraRemover = null;
        for (Anime anime : animes) {
            if (anime.getNome() == excluir.getNome()) {
                paraRemover = anime;
                break;
            }
        }

        if (paraRemover != null) {
            animes.remove(paraRemover);
        }

        salvaAnime(animes);
    }

    public static void main(String[] args) {
        Scanner bru = new Scanner(System.in);
        Anime n = new Anime();
        n.setNome("Bru");
        n.setAno("2000");
        n.setAutor("Bruno");
        n.setGenero("Ação");
        n.setVisto("não");
        retorno.add(new Anime());
        
        n.setNome("Brun");
        n.setAno("2000");
        n.setAutor("Brun");
        n.setGenero("Ação");
        n.setVisto("não");
        retorno.add(new Anime());
        
    }

}
