package com.builder;

public class Client {

	public static void main(String[] args) {
		QueryBuildDirector director = new QueryBuildDirector();
		String from = "client";
		String where = "client_id = ?";

		QueryBuilder builder = new MongoDBQueryBuilder();

		Query buildQuery = director.buildQuery(from, where, builder);

		buildQuery.execute();

		builder = new SQLQueryBuilder();

		buildQuery = director.buildQuery(from, where, builder);

		buildQuery.execute();

	}
}
