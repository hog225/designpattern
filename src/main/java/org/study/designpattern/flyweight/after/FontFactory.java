package org.study.designpattern.flyweight.after;

import java.util.HashMap;
import java.util.Map;

/**
 * 플라이 웨이트 객체를 접근하고 캐싱하는
 */
public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
