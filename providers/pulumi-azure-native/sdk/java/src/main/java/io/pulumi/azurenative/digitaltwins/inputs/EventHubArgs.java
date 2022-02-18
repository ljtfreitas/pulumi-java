// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.azurenative.digitaltwins.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties related to EventHub.
 * 
 */
public final class EventHubArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubArgs Empty = new EventHubArgs();

    /**
     * Specifies the authentication type being used for connecting to the endpoint.
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable Input<Either<String,AuthenticationType>> authenticationType;

    public Input<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * PrimaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="connectionStringPrimaryKey")
    private final @Nullable Input<String> connectionStringPrimaryKey;

    public Input<String> getConnectionStringPrimaryKey() {
        return this.connectionStringPrimaryKey == null ? Input.empty() : this.connectionStringPrimaryKey;
    }

    /**
     * SecondaryConnectionString of the endpoint for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="connectionStringSecondaryKey")
    private final @Nullable Input<String> connectionStringSecondaryKey;

    public Input<String> getConnectionStringSecondaryKey() {
        return this.connectionStringSecondaryKey == null ? Input.empty() : this.connectionStringSecondaryKey;
    }

    /**
     * Dead letter storage secret for key-based authentication. Will be obfuscated during read.
     * 
     */
    @InputImport(name="deadLetterSecret")
    private final @Nullable Input<String> deadLetterSecret;

    public Input<String> getDeadLetterSecret() {
        return this.deadLetterSecret == null ? Input.empty() : this.deadLetterSecret;
    }

    /**
     * Dead letter storage URL for identity-based authentication.
     * 
     */
    @InputImport(name="deadLetterUri")
    private final @Nullable Input<String> deadLetterUri;

    public Input<String> getDeadLetterUri() {
        return this.deadLetterUri == null ? Input.empty() : this.deadLetterUri;
    }

    /**
     * The type of Digital Twins endpoint
     * Expected value is 'EventHub'.
     * 
     */
    @InputImport(name="endpointType", required=true)
    private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @InputImport(name="endpointUri")
    private final @Nullable Input<String> endpointUri;

    public Input<String> getEndpointUri() {
        return this.endpointUri == null ? Input.empty() : this.endpointUri;
    }

    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    @InputImport(name="entityPath")
    private final @Nullable Input<String> entityPath;

    public Input<String> getEntityPath() {
        return this.entityPath == null ? Input.empty() : this.entityPath;
    }

    public EventHubArgs(
        @Nullable Input<Either<String,AuthenticationType>> authenticationType,
        @Nullable Input<String> connectionStringPrimaryKey,
        @Nullable Input<String> connectionStringSecondaryKey,
        @Nullable Input<String> deadLetterSecret,
        @Nullable Input<String> deadLetterUri,
        Input<String> endpointType,
        @Nullable Input<String> endpointUri,
        @Nullable Input<String> entityPath) {
        this.authenticationType = authenticationType;
        this.connectionStringPrimaryKey = connectionStringPrimaryKey;
        this.connectionStringSecondaryKey = connectionStringSecondaryKey;
        this.deadLetterSecret = deadLetterSecret;
        this.deadLetterUri = deadLetterUri;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
    }

    private EventHubArgs() {
        this.authenticationType = Input.empty();
        this.connectionStringPrimaryKey = Input.empty();
        this.connectionStringSecondaryKey = Input.empty();
        this.deadLetterSecret = Input.empty();
        this.deadLetterUri = Input.empty();
        this.endpointType = Input.empty();
        this.endpointUri = Input.empty();
        this.entityPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Input<String> connectionStringPrimaryKey;
        private @Nullable Input<String> connectionStringSecondaryKey;
        private @Nullable Input<String> deadLetterSecret;
        private @Nullable Input<String> deadLetterUri;
        private Input<String> endpointType;
        private @Nullable Input<String> endpointUri;
        private @Nullable Input<String> entityPath;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionStringPrimaryKey = defaults.connectionStringPrimaryKey;
    	      this.connectionStringSecondaryKey = defaults.connectionStringSecondaryKey;
    	      this.deadLetterSecret = defaults.deadLetterSecret;
    	      this.deadLetterUri = defaults.deadLetterUri;
    	      this.endpointType = defaults.endpointType;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setConnectionStringPrimaryKey(@Nullable Input<String> connectionStringPrimaryKey) {
            this.connectionStringPrimaryKey = connectionStringPrimaryKey;
            return this;
        }

        public Builder setConnectionStringPrimaryKey(@Nullable String connectionStringPrimaryKey) {
            this.connectionStringPrimaryKey = Input.ofNullable(connectionStringPrimaryKey);
            return this;
        }

        public Builder setConnectionStringSecondaryKey(@Nullable Input<String> connectionStringSecondaryKey) {
            this.connectionStringSecondaryKey = connectionStringSecondaryKey;
            return this;
        }

        public Builder setConnectionStringSecondaryKey(@Nullable String connectionStringSecondaryKey) {
            this.connectionStringSecondaryKey = Input.ofNullable(connectionStringSecondaryKey);
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable Input<String> deadLetterSecret) {
            this.deadLetterSecret = deadLetterSecret;
            return this;
        }

        public Builder setDeadLetterSecret(@Nullable String deadLetterSecret) {
            this.deadLetterSecret = Input.ofNullable(deadLetterSecret);
            return this;
        }

        public Builder setDeadLetterUri(@Nullable Input<String> deadLetterUri) {
            this.deadLetterUri = deadLetterUri;
            return this;
        }

        public Builder setDeadLetterUri(@Nullable String deadLetterUri) {
            this.deadLetterUri = Input.ofNullable(deadLetterUri);
            return this;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setEndpointUri(@Nullable Input<String> endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder setEndpointUri(@Nullable String endpointUri) {
            this.endpointUri = Input.ofNullable(endpointUri);
            return this;
        }

        public Builder setEntityPath(@Nullable Input<String> entityPath) {
            this.entityPath = entityPath;
            return this;
        }

        public Builder setEntityPath(@Nullable String entityPath) {
            this.entityPath = Input.ofNullable(entityPath);
            return this;
        }

        public EventHubArgs build() {
            return new EventHubArgs(authenticationType, connectionStringPrimaryKey, connectionStringSecondaryKey, deadLetterSecret, deadLetterUri, endpointType, endpointUri, entityPath);
        }
    }
}
