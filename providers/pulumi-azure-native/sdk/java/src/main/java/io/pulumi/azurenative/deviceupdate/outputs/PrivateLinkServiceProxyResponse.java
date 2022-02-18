// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.GroupConnectivityInformationResponse;
import io.pulumi.azurenative.deviceupdate.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.deviceupdate.outputs.PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceProxyResponse {
    /**
     * Group connectivity information.
     * 
     */
    private final @Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation;
    /**
     * NRP resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Remote private endpoint connection details.
     * 
     */
    private final @Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection;
    /**
     * Remote private link service connection state
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState;

    @OutputCustomType.Constructor({"groupConnectivityInformation","id","remotePrivateEndpointConnection","remotePrivateLinkServiceConnectionState"})
    private PrivateLinkServiceProxyResponse(
        @Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation,
        @Nullable String id,
        @Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection,
        @Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState) {
        this.groupConnectivityInformation = groupConnectivityInformation;
        this.id = id;
        this.remotePrivateEndpointConnection = remotePrivateEndpointConnection;
        this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
    }

    /**
     * Group connectivity information.
     * 
     */
    public List<GroupConnectivityInformationResponse> getGroupConnectivityInformation() {
        return this.groupConnectivityInformation == null ? List.of() : this.groupConnectivityInformation;
    }
    /**
     * NRP resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Remote private endpoint connection details.
     * 
     */
    public Optional<PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection> getRemotePrivateEndpointConnection() {
        return Optional.ofNullable(this.remotePrivateEndpointConnection);
    }
    /**
     * Remote private link service connection state
     * 
     */
    public Optional<PrivateLinkServiceConnectionStateResponse> getRemotePrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.remotePrivateLinkServiceConnectionState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceProxyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation;
        private @Nullable String id;
        private @Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection;
        private @Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceProxyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupConnectivityInformation = defaults.groupConnectivityInformation;
    	      this.id = defaults.id;
    	      this.remotePrivateEndpointConnection = defaults.remotePrivateEndpointConnection;
    	      this.remotePrivateLinkServiceConnectionState = defaults.remotePrivateLinkServiceConnectionState;
        }

        public Builder setGroupConnectivityInformation(@Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation) {
            this.groupConnectivityInformation = groupConnectivityInformation;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setRemotePrivateEndpointConnection(@Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection) {
            this.remotePrivateEndpointConnection = remotePrivateEndpointConnection;
            return this;
        }

        public Builder setRemotePrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState) {
            this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
            return this;
        }

        public PrivateLinkServiceProxyResponse build() {
            return new PrivateLinkServiceProxyResponse(groupConnectivityInformation, id, remotePrivateEndpointConnection, remotePrivateLinkServiceConnectionState);
        }
    }
}
