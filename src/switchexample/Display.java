package switchexample;

public enum Display{
    SPAIN("España"),
    ITALY("Italia"),
    PORTUGAL("Portugal");


    private String value;

    Display(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

