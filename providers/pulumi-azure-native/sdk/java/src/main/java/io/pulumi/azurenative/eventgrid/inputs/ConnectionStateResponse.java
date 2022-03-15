// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ConnectionState information.
 * 
 */
public final class ConnectionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionStateResponse Empty = new ConnectionStateResponse();

    /**
     * Actions required (if any).
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable String actionsRequired;

    public Optional<String> getActionsRequired() {
        return this.actionsRequired == null ? Optional.empty() : Optional.ofNullable(this.actionsRequired);
    }

    /**
     * Description of the connection state.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Status of the connection.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public ConnectionStateResponse(
        @Nullable String actionsRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private ConnectionStateResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStateResponse defaults) {
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
        public ConnectionStateResponse build() {
            return new ConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
