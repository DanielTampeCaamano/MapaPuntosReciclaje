package modelo;

public enum Categoria {
    VIDRIO,
    METAL,
    PAPEL,
    PLASTICO,
    BATERIAPILA;

    public static Categoria getVIDRIO() {
        return VIDRIO;
    }

    public static Categoria getMETAL() {
        return METAL;
    }

    public static Categoria getPAPEL() {
        return PAPEL;
    }

    public static Categoria getPLASTICO() {
        return PLASTICO;
    }

    public static Categoria getBATERIAPILA() {
        return BATERIAPILA;
    }

    @Override
    public String toString() {
        return "Categoria{" + '}';
    }

}
