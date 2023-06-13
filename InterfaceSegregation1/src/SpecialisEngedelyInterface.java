// Ez az interfész tartalmazza a grantSpecialEngedely, és a revokeSpecialEngedely metódusokat,
// amelyeket az implementáló osztályoknak meg kell valósítaniuk.

// Nem tartalmaz olyan metódust, amit nem használ a speciális engedély osztály, és
// ezekhez a metódusokhoz az alap engedélyekre jogosult osztály nem fér hozzá



public interface SpecialisEngedelyInterface {

    void grantSpecialEngedely();
    void revokeSpecialEngedely();

}
