package org.fruits.enums;

import static org.fruits.enums.RegionEnum.*;

public enum StateEnum {

    ACRE("Acre", "AC", NORTH),
    ALAGOAS("Alagoas", "AL", NORTHEAST),
    AMAPA("Amapá", "AP", NORTH),
    AMAZONAS("Amazonas", "AM", NORTH),
    BAHIA("Bahia", "BA", NORTHEAST),
    CEARA("Ceara", "CE", NORTHEAST),
    ESPIRITO_SANTO("Espírito Santo", "ES", SOUTHEAST),
    GOIAS("Goiás", "GO", CENTER_WEST),
    MARANHAO("Maranhão", "MA", NORTHEAST),
    MATO_GROSSO("Mato Grosso", "MT", CENTER_WEST),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", CENTER_WEST),
    MINAS_GERAIS("Minas Gerais", "MG", SOUTHEAST),
    PARA("Pará", "PA", NORTH),
    PARAIBA("Paraíba", "PB", NORTHEAST),
    PARANA("Paraná", "PR", SOUTH),
    PERNAMBUCO("Pernambuco", "PE", NORTHEAST),
    PIAUI("Piauí", "PI", NORTHEAST),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", SOUTHEAST),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", NORTHEAST),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", SOUTH),
    RONDONIA("Rondônia", "RO", NORTH),
    RORAIMA("Roraima", "RR", NORTH),
    SANTA_CATARINA("Santa Catarina", "SC", SOUTH),
    SAO_PAULO("São Paulo", "SP", SOUTHEAST),
    SERGIPE("Sergipe", "SE", NORTHEAST),
    TOCANTINS("Tocantins", "TO", NORTH),
    DISTRITO_FEDERAL("Distrito Federal", "DF", CENTER_WEST);

    private String name;
    private String abbreviation;
    private RegionEnum region;

    StateEnum(String name, String abbreviation, RegionEnum region) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public RegionEnum getRegion() {
        return region;
    }
}
