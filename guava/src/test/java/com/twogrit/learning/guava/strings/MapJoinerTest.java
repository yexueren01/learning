package com.twogrit.learning.guava.strings;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by kezhang on 17/4/21.
 */
public class MapJoinerTest {


    @Test
    public void testMapJoiner() throws Exception {

        Map<String,String> map = Maps.newLinkedHashMap();
        map.put("Audi", "Neckarsulm");
        map.put("VW", "Wolfsburg");
        map.put("Merzedes", "Stuttgart");
        map.put("Porsche", "Stuttgart");
        map.put("Opel", "Rüsselsheim");
        map.put("Ford", "Köln");

        String joined = Joiner.on("#").withKeyValueSeparator("=").join(map);
        String expected = "Audi=Neckarsulm#VW=Wolfsburg#Merzedes=Stuttgart#Porsche=Stuttgart#Opel=Rüsselsheim#Ford=Köln";

        assertThat(joined, equalTo(expected));
    }


}
