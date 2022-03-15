// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterWorkloadIdentityConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterWorkloadIdentityConfigGetArgs Empty = new ClusterWorkloadIdentityConfigGetArgs();

    /**
     * The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    @Import(name="workloadPool")
      private final @Nullable Output<String> workloadPool;

    public Output<String> getWorkloadPool() {
        return this.workloadPool == null ? Output.empty() : this.workloadPool;
    }

    public ClusterWorkloadIdentityConfigGetArgs(@Nullable Output<String> workloadPool) {
        this.workloadPool = workloadPool;
    }

    private ClusterWorkloadIdentityConfigGetArgs() {
        this.workloadPool = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterWorkloadIdentityConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterWorkloadIdentityConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder workloadPool(@Nullable Output<String> workloadPool) {
            this.workloadPool = workloadPool;
            return this;
        }

        public Builder workloadPool(@Nullable String workloadPool) {
            this.workloadPool = Output.ofNullable(workloadPool);
            return this;
        }
        public ClusterWorkloadIdentityConfigGetArgs build() {
            return new ClusterWorkloadIdentityConfigGetArgs(workloadPool);
        }
    }
}
