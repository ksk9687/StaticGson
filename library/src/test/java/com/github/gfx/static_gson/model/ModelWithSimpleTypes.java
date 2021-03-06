package com.github.gfx.static_gson.model;

import com.github.gfx.static_gson.annotation.JsonSerializable;

@JsonSerializable
public class ModelWithSimpleTypes {

    public boolean booleanValue;

    public short shortValue;

    public int intValue;

    public long longValue;

    public float floatValue;

    public double doubleValue;

    public String stringValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelWithSimpleTypes)) {
            return false;
        }

        ModelWithSimpleTypes that = (ModelWithSimpleTypes) o;

        if (booleanValue != that.booleanValue) {
            return false;
        }
        if (shortValue != that.shortValue) {
            return false;
        }
        if (intValue != that.intValue) {
            return false;
        }
        if (longValue != that.longValue) {
            return false;
        }
        if (Float.compare(that.floatValue, floatValue) != 0) {
            return false;
        }
        if (Double.compare(that.doubleValue, doubleValue) != 0) {
            return false;
        }
        return !(stringValue != null ? !stringValue.equals(that.stringValue)
                : that.stringValue != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (booleanValue ? 1 : 0);
        result = 31 * result + (int) shortValue;
        result = 31 * result + intValue;
        result = 31 * result + (int) (longValue ^ (longValue >>> 32));
        result = 31 * result + (floatValue != +0.0f ? Float.floatToIntBits(floatValue) : 0);
        temp = Double.doubleToLongBits(doubleValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (stringValue != null ? stringValue.hashCode() : 0);
        return result;
    }
}
