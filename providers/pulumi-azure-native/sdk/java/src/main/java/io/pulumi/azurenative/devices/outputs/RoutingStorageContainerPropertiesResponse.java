// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingStorageContainerPropertiesResponse {
    /**
     * Method used to authenticate against the storage endpoint
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    private final @Nullable Integer batchFrequencyInSeconds;
    /**
     * The connection string of the storage account.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * The name of storage container in the storage account.
     * 
     */
    private final String containerName;
    /**
     * Encoding that is used to serialize messages to blobs. Supported values are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'.
     * 
     */
    private final @Nullable String encoding;
    /**
     * The url of the storage endpoint. It must include the protocol https://
     * 
     */
    private final @Nullable String endpointUri;
    /**
     * File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    private final @Nullable String fileNameFormat;
    /**
     * Id of the storage container endpoint
     * 
     */
    private final @Nullable String id;
    /**
     * Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    private final @Nullable Integer maxChunkSizeInBytes;
    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    private final String name;
    /**
     * The name of the resource group of the storage account.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * The subscription identifier of the storage account.
     * 
     */
    private final @Nullable String subscriptionId;

    @CustomType.Constructor
    private RoutingStorageContainerPropertiesResponse(
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("batchFrequencyInSeconds") @Nullable Integer batchFrequencyInSeconds,
        @CustomType.Parameter("connectionString") @Nullable String connectionString,
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("encoding") @Nullable String encoding,
        @CustomType.Parameter("endpointUri") @Nullable String endpointUri,
        @CustomType.Parameter("fileNameFormat") @Nullable String fileNameFormat,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("maxChunkSizeInBytes") @Nullable Integer maxChunkSizeInBytes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId) {
        this.authenticationType = authenticationType;
        this.batchFrequencyInSeconds = batchFrequencyInSeconds;
        this.connectionString = connectionString;
        this.containerName = containerName;
        this.encoding = encoding;
        this.endpointUri = endpointUri;
        this.fileNameFormat = fileNameFormat;
        this.id = id;
        this.maxChunkSizeInBytes = maxChunkSizeInBytes;
        this.name = name;
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    /**
     * Method used to authenticate against the storage endpoint
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
    */
    public Optional<Integer> getBatchFrequencyInSeconds() {
        return Optional.ofNullable(this.batchFrequencyInSeconds);
    }
    /**
     * The connection string of the storage account.
     * 
    */
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * The name of storage container in the storage account.
     * 
    */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * Encoding that is used to serialize messages to blobs. Supported values are 'avro', 'avrodeflate', and 'JSON'. Default value is 'avro'.
     * 
    */
    public Optional<String> getEncoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * The url of the storage endpoint. It must include the protocol https://
     * 
    */
    public Optional<String> getEndpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    /**
     * File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
    */
    public Optional<String> getFileNameFormat() {
        return Optional.ofNullable(this.fileNameFormat);
    }
    /**
     * Id of the storage container endpoint
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
    */
    public Optional<Integer> getMaxChunkSizeInBytes() {
        return Optional.ofNullable(this.maxChunkSizeInBytes);
    }
    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the resource group of the storage account.
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * The subscription identifier of the storage account.
     * 
    */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingStorageContainerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable Integer batchFrequencyInSeconds;
        private @Nullable String connectionString;
        private String containerName;
        private @Nullable String encoding;
        private @Nullable String endpointUri;
        private @Nullable String fileNameFormat;
        private @Nullable String id;
        private @Nullable Integer maxChunkSizeInBytes;
        private String name;
        private @Nullable String resourceGroup;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingStorageContainerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.batchFrequencyInSeconds = defaults.batchFrequencyInSeconds;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.encoding = defaults.encoding;
    	      this.endpointUri = defaults.endpointUri;
    	      this.fileNameFormat = defaults.fileNameFormat;
    	      this.id = defaults.id;
    	      this.maxChunkSizeInBytes = defaults.maxChunkSizeInBytes;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder batchFrequencyInSeconds(@Nullable Integer batchFrequencyInSeconds) {
            this.batchFrequencyInSeconds = batchFrequencyInSeconds;
            return this;
        }

        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder fileNameFormat(@Nullable String fileNameFormat) {
            this.fileNameFormat = fileNameFormat;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder maxChunkSizeInBytes(@Nullable Integer maxChunkSizeInBytes) {
            this.maxChunkSizeInBytes = maxChunkSizeInBytes;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public RoutingStorageContainerPropertiesResponse build() {
            return new RoutingStorageContainerPropertiesResponse(authenticationType, batchFrequencyInSeconds, connectionString, containerName, encoding, endpointUri, fileNameFormat, id, maxChunkSizeInBytes, name, resourceGroup, subscriptionId);
        }
    }
}
