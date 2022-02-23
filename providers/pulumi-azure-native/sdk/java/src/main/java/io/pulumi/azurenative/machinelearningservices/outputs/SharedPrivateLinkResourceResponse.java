// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SharedPrivateLinkResourceResponse {
    /**
     * The private link resource group id.
     * 
     */
    private final @Nullable String groupId;
    /**
     * Unique name of the private link.
     * 
     */
    private final @Nullable String name;
    /**
     * The resource id that private link links to.
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * Request message.
     * 
     */
    private final @Nullable String requestMessage;
    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"groupId","name","privateLinkResourceId","requestMessage","status"})
    private SharedPrivateLinkResourceResponse(
        @Nullable String groupId,
        @Nullable String name,
        @Nullable String privateLinkResourceId,
        @Nullable String requestMessage,
        @Nullable String status) {
        this.groupId = groupId;
        this.name = name;
        this.privateLinkResourceId = privateLinkResourceId;
        this.requestMessage = requestMessage;
        this.status = status;
    }

    /**
     * The private link resource group id.
     * 
     */
    public Optional<String> getGroupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * Unique name of the private link.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The resource id that private link links to.
     * 
     */
    public Optional<String> getPrivateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * Request message.
     * 
     */
    public Optional<String> getRequestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }
    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String name;
        private @Nullable String privateLinkResourceId;
        private @Nullable String requestMessage;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.name = defaults.name;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.requestMessage = defaults.requestMessage;
    	      this.status = defaults.status;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public SharedPrivateLinkResourceResponse build() {
            return new SharedPrivateLinkResourceResponse(groupId, name, privateLinkResourceId, requestMessage, status);
        }
    }
}
