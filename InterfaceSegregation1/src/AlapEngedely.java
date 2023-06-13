// Csak az alap engedélyeket éri el

class AlapEngedely implements AlapEngedelyInterface {

    @Override
    public void grantAlapEngedely() {
        // Alap engedély megadása
        System.out.println("Az alapvető engedélyekre feljogosító jogosultság hozzáadva!\n");
    }


    @Override
    public void revokeAlapEngedely() {
        // Alap engedély visszavonása
        System.out.println("Alap jogosultság visszavonva!\n");
    }
}