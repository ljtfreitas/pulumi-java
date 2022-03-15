// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.azurenative.digitaltwins.outputs.ConnectionPropertiesResponsePrivateEndpoint;
import io.pulumi.azurenative.digitaltwins.outputs.ConnectionPropertiesResponsePrivateLinkServiceConnectionState;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionResponseProperties {
    /**
     * The list of group ids for the private endpoint connection.
     * 
     */
    private final @Nullable List<String> groupIds;
    private final @Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint;
    private final @Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private PrivateEndpointConnectionResponseProperties(
        @CustomType.Parameter("groupIds") @Nullable List<String> groupIds,
        @CustomType.Parameter("privateEndpoint") @Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.groupIds = groupIds;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    /**
     * The list of group ids for the private endpoint connection.
     * 
    */
    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    public Optional<ConnectionPropertiesResponsePrivateEndpoint> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    public Optional<ConnectionPropertiesResponsePrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * The provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private @Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint;
        private @Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder privateEndpoint(@Nullable ConnectionPropertiesResponsePrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable ConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public PrivateEndpointConnectionResponseProperties build() {
            return new PrivateEndpointConnectionResponseProperties(groupIds, privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
