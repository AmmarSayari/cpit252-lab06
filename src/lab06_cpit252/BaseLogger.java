package lab06_cpit252;

public abstract class BaseLogger {
    String label = "Unknown label";

    public String getLabel() {
        return label;
    }

    public abstract String getLevel();
}