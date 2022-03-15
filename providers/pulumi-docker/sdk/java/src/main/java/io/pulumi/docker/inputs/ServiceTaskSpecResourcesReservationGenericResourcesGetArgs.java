// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecResourcesReservationGenericResourcesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecResourcesReservationGenericResourcesGetArgs Empty = new ServiceTaskSpecResourcesReservationGenericResourcesGetArgs();

    @Import(name="discreteResourcesSpecs")
      private final @Nullable Output<List<String>> discreteResourcesSpecs;

    public Output<List<String>> getDiscreteResourcesSpecs() {
        return this.discreteResourcesSpecs == null ? Output.empty() : this.discreteResourcesSpecs;
    }

    @Import(name="namedResourcesSpecs")
      private final @Nullable Output<List<String>> namedResourcesSpecs;

    public Output<List<String>> getNamedResourcesSpecs() {
        return this.namedResourcesSpecs == null ? Output.empty() : this.namedResourcesSpecs;
    }

    public ServiceTaskSpecResourcesReservationGenericResourcesGetArgs(
        @Nullable Output<List<String>> discreteResourcesSpecs,
        @Nullable Output<List<String>> namedResourcesSpecs) {
        this.discreteResourcesSpecs = discreteResourcesSpecs;
        this.namedResourcesSpecs = namedResourcesSpecs;
    }

    private ServiceTaskSpecResourcesReservationGenericResourcesGetArgs() {
        this.discreteResourcesSpecs = Output.empty();
        this.namedResourcesSpecs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesReservationGenericResourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> discreteResourcesSpecs;
        private @Nullable Output<List<String>> namedResourcesSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesReservationGenericResourcesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discreteResourcesSpecs = defaults.discreteResourcesSpecs;
    	      this.namedResourcesSpecs = defaults.namedResourcesSpecs;
        }

        public Builder discreteResourcesSpecs(@Nullable Output<List<String>> discreteResourcesSpecs) {
            this.discreteResourcesSpecs = discreteResourcesSpecs;
            return this;
        }

        public Builder discreteResourcesSpecs(@Nullable List<String> discreteResourcesSpecs) {
            this.discreteResourcesSpecs = Output.ofNullable(discreteResourcesSpecs);
            return this;
        }

        public Builder namedResourcesSpecs(@Nullable Output<List<String>> namedResourcesSpecs) {
            this.namedResourcesSpecs = namedResourcesSpecs;
            return this;
        }

        public Builder namedResourcesSpecs(@Nullable List<String> namedResourcesSpecs) {
            this.namedResourcesSpecs = Output.ofNullable(namedResourcesSpecs);
            return this;
        }
        public ServiceTaskSpecResourcesReservationGenericResourcesGetArgs build() {
            return new ServiceTaskSpecResourcesReservationGenericResourcesGetArgs(discreteResourcesSpecs, namedResourcesSpecs);
        }
    }
}
