// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.CapacityReservationFleetTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityReservationFleetTagSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityReservationFleetTagSpecificationArgs Empty = new CapacityReservationFleetTagSpecificationArgs();

    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Output.empty() : this.resourceType;
    }

    @Import(name="tags")
      private final @Nullable Output<List<CapacityReservationFleetTagArgs>> tags;

    public Output<List<CapacityReservationFleetTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CapacityReservationFleetTagSpecificationArgs(
        @Nullable Output<String> resourceType,
        @Nullable Output<List<CapacityReservationFleetTagArgs>> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private CapacityReservationFleetTagSpecificationArgs() {
        this.resourceType = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationFleetTagSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceType;
        private @Nullable Output<List<CapacityReservationFleetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationFleetTagSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Output.ofNullable(resourceType);
            return this;
        }

        public Builder tags(@Nullable Output<List<CapacityReservationFleetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<CapacityReservationFleetTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public CapacityReservationFleetTagSpecificationArgs build() {
            return new CapacityReservationFleetTagSpecificationArgs(resourceType, tags);
        }
    }
}
