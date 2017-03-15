/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author thiago_sandes
 */


// Usar instance OF!
public class Main {
        public static void main(String args[]){
            String titulo, artista, diretor, comentario, numTrilhas, tempReproducao, auxBoo;
            int  aux;
            boolean possuo;
            CDDVDCollection collection = new CDDVDCollection();
            
            CD cd = new CD();
            Scanner ler = new Scanner(System.in);
            System.out.println("Adicione o título do cd:");
            titulo = ler.nextLine();
            cd.setTitulo(titulo);

            System.out.println("Adicione o tempo de reprodução do cd:");
            tempReproducao = ler.nextLine();
            aux = Integer.parseInt(tempReproducao);
            cd.setTempReproducao(aux);

            
            System.out.println("Adicione o artista do cd:");
            artista = ler.nextLine();
            cd.setArtista(artista);

            System.out.println("Adicione o número de trilhas do cd:");
            numTrilhas = ler.nextLine();
            aux = Integer.parseInt(numTrilhas);
            cd.setNumTrilhas(aux);

            System.out.println("Adicione 1 no caso de possuir o cd e 0 caso contrário:");
            auxBoo = ler.nextLine();
            aux = Integer.parseInt(auxBoo);
            while(aux != 1 && aux != 0 ){
                System.out.println("Valor errado. Tente novamente");
                auxBoo = ler.nextLine();
                aux = Integer.parseInt(auxBoo);
            }
            if(aux == 1){
                cd.setPossuo(true);
            }else{
                cd.setPossuo(false);
            }

            System.out.println("Adicione o comentário do cd:");
            comentario = ler.nextLine();
            cd.setComentario(comentario);
            
            collection.addCD(cd);
            
            
            collection.listarCD();
            
            
            
            
            
            CD cd1 = new CD();
            System.out.println("Adicione o título do cd:");
            titulo = ler.nextLine();
            cd1.setTitulo(titulo);

            System.out.println("Adicione o tempo de reprodução do cd:");
            tempReproducao = ler.nextLine();
            aux = Integer.parseInt(tempReproducao);
            cd1.setTempReproducao(aux);

            
            System.out.println("Adicione o artista do cd:");
            artista = ler.nextLine();
            cd1.setArtista(artista);

            System.out.println("Adicione o número de trilhas do cd:");
            numTrilhas = ler.nextLine();
            aux = Integer.parseInt(numTrilhas);
            cd1.setNumTrilhas(aux);

            System.out.println("Adicione 1 no caso de possuir o cd e 0 caso contrário:");
            auxBoo = ler.nextLine();
            aux = Integer.parseInt(auxBoo);
            while(aux != 1 && aux != 0 ){
                System.out.println("Valor errado. Tente novamente");
                auxBoo = ler.nextLine();
                aux = Integer.parseInt(auxBoo);
            }
            if(aux == 1){
                cd1.setPossuo(true);
            }else{
                cd1.setPossuo(false);
            }

            System.out.println("Adicione o comentário do cd:");
            comentario = ler.nextLine();
            cd1.setComentario(comentario);
            
            collection.addCD(cd1);
            
            
            collection.listarCD();
            
            collection.removeCD(cd);
            
            collection.listarCD();
            
            
            
            
            
            
            DVD dvd = new DVD();
            System.out.println("Adicione o título do dvd:");
            titulo = ler.nextLine();
            dvd.setTitulo(titulo);

            System.out.println("Adicione o tempo de reprodução do dvd:");
            tempReproducao = ler.nextLine();
            aux = Integer.parseInt(tempReproducao);
            dvd.setTempReproducao(aux);

            
            System.out.println("Adicione o diretor do dvd:");
            diretor = ler.nextLine();
            dvd.setDiretor(diretor);

            System.out.println("Adicione 1 no caso de possuir o dvd e 0 caso contrário:");
            auxBoo = ler.nextLine();
            aux = Integer.parseInt(auxBoo);
            while(aux != 1 && aux != 0 ){
                System.out.println("Valor errado. Tente novamente");
                auxBoo = ler.nextLine();
                aux = Integer.parseInt(auxBoo);
            }
            if(aux == 1){
                dvd.setPossuo(true);
            }else{
                dvd.setPossuo(false);
            }

            System.out.println("Adicione o comentário do dvd:");
            comentario = ler.nextLine();
            dvd.setComentario(comentario);
            
            collection.addDVD(dvd);
            
            collection.listarDVD(dvd);
            
            
            
            DVD dvd1 = new DVD();
            System.out.println("Adicione o título do dvd:");
            titulo = ler.nextLine();
            dvd1.setTitulo(titulo);

            System.out.println("Adicione o tempo de reprodução do dvd:");
            tempReproducao = ler.nextLine();
            aux = Integer.parseInt(tempReproducao);
            dvd1.setTempReproducao(aux);

            
            System.out.println("Adicione o diretor do dvd:");
            diretor = ler.nextLine();
            dvd1.setDiretor(diretor);

            System.out.println("Adicione 1 no caso de possuir o dvd e 0 caso contrário:");
            auxBoo = ler.nextLine();
            aux = Integer.parseInt(auxBoo);
            while(aux != 1 && aux != 0 ){
                System.out.println("Valor errado. Tente novamente");
                auxBoo = ler.nextLine();
                aux = Integer.parseInt(auxBoo);
            }
            if(aux == 1){
                dvd.setPossuo(true);
            }else{
                dvd.setPossuo(false);
            }

            System.out.println("Adicione o comentário do dvd:");
            comentario = ler.nextLine();
            dvd1.setComentario(comentario);
            
            collection.addDVD(dvd1);
            
            collection.listarDVD();
            
            collection.removeDVD(dvd);
            
            collection.listarDVD();
            
            
            
        }
}
