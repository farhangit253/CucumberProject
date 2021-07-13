package com.amazon.managers;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static com.amazon.readconfigfile.ConfigFileReader configFileReader;

	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public com.amazon.readconfigfile.ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new com.amazon.readconfigfile.ConfigFileReader() : configFileReader;
	 }

}
