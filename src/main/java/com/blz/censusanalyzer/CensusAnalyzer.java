package com.blz.censusanalyzer;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class CensusAnalyzer {

    public int loadIndiaCensusData(String csvPath) throws CensusAnalyzerException {

        try{
            Reader reader = Files.newBufferedReader(Paths.get(csvPath));
            CsvToBeanBuilder<IndiaCensusCSV> csvCsvToBeanBuilder = new CsvToBeanBuilder<>(reader);
            csvCsvToBeanBuilder.withType(IndiaCensusCSV.class);
            csvCsvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
            CsvToBean<IndiaCensusCSV> csvToBean = csvCsvToBeanBuilder.build();

            Iterator<IndiaCensusCSV> censusCSVIterator = csvToBean.iterator();
            int numOfEntries = 0;
            while (censusCSVIterator.hasNext()){
                numOfEntries++;
                System.out.println(censusCSVIterator);
                censusCSVIterator.next();
            }
           return numOfEntries;
        }catch (IOException e){
            throw new CensusAnalyzerException(e.getMessage(), CensusAnalyzerException.ExceptionType.CENSUS_FILE_PROBLEM);
        }
    }
}
