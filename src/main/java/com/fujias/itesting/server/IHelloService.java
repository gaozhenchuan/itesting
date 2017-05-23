package com.fujias.itesting.server;


import javax.jws.WebService;

/**
 * <p>
 * WebService接口
 * </p>
 * 
 * @author IceWee
 * @date 2012-7-6
 * @version 1.0
 */
@SuppressWarnings("restriction")
@WebService
public interface IHelloService {
    public String sayHello(String username);
}