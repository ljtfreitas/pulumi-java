// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceModeReplicatedGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceModeReplicatedGetArgs Empty = new ServiceModeReplicatedGetArgs();

    @Import(name="replicas")
      private final @Nullable Output<Integer> replicas;

    public Output<Integer> getReplicas() {
        return this.replicas == null ? Output.empty() : this.replicas;
    }

    public ServiceModeReplicatedGetArgs(@Nullable Output<Integer> replicas) {
        this.replicas = replicas;
    }

    private ServiceModeReplicatedGetArgs() {
        this.replicas = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceModeReplicatedGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceModeReplicatedGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder replicas(@Nullable Output<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Output.ofNullable(replicas);
            return this;
        }
        public ServiceModeReplicatedGetArgs build() {
            return new ServiceModeReplicatedGetArgs(replicas);
        }
    }
}
