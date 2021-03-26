public class Chequ {

    private String diagnostic;
    private String repair;
    private String notBigChanges;

    void setDiagnostic(String value) {
        this.diagnostic = value;
    }

    void setRepair(String value) {
        this.repair = value;
    }
    void setNotBigChanges(String value) {
        this.notBigChanges = value;
    }

    private String getDiagnostic() {
        return diagnostic;
    }
    private String getRepair() {
        return repair;
    }
    private String getNotBigChanges() {
        return notBigChanges;
    }

}
