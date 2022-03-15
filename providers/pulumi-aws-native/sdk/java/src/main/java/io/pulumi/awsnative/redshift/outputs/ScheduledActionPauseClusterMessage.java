// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduledActionPauseClusterMessage {
    private final String clusterIdentifier;

    @CustomType.Constructor
    private ScheduledActionPauseClusterMessage(@CustomType.Parameter("clusterIdentifier") String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionPauseClusterMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionPauseClusterMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public ScheduledActionPauseClusterMessage build() {
            return new ScheduledActionPauseClusterMessage(clusterIdentifier);
        }
    }
}
