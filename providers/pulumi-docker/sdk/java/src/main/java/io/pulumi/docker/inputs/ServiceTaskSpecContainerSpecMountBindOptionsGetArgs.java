// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecMountBindOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecMountBindOptionsGetArgs Empty = new ServiceTaskSpecContainerSpecMountBindOptionsGetArgs();

    @Import(name="propagation")
      private final @Nullable Output<String> propagation;

    public Output<String> getPropagation() {
        return this.propagation == null ? Output.empty() : this.propagation;
    }

    public ServiceTaskSpecContainerSpecMountBindOptionsGetArgs(@Nullable Output<String> propagation) {
        this.propagation = propagation;
    }

    private ServiceTaskSpecContainerSpecMountBindOptionsGetArgs() {
        this.propagation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountBindOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> propagation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMountBindOptionsGetArgs defaults) {
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
        public ServiceTaskSpecContainerSpecMountBindOptionsGetArgs build() {
            return new ServiceTaskSpecContainerSpecMountBindOptionsGetArgs(propagation);
        }
    }
}
