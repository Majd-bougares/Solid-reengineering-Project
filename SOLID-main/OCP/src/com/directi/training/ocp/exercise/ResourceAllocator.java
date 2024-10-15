package com.directi.training.ocp.exercise;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;
    private Map<ResourceType, ResourceAllocatorStrategy> strategies;

    public ResourceAllocator() {
        strategies = new HashMap<>();
        strategies.put(ResourceType.TIME_SLOT, new TimeSlotAllocatorStrategy());
        strategies.put(ResourceType.SPACE_SLOT, new SpaceSlotAllocatorStrategy());
    }

    public int allocate(ResourceType resourceType) {
        ResourceAllocatorStrategy strategy = strategies.get(resourceType);
        if (strategy != null) {
            return strategy.allocate();
        } else {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
    }

    public void free(ResourceType resourceType, int resourceId) {
        ResourceAllocatorStrategy strategy = strategies.get(resourceType);
        if (strategy != null) {
            strategy.free(resourceId);
        } else {
            System.out.println("ERROR: attempted to free invalid resource");
        }
    }
}