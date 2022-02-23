// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainZoneAwarenessConfig extends io.pulumi.resources.InvokeArgs {

    public static final DomainZoneAwarenessConfig Empty = new DomainZoneAwarenessConfig();

    @InputImport(name="availabilityZoneCount")
        private final @Nullable Integer availabilityZoneCount;

    public Optional<Integer> getAvailabilityZoneCount() {
        return this.availabilityZoneCount == null ? Optional.empty() : Optional.ofNullable(this.availabilityZoneCount);
    }

    public DomainZoneAwarenessConfig(@Nullable Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    private DomainZoneAwarenessConfig() {
        this.availabilityZoneCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainZoneAwarenessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainZoneAwarenessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder setAvailabilityZoneCount(@Nullable Integer availabilityZoneCount) {
            this.availabilityZoneCount = availabilityZoneCount;
            return this;
        }
        public DomainZoneAwarenessConfig build() {
            return new DomainZoneAwarenessConfig(availabilityZoneCount);
        }
    }
}
