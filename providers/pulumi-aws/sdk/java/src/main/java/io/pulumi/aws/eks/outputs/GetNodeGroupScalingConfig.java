// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetNodeGroupScalingConfig {
    /**
     * Desired number of worker nodes.
     * 
     */
    private final Integer desiredSize;
    /**
     * Maximum number of worker nodes.
     * 
     */
    private final Integer maxSize;
    /**
     * Minimum number of worker nodes.
     * 
     */
    private final Integer minSize;

    @OutputCustomType.Constructor({"desiredSize","maxSize","minSize"})
    private GetNodeGroupScalingConfig(
        Integer desiredSize,
        Integer maxSize,
        Integer minSize) {
        this.desiredSize = Objects.requireNonNull(desiredSize);
        this.maxSize = Objects.requireNonNull(maxSize);
        this.minSize = Objects.requireNonNull(minSize);
    }

    /**
     * Desired number of worker nodes.
     * 
     */
    public Integer getDesiredSize() {
        return this.desiredSize;
    }
    /**
     * Maximum number of worker nodes.
     * 
     */
    public Integer getMaxSize() {
        return this.maxSize;
    }
    /**
     * Minimum number of worker nodes.
     * 
     */
    public Integer getMinSize() {
        return this.minSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupScalingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer desiredSize;
        private Integer maxSize;
        private Integer minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupScalingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredSize = defaults.desiredSize;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder setDesiredSize(Integer desiredSize) {
            this.desiredSize = Objects.requireNonNull(desiredSize);
            return this;
        }

        public Builder setMaxSize(Integer maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }

        public Builder setMinSize(Integer minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }
        public GetNodeGroupScalingConfig build() {
            return new GetNodeGroupScalingConfig(desiredSize, maxSize, minSize);
        }
    }
}
