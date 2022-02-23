// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseResourceRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseResourceRequirementsArgs Empty = new LicenseResourceRequirementsArgs();

    /**
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @InputImport(name="minGuestCpuCount")
      private final @Nullable Input<Integer> minGuestCpuCount;

    public Input<Integer> getMinGuestCpuCount() {
        return this.minGuestCpuCount == null ? Input.empty() : this.minGuestCpuCount;
    }

    /**
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @InputImport(name="minMemoryMb")
      private final @Nullable Input<Integer> minMemoryMb;

    public Input<Integer> getMinMemoryMb() {
        return this.minMemoryMb == null ? Input.empty() : this.minMemoryMb;
    }

    public LicenseResourceRequirementsArgs(
        @Nullable Input<Integer> minGuestCpuCount,
        @Nullable Input<Integer> minMemoryMb) {
        this.minGuestCpuCount = minGuestCpuCount;
        this.minMemoryMb = minMemoryMb;
    }

    private LicenseResourceRequirementsArgs() {
        this.minGuestCpuCount = Input.empty();
        this.minMemoryMb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minGuestCpuCount;
        private @Nullable Input<Integer> minMemoryMb;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minGuestCpuCount = defaults.minGuestCpuCount;
    	      this.minMemoryMb = defaults.minMemoryMb;
        }

        public Builder setMinGuestCpuCount(@Nullable Input<Integer> minGuestCpuCount) {
            this.minGuestCpuCount = minGuestCpuCount;
            return this;
        }

        public Builder setMinGuestCpuCount(@Nullable Integer minGuestCpuCount) {
            this.minGuestCpuCount = Input.ofNullable(minGuestCpuCount);
            return this;
        }

        public Builder setMinMemoryMb(@Nullable Input<Integer> minMemoryMb) {
            this.minMemoryMb = minMemoryMb;
            return this;
        }

        public Builder setMinMemoryMb(@Nullable Integer minMemoryMb) {
            this.minMemoryMb = Input.ofNullable(minMemoryMb);
            return this;
        }
        public LicenseResourceRequirementsArgs build() {
            return new LicenseResourceRequirementsArgs(minGuestCpuCount, minMemoryMb);
        }
    }
}
