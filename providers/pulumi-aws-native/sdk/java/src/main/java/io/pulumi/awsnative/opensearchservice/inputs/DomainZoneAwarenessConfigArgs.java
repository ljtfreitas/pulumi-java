// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainZoneAwarenessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainZoneAwarenessConfigArgs Empty = new DomainZoneAwarenessConfigArgs();

    @Import(name="availabilityZoneCount")
      private final @Nullable Output<Integer> availabilityZoneCount;

    public Output<Integer> getAvailabilityZoneCount() {
        return this.availabilityZoneCount == null ? Output.empty() : this.availabilityZoneCount;
    }

    public DomainZoneAwarenessConfigArgs(@Nullable Output<Integer> availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    private DomainZoneAwarenessConfigArgs() {
        this.availabilityZoneCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainZoneAwarenessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainZoneAwarenessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder availabilityZoneCount(@Nullable Output<Integer> availabilityZoneCount) {
            this.availabilityZoneCount = availabilityZoneCount;
            return this;
        }

        public Builder availabilityZoneCount(@Nullable Integer availabilityZoneCount) {
            this.availabilityZoneCount = Output.ofNullable(availabilityZoneCount);
            return this;
        }
        public DomainZoneAwarenessConfigArgs build() {
            return new DomainZoneAwarenessConfigArgs(availabilityZoneCount);
        }
    }
}
