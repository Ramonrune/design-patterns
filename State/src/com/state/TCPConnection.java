package com.state;

public class TCPConnection {

	private TCPConnectionState tcpConnectionState = new ClosedTCPConnectionState(this);
	
	public void open(){
		tcpConnectionState.open();
	}
	
	public void close(){
		tcpConnectionState.close();
	}
	
	public void acknowledge() throws Exception{
		tcpConnectionState.acknowledge();
	}

	protected void setTcpConnectionState(TCPConnectionState tcpConnectionState) {
		this.tcpConnectionState = tcpConnectionState;
	}
	
	
}
