// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.outputs;

import io.pulumi.azurenative.powerbi.outputs.ConnectionStateResponse;
import io.pulumi.azurenative.powerbi.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.powerbi.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * Specifies the id of the resource.
     * 
     */
    private final String id;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * Specifies the private endpoint.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * Specifies the connection state.
     * 
     */
    private final @Nullable ConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","privateEndpoint","privateLinkServiceConnectionState","provisioningState","systemData","type"})
    private GetPrivateEndpointConnectionResult(
        String id,
        String name,
        @Nullable PrivateEndpointResponse privateEndpoint,
        @Nullable ConnectionStateResponse privateLinkServiceConnectionState,
        @Nullable String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the id of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the private endpoint.
     * 
     */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Specifies the connection state.
     * 
     */
    public Optional<ConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The system meta data relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable ConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable ConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, systemData, type);
        }
    }
}
