// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FtpReadSettingsResponse {
    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object deleteFilesAfterCompletion;
    /**
     * If true, disable parallel reading within each file. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableChunking;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    private final @Nullable Boolean enablePartitionDiscovery;
    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileListPath;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionRootPath;
    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object recursive;
    /**
     * The read setting type.
     * Expected value is 'FtpReadSettings'.
     * 
     */
    private final String type;
    /**
     * Specify whether to use binary transfer mode for FTP stores.
     * 
     */
    private final @Nullable Boolean useBinaryTransfer;
    /**
     * Ftp wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object wildcardFileName;
    /**
     * Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object wildcardFolderPath;

    @CustomType.Constructor
    private FtpReadSettingsResponse(
        @CustomType.Parameter("deleteFilesAfterCompletion") @Nullable Object deleteFilesAfterCompletion,
        @CustomType.Parameter("disableChunking") @Nullable Object disableChunking,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("enablePartitionDiscovery") @Nullable Boolean enablePartitionDiscovery,
        @CustomType.Parameter("fileListPath") @Nullable Object fileListPath,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("partitionRootPath") @Nullable Object partitionRootPath,
        @CustomType.Parameter("recursive") @Nullable Object recursive,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useBinaryTransfer") @Nullable Boolean useBinaryTransfer,
        @CustomType.Parameter("wildcardFileName") @Nullable Object wildcardFileName,
        @CustomType.Parameter("wildcardFolderPath") @Nullable Object wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableChunking = disableChunking;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionRootPath = partitionRootPath;
        this.recursive = recursive;
        this.type = type;
        this.useBinaryTransfer = useBinaryTransfer;
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDeleteFilesAfterCompletion() {
        return Optional.ofNullable(this.deleteFilesAfterCompletion);
    }
    /**
     * If true, disable parallel reading within each file. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableChunking() {
        return Optional.ofNullable(this.disableChunking);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Indicates whether to enable partition discovery.
     * 
    */
    public Optional<Boolean> getEnablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }
    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFileListPath() {
        return Optional.ofNullable(this.fileListPath);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPartitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }
    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getRecursive() {
        return Optional.ofNullable(this.recursive);
    }
    /**
     * The read setting type.
     * Expected value is 'FtpReadSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specify whether to use binary transfer mode for FTP stores.
     * 
    */
    public Optional<Boolean> getUseBinaryTransfer() {
        return Optional.ofNullable(this.useBinaryTransfer);
    }
    /**
     * Ftp wildcardFileName. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getWildcardFileName() {
        return Optional.ofNullable(this.wildcardFileName);
    }
    /**
     * Ftp wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getWildcardFolderPath() {
        return Optional.ofNullable(this.wildcardFolderPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FtpReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deleteFilesAfterCompletion;
        private @Nullable Object disableChunking;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Boolean enablePartitionDiscovery;
        private @Nullable Object fileListPath;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionRootPath;
        private @Nullable Object recursive;
        private String type;
        private @Nullable Boolean useBinaryTransfer;
        private @Nullable Object wildcardFileName;
        private @Nullable Object wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FtpReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableChunking = defaults.disableChunking;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.fileListPath = defaults.fileListPath;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.recursive = defaults.recursive;
    	      this.type = defaults.type;
    	      this.useBinaryTransfer = defaults.useBinaryTransfer;
    	      this.wildcardFileName = defaults.wildcardFileName;
    	      this.wildcardFolderPath = defaults.wildcardFolderPath;
        }

        public Builder deleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }

        public Builder disableChunking(@Nullable Object disableChunking) {
            this.disableChunking = disableChunking;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder enablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder fileListPath(@Nullable Object fileListPath) {
            this.fileListPath = fileListPath;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder partitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder recursive(@Nullable Object recursive) {
            this.recursive = recursive;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder useBinaryTransfer(@Nullable Boolean useBinaryTransfer) {
            this.useBinaryTransfer = useBinaryTransfer;
            return this;
        }

        public Builder wildcardFileName(@Nullable Object wildcardFileName) {
            this.wildcardFileName = wildcardFileName;
            return this;
        }

        public Builder wildcardFolderPath(@Nullable Object wildcardFolderPath) {
            this.wildcardFolderPath = wildcardFolderPath;
            return this;
        }
        public FtpReadSettingsResponse build() {
            return new FtpReadSettingsResponse(deleteFilesAfterCompletion, disableChunking, disableMetricsCollection, enablePartitionDiscovery, fileListPath, maxConcurrentConnections, partitionRootPath, recursive, type, useBinaryTransfer, wildcardFileName, wildcardFolderPath);
        }
    }
}
