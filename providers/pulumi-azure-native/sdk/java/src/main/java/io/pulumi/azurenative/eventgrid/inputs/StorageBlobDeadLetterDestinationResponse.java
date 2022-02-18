// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the storage blob based dead letter destination.
 * 
 */
public final class StorageBlobDeadLetterDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageBlobDeadLetterDestinationResponse Empty = new StorageBlobDeadLetterDestinationResponse();

    /**
     * The name of the Storage blob container that is the destination of the deadletter events
     * 
     */
    @InputImport(name="blobContainerName")
    private final @Nullable String blobContainerName;

    public Optional<String> getBlobContainerName() {
        return this.blobContainerName == null ? Optional.empty() : Optional.ofNullable(this.blobContainerName);
    }

    /**
     * Type of the endpoint for the dead letter destination
     * Expected value is 'StorageBlob'.
     * 
     */
    @InputImport(name="endpointType", required=true)
    private final String endpointType;

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource ID of the storage account that is the destination of the deadletter events
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public StorageBlobDeadLetterDestinationResponse(
        @Nullable String blobContainerName,
        String endpointType,
        @Nullable String resourceId) {
        this.blobContainerName = blobContainerName;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private StorageBlobDeadLetterDestinationResponse() {
        this.blobContainerName = null;
        this.endpointType = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageBlobDeadLetterDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobContainerName;
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageBlobDeadLetterDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerName = defaults.blobContainerName;
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setBlobContainerName(@Nullable String blobContainerName) {
            this.blobContainerName = blobContainerName;
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public StorageBlobDeadLetterDestinationResponse build() {
            return new StorageBlobDeadLetterDestinationResponse(blobContainerName, endpointType, resourceId);
        }
    }
}
