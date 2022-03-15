// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information specifying a GKE Cluster.
 * 
 */
public final class GkeClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GkeClusterArgs Empty = new GkeClusterArgs();

    /**
     * Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster == null ? Output.empty() : this.cluster;
    }

    public GkeClusterArgs(@Nullable Output<String> cluster) {
        this.cluster = cluster;
    }

    private GkeClusterArgs() {
        this.cluster = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder cluster(@Nullable String cluster) {
            this.cluster = Output.ofNullable(cluster);
            return this;
        }
        public GkeClusterArgs build() {
            return new GkeClusterArgs(cluster);
        }
    }
}
