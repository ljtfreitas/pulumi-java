// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.inputs;

import io.pulumi.azurenative.relay.enums.PrivateEndpointServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that represents the approval state of the private link connection.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @InputImport(name="actionRequired")
    private final @Nullable Input<String> actionRequired;

    public Input<String> getActionRequired() {
        return this.actionRequired == null ? Input.empty() : this.actionRequired;
    }

    /**
     * The reason for approval or rejection.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Indicates whether the connection has been approved, rejected or removed by the Relay Namespace owner.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status;

    public Input<Either<String,PrivateEndpointServiceConnectionStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Input<String> actionRequired,
        @Nullable Input<String> description,
        @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
        this.actionRequired = actionRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateArgs() {
        this.actionRequired = Input.empty();
        this.description = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> actionRequired;
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionRequired(@Nullable Input<String> actionRequired) {
            this.actionRequired = actionRequired;
            return this;
        }

        public Builder setActionRequired(@Nullable String actionRequired) {
            this.actionRequired = Input.ofNullable(actionRequired);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PrivateEndpointServiceConnectionStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionRequired, description, status);
        }
    }
}
