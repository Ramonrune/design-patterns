package com.datatransferobject;

public class DomainService {

	
	public DomainObjectDTO getData(){
		
		DomainObject domainObject = getObject();
		
		DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
		
		domainObjectDTO.setaProperty(domainObject.getaProperty());
		
		return domainObjectDTO;
	}
	
	public DomainObject getObject(){
		
		DomainObject domainObject = new DomainObject();
		domainObject.setaProperty("test");
		
		return domainObject;
	}
}
