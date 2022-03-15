// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlowGoogleAnalyticsSourceProperties {
    private final String object;

    @CustomType.Constructor
    private FlowGoogleAnalyticsSourceProperties(@CustomType.Parameter("object") String object) {
        this.object = object;
    }

    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowGoogleAnalyticsSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowGoogleAnalyticsSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowGoogleAnalyticsSourceProperties build() {
            return new FlowGoogleAnalyticsSourceProperties(object);
        }
    }
}
