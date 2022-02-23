// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.NetworkProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterResourcePropertiesResponse {
    /**
     * Network profile of the Service
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * Provisioning state of the Service
     * 
     */
    private final String provisioningState;
    /**
     * ServiceInstanceEntity GUID which uniquely identifies a created resource
     * 
     */
    private final String serviceId;
    /**
     * Version of the Service
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor({"networkProfile","provisioningState","serviceId","version"})
    private ClusterResourcePropertiesResponse(
        @Nullable NetworkProfileResponse networkProfile,
        String provisioningState,
        String serviceId,
        Integer version) {
        this.networkProfile = networkProfile;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.serviceId = Objects.requireNonNull(serviceId);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Network profile of the Service
     * 
     */
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Provisioning state of the Service
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * ServiceInstanceEntity GUID which uniquely identifies a created resource
     * 
     */
    public String getServiceId() {
        return this.serviceId;
    }
    /**
     * Version of the Service
     * 
     */
    public Integer getVersion() {
        return this.version;
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

        public Builder setNetworkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public ClusterResourcePropertiesResponse build() {
            return new ClusterResourcePropertiesResponse(networkProfile, provisioningState, serviceId, version);
        }
    }
}
