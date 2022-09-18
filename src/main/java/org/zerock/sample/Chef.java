package org.zerock.sample;

import lombok.Data;
import org.springframework.stereotype.Component;

// @Component : 스프링에서 관리해야 하는 대상임을 표시
// @Data : @ToString, @EqualsAndHashCode, @Getter/Setter, @RequiredArgsConstructor를 모두 결합
@Component
@Data
public class Chef {
}
