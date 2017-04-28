package com.twogrit.learning.algorithm.map.greedy;

import com.google.common.base.Joiner;

import java.util.LinkedList;

/**
 * Created by kezhang on 17/4/27.
 */
public class Line implements Cloneable {
    private LinkedList linkedList = new LinkedList();
    private String start;
    private String end;
    private Double weight;

    public Line(String start, String end, Double weight) {
        this.start = start;
        this.end = end;
        linkedList.add(start);
        linkedList.add(end);
        this.weight = weight;
    }

    public Line(String start, String end,LinkedList linkedList ,Double weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
        this.linkedList=linkedList;
    }

    public LinkedList fetchLinkedList() {
        return linkedList;
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public Double getWeight() {
        return weight;
    }

    public String key() {
        return Joiner.on("->").join(start, end);
    }


}
