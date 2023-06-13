// Az interfacek külön-külön szerepelnek, más "jogokkal" bírnak, nem egyetlen nagy interfaceben van minden metódus.
// Így minden jármű külön-külön kapja meg őket attól függően, hogy melyik szükséges, melyik tulajdonság/funkció igaz rájuk.


// Minden jármű rendelkezik árral, és színnel.

public interface Jarmu {

        void setAr(double ar);
        void setSzin(String szin);

}
