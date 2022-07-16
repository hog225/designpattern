package org.study.designpattern.iterator.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Getter
@ToString
public class Post {
    String content;
    ZonedDateTime createDateTime;

    Post(String content) {
        this.content = content;
        this.createDateTime = ZonedDateTime.now();
    }
}
