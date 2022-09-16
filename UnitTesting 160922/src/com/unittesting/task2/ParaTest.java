package com.unittesting.task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParaTest {

	@ParameterizedTest
    @ValueSource(ints = {10,15,20,40})
    @DisplayName("ValueSource")
    public void testWithValueSource(int num) {
		OperationOddEven obj = new OperationOddEven();
        assertEquals(false,obj.oddEven(num));
    }
    
    @ParameterizedTest
    @CsvSource(value={"10,true","15,false","20,true","25,true"})
    @DisplayName("CSVSource")
    public void testWithCSVSource(int num,String value) {
        OperationOddEven obj = new OperationOddEven();
        assertEquals(value,obj.oddEven(num));
    }
    
    @ParameterizedTest
    @CsvFileSource( resources = "demo.csv")
    @DisplayName("CSVFileSource")
    public void testWithCSVFileSource(int num) {
    	OperationOddEven obj = new OperationOddEven();
        assertEquals(false,obj.oddEven(num));
    }
}
