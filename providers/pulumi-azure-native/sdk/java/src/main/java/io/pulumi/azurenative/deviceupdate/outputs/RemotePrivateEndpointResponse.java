// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.ConnectionDetailsResponse;
import io.pulumi.azurenative.deviceupdate.outputs.PrivateLinkServiceConnectionResponse;
import io.pulumi.azurenative.deviceupdate.outputs.PrivateLinkServiceProxyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RemotePrivateEndpointResponse {
    /**
     * List of connection details.
     * 
     */
    private final @Nullable List<ConnectionDetailsResponse> connectionDetails;
    /**
     * Remote endpoint resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * List of private link service connections that need manual approval.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;
    /**
     * List of automatically approved private link service connections.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections;
    /**
     * List of private link service proxies.
     * 
     */
    private final @Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies;
    /**
     * Virtual network traffic tag.
     * 
     */
    private final String vnetTrafficTag;

    @OutputCustomType.Constructor({"connectionDetails","id","manualPrivateLinkServiceConnections","privateLinkServiceConnections","privateLinkServiceProxies","vnetTrafficTag"})
    private RemotePrivateEndpointResponse(
        @Nullable List<ConnectionDetailsResponse> connectionDetails,
        @Nullable String id,
        @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections,
        @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections,
        @Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies,
        String vnetTrafficTag) {
        this.connectionDetails = connectionDetails;
        this.id = id;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        this.privateLinkServiceProxies = privateLinkServiceProxies;
        this.vnetTrafficTag = Objects.requireNonNull(vnetTrafficTag);
    }

    /**
     * List of connection details.
     * 
     */
    public List<ConnectionDetailsResponse> getConnectionDetails() {
        return this.connectionDetails == null ? List.of() : this.connectionDetails;
    }
    /**
     * Remote endpoint resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * List of private link service connections that need manual approval.
     * 
     */
    public List<PrivateLinkServiceConnectionResponse> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? List.of() : this.manualPrivateLinkServiceConnections;
    }
    /**
     * List of automatically approved private link service connections.
     * 
     */
    public List<PrivateLinkServiceConnectionResponse> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections == null ? List.of() : this.privateLinkServiceConnections;
    }
    /**
     * List of private link service proxies.
     * 
     */
    public List<PrivateLinkServiceProxyResponse> getPrivateLinkServiceProxies() {
        return this.privateLinkServiceProxies == null ? List.of() : this.privateLinkServiceProxies;
    }
    /**
     * Virtual network traffic tag.
     * 
     */
    public String getVnetTrafficTag() {
        return this.vnetTrafficTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemotePrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionDetailsResponse> connectionDetails;
        private @Nullable String id;
        private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;
        private @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections;
        private @Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies;
        private String vnetTrafficTag;

        public Builder() {
    	      // Empty
        }

        public Builder(RemotePrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionDetails = defaults.connectionDetails;
    	      this.id = defaults.id;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
    	      this.privateLinkServiceConnections = defaults.privateLinkServiceConnections;
    	      this.privateLinkServiceProxies = defaults.privateLinkServiceProxies;
    	      this.vnetTrafficTag = defaults.vnetTrafficTag;
        }

        public Builder setConnectionDetails(@Nullable List<ConnectionDetailsResponse> connectionDetails) {
            this.connectionDetails = connectionDetails;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        public Builder setPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }

        public Builder setPrivateLinkServiceProxies(@Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies) {
            this.privateLinkServiceProxies = privateLinkServiceProxies;
            return this;
        }

        public Builder setVnetTrafficTag(String vnetTrafficTag) {
            this.vnetTrafficTag = Objects.requireNonNull(vnetTrafficTag);
            return this;
        }
        public RemotePrivateEndpointResponse build() {
            return new RemotePrivateEndpointResponse(connectionDetails, id, manualPrivateLinkServiceConnections, privateLinkServiceConnections, privateLinkServiceProxies, vnetTrafficTag);
        }
    }
}
