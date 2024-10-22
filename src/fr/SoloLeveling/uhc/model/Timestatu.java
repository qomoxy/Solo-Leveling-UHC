package fr.SoloLeveling.uhc.model;

public enum Timestatu {
    DAY("Jour"),
    NIGHT("Nuit");

    private String name;

    private Timestatu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
