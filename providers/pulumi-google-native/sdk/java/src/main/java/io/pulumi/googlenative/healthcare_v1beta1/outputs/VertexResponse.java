// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class VertexResponse {
    /**
     * X coordinate.
     * 
     */
    private final Double x;
    /**
     * Y coordinate.
     * 
     */
    private final Double y;

    @OutputCustomType.Constructor({"x","y"})
    private VertexResponse(
        Double x,
        Double y) {
        this.x = Objects.requireNonNull(x);
        this.y = Objects.requireNonNull(y);
    }

    /**
     * X coordinate.
     * 
     */
    public Double getX() {
        return this.x;
    }
    /**
     * Y coordinate.
     * 
     */
    public Double getY() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VertexResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double x;
        private Double y;

        public Builder() {
    	      // Empty
        }

        public Builder(VertexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setX(Double x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setY(Double y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }
        public VertexResponse build() {
            return new VertexResponse(x, y);
        }
    }
}
