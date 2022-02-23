// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionStateResponse {
    /**
     * Actions required (if any).
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * Description of the connection state.
     * 
     */
    private final @Nullable String description;
    /**
     * Status of the connection.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"actionsRequired","description","status"})
    private ConnectionStateResponse(
        @Nullable String actionsRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * Actions required (if any).
     * 
     */
    public Optional<String> getActionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * Description of the connection state.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Status of the connection.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
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
        public ConnectionStateResponse build() {
            return new ConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
