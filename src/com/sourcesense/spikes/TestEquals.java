package com.sourcesense.spikes;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestEquals {

    @Test
    public void testname() throws Exception {
        MyObject myObject = new MyObject("One");
        MyObject myOtherObject = new MyObject("Two");
        
        assertHashCodeIsConsistentFor(myObject, new MyObject("One"));
        
        HashSet<MyObject> set = new HashSet<MyObject>();
        set.add(myObject);
        set.add(myOtherObject);

        assertTrue(set.contains(new MyObject("One")));
        assertTrue(set.contains(new MyObject("Two")));
        assertFalse(set.contains(new MyObject("Three")));
        
    }

    private void assertHashCodeIsConsistentFor(Object myObject, Object myObject2) {
        assertTrue(myObject.equals(myObject2) && myObject.hashCode() == myObject2.hashCode());
    }
}
