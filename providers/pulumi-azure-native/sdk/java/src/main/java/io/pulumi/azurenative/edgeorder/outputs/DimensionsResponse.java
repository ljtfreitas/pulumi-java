// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DimensionsResponse {
    /**
     * Depth of the device.
     * 
     */
    private final Double depth;
    /**
     * Height of the device.
     * 
     */
    private final Double height;
    /**
     * Length of the device.
     * 
     */
    private final Double length;
    /**
     * Unit for the dimensions of length, height and width.
     * 
     */
    private final String lengthHeightUnit;
    /**
     * Weight of the device.
     * 
     */
    private final Double weight;
    /**
     * Unit for the dimensions of weight.
     * 
     */
    private final String weightUnit;
    /**
     * Width of the device.
     * 
     */
    private final Double width;

    @CustomType.Constructor
    private DimensionsResponse(
        @CustomType.Parameter("depth") Double depth,
        @CustomType.Parameter("height") Double height,
        @CustomType.Parameter("length") Double length,
        @CustomType.Parameter("lengthHeightUnit") String lengthHeightUnit,
        @CustomType.Parameter("weight") Double weight,
        @CustomType.Parameter("weightUnit") String weightUnit,
        @CustomType.Parameter("width") Double width) {
        this.depth = depth;
        this.height = height;
        this.length = length;
        this.lengthHeightUnit = lengthHeightUnit;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.width = width;
    }

    /**
     * Depth of the device.
     * 
    */
    public Double getDepth() {
        return this.depth;
    }
    /**
     * Height of the device.
     * 
    */
    public Double getHeight() {
        return this.height;
    }
    /**
     * Length of the device.
     * 
    */
    public Double getLength() {
        return this.length;
    }
    /**
     * Unit for the dimensions of length, height and width.
     * 
    */
    public String getLengthHeightUnit() {
        return this.lengthHeightUnit;
    }
    /**
     * Weight of the device.
     * 
    */
    public Double getWeight() {
        return this.weight;
    }
    /**
     * Unit for the dimensions of weight.
     * 
    */
    public String getWeightUnit() {
        return this.weightUnit;
    }
    /**
     * Width of the device.
     * 
    */
    public Double getWidth() {
        return this.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DimensionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double depth;
        private Double height;
        private Double length;
        private String lengthHeightUnit;
        private Double weight;
        private String weightUnit;
        private Double width;

        public Builder() {
    	      // Empty
        }

        public Builder(DimensionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.depth = defaults.depth;
    	      this.height = defaults.height;
    	      this.length = defaults.length;
    	      this.lengthHeightUnit = defaults.lengthHeightUnit;
    	      this.weight = defaults.weight;
    	      this.weightUnit = defaults.weightUnit;
    	      this.width = defaults.width;
        }

        public Builder depth(Double depth) {
            this.depth = Objects.requireNonNull(depth);
            return this;
        }

        public Builder height(Double height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }

        public Builder length(Double length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }

        public Builder lengthHeightUnit(String lengthHeightUnit) {
            this.lengthHeightUnit = Objects.requireNonNull(lengthHeightUnit);
            return this;
        }

        public Builder weight(Double weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder weightUnit(String weightUnit) {
            this.weightUnit = Objects.requireNonNull(weightUnit);
            return this;
        }

        public Builder width(Double width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }
        public DimensionsResponse build() {
            return new DimensionsResponse(depth, height, length, lengthHeightUnit, weight, weightUnit, width);
        }
    }
}
