// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of azure data lake store dataset.
 * 
 */
public final class AzureDataLakeStoreLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDataLakeStoreLocationResponse Empty = new AzureDataLakeStoreLocationResponse();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Object fileName;

    public Optional<Object> getFileName() {
        return this.fileName == null ? Optional.empty() : Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Object folderPath;

    public Optional<Object> getFolderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'AzureDataLakeStoreLocation'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AzureDataLakeStoreLocationResponse(
        @Nullable Object fileName,
        @Nullable Object folderPath,
        String type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDataLakeStoreLocationResponse() {
        this.fileName = null;
        this.folderPath = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureDataLakeStoreLocationResponse build() {
            return new AzureDataLakeStoreLocationResponse(fileName, folderPath, type);
        }
    }
}
