public class Main {
    public static void main(String[] args) {

        AlapEngedelyInterface alapEngedely = new AlapEngedely();
        SpecialisEngedelyInterface specialisEngedely = new SpecialisEngedely();

        EngedelyKezelo kezelo = new EngedelyKezelo(alapEngedely,  specialisEngedely);

        kezelo.grantAlapEngedely();
        kezelo.revokeAlapEngedely();

        kezelo.grantSpecialisEngedely();
        kezelo.revokeSpecialisEngedely();
    }
}
