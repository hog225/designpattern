package org.study.designpattern.iterator.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Concrete Itorator
public class RecentPostIterator implements Iterator<Post> {

    private final Iterator<Post> internalIter;
    // concrete aggregate


    public RecentPostIterator(List<Post> posts) {
        posts.sort((p1, p2) -> p2.getCreateDateTime().compareTo(p1.getCreateDateTime()));
        this.internalIter = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIter.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIter.next();
    }
}
