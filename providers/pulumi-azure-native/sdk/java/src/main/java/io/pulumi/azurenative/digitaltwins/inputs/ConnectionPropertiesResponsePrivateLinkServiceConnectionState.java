// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionPropertiesResponsePrivateLinkServiceConnectionState extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionPropertiesResponsePrivateLinkServiceConnectionState Empty = new ConnectionPropertiesResponsePrivateLinkServiceConnectionState();

    /**
     * Actions required for a private endpoint connection.
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable String actionsRequired;

    public Optional<String> getActionsRequired() {
        return this.actionsRequired == null ? Optional.empty() : Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The description for the current state of a private endpoint connection.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The status of a private endpoint connection.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public ConnectionPropertiesResponsePrivateLinkServiceConnectionState(
        @Nullable String actionsRequired,
        String description,
        String status) {
        this.actionsRequired = actionsRequired;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ConnectionPropertiesResponsePrivateLinkServiceConnectionState() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ConnectionPropertiesResponsePrivateLinkServiceConnectionState build() {
            return new ConnectionPropertiesResponsePrivateLinkServiceConnectionState(actionsRequired, description, status);
        }
    }
}
