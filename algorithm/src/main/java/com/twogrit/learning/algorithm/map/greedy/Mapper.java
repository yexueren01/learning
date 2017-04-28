package com.twogrit.learning.algorithm.map.greedy;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * Created by kezhang on 17/4/27.
 */
public class Mapper {

    Multimap multimap;

    public Mapper(Multimap multimap) {
        this.multimap = multimap;
    }


    public static class Builder {
        Multimap multimap = ArrayListMultimap.create();

        public Builder put(String start, String to, Double weight) {
            Line line = new Line(start, to, weight);
            this.multimap.put(line.getStart(), line);
            return this;
        }

        public static Builder newInstance() {
            return new Builder();

        }

        public Mapper build() {
            return new Mapper(multimap);
        }
    }

    public Multimap getMultimap() {
        return multimap;
    }
}
