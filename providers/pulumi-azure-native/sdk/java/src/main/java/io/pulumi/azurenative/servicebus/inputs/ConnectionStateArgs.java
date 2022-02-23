// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.azurenative.servicebus.enums.PrivateLinkConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ConnectionState information.
 * 
 */
public final class ConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionStateArgs Empty = new ConnectionStateArgs();

    /**
     * Description of the connection state.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Status of the connection.
     * 
     */
    @InputImport(name="status")
        private final @Nullable Input<Either<String,PrivateLinkConnectionStatus>> status;

    public Input<Either<String,PrivateLinkConnectionStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ConnectionStateArgs(
        @Nullable Input<String> description,
        @Nullable Input<Either<String,PrivateLinkConnectionStatus>> status) {
        this.description = description;
        this.status = status;
    }

    private ConnectionStateArgs() {
        this.description = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,PrivateLinkConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,PrivateLinkConnectionStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PrivateLinkConnectionStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ConnectionStateArgs build() {
            return new ConnectionStateArgs(description, status);
        }
    }
}
