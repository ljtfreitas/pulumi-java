// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionStateResponse {
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

    @OutputCustomType.Constructor({"description","status"})
    private ConnectionStateResponse(
        @Nullable String description,
        @Nullable String status) {
        this.description = description;
        this.status = status;
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
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
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
            return new ConnectionStateResponse(description, status);
        }
    }
}
