package pl.sda.structure.oop.problem1.tyre;

public class Parameters {
    // Private int rozmiar w calach
    private SizeTyre size;

    // Typ opon : ZIMOWE/LETNIE/WIELOSEZONOWE
    private TyreType tyreType;


    Parameters(SizeTyre size, TyreType tyreType){
        this.size = size;
        this.tyreType = tyreType;
    }
}
