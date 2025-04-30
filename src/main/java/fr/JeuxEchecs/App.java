package fr.JeuxEchecs;

import fr.JeuxEchecs.model.bo.*;

public class App {

    public static void main(String[] args) {

        Cavalier cavalier = new Cavalier(3, 4, Couleur.BLANC);

        System.out.println(cavalier.peutAllerA(5, 6));

        System.out.println("=======Tableau PieceEchecs======");

        PieceEchecs[] tabPiece = new PieceEchecs[4];
        tabPiece[0] = new Fou(2, 2, Couleur.BLANC);
        tabPiece[1] = new Fou(6, 1, Couleur.NOIR);
        tabPiece[2] = new Cavalier(4, 3, Couleur.NOIR);
        tabPiece[3] = new Cavalier(4, 7, Couleur.BLANC);
        for (int i = 0; i < tabPiece.length; i++) {
            // deux méthodes differente de comparaison

            if ((tabPiece[i].getClass().getName()).equals("fr.JeuxEchecs.model.bo.Cavalier")) {
                Cavalier c = (Cavalier) tabPiece[i];
                System.out.println(c.peutAllerA(5, 5));
            }
            if (tabPiece[i] instanceof Fou) {
                Fou f = (Fou) tabPiece[i];
                System.out.println(f.peutAllerA(5, 5));

            }
        }

        System.out.println("========Test Pion=========");

        Pion pion = new Pion(3, 2, Couleur.BLANC);

        System.out.println(pion.peutAllerA(3, 2));

        System.out.println("========Test manger une pièces=========");
        Cavalier calier1 = new Cavalier(3, 4, Couleur.NOIR);
        Fou fou1 = new Fou(5, 6, Couleur.BLANC);
        System.out.println(fou1.peutManger(calier1));
    }
}
