package org.study.designpattern.flyweight.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * extransit 잘 변하는
 */
@AllArgsConstructor
@Getter
@ToString
public class Character {
    private char ch;
    private String color;
    private Font font;


}
