// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class LicenseResourceRequirementsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LicenseResourceRequirementsResponse Empty = new LicenseResourceRequirementsResponse();

    /**
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @InputImport(name="minGuestCpuCount", required=true)
      private final Integer minGuestCpuCount;

    public Integer getMinGuestCpuCount() {
        return this.minGuestCpuCount;
    }

    /**
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @InputImport(name="minMemoryMb", required=true)
      private final Integer minMemoryMb;

    public Integer getMinMemoryMb() {
        return this.minMemoryMb;
    }

    public LicenseResourceRequirementsResponse(
        Integer minGuestCpuCount,
        Integer minMemoryMb) {
        this.minGuestCpuCount = Objects.requireNonNull(minGuestCpuCount, "expected parameter 'minGuestCpuCount' to be non-null");
        this.minMemoryMb = Objects.requireNonNull(minMemoryMb, "expected parameter 'minMemoryMb' to be non-null");
    }

    private LicenseResourceRequirementsResponse() {
        this.minGuestCpuCount = null;
        this.minMemoryMb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minGuestCpuCount;
        private Integer minMemoryMb;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minGuestCpuCount = defaults.minGuestCpuCount;
    	      this.minMemoryMb = defaults.minMemoryMb;
        }

        public Builder setMinGuestCpuCount(Integer minGuestCpuCount) {
            this.minGuestCpuCount = Objects.requireNonNull(minGuestCpuCount);
            return this;
        }

        public Builder setMinMemoryMb(Integer minMemoryMb) {
            this.minMemoryMb = Objects.requireNonNull(minMemoryMb);
            return this;
        }
        public LicenseResourceRequirementsResponse build() {
            return new LicenseResourceRequirementsResponse(minGuestCpuCount, minMemoryMb);
        }
    }
}
