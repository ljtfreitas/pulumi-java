// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DiskExclusionPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExtendedPropertiesResponse {
    /**
     * Extended Properties for Disk Exclusion.
     * 
     */
    private final @Nullable DiskExclusionPropertiesResponse diskExclusionProperties;

    @CustomType.Constructor
    private ExtendedPropertiesResponse(@CustomType.Parameter("diskExclusionProperties") @Nullable DiskExclusionPropertiesResponse diskExclusionProperties) {
        this.diskExclusionProperties = diskExclusionProperties;
    }

    /**
     * Extended Properties for Disk Exclusion.
     * 
    */
    public Optional<DiskExclusionPropertiesResponse> getDiskExclusionProperties() {
        return Optional.ofNullable(this.diskExclusionProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskExclusionPropertiesResponse diskExclusionProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskExclusionProperties = defaults.diskExclusionProperties;
        }

        public Builder diskExclusionProperties(@Nullable DiskExclusionPropertiesResponse diskExclusionProperties) {
            this.diskExclusionProperties = diskExclusionProperties;
            return this;
        }
        public ExtendedPropertiesResponse build() {
            return new ExtendedPropertiesResponse(diskExclusionProperties);
        }
    }
}
