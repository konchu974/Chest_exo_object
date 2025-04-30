package fr.JeuxEchecs.model.bo;

public abstract class PieceEchecs {
    private int coordX;
    private int coordY;
    private Couleur couleur;

    public  abstract boolean peutAllerA(int xD, int yD);
    public abstract boolean peutManger(PieceEchecs pe);


    public PieceEchecs(int coordX, int coordY, Couleur couleur) {
        this.setCoordX(coordX);
        this.setCoordY(coordY);
        this.setCouleur(couleur);
    }

    public int getCouleur(){
        int result = 0;
        if (couleur==Couleur.BLANC){
            result = 1;
        }
        return result;
    }

    public int getCouleurCase(){
        int result =0;
        if ((coordX + coordY) % 3 == 0){
            result = 1;
        }
        return result;
    }

    public boolean estDansLEchiquier(){
        if (this.coordY <= 8 && this.coordY>0 && this.coordX <= 8 && this.coordX>0){
            return true;
        }
        return false;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        if (coordX>8){
            this.coordX = 8;
        } else if (coordX<1) {
            this.coordX = 1;
        }else{
            this.coordX = coordX;
        }
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        if (coordY>8){
            this.coordY = 8;
        } else if (coordY<1) {
            this.coordY = 1;
        }else{
            this.coordY = coordY;
        }
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
