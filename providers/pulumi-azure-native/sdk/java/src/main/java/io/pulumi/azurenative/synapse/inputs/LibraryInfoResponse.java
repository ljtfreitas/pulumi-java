// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Library/package information of a Big Data pool powered by Apache Spark
 * 
 */
public final class LibraryInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final LibraryInfoResponse Empty = new LibraryInfoResponse();

    /**
     * Storage blob container name.
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * Creator Id of the library/package.
     * 
     */
    @InputImport(name="creatorId", required=true)
    private final String creatorId;

    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * Name of the library.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Storage blob path of library.
     * 
     */
    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * Provisioning status of the library/package.
     * 
     */
    @InputImport(name="provisioningStatus", required=true)
    private final String provisioningStatus;

    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * Type of the library.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The last update time of the library.
     * 
     */
    @InputImport(name="uploadedTimestamp", required=true)
    private final String uploadedTimestamp;

    public String getUploadedTimestamp() {
        return this.uploadedTimestamp;
    }

    public LibraryInfoResponse(
        @Nullable String containerName,
        String creatorId,
        @Nullable String name,
        @Nullable String path,
        String provisioningStatus,
        @Nullable String type,
        String uploadedTimestamp) {
        this.containerName = containerName;
        this.creatorId = Objects.requireNonNull(creatorId, "expected parameter 'creatorId' to be non-null");
        this.name = name;
        this.path = path;
        this.provisioningStatus = Objects.requireNonNull(provisioningStatus, "expected parameter 'provisioningStatus' to be non-null");
        this.type = type;
        this.uploadedTimestamp = Objects.requireNonNull(uploadedTimestamp, "expected parameter 'uploadedTimestamp' to be non-null");
    }

    private LibraryInfoResponse() {
        this.containerName = null;
        this.creatorId = null;
        this.name = null;
        this.path = null;
        this.provisioningStatus = null;
        this.type = null;
        this.uploadedTimestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private String creatorId;
        private @Nullable String name;
        private @Nullable String path;
        private String provisioningStatus;
        private @Nullable String type;
        private String uploadedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.creatorId = defaults.creatorId;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.provisioningStatus = defaults.provisioningStatus;
    	      this.type = defaults.type;
    	      this.uploadedTimestamp = defaults.uploadedTimestamp;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = Objects.requireNonNull(creatorId);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setProvisioningStatus(String provisioningStatus) {
            this.provisioningStatus = Objects.requireNonNull(provisioningStatus);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUploadedTimestamp(String uploadedTimestamp) {
            this.uploadedTimestamp = Objects.requireNonNull(uploadedTimestamp);
            return this;
        }

        public LibraryInfoResponse build() {
            return new LibraryInfoResponse(containerName, creatorId, name, path, provisioningStatus, type, uploadedTimestamp);
        }
    }
}
