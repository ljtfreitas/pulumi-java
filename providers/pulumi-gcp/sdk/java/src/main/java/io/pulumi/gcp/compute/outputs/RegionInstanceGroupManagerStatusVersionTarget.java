// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionInstanceGroupManagerStatusVersionTarget {
    private final @Nullable Boolean isReached;

    @CustomType.Constructor
    private RegionInstanceGroupManagerStatusVersionTarget(@CustomType.Parameter("isReached") @Nullable Boolean isReached) {
        this.isReached = isReached;
    }

    public Optional<Boolean> isReached() {
        return Optional.ofNullable(this.isReached);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusVersionTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isReached;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusVersionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isReached = defaults.isReached;
        }

        public Builder isReached(@Nullable Boolean isReached) {
            this.isReached = isReached;
            return this;
        }        public RegionInstanceGroupManagerStatusVersionTarget build() {
            return new RegionInstanceGroupManagerStatusVersionTarget(isReached);
        }
    }
}
