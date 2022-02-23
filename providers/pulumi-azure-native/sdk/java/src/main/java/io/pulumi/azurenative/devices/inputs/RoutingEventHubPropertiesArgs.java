// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties related to an event hub endpoint.
 * 
 */
public final class RoutingEventHubPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingEventHubPropertiesArgs Empty = new RoutingEventHubPropertiesArgs();

    /**
     * Method used to authenticate against the event hub endpoint
     * 
     */
    @InputImport(name="authenticationType")
        private final @Nullable Input<Either<String,AuthenticationType>> authenticationType;

    public Input<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * The connection string of the event hub endpoint.
     * 
     */
    @InputImport(name="connectionString")
        private final @Nullable Input<String> connectionString;

    public Input<String> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * The url of the event hub endpoint. It must include the protocol sb://
     * 
     */
    @InputImport(name="endpointUri")
        private final @Nullable Input<String> endpointUri;

    public Input<String> getEndpointUri() {
        return this.endpointUri == null ? Input.empty() : this.endpointUri;
    }

    /**
     * Event hub name on the event hub namespace
     * 
     */
    @InputImport(name="entityPath")
        private final @Nullable Input<String> entityPath;

    public Input<String> getEntityPath() {
        return this.entityPath == null ? Input.empty() : this.entityPath;
    }

    /**
     * Id of the event hub endpoint
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The name of the resource group of the event hub endpoint.
     * 
     */
    @InputImport(name="resourceGroup")
        private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * The subscription identifier of the event hub endpoint.
     * 
     */
    @InputImport(name="subscriptionId")
        private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    public RoutingEventHubPropertiesArgs(
        @Nullable Input<Either<String,AuthenticationType>> authenticationType,
        @Nullable Input<String> connectionString,
        @Nullable Input<String> endpointUri,
        @Nullable Input<String> entityPath,
        @Nullable Input<String> id,
        Input<String> name,
        @Nullable Input<String> resourceGroup,
        @Nullable Input<String> subscriptionId) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    private RoutingEventHubPropertiesArgs() {
        this.authenticationType = Input.empty();
        this.connectionString = Input.empty();
        this.endpointUri = Input.empty();
        this.entityPath = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.resourceGroup = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingEventHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Input<String> connectionString;
        private @Nullable Input<String> endpointUri;
        private @Nullable Input<String> entityPath;
        private @Nullable Input<String> id;
        private Input<String> name;
        private @Nullable Input<String> resourceGroup;
        private @Nullable Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingEventHubPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setConnectionString(@Nullable Input<String> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
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

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }
        public RoutingEventHubPropertiesArgs build() {
            return new RoutingEventHubPropertiesArgs(authenticationType, connectionString, endpointUri, entityPath, id, name, resourceGroup, subscriptionId);
        }
    }
}
