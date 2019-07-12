package com.yoloho.schedule.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.yoloho.schedule.types.TaskItem;
import com.yoloho.schedule.util.ScheduleTaskUtil;

public class ScheduleTaskUtilTest {
    @Test
    public void parseItem() {
        TaskItem item = ScheduleTaskUtil.parseItem("a");
        assertEquals("a", item.getTaskItemId());
        
        item = ScheduleTaskUtil.parseItem("a:{b=3}");
        assertEquals("a", item.getTaskItemId());
        assertEquals("b=3", item.getParameter());
    }
    
    @Test
    public void parseItems() {
        TaskItem[] items = ScheduleTaskUtil.parseItems(new String[]{"a", "b:{c=3}"});
        assertNotNull(items);
        assertEquals(2, items.length);
        assertEquals("a", items[0].getTaskItemId());
        assertEquals("b", items[1].getTaskItemId());
        assertEquals("c=3", items[1].getParameter());
    }
}
