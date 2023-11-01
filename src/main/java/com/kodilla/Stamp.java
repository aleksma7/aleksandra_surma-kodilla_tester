package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String dimensions;
    private boolean stamped;

    public Stamp(String name, String dimensions, boolean stamped) {
        this.name = name;
        this.dimensions = dimensions;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stamped == stamp.stamped && Objects.equals(name, stamp.name) && Objects.equals(dimensions, stamp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensions, stamped);
    }
}

