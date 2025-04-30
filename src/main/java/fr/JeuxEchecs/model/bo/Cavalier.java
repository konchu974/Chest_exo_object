package fr.JeuxEchecs.model.bo;

public class Cavalier extends PieceEchecs{
    public Cavalier(int coordX, int coordY, Couleur couleur) {
        super(coordX, coordY, couleur);
    }

    @Override
    public boolean peutAllerA(int xD, int yD){
        boolean result = false;
        int dx = Math.abs(xD - getCoordX());
        int dy = Math.abs(yD - getCoordY());

        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            result = true;
        }

        return result;
    }

    @Override
    public boolean peutManger(PieceEchecs pe) {
        if (peutAllerA(pe.getCoordX(), pe.getCoordY()) && (getCouleur() != pe.getCouleur())){
            return true;
        }
        return false;
    }
}
