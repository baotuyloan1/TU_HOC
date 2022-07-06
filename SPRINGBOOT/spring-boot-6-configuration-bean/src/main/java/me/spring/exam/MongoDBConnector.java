package me.spring.exam;

public class MongoDBConnector extends DatabaseConnector {
	@Override
	public void connect() {
		System.out.println("Đã kết nối tới MonogoDB: " + getUrl());
	}

}
