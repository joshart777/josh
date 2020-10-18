package com.ace.sftp;

public class ftpTest {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		SFTPHandler sftpHandler = new SFTPHandler();
		sftpHandler.init("192.168.220.130", "root", "1234", 24);
		sftpHandler.upload("/home/test", "D:\test.txt");
		System.out.println("Done");
		
	}
}
