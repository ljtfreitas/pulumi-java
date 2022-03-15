// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of information about the state of the connection between service consumer and provider.
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable String actionsRequired;

    public Optional<String> getActionsRequired() {
        return this.actionsRequired == null ? Optional.empty() : Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The reason for approval/rejection of the connection.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public PrivateLinkServiceConnectionStateResponse(
        @Nullable String actionsRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
