package org.study.designpattern.builder.spring;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Annotation Processor 를 통해 Compile 시 Builder 코드 생성
 */
@Builder
@ToString
public class LombokExample {
    private String title;
    private int nights;
    private int days;

    public static class LombokExampleBuilder {
        public LombokExampleBuilder title(String title) {
            this.title = title + "!!";
            return this;
        }
    }

    public static void main(String[] args) {
        LombokExample lombokExample = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
        System.out.println(lombokExample);
    }
}
