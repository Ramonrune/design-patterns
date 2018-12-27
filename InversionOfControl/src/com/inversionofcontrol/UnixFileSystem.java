package com.inversionofcontrol;

public class UnixFileSystem implements FileSystem{

	@Override
	public String readFile() {
		return "Unix file system";
	}

}
