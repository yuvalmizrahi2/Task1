package intputoutputtest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import inputoutput.CsvToSamples;
import inputoutput.IOCsvFile;
import sample.Sample;

class IOCsvFileTest {

	@Test
	void testReadfile() {
		ArrayList<Sample> test = IOCsvFile.readfile("filetest");
		assertTrue(test.size() == 3821);

	}

	@Test
	void testWritefile() {
		ArrayList<Sample> test = IOCsvFile.readfile("filetest");
		IOCsvFile.writefile("IOCsvFileTest.csv", test,"output//");
		test = CsvToSamples.readfile("IOCsvFileTest.csv");
		assertTrue(test.size() == 3607);
	}

}
