package com.jiangyixuan.mybatis.my;

import com.jiangyixuan.mybatis.beans.Test;

public interface TestMapper {
    Test selectByPrimaryKey(Integer userId);
}