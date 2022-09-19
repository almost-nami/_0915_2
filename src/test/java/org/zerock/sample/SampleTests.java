package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

// Restaurant에 대한 테스트 -> setter 주입
/*
    1.Lombok 관련
        -> @Setter, @Data, @Log4j
    2.Spring 관련
        -> @Autowired, @Component
    3.테스트 관련
        -> @RunWith, @ContextConfiguration, @Test
 */

// @RunWith : 테스트 코드가 스프링을 실행하는 역할을 하게 됨
//      -> 테스트시 필요한 클래스를 지정
// @ContextConfiguration : 필요한 객체들을 Bean으로 등록
//      -> locations를 이용해서 문자열로 XML설정파일을 명시하거나 classes를 이용해서 @Configuration이 적용된 클래스를 지정할 수 있음
// @Log4j : Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성
// @Log : static final로 Logger객체가 생성됨
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:web/WEB-INF/applicationContext.xml")
@Log4j
public class SampleTests {

    // @Autowired : 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시
    @Setter(onMethod_ = {@Autowired})
    private Restaurant restaurant;

    // @Test : 테스트 대상을 표시
    @Test
    public void testExist() {
        // 파라미터 restaurant가 null이 아니어야만 테스트가 성공한다는 것을 의미함
        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("-----------------------");
        log.info(restaurant.getChef());
    }
}
