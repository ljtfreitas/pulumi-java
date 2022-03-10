// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceMonthlyTransfer {
    /**
     * GbPerMonthAllocated of the Instance.
     * 
     */
    private final @Nullable String gbPerMonthAllocated;

    @OutputCustomType.Constructor
    private InstanceMonthlyTransfer(@OutputCustomType.Parameter("gbPerMonthAllocated") @Nullable String gbPerMonthAllocated) {
        this.gbPerMonthAllocated = gbPerMonthAllocated;
    }

    /**
     * GbPerMonthAllocated of the Instance.
     * 
    */
    public Optional<String> getGbPerMonthAllocated() {
        return Optional.ofNullable(this.gbPerMonthAllocated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMonthlyTransfer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gbPerMonthAllocated;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMonthlyTransfer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gbPerMonthAllocated = defaults.gbPerMonthAllocated;
        }

        public Builder setGbPerMonthAllocated(@Nullable String gbPerMonthAllocated) {
            this.gbPerMonthAllocated = gbPerMonthAllocated;
            return this;
        }
        public InstanceMonthlyTransfer build() {
            return new InstanceMonthlyTransfer(gbPerMonthAllocated);
        }
    }
}
