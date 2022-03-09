package org.study.designpattern.builder.spring;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.stream.Stream;

public class UsageOnSpring {

    public static void main(String[] args) {
        // no syncronized
        // String - product
        // AbstractStringBuilder - builder
        // StringBuilder - concreteBuilder
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("hi").append(4).toString();
        System.out.println(result);

        // String - product
        // Stream.Builder - builder
        // StreamBuilderImpl - concreteBuilder
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = stringStreamBuilder.add("gildong").add("yeonggi").build();
        names.forEach(System.out::println);

        // UriComponents - product
        // UriComponentsBuilder - builder, concreteBuilder
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("toast.com")
                .path("instance")
                .build();
        System.out.println(uriComponents);
    }

}
