package lab06_cpit252;

public class ConsoleLogger extends BaseLogger {
    public ConsoleLogger() {
        label = "Console logger";
    }

    public String getLevel() {
        return "info";
    }
}