package com.fujias.itesting.server;



import javax.jws.WebService;

/**
 * <p>
 * WebService实现类
 * </p>
 * 
 * @author IceWee
 * @date 2012-7-6
 * @version 1.0
 */
@SuppressWarnings("restriction")
@WebService(endpointInterface = "com.fujias.itesting.server.IHelloService", serviceName = "HelloService")
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String username) {
        return "hello, " + username;
    }

}