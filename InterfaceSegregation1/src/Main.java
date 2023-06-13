public class Main {
    public static void main(String[] args) {

        AlapEngedelyInterface alapEngedely = new AlapEngedely();
        SpecialisEngedelyInterface specialisEngedely = new SpecialisEngedely();

        EngedelyKezelo kezelo = new EngedelyKezelo(alapEngedely,  specialisEngedely);

        // Alap bejelentkezési jogosultság hozzáadása és visszavonása az alap engedélyeknek
        kezelo.grantAlapEngedely();
        kezelo.revokeAlapEngedely();



        // Alap bejelentkezési és speciális jogosultság hozzáadása és visszavonása a speciális engedélyeknek
        kezelo.grantSpecialisEngedely();
        kezelo.revokeSpecialisEngedely();
    }
}