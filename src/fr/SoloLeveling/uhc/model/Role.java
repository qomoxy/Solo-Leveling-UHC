package fr.SoloLeveling.uhc.model;

public enum Role{
    PARK_JONGSOO(RoleCamps.HUNTERS),
    SONG_CHI_YUL(RoleCamps.HUNTERS),
    SUNG_IL_HWAN(RoleCamps.HUNTERS),
    CHA_HAE_IN(RoleCamps.HUNTERS),
    SUNG_JIN_WOO(RoleCamps.HUNTERS),
    WOO_JIN_CHEOL(RoleCamps.HUNTERS),
    YOO_JINHO(RoleCamps.HUNTERS),
    BAEK_YOON_HO(RoleCamps.HUNTERS),
    CHOI_JONG_IN(RoleCamps.HUNTERS),
    GO_GUN_HEE(RoleCamps.HUNTERS),
    GOTO_RYUJI(RoleCamps.HUNTERS),
    NORMA_SELMER(RoleCamps.HUNTERS),
    KEI(RoleCamps.HUNTERS),
    CHRISTOPHER_REED(RoleCamps.HUNTERS),
    MIN_BYUNG_GYU(RoleCamps.HUNTERS),
    MA_DONGWOOK(RoleCamps.HUNTERS),
    LIM_TAE_GYU(RoleCamps.HUNTERS),
    LIU_ZHIGANG(RoleCamps.HUNTERS),
    LEGIA(RoleCamps.HUNTERS),
    HWANG_DONGSOO(RoleCamps.HUNTERS),
    MINORU_HOSHINO(RoleCamps.HUNTERS),
    TATSUMI_FUJISHIMA(RoleCamps.HUNTERS),
    LENNART_NIERMANN(RoleCamps.HUNTERS),
    AHN_SANGMIN(RoleCamps.HUNTERS),
    THOMAS_ANDRE(RoleCamps.HUNTERS),
    HANEKAWA(RoleCamps.HUNTERS),
    ESIL(RoleCamps.HUNTERS),
    BERU(RoleCamps.MUTABLE),
    IGRIS(RoleCamps.MONSTERS),
    KARGALGAN(RoleCamps.MONSTERS),
    YOGUMUNTAL(RoleCamps.MONSTERS),
    QUERESHSA(RoleCamps.MONSTERS),
    TARNAK(RoleCamps.MONSTERS),
    SILLAD(RoleCamps.MONSTERS),
    RAKAN(RoleCamps.MONSTERS),
    ANTARES(RoleCamps.MONSTERS),
    BARAN(RoleCamps.MONSTERS),
    HWANG_DONGSUK(RoleCamps.LEZARD),
    YURI_ORLOFF(RoleCamps.LEZARD),
    KANG_TAESHIK(RoleCamps.LEZARD),
    KIM_CHUL(RoleCamps.LEZARD),
    BELLION(RoleCamps.SOLO),
    ASHBORN(RoleCamps.DUO),
    ARCHITECT(RoleCamps.DUO),
    LEE_MINSUNG(RoleCamps.SOLO),;

    private final RoleCamps clan;

    Role(RoleCamps roleCamps) {
        this.clan = roleCamps;
    }

    public RoleCamps getClan() {
        return clan;
    }

}

