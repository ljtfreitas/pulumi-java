// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.azurenative.labservices.inputs.SizeAvailabilityResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The availability information of sizes across regions
 * 
 */
public final class RegionalAvailabilityResponse extends io.pulumi.resources.InvokeArgs {

    public static final RegionalAvailabilityResponse Empty = new RegionalAvailabilityResponse();

    /**
     * Corresponding region
     * 
     */
    @InputImport(name="region")
    private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * List of all the size information for the region
     * 
     */
    @InputImport(name="sizeAvailabilities")
    private final @Nullable List<SizeAvailabilityResponse> sizeAvailabilities;

    public List<SizeAvailabilityResponse> getSizeAvailabilities() {
        return this.sizeAvailabilities == null ? List.of() : this.sizeAvailabilities;
    }

    public RegionalAvailabilityResponse(
        @Nullable String region,
        @Nullable List<SizeAvailabilityResponse> sizeAvailabilities) {
        this.region = region;
        this.sizeAvailabilities = sizeAvailabilities;
    }

    private RegionalAvailabilityResponse() {
        this.region = null;
        this.sizeAvailabilities = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionalAvailabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;
        private @Nullable List<SizeAvailabilityResponse> sizeAvailabilities;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionalAvailabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.sizeAvailabilities = defaults.sizeAvailabilities;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setSizeAvailabilities(@Nullable List<SizeAvailabilityResponse> sizeAvailabilities) {
            this.sizeAvailabilities = sizeAvailabilities;
            return this;
        }

        public RegionalAvailabilityResponse build() {
            return new RegionalAvailabilityResponse(region, sizeAvailabilities);
        }
    }
}
