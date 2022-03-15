// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecMountBindOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecMountBindOptionsArgs Empty = new ServiceTaskSpecContainerSpecMountBindOptionsArgs();

    @Import(name="propagation")
      private final @Nullable Output<String> propagation;

    public Output<String> getPropagation() {
        return this.propagation == null ? Output.empty() : this.propagation;
    }

    public ServiceTaskSpecContainerSpecMountBindOptionsArgs(@Nullable Output<String> propagation) {
        this.propagation = propagation;
    }

    private ServiceTaskSpecContainerSpecMountBindOptionsArgs() {
        this.propagation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountBindOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> propagation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMountBindOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propagation = defaults.propagation;
        }

        public Builder propagation(@Nullable Output<String> propagation) {
            this.propagation = propagation;
            return this;
        }

        public Builder propagation(@Nullable String propagation) {
            this.propagation = Output.ofNullable(propagation);
            return this;
        }
        public ServiceTaskSpecContainerSpecMountBindOptionsArgs build() {
            return new ServiceTaskSpecContainerSpecMountBindOptionsArgs(propagation);
        }
    }
}
