// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointEventhubState extends com.pulumi.resources.ResourceArgs {

    public static final EndpointEventhubState Empty = new EndpointEventhubState();

    /**
     * Type used to authenticate against the Event Hub endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    /**
     * @return Type used to authenticate against the Event Hub endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * The connection string for the endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `keyBased`.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The connection string for the endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `keyBased`.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * URI of the Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
     * 
     */
    @Import(name="endpointUri")
    private @Nullable Output<String> endpointUri;

    /**
     * @return URI of the Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
     * 
     */
    public Optional<Output<String>> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }

    /**
     * Name of the Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
     * 
     */
    @Import(name="entityPath")
    private @Nullable Output<String> entityPath;

    /**
     * @return Name of the Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
     * 
     */
    public Optional<Output<String>> entityPath() {
        return Optional.ofNullable(this.entityPath);
    }

    /**
     * ID of the User Managed Identity used to authenticate against the Event Hub endpoint.
     * 
     */
    @Import(name="identityId")
    private @Nullable Output<String> identityId;

    /**
     * @return ID of the User Managed Identity used to authenticate against the Event Hub endpoint.
     * 
     */
    public Optional<Output<String>> identityId() {
        return Optional.ofNullable(this.identityId);
    }

    /**
     * The IoTHub ID for the endpoint.
     * 
     */
    @Import(name="iothubId")
    private @Nullable Output<String> iothubId;

    /**
     * @return The IoTHub ID for the endpoint.
     * 
     */
    public Optional<Output<String>> iothubId() {
        return Optional.ofNullable(this.iothubId);
    }

    /**
     * The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group under which the Event Hub has been created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the Event Hub has been created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private EndpointEventhubState() {}

    private EndpointEventhubState(EndpointEventhubState $) {
        this.authenticationType = $.authenticationType;
        this.connectionString = $.connectionString;
        this.endpointUri = $.endpointUri;
        this.entityPath = $.entityPath;
        this.identityId = $.identityId;
        this.iothubId = $.iothubId;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointEventhubState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointEventhubState $;

        public Builder() {
            $ = new EndpointEventhubState();
        }

        public Builder(EndpointEventhubState defaults) {
            $ = new EndpointEventhubState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType Type used to authenticate against the Event Hub endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Type used to authenticate against the Event Hub endpoint. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param connectionString The connection string for the endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `keyBased`.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string for the endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `keyBased`.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param endpointUri URI of the Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(@Nullable Output<String> endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        /**
         * @param endpointUri URI of the Event Hubs Namespace endpoint. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(String endpointUri) {
            return endpointUri(Output.of(endpointUri));
        }

        /**
         * @param entityPath Name of the Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
         * 
         * @return builder
         * 
         */
        public Builder entityPath(@Nullable Output<String> entityPath) {
            $.entityPath = entityPath;
            return this;
        }

        /**
         * @param entityPath Name of the Event Hub. This attribute can only be specified and is mandatory when `authentication_type` is `identityBased`.
         * 
         * @return builder
         * 
         */
        public Builder entityPath(String entityPath) {
            return entityPath(Output.of(entityPath));
        }

        /**
         * @param identityId ID of the User Managed Identity used to authenticate against the Event Hub endpoint.
         * 
         * @return builder
         * 
         */
        public Builder identityId(@Nullable Output<String> identityId) {
            $.identityId = identityId;
            return this;
        }

        /**
         * @param identityId ID of the User Managed Identity used to authenticate against the Event Hub endpoint.
         * 
         * @return builder
         * 
         */
        public Builder identityId(String identityId) {
            return identityId(Output.of(identityId));
        }

        /**
         * @param iothubId The IoTHub ID for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder iothubId(@Nullable Output<String> iothubId) {
            $.iothubId = iothubId;
            return this;
        }

        /**
         * @param iothubId The IoTHub ID for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder iothubId(String iothubId) {
            return iothubId(Output.of(iothubId));
        }

        /**
         * @param name The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint. The name must be unique across endpoint types. The following names are reserved:  `events`, `operationsMonitoringEvents`, `fileNotifications` and `$default`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Event Hub has been created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Event Hub has been created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public EndpointEventhubState build() {
            return $;
        }
    }

}
