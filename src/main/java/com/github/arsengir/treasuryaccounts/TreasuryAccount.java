package com.github.arsengir.treasuryaccounts;

import java.nio.charset.StandardCharsets;

public class TreasuryAccount {
    // Номер казначейского счета
    private final String TA;
    // Номер единого казначейского счета
    private final String TSA;
    // Банковский идентификационный код территориального органа Федерального казначейства
    // в платежной системе Банка России
    private final String TBIC;
    //Дата открытия казначейского счета
    private final String TAOpenDate;
    //Наименование владельца казначейского счета
    private final String TAHolder;
    //Вариант открытия лицевого счета (LS1 - лицевые счета открыты в территориальном органе Федерального
    //казначейства, LS2 - лицевые счета открыты в финансовом органе или органе управления внебюджетным фондом)
    private final String LSScheme;

    public TreasuryAccount(String ta, String tsa, String tbic, String taOpenDate, String taHolder, String lsScheme) {
        TA = ta;
        TSA = tsa;
        TBIC = tbic;
        TAOpenDate = taOpenDate;
        TAHolder = taHolder;
        LSScheme = lsScheme;
    }

    @Override
    public String toString() {
        return "TreasuryAccount{" +
                "TA='" + TA + '\'' +
                ", TSA='" + TSA + '\'' +
                ", TBIC='" + TBIC + '\'' +
                ", TAOpenDate='" + TAOpenDate + '\'' +
                ", TAHolder='" + TAHolder + '\'' +
                ", LSScheme='" + LSScheme + '\'' +
                '}';
    }

    public byte[] getBytesForSaveToFile() {
        String line = TA + "," + TSA + "," + TBIC + "," + TAOpenDate + "," + TAHolder + "," + LSScheme + "\n";
        return line.getBytes(StandardCharsets.UTF_8);
    }
}