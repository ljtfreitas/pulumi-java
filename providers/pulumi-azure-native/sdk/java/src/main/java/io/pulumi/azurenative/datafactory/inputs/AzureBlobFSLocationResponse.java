// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of azure blobFS dataset.
 * 
 */
public final class AzureBlobFSLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureBlobFSLocationResponse Empty = new AzureBlobFSLocationResponse();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileName")
        private final @Nullable Object fileName;

    public Optional<Object> getFileName() {
        return this.fileName == null ? Optional.empty() : Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the fileSystem of azure blobFS. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileSystem")
        private final @Nullable Object fileSystem;

    public Optional<Object> getFileSystem() {
        return this.fileSystem == null ? Optional.empty() : Optional.ofNullable(this.fileSystem);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="folderPath")
        private final @Nullable Object folderPath;

    public Optional<Object> getFolderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'AzureBlobFSLocation'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public AzureBlobFSLocationResponse(
        @Nullable Object fileName,
        @Nullable Object fileSystem,
        @Nullable Object folderPath,
        String type) {
        this.fileName = fileName;
        this.fileSystem = fileSystem;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureBlobFSLocationResponse() {
        this.fileName = null;
        this.fileSystem = null;
        this.folderPath = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileName;
        private @Nullable Object fileSystem;
        private @Nullable Object folderPath;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileSystem(@Nullable Object fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureBlobFSLocationResponse build() {
            return new AzureBlobFSLocationResponse(fileName, fileSystem, folderPath, type);
        }
    }
}
