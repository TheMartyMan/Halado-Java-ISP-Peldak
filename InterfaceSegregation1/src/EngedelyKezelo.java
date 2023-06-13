class EngedelyKezelo {
    private AlapEngedelyInterface alapEngedely;
    private SpecialisEngedelyInterface specialisEngedely;

    public EngedelyKezelo(AlapEngedelyInterface alapEngedelyInterface, SpecialisEngedelyInterface specialisEngedely) {
        this.alapEngedely = alapEngedelyInterface;
        this.specialisEngedely = specialisEngedely;
    }



    public void grantAlapEngedely() {
        alapEngedely.grantAlapEngedely();
    }

    public void revokeAlapEngedely() {
        alapEngedely.revokeAlapEngedely();
    }

    public void grantSpecialisEngedely() {
        specialisEngedely.grantSpecialEngedely();
    }

    public void revokeSpecialisEngedely() {
        specialisEngedely.revokeSpecialEngedely();

    }
}