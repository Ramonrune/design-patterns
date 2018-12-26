package com.state;

public class ClosedTCPConnectionState implements TCPConnectionState {

	private TCPConnection connection;

	public ClosedTCPConnectionState(TCPConnection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void open() {
		System.out.println("Opening connection");
		connection.setTcpConnectionState(new OpenTCPConnectionState(connection));
	}

	@Override
	public void close() {
		System.out.println("Already closed");
	}

	@Override
	public void acknowledge() throws Exception {
		throw new Exception("Invalid usage of connection");
	}

}
