public class Flight {
    private int fNumber = 0;
    private String fClass;

    public Flight(int num) {
        this.fNumber = num;
    }

    public Flight(String fCls) {
        this.fClass = fCls;
    }

    @Override
    public String toString() {
        if (fClass == null || fClass.isBlank()) {
            return "Flight #" + fNumber;
        } else {
            return "Flight Class " + fClass;
        }
    }

    public int getfNumber() {
        return fNumber;
    }

    public void setfNumber(int fNumber) {
        this.fNumber = fNumber;
    }

    public String getfClass() {
        return fClass;
    }

    public void setfClass(String fClass) {
        this.fClass = fClass;
    }

}
