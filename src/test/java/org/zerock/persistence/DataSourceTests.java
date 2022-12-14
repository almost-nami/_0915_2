package org.zerock.persistence;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.sql.Connection;

import static org.junit.Assert.fail;

// Bean으로 등록된 DataSource를 이용해서 Connection을 제대로 처리할 수 있는지 확인하는 테스트코드
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:web/WEB-INF/applicationContext.xml")
@Log4j
public class DataSourceTests {

    @Setter(onMethod_ = {@Autowired})
    private DataSource dataSource;

    // 내부적으로 HikariCP가 시작되고 종료됨을 로그를 통해서 확인 가능
    @Test
    public void testConnection() {
        try(Connection con = dataSource.getConnection()) {
            log.info(con);
        } catch(Exception e) {
            fail(e.getMessage());
        }
    }

    // SqlSession을 사용하는 테스트
    @Setter(onMethod_ = {@Autowired})
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testMyBatis() {
        try(SqlSession session = sqlSessionFactory.openSession();
            Connection con = session.getConnection();
        ) {
            log.info(session);
            log.info(con);
        } catch(Exception e) {
            fail(e.getMessage());
        }
    }
}
