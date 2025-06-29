package JavaAdvCoding.Exercise12_13;

public enum EngineType {
    V12,
    V10,
    V8,
    V6,
    S6,
    S4,
    S3,
    F4,
    F6,
    ELECTRIC,
    OTHER;

    public static String printString() {
        String result = "";
        for (EngineType engineType : EngineType.values()) {
            result += engineType + ", ";
        }
        return result;
    }
}
