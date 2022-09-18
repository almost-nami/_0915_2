package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

// Mapper는 SQL과 그에 대한 처리를 지정하는 역능
public interface TimeMapper {

    @Select("SELECT sysdate FROM dual")
    public String getTime();

    // MyBatis 어노테이션 X, SQL X
    public String getTime2();
}
