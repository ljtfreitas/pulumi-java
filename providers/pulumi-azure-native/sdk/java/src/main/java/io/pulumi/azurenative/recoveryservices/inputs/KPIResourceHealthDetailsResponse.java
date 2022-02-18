// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.ResourceHealthDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KPI Resource Health Details
 * 
 */
public final class KPIResourceHealthDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final KPIResourceHealthDetailsResponse Empty = new KPIResourceHealthDetailsResponse();

    /**
     * Resource Health Status
     * 
     */
    @InputImport(name="resourceHealthDetails")
    private final @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails;

    public List<ResourceHealthDetailsResponse> getResourceHealthDetails() {
        return this.resourceHealthDetails == null ? List.of() : this.resourceHealthDetails;
    }

    /**
     * Resource Health Status
     * 
     */
    @InputImport(name="resourceHealthStatus")
    private final @Nullable String resourceHealthStatus;

    public Optional<String> getResourceHealthStatus() {
        return this.resourceHealthStatus == null ? Optional.empty() : Optional.ofNullable(this.resourceHealthStatus);
    }

    public KPIResourceHealthDetailsResponse(
        @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails,
        @Nullable String resourceHealthStatus) {
        this.resourceHealthDetails = resourceHealthDetails;
        this.resourceHealthStatus = resourceHealthStatus;
    }

    private KPIResourceHealthDetailsResponse() {
        this.resourceHealthDetails = List.of();
        this.resourceHealthStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KPIResourceHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails;
        private @Nullable String resourceHealthStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(KPIResourceHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceHealthDetails = defaults.resourceHealthDetails;
    	      this.resourceHealthStatus = defaults.resourceHealthStatus;
        }

        public Builder setResourceHealthDetails(@Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails) {
            this.resourceHealthDetails = resourceHealthDetails;
            return this;
        }

        public Builder setResourceHealthStatus(@Nullable String resourceHealthStatus) {
            this.resourceHealthStatus = resourceHealthStatus;
            return this;
        }

        public KPIResourceHealthDetailsResponse build() {
            return new KPIResourceHealthDetailsResponse(resourceHealthDetails, resourceHealthStatus);
        }
    }
}
