// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.awsnative.route53recoverycontrol.enums.ClusterStatus;
import io.pulumi.awsnative.route53recoverycontrol.outputs.ClusterEndpoint;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    private final @Nullable String clusterArn;
    /**
     * Endpoints for the cluster.
     * 
     */
    private final @Nullable List<ClusterEndpoint> clusterEndpoints;
    /**
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    private final @Nullable ClusterStatus status;

    @OutputCustomType.Constructor
    private GetClusterResult(
        @OutputCustomType.Parameter("clusterArn") @Nullable String clusterArn,
        @OutputCustomType.Parameter("clusterEndpoints") @Nullable List<ClusterEndpoint> clusterEndpoints,
        @OutputCustomType.Parameter("status") @Nullable ClusterStatus status) {
        this.clusterArn = clusterArn;
        this.clusterEndpoints = clusterEndpoints;
        this.status = status;
    }

    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
    */
    public Optional<String> getClusterArn() {
        return Optional.ofNullable(this.clusterArn);
    }
    /**
     * Endpoints for the cluster.
     * 
    */
    public List<ClusterEndpoint> getClusterEndpoints() {
        return this.clusterEndpoints == null ? List.of() : this.clusterEndpoints;
    }
    /**
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
    */
    public Optional<ClusterStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterArn;
        private @Nullable List<ClusterEndpoint> clusterEndpoints;
        private @Nullable ClusterStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.clusterEndpoints = defaults.clusterEndpoints;
    	      this.status = defaults.status;
        }

        public Builder setClusterArn(@Nullable String clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }

        public Builder setClusterEndpoints(@Nullable List<ClusterEndpoint> clusterEndpoints) {
            this.clusterEndpoints = clusterEndpoints;
            return this;
        }

        public Builder setStatus(@Nullable ClusterStatus status) {
            this.status = status;
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(clusterArn, clusterEndpoints, status);
        }
    }
}
