// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * A class that contains the optimized auto scale definition.
 * 
 */
public final class OptimizedAutoscaleResponse extends io.pulumi.resources.InvokeArgs {

    public static final OptimizedAutoscaleResponse Empty = new OptimizedAutoscaleResponse();

    /**
     * A boolean value that indicate if the optimized autoscale feature is enabled or not.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Maximum allowed instances count.
     * 
     */
    @Import(name="maximum", required=true)
      private final Integer maximum;

    public Integer getMaximum() {
        return this.maximum;
    }

    /**
     * Minimum allowed instances count.
     * 
     */
    @Import(name="minimum", required=true)
      private final Integer minimum;

    public Integer getMinimum() {
        return this.minimum;
    }

    /**
     * The version of the template defined, for instance 1.
     * 
     */
    @Import(name="version", required=true)
      private final Integer version;

    public Integer getVersion() {
        return this.version;
    }

    public OptimizedAutoscaleResponse(
        Boolean isEnabled,
        Integer maximum,
        Integer minimum,
        Integer version) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private OptimizedAutoscaleResponse() {
        this.isEnabled = null;
        this.maximum = null;
        this.minimum = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptimizedAutoscaleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;
        private Integer maximum;
        private Integer minimum;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(OptimizedAutoscaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.version = defaults.version;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder maximum(Integer maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder minimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public OptimizedAutoscaleResponse build() {
            return new OptimizedAutoscaleResponse(isEnabled, maximum, minimum, version);
        }
    }
}
