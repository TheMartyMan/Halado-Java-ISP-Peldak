// Csak ez az osztály éri el a speciális jogosultságokat

class SpecialisEngedely implements SpecialisEngedelyInterface {

    @Override
    public void grantSpecialEngedely() {
            // Speciális engedély megadása
            System.out.println("A speciális engedélyekre feljogosító jogosultság hozzáadva!\n");
    }


    @Override
    public void revokeSpecialEngedely() {
        // Speciális engedély visszavonása
        System.out.println("Speciális engedélyek visszavonva!\n");
    }
}