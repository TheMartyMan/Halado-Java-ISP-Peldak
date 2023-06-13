// Az interfacek külön-külön szerepelnek, más "jogokkal" bírnak, nem egyetlen nagy interfaceben van minden metódus.
// Így minden jármű külön-külön kapja meg őket attól függően, hogy melyik szükséges, melyik tulajdonság/funkció igaz rájuk.


// A mozogni képes járművek el tudnak indulni, és meg is tudnak állni.

public interface Mozgo {

        void indul();
        void megall();

}
