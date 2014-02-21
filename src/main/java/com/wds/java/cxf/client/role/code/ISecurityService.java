package com.wds.java.cxf.client.role.code;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2014-02-21T14:09:25.781+08:00
 * Generated source version: 3.0.0-milestone1
 * 
 */
@WebService(targetNamespace = "http://server.spring.cxf.wds.com/", name = "ISecurityService")
@XmlSeeAlso({ObjectFactory.class})
public interface ISecurityService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAuthority", targetNamespace = "http://server.spring.cxf.wds.com/", className = "com.wds.java.cxf.client.role.code.GetAuthority")
    @WebMethod
    @ResponseWrapper(localName = "getAuthorityResponse", targetNamespace = "http://server.spring.cxf.wds.com/", className = "com.wds.java.cxf.client.role.code.GetAuthorityResponse")
    public com.wds.java.cxf.client.role.code.MappingUserValue getAuthority();
}
