// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduledActionTargetActionPauseCluster {
    /**
     * The identifier of the cluster to be resumed.
     * 
     */
    private final String clusterIdentifier;

    @OutputCustomType.Constructor({"clusterIdentifier"})
    private ScheduledActionTargetActionPauseCluster(String clusterIdentifier) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
    }

    /**
     * The identifier of the cluster to be resumed.
     * 
     */
    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionPauseCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionTargetActionPauseCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public ScheduledActionTargetActionPauseCluster build() {
            return new ScheduledActionTargetActionPauseCluster(clusterIdentifier);
        }
    }
}
