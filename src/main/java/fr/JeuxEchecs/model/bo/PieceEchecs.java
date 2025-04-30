package fr.JeuxEchecs.model.bo;

/**
 * The type Piece echecs.
 */
public abstract class PieceEchecs {
    private int coordX;
    private int coordY;
    private Couleur couleur;

    /**
     * Methode abstraite pour verifier si une piece peut aller au coordonée demandé
     *
     * @param xD coordonnée en Y ou l'on souhaite se deplacer
     * @param yD coordonnée en X ou l'on souhaite se deplacer
     * @return the boolean
     */
    public  abstract boolean peutAllerA(int xD, int yD);

    /**
     * regarde si la piece instancié peut manger une autre piece donné Peut manger
     *
     * @param pe piece que l'on veux manger
     * @return the boolean
     */
    public abstract boolean peutManger(PieceEchecs pe);


    /**
     * Instantiates a new Piece echecs.
     *
     * @param coordX  the coord x
     * @param coordY  the coord y
     * @param couleur the couleur
     */
    public PieceEchecs(int coordX, int coordY, Couleur couleur) {
        this.setCoordX(coordX);
        this.setCoordY(coordY);
        this.setCouleur(couleur);
    }

    /**
     * Get couleur int.
     *
     * @return the int
     */
    public int getCouleur(){
        int result = 0;
        if (couleur==Couleur.BLANC){
            result = 1;
        }
        return result;
    }

    /**
     * Get couleur case int.
     *
     * @return the int
     */
    public int getCouleurCase(){
        int result =0;
        if ((coordX + coordY) % 3 == 0){
            result = 1;
        }
        return result;
    }

    /**
     * Verifie si la pièce est dans l echiquier
     *
     * @return the boolean
     */
    public boolean estDansLEchiquier(){
        if (this.coordY <= 8 && this.coordY>0 && this.coordX <= 8 && this.coordX>0){
            return true;
        }
        return false;
    }

    /**
     * Gets coord x.
     *
     * @return the coord x
     */
    public int getCoordX() {
        return coordX;
    }

    /**
     * Sets coord x.
     *
     * @param coordX the coord x
     */
    public void setCoordX(int coordX) {
        if (coordX>8){
            this.coordX = 8;
        } else if (coordX<1) {
            this.coordX = 1;
        }else{
            this.coordX = coordX;
        }
    }

    /**
     * Gets coord y.
     *
     * @return the coord y
     */
    public int getCoordY() {
        return coordY;
    }

    /**
     * Sets coord y.
     *
     * @param coordY the coord y
     */
    public void setCoordY(int coordY) {
        if (coordY>8){
            this.coordY = 8;
        } else if (coordY<1) {
            this.coordY = 1;
        }else{
            this.coordY = coordY;
        }
    }

    /**
     * Sets couleur.
     *
     * @param couleur the couleur
     */
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}
