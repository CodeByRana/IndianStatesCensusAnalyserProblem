package com.blz.censusanalyzer;

import com.opencsv.bean.CsvToBeanBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.util.Iterator;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_PATH = "C:\\java\\CensusAnalyzer\\src\\main\\resources\\IndiaStateCensusData.csv";

    @Test
    public void givenIndiaCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();

        try {
            int numOfRecord = censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}