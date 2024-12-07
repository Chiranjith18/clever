public class Coffee {
    private String roast;

    public Coffee(String roast) throws InvalidTypeException {
        setRoast(roast);
    }

    public void setRoast(String roast) throws InvalidTypeException {
        if (!isValidRoast(roast)) {
            throw new InvalidTypeException("Invalid roast: \"" + roast + "\", please select a valid roast type!");
        }
        this.roast = roast;
    }

    private boolean isValidRoast(String roast) {
        // Add logic to check if the roast type is valid
        return roast.equalsIgnoreCase("light") || roast.equalsIgnoreCase("medium") || roast.equalsIgnoreCase("dark");
    }

    public String getRoast() {
        return roast;
    }

    public static class InvalidTypeException extends Exception {
        public InvalidTypeException(String message) {
            super(message);
        }
    }
}
