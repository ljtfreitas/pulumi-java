// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.NetworkProfileResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service properties payload
 * 
 */
public final class ClusterResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterResourcePropertiesResponse Empty = new ClusterResourcePropertiesResponse();

    /**
     * Network profile of the Service
     * 
     */
    @Import(name="networkProfile")
      private final @Nullable NetworkProfileResponse networkProfile;

    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile == null ? Optional.empty() : Optional.ofNullable(this.networkProfile);
    }

    /**
     * Provisioning state of the Service
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * ServiceInstanceEntity GUID which uniquely identifies a created resource
     * 
     */
    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * Version of the Service
     * 
     */
    @Import(name="version", required=true)
      private final Integer version;

    public Integer getVersion() {
        return this.version;
    }

    public ClusterResourcePropertiesResponse(
        @Nullable NetworkProfileResponse networkProfile,
        String provisioningState,
        String serviceId,
        Integer version) {
        this.networkProfile = networkProfile;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ClusterResourcePropertiesResponse() {
        this.networkProfile = null;
        this.provisioningState = null;
        this.serviceId = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkProfileResponse networkProfile;
        private String provisioningState;
        private String serviceId;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceId = defaults.serviceId;
    	      this.version = defaults.version;
        }

        public Builder networkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ClusterResourcePropertiesResponse build() {
            return new ClusterResourcePropertiesResponse(networkProfile, provisioningState, serviceId, version);
        }
    }
}
