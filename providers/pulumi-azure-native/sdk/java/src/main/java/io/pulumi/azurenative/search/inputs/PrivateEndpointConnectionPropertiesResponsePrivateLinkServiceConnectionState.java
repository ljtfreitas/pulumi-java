// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint.
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState Empty = new PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState();

    /**
     * A description of any extra actions that may be required.
     * 
     */
    @InputImport(name="actionsRequired")
        private final @Nullable String actionsRequired;

    public Optional<String> getActionsRequired() {
        return this.actionsRequired == null ? Optional.empty() : Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The description for the private link service connection state.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Status of the the private link service connection. Can be Pending, Approved, Rejected, or Disconnected.
     * 
     */
    @InputImport(name="status")
        private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState(
        @Nullable String actionsRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionsRequired = actionsRequired == null ? "None" : actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setActionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
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
        public PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState build() {
            return new PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState(actionsRequired, description, status);
        }
    }
}
