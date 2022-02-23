// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ArmIdWrapperResponse;
import io.pulumi.azurenative.web.outputs.PrivateLinkConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppPrivateEndpointConnectionSlotResult {
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Private IPAddresses mapped to the remote private endpoint
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
     */
    private final @Nullable ArmIdWrapperResponse privateEndpoint;
    /**
     * The state of a private link connection
     * 
     */
    private final @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","ipAddresses","kind","name","privateEndpoint","privateLinkServiceConnectionState","provisioningState","type"})
    private GetWebAppPrivateEndpointConnectionSlotResult(
        String id,
        @Nullable List<String> ipAddresses,
        @Nullable String kind,
        String name,
        @Nullable ArmIdWrapperResponse privateEndpoint,
        @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.ipAddresses = ipAddresses;
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Private IPAddresses mapped to the remote private endpoint
     * 
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
     */
    public Optional<ArmIdWrapperResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * The state of a private link connection
     * 
     */
    public Optional<PrivateLinkConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPrivateEndpointConnectionSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable List<String> ipAddresses;
        private @Nullable String kind;
        private String name;
        private @Nullable ArmIdWrapperResponse privateEndpoint;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPrivateEndpointConnectionSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable ArmIdWrapperResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppPrivateEndpointConnectionSlotResult build() {
            return new GetWebAppPrivateEndpointConnectionSlotResult(id, ipAddresses, kind, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
