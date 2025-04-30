package fr.JeuxEchecs.model.bo;

public class Roi extends PieceEchecs{
    public Roi(int coordX, int coordY, Couleur couleur) {
        super(coordX, coordY, couleur);
    }

    @Override
    public boolean peutAllerA(int xD, int yD) {
        boolean result = false;

        int dx = Math.abs(xD - getCoordX());
        int dy = Math.abs(yD - getCoordY());

        if ((dx == 1 && dy == 1) || (dx == 0 && dy == 1) || (dx == 1 && dy == 0)) {
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
