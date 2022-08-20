package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new ArrayList<>();
        for (String key: projects.keySet()){
            if (projects.get(key).contains(developer)){
                res.add(key);
            }
        }

        res.sort(new SortProjectList());
        return res;
    }

    public class SortProjectList implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length() == o2.length() ? o2.compareTo(o1) : o1.compareTo(o2);
        }
    }
}
