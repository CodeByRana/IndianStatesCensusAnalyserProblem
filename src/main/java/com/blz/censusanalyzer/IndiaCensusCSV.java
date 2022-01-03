package com.blz.censusanalyzer;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
    @CsvBindByName(column = "state")
    private String state;

    @CsvBindByName(column = "Population")
    private int population;
    //State,Population,AreaInSqKm,DensityPerSqKm

    @CsvBindByName(column = "AreaInSqKm")
    private int areaInSqKm;

    @CsvBindByName(column = "DensityPerSqKm")
    private int densityPerSqKm;

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", areaInSqKm=" + areaInSqKm +
                ", densityPerSqKm=" + densityPerSqKm +
                '}';
    }
}
