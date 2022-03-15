// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Dataproc job config.
 * 
 */
public final class JobPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPlacementArgs Empty = new JobPlacementArgs();

    /**
     * Optional. Cluster labels to identify a cluster where the job will be submitted.
     * 
     */
    @Import(name="clusterLabels")
      private final @Nullable Output<Map<String,String>> clusterLabels;

    public Output<Map<String,String>> getClusterLabels() {
        return this.clusterLabels == null ? Output.empty() : this.clusterLabels;
    }

    /**
     * The name of the cluster where the job will be submitted.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    public JobPlacementArgs(
        @Nullable Output<Map<String,String>> clusterLabels,
        Output<String> clusterName) {
        this.clusterLabels = clusterLabels;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
    }

    private JobPlacementArgs() {
        this.clusterLabels = Output.empty();
        this.clusterName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> clusterLabels;
        private Output<String> clusterName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.clusterName = defaults.clusterName;
        }

        public Builder clusterLabels(@Nullable Output<Map<String,String>> clusterLabels) {
            this.clusterLabels = clusterLabels;
            return this;
        }

        public Builder clusterLabels(@Nullable Map<String,String> clusterLabels) {
            this.clusterLabels = Output.ofNullable(clusterLabels);
            return this;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public JobPlacementArgs build() {
            return new JobPlacementArgs(clusterLabels, clusterName);
        }
    }
}
