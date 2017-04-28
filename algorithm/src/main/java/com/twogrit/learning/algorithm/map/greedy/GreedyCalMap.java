package com.twogrit.learning.algorithm.map.greedy;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import java.util.*;

/**
 * Created by kezhang on 17/4/27.
 */
public class GreedyCalMap {

    String start;
    String end;
    List<String> calEndList = Lists.newArrayList();

    Double minWeigth = Double.POSITIVE_INFINITY;
    Map<String, Line> caledEndKeyMap = new HashMap<String, Line>();

    Multimap multimap;

    private GreedyCalMap(Multimap multimap, String start, String end) {
        this.start = start;
        this.end = end;
        this.multimap = multimap;
        calEndList.add(start);
//        Line line = new Line(start, start, 0.0);
//        add(line);

    }

    public void add(Line line) {
        caledEndKeyMap.put(line.getEnd(), line);
        calEndList.add(line.getEnd());
    }

    public static GreedyCalMap create(Multimap multimap, String start, String end) {
        return new GreedyCalMap(multimap, start, end);
    }

    public Line cal() {
        if (multimap.keySet().size() == 0) return caledEndKeyMap.get(end);
        String tempEnd = calEndList.get(0);
        Collection lineCollection = multimap.get(tempEnd);

        Iterator<Line> lineIterator = lineCollection.iterator();


        while (lineIterator.hasNext()) {
            Line calingLine = lineIterator.next();

            Line caledCalingStartLine = caledEndKeyMap.get(calingLine.getStart());
            Line caledCalingLine = caledEndKeyMap.get(calingLine.getEnd());
            if (caledCalingStartLine == null && this.start != calingLine.getStart()) {
                continue;
            }
            if (null == caledCalingLine || (caledCalingStartLine.getWeight() + calingLine.getWeight() < caledCalingLine.getWeight()))
                this.add(merge(caledCalingStartLine, calingLine));

        }
        multimap.removeAll(tempEnd);
        calEndList.remove(0);
        return cal();
    }

    public static Line merge(Line caledCalingStartLine, Line calingLine) {
        if (null == caledCalingStartLine) return calingLine;
        LinkedList tempLinkedList = (LinkedList) caledCalingStartLine.getLinkedList().clone();
        tempLinkedList.remove(tempLinkedList.size() - 1);
        tempLinkedList.addAll((LinkedList) calingLine.getLinkedList().clone());
        return new Line(caledCalingStartLine.getStart(), calingLine.getEnd(), tempLinkedList, caledCalingStartLine.getWeight() + calingLine.getWeight());

    }
}
