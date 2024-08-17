package fr.SoloLeveling.uhc.model;

public class Gameconfig {

    private static int role_time;

    private static int nb_hunters;
    private static int nb_monsters;
    private static int nb_shadows;
    private static int nb_lezad;
    private static int nb_solo;
    private static int nb_duo;
    private static int nb_mutable;

    private static int nb_role;

    private static int worldborder_size;

    private static int nb_player;

    private void GameConfig(int nb_hunters, int nb_monsters, int nb_solo, int nb_duo, int nb_mutable, int nb_role, int worldborder_size, int nb_shadows, int nb_lezad) {
        Gameconfig.nb_hunters = nb_hunters;
        Gameconfig.nb_monsters =  nb_monsters;
        Gameconfig.nb_shadows = nb_shadows;
        Gameconfig.nb_lezad = nb_lezad;
        Gameconfig.nb_solo = nb_solo;
        Gameconfig.nb_duo = nb_duo;
        Gameconfig.nb_mutable = nb_mutable;
        Gameconfig.nb_role = nb_role;
        Gameconfig.worldborder_size = worldborder_size;
    }

    public static int getNb_hunters() {
        return nb_hunters;
    }

    public static int getNb_monster() {
        return nb_monsters;
    }

    public static int getNb_shadows() {
        return nb_shadows;
    }

    public static int getNb_lezad() {
        return nb_lezad;
    }

    public static int getNb_solo() {
        return nb_solo;
    }

    public static int getNb_duo() {
        return nb_duo;
    }

    public static int getNb_mutable() {
        return nb_mutable;
    }

    public static int getNb_role() {
        return nb_role;
    }

    public static int getWorldborder_size() {
        return worldborder_size;
    }

    public static int getRole_time() {
        return role_time;
    }

    public static int getNb_player() {
        return nb_player;
    }


}
