public class Sepeda extends Kendaraan {

    private boolean isAuto;

    public boolean isAuto() {
        return isAuto;
    }

    public void setAuto(boolean isAuto) {
        this.isAuto = isAuto;
    }

    @Override
    public void nyalakan() {
        System.out.println("Sepeda dinyalakan");
    }

    public void jenis() {
        if (isAuto) {
            System.out.println("Sepeda otomatis");
        } else {
            System.out.println("Sepeda kayuh");
        }
    }
}
