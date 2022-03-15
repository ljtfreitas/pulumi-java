// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.PrivateEndpointConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private Link Service Connection State
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Gets or sets actions required
     * 
     */
    @Import(name="actionRequired")
      private final @Nullable Output<String> actionRequired;

    public Output<String> getActionRequired() {
        return this.actionRequired == null ? Output.empty() : this.actionRequired;
    }

    /**
     * Gets or sets description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Gets or sets the status
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,PrivateEndpointConnectionStatus>> status;

    public Output<Either<String,PrivateEndpointConnectionStatus>> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> actionRequired,
        @Nullable Output<String> description,
        @Nullable Output<Either<String,PrivateEndpointConnectionStatus>> status) {
        this.actionRequired = actionRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateArgs() {
        this.actionRequired = Output.empty();
        this.description = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionRequired;
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,PrivateEndpointConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionRequired(@Nullable Output<String> actionRequired) {
            this.actionRequired = actionRequired;
            return this;
        }

        public Builder actionRequired(@Nullable String actionRequired) {
            this.actionRequired = Output.ofNullable(actionRequired);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder status(@Nullable Output<Either<String,PrivateEndpointConnectionStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Either<String,PrivateEndpointConnectionStatus> status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionRequired, description, status);
        }
    }
}
