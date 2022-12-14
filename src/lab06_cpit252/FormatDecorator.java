package lab06_cpit252;

public abstract class FormatDecorator extends BaseLogger {
    BaseLogger logger;
    // All format decorators have to reimplement the getLabel method
    public abstract String getLabel();
}