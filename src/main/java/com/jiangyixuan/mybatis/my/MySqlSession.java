package com.jiangyixuan.mybatis.my;


import java.lang.reflect.Proxy;

/**
 * @author jiangyixuan
 * @date 2018-12-10
 */
public class MySqlSession {
    private Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement, Object parameter) {
        return executor.query(statement, parameter);
    }

    public <T> T getMapper(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MapperProxy<T>(this, clazz));
    }
}
