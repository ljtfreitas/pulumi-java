// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceConnectionStateResponse {
    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    private final @Nullable String actionRequired;
    /**
     * The reason for approval/rejection of the connection.
     * 
     */
    private final @Nullable String description;
    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"actionRequired","description","status"})
    private PrivateLinkServiceConnectionStateResponse(
        @Nullable String actionRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionRequired = actionRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    public Optional<String> getActionRequired() {
        return Optional.ofNullable(this.actionRequired);
    }
    /**
     * The reason for approval/rejection of the connection.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
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

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionRequired(@Nullable String actionRequired) {
            this.actionRequired = actionRequired;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionRequired, description, status);
        }
    }
}
