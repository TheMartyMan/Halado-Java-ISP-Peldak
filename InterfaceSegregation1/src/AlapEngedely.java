class AlapEngedely implements AlapEngedelyInterface {

    @Override
    public void grantAlapEngedely() {
        System.out.println("Az alapvető engedélyekre feljogosító jogosultság hozzáadva!\n");
    }


    @Override
    public void revokeAlapEngedely() {
        System.out.println("Alap jogosultság visszavonva!\n");
    }
}
