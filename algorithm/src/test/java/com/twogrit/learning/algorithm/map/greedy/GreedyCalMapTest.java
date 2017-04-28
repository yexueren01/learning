package com.twogrit.learning.algorithm.map.greedy;

import com.google.common.base.Joiner;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;

/**
 * Created by kezhang on 17/4/27.
 */
public class GreedyCalMapTest {

    Mapper mapper;

    @Before
    public void init() {
        mapper = Mapper.Builder.newInstance()
                .put("1", "2", 7.0)
                .put("1", "3", 9.0)
                .put("1", "6", 14.0)
                .put("2", "4", 15.0)
                .put("2", "3", 10.0)
                .put("3", "4", 11.0)
                .put("3", "6", 2.0)
                .put("6", "5", 9.0)
                .put("4", "5", 6.0)
                .build();
    }


    @Test
    public void test() {
        assertThat(Joiner.on("->").join(GreedyCalMap.create(mapper.getMultimap(), "1", "5").cal().fetchLinkedList()), equalTo("1->3->6->5"));
    }

    @Test
    public void testOneL() {
        Line line = GreedyCalMap.create(Mapper.Builder.newInstance()
                .put("1", "2", 7.0).multimap, "1", "2").cal();
        assertThat(Joiner.on("->").join(line.fetchLinkedList()), equalTo("1->2"));
        assertThat(line.getWeight(), equalTo(7.0));
    }

    @Test
    public void testTwoL() {

        Line line = GreedyCalMap.create(Mapper.Builder.newInstance()
                .put("1", "2", 7.0).put("2", "3", 3.0).multimap, "1", "3").cal();
        assertThat(Joiner.on("->").join(line.fetchLinkedList()), equalTo("1->2->3"));
        assertThat(line.getWeight(), equalTo(10.0));
    }

    @Test
    public void testAdd() {
        GreedyCalMap greedyCalMap = GreedyCalMap.create(Mapper.Builder.newInstance()
                .put("1", "2", 7.0).build().getMultimap(), "1", "2");

        Line line = new Line("1", "2", 7.0);
        greedyCalMap.add(line);
        assertTrue(greedyCalMap.calEndList.contains(line.getEnd()));
        assertThat(greedyCalMap.caledEndKeyMap.get(line.getEnd()), equalTo(line));

        //  System.out.println("x");
        // assertThat(Joiner.on("->").join(greedyCalMap.cal().fetchLinkedList()), equalTo("1->3->6->5"));
    }


    @Test
    public void testMergeOkWithNullStart() {
        Line line = GreedyCalMap.merge(null, new Line("2", "3", 7.0));
        assertThat(Joiner.on("->").join(line.getLinkedList()), equalTo("2->3"));
        assertThat(line.getWeight(), equalTo(7.0));
    }

    @Test
    public void testMergeOk() {
        Line line = GreedyCalMap.merge(new Line("1", "2", 7.0), new Line("2", "3", 7.0));
        assertThat(Joiner.on("->").join(line.getLinkedList()), equalTo("1->2->3"));
        assertThat(line.getWeight(), equalTo(14.0));
    }

    @Test
    public void testMergeFail() {
        Line line = GreedyCalMap.merge(new Line("1", "2", 7.0), new Line("2", "3", 7.0));
        assertThat(Joiner.on("->").join(line.getLinkedList()), equalTo("1->2->3"));
        assertThat(line.getWeight(), equalTo(14.0));
    }
}

