// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The service endpoint properties.
 * 
 */
public final class ServiceEndpointPropertiesFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceEndpointPropertiesFormatResponse Empty = new ServiceEndpointPropertiesFormatResponse();

    /**
     * A list of locations.
     * 
     */
    @InputImport(name="locations")
        private final @Nullable List<String> locations;

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }

    /**
     * The provisioning state of the service endpoint resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The type of the endpoint service.
     * 
     */
    @InputImport(name="service")
        private final @Nullable String service;

    public Optional<String> getService() {
        return this.service == null ? Optional.empty() : Optional.ofNullable(this.service);
    }

    public ServiceEndpointPropertiesFormatResponse(
        @Nullable List<String> locations,
        String provisioningState,
        @Nullable String service) {
        this.locations = locations;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.service = service;
    }

    private ServiceEndpointPropertiesFormatResponse() {
        this.locations = List.of();
        this.provisioningState = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPropertiesFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;
        private String provisioningState;
        private @Nullable String service;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPropertiesFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.provisioningState = defaults.provisioningState;
    	      this.service = defaults.service;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }
        public ServiceEndpointPropertiesFormatResponse build() {
            return new ServiceEndpointPropertiesFormatResponse(locations, provisioningState, service);
        }
    }
}
