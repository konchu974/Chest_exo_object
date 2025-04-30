package fr.JeuxEchecs.model.bo;

public class Pion extends PieceEchecs{
    public Pion(int coordX, int coordY, Couleur couleur) {
        super(coordX, coordY, couleur);
        if (couleur == Couleur.BLANC && coordY == 1) {
            throw new IllegalArgumentException("Un pion blanc ne peut pas être créé en ligne Y = 1.");
        }

        if (couleur == Couleur.NOIR && coordY == 8) {
            throw new IllegalArgumentException("Un pion noir ne peut pas être créé en ligne Y = 8.");
        }
    }


    @Override
    public boolean peutAllerA(int xD, int yD) {
        boolean result = false;
        int dx = Math.abs(xD - getCoordX());

        if (yD == getCoordY()+1) {
            result = true;
        }else if (getCoordY()==2 && yD == getCoordY()+2 && dx==0){
            result = true;
        }

        return result;
    }

    @Override
    public boolean peutManger(PieceEchecs pe) {
        if (peutAllerA(pe.getCoordX()+1, pe.getCoordY()) || peutAllerA(pe.getCoordX()-1, pe.getCoordY())&& (getCouleur() != pe.getCouleur())){
            return true;
        }
        return false;
    }
    
    
}
