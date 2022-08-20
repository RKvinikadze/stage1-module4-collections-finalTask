package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> res = new HashSet<>();
        for (List<String> ls : timetable.values()){
            res.addAll(ls);
        }

        return res;
    }
}
