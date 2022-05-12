package org.study.designpattern.flyweight.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 플라이웨이트 객체는 내적인 객체이기 때문에 immutable (다른 곳에서 값을 바꿀수 없음) 으로 만드는게 중요하다.
 */
@AllArgsConstructor
@Getter
@ToString
public final class Font {
    final String family;

    final int size;
}
