// Ez az interfész tartalmazza a grant() és a revoke() metódusokat,
// amelyeket az implementáló osztályoknak meg kell valósítaniuk.

// Nem tartalmaz olyan metódust, amit nem szabad elérnie az alap engedélyeknek, vagy amiket nem használ


public interface AlapEngedelyInterface {


    void grantAlapEngedely();
    void revokeAlapEngedely();

}
