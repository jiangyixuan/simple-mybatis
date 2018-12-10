package com.jiangyixuan.mybatis.my;

public interface Executor {
    <E> E query(String statement, Object parameter);
}