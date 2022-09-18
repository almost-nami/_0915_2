package org.zerock.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

// @AllArgsConstructor : 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자를 작성
// @RequiredArgsConstructor : @NonNull이나 final이 붙은 인스턴스 변수에 대한 생성자를 작성
@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel {
    private Chef chef;

    /*
    // 스프링 4.3 이후부터는 @Autowired 없이 생성자 주입이 가능
    public SampleHotel(Chef chef) {
        this.chef = chef;
    }
    */
}
