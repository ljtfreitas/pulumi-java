// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import java.util.Objects;


public final class TrafficManagerUserMetricsKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficManagerUserMetricsKeyArgs Empty = new TrafficManagerUserMetricsKeyArgs();

    public TrafficManagerUserMetricsKeyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficManagerUserMetricsKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficManagerUserMetricsKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public TrafficManagerUserMetricsKeyArgs build() {
            return new TrafficManagerUserMetricsKeyArgs();
        }
    }
}
