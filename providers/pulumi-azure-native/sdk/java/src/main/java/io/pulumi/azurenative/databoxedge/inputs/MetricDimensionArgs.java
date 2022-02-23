// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The metric dimension
 * 
 */
public final class MetricDimensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDimensionArgs Empty = new MetricDimensionArgs();

    /**
     * The dimension value.
     * 
     */
    @InputImport(name="sourceName", required=true)
        private final Input<String> sourceName;

    public Input<String> getSourceName() {
        return this.sourceName;
    }

    /**
     * The dimension type.
     * 
     */
    @InputImport(name="sourceType", required=true)
        private final Input<String> sourceType;

    public Input<String> getSourceType() {
        return this.sourceType;
    }

    public MetricDimensionArgs(
        Input<String> sourceName,
        Input<String> sourceType) {
        this.sourceName = Objects.requireNonNull(sourceName, "expected parameter 'sourceName' to be non-null");
        this.sourceType = Objects.requireNonNull(sourceType, "expected parameter 'sourceType' to be non-null");
    }

    private MetricDimensionArgs() {
        this.sourceName = Input.empty();
        this.sourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sourceName;
        private Input<String> sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDimensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceName = defaults.sourceName;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder setSourceName(Input<String> sourceName) {
            this.sourceName = Objects.requireNonNull(sourceName);
            return this;
        }

        public Builder setSourceName(String sourceName) {
            this.sourceName = Input.of(Objects.requireNonNull(sourceName));
            return this;
        }

        public Builder setSourceType(Input<String> sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }

        public Builder setSourceType(String sourceType) {
            this.sourceType = Input.of(Objects.requireNonNull(sourceType));
            return this;
        }
        public MetricDimensionArgs build() {
            return new MetricDimensionArgs(sourceName, sourceType);
        }
    }
}
