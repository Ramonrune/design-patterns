package com.builder;

public class SQLQueryBuilder implements QueryBuilder {

	private SQLQuery query = new SQLQuery();
	
	@Override
	public void from(String from) {
		query.setFrom(from);
	}

	@Override
	public void where(String where) {
		query.setWhere(where);
		
	}

	@Override
	public Query getQuery() {
		return query;
	}

}
