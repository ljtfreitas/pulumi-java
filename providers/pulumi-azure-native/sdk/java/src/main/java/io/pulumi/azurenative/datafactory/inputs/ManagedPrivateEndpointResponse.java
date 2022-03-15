// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ConnectionStatePropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a managed private endpoint
 * 
 */
public final class ManagedPrivateEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedPrivateEndpointResponse Empty = new ManagedPrivateEndpointResponse();

    /**
     * The managed private endpoint connection state
     * 
     */
    @Import(name="connectionState")
      private final @Nullable ConnectionStatePropertiesResponse connectionState;

    public Optional<ConnectionStatePropertiesResponse> getConnectionState() {
        return this.connectionState == null ? Optional.empty() : Optional.ofNullable(this.connectionState);
    }

    /**
     * Fully qualified domain names
     * 
     */
    @Import(name="fqdns")
      private final @Nullable List<String> fqdns;

    public List<String> getFqdns() {
        return this.fqdns == null ? List.of() : this.fqdns;
    }

    /**
     * The groupId to which the managed private endpoint is created
     * 
     */
    @Import(name="groupId")
      private final @Nullable String groupId;

    public Optional<String> getGroupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    /**
     * Denotes whether the managed private endpoint is reserved
     * 
     */
    @Import(name="isReserved", required=true)
      private final Boolean isReserved;

    public Boolean getIsReserved() {
        return this.isReserved;
    }

    /**
     * The ARM resource ID of the resource to which the managed private endpoint is created
     * 
     */
    @Import(name="privateLinkResourceId")
      private final @Nullable String privateLinkResourceId;

    public Optional<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkResourceId);
    }

    /**
     * The managed private endpoint provisioning state
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public ManagedPrivateEndpointResponse(
        @Nullable ConnectionStatePropertiesResponse connectionState,
        @Nullable List<String> fqdns,
        @Nullable String groupId,
        Boolean isReserved,
        @Nullable String privateLinkResourceId,
        String provisioningState) {
        this.connectionState = connectionState;
        this.fqdns = fqdns;
        this.groupId = groupId;
        this.isReserved = Objects.requireNonNull(isReserved, "expected parameter 'isReserved' to be non-null");
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private ManagedPrivateEndpointResponse() {
        this.connectionState = null;
        this.fqdns = List.of();
        this.groupId = null;
        this.isReserved = null;
        this.privateLinkResourceId = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionStatePropertiesResponse connectionState;
        private @Nullable List<String> fqdns;
        private @Nullable String groupId;
        private Boolean isReserved;
        private @Nullable String privateLinkResourceId;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionState = defaults.connectionState;
    	      this.fqdns = defaults.fqdns;
    	      this.groupId = defaults.groupId;
    	      this.isReserved = defaults.isReserved;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder connectionState(@Nullable ConnectionStatePropertiesResponse connectionState) {
            this.connectionState = connectionState;
            return this;
        }

        public Builder fqdns(@Nullable List<String> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder isReserved(Boolean isReserved) {
            this.isReserved = Objects.requireNonNull(isReserved);
            return this;
        }

        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ManagedPrivateEndpointResponse build() {
            return new ManagedPrivateEndpointResponse(connectionState, fqdns, groupId, isReserved, privateLinkResourceId, provisioningState);
        }
    }
}
