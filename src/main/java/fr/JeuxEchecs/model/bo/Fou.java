package fr.JeuxEchecs.model.bo;

public class Fou extends PieceEchecs {
    public Fou(int coordX, int coordY, Couleur couleur) {
        super(coordX, coordY, couleur);
    }

    // ✅ Nickel
    // JavaDoc
    @Override
    public boolean peutAllerA(int xD, int yD) {
        boolean result = false;

        // Math.abs permet de mettre la valeur en valeur absolu
        int dx = Math.abs(xD - getCoordX());
        int dy = Math.abs(yD - getCoordY());

        if (dx == dy) {
            result = true;
        }

        return result;
    }

    // ✅ checked
    @Override
    public boolean peutManger(PieceEchecs pe) {
        if (peutAllerA(pe.getCoordX(), pe.getCoordY()) && (getCouleur() != pe.getCouleur())) {
            return true;
        }
        return false;
    }
}
