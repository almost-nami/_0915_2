package org.zerock.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor     // 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자를 작성
// @RequiredArgsConstructor // @NonNull이나 final이 붙은 인스턴스 변수에 대한 생성자를 작성
public class SampleHotel {
    private Chef chef;

    /*
    public SampleHotel(Chef chef) {
        this.chef = chef;
    }
    */
}
