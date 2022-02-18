// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PrivateLinkServiceConnection resource.
 * 
 */
public final class PrivateLinkServiceConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionResponse Empty = new PrivateLinkServiceConnectionResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to.
     * 
     */
    @InputImport(name="groupIds")
    private final @Nullable List<String> groupIds;

    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A collection of read-only information about the state of the connection to the remote resource.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The resource id of private link service.
     * 
     */
    @InputImport(name="privateLinkServiceId")
    private final @Nullable String privateLinkServiceId;

    public Optional<String> getPrivateLinkServiceId() {
        return this.privateLinkServiceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceId);
    }

    /**
     * The provisioning state of the private link service connection resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    @InputImport(name="requestMessage")
    private final @Nullable String requestMessage;

    public Optional<String> getRequestMessage() {
        return this.requestMessage == null ? Optional.empty() : Optional.ofNullable(this.requestMessage);
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public PrivateLinkServiceConnectionResponse(
        String etag,
        @Nullable List<String> groupIds,
        @Nullable String id,
        @Nullable String name,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @Nullable String privateLinkServiceId,
        String provisioningState,
        @Nullable String requestMessage,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.groupIds = groupIds;
        this.id = id;
        this.name = name;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.privateLinkServiceId = privateLinkServiceId;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.requestMessage = requestMessage;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PrivateLinkServiceConnectionResponse() {
        this.etag = null;
        this.groupIds = List.of();
        this.id = null;
        this.name = null;
        this.privateLinkServiceConnectionState = null;
        this.privateLinkServiceId = null;
        this.provisioningState = null;
        this.requestMessage = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable List<String> groupIds;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String privateLinkServiceId;
        private String provisioningState;
        private @Nullable String requestMessage;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PrivateLinkServiceConnectionResponse build() {
            return new PrivateLinkServiceConnectionResponse(etag, groupIds, id, name, privateLinkServiceConnectionState, privateLinkServiceId, provisioningState, requestMessage, type);
        }
    }
}
