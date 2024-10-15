package com.directi.training.ocp.exercise;

public interface ResourceAllocatorStrategy {
    int allocate();
    void free(int resourceId);
}