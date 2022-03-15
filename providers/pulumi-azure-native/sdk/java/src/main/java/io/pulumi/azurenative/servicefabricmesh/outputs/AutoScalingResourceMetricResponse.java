// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AutoScalingResourceMetricResponse {
    /**
     * Enumerates the metrics that are used for triggering auto scaling.
     * Expected value is 'Resource'.
     * 
     */
    private final String kind;
    /**
     * Name of the resource.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private AutoScalingResourceMetricResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name) {
        this.kind = kind;
        this.name = name;
    }

    /**
     * Enumerates the metrics that are used for triggering auto scaling.
     * Expected value is 'Resource'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalingResourceMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalingResourceMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AutoScalingResourceMetricResponse build() {
            return new AutoScalingResourceMetricResponse(kind, name);
        }
    }
}
