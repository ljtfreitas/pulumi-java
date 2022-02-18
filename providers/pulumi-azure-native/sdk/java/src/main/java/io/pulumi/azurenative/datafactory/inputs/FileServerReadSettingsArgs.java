// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * File server read settings.
 * 
 */
public final class FileServerReadSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileServerReadSettingsArgs Empty = new FileServerReadSettingsArgs();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="deleteFilesAfterCompletion")
    private final @Nullable Input<Object> deleteFilesAfterCompletion;

    public Input<Object> getDeleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion == null ? Input.empty() : this.deleteFilesAfterCompletion;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @InputImport(name="enablePartitionDiscovery")
    private final @Nullable Input<Boolean> enablePartitionDiscovery;

    public Input<Boolean> getEnablePartitionDiscovery() {
        return this.enablePartitionDiscovery == null ? Input.empty() : this.enablePartitionDiscovery;
    }

    /**
     * Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileFilter")
    private final @Nullable Input<Object> fileFilter;

    public Input<Object> getFileFilter() {
        return this.fileFilter == null ? Input.empty() : this.fileFilter;
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileListPath")
    private final @Nullable Input<Object> fileListPath;

    public Input<Object> getFileListPath() {
        return this.fileListPath == null ? Input.empty() : this.fileListPath;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="modifiedDatetimeEnd")
    private final @Nullable Input<Object> modifiedDatetimeEnd;

    public Input<Object> getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Input.empty() : this.modifiedDatetimeEnd;
    }

    /**
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="modifiedDatetimeStart")
    private final @Nullable Input<Object> modifiedDatetimeStart;

    public Input<Object> getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Input.empty() : this.modifiedDatetimeStart;
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionRootPath")
    private final @Nullable Input<Object> partitionRootPath;

    public Input<Object> getPartitionRootPath() {
        return this.partitionRootPath == null ? Input.empty() : this.partitionRootPath;
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="recursive")
    private final @Nullable Input<Object> recursive;

    public Input<Object> getRecursive() {
        return this.recursive == null ? Input.empty() : this.recursive;
    }

    /**
     * The read setting type.
     * Expected value is 'FileServerReadSettings'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * FileServer wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="wildcardFileName")
    private final @Nullable Input<Object> wildcardFileName;

    public Input<Object> getWildcardFileName() {
        return this.wildcardFileName == null ? Input.empty() : this.wildcardFileName;
    }

    /**
     * FileServer wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="wildcardFolderPath")
    private final @Nullable Input<Object> wildcardFolderPath;

    public Input<Object> getWildcardFolderPath() {
        return this.wildcardFolderPath == null ? Input.empty() : this.wildcardFolderPath;
    }

    public FileServerReadSettingsArgs(
        @Nullable Input<Object> deleteFilesAfterCompletion,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Boolean> enablePartitionDiscovery,
        @Nullable Input<Object> fileFilter,
        @Nullable Input<Object> fileListPath,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> modifiedDatetimeEnd,
        @Nullable Input<Object> modifiedDatetimeStart,
        @Nullable Input<Object> partitionRootPath,
        @Nullable Input<Object> recursive,
        Input<String> type,
        @Nullable Input<Object> wildcardFileName,
        @Nullable Input<Object> wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileFilter = fileFilter;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.partitionRootPath = partitionRootPath;
        this.recursive = recursive;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    private FileServerReadSettingsArgs() {
        this.deleteFilesAfterCompletion = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.enablePartitionDiscovery = Input.empty();
        this.fileFilter = Input.empty();
        this.fileListPath = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.modifiedDatetimeEnd = Input.empty();
        this.modifiedDatetimeStart = Input.empty();
        this.partitionRootPath = Input.empty();
        this.recursive = Input.empty();
        this.type = Input.empty();
        this.wildcardFileName = Input.empty();
        this.wildcardFolderPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> deleteFilesAfterCompletion;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Boolean> enablePartitionDiscovery;
        private @Nullable Input<Object> fileFilter;
        private @Nullable Input<Object> fileListPath;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> modifiedDatetimeEnd;
        private @Nullable Input<Object> modifiedDatetimeStart;
        private @Nullable Input<Object> partitionRootPath;
        private @Nullable Input<Object> recursive;
        private Input<String> type;
        private @Nullable Input<Object> wildcardFileName;
        private @Nullable Input<Object> wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.fileFilter = defaults.fileFilter;
    	      this.fileListPath = defaults.fileListPath;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.recursive = defaults.recursive;
    	      this.type = defaults.type;
    	      this.wildcardFileName = defaults.wildcardFileName;
    	      this.wildcardFolderPath = defaults.wildcardFolderPath;
        }

        public Builder setDeleteFilesAfterCompletion(@Nullable Input<Object> deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }

        public Builder setDeleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = Input.ofNullable(deleteFilesAfterCompletion);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setEnablePartitionDiscovery(@Nullable Input<Boolean> enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder setEnablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = Input.ofNullable(enablePartitionDiscovery);
            return this;
        }

        public Builder setFileFilter(@Nullable Input<Object> fileFilter) {
            this.fileFilter = fileFilter;
            return this;
        }

        public Builder setFileFilter(@Nullable Object fileFilter) {
            this.fileFilter = Input.ofNullable(fileFilter);
            return this;
        }

        public Builder setFileListPath(@Nullable Input<Object> fileListPath) {
            this.fileListPath = fileListPath;
            return this;
        }

        public Builder setFileListPath(@Nullable Object fileListPath) {
            this.fileListPath = Input.ofNullable(fileListPath);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setModifiedDatetimeEnd(@Nullable Input<Object> modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder setModifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = Input.ofNullable(modifiedDatetimeEnd);
            return this;
        }

        public Builder setModifiedDatetimeStart(@Nullable Input<Object> modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder setModifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = Input.ofNullable(modifiedDatetimeStart);
            return this;
        }

        public Builder setPartitionRootPath(@Nullable Input<Object> partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder setPartitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = Input.ofNullable(partitionRootPath);
            return this;
        }

        public Builder setRecursive(@Nullable Input<Object> recursive) {
            this.recursive = recursive;
            return this;
        }

        public Builder setRecursive(@Nullable Object recursive) {
            this.recursive = Input.ofNullable(recursive);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setWildcardFileName(@Nullable Input<Object> wildcardFileName) {
            this.wildcardFileName = wildcardFileName;
            return this;
        }

        public Builder setWildcardFileName(@Nullable Object wildcardFileName) {
            this.wildcardFileName = Input.ofNullable(wildcardFileName);
            return this;
        }

        public Builder setWildcardFolderPath(@Nullable Input<Object> wildcardFolderPath) {
            this.wildcardFolderPath = wildcardFolderPath;
            return this;
        }

        public Builder setWildcardFolderPath(@Nullable Object wildcardFolderPath) {
            this.wildcardFolderPath = Input.ofNullable(wildcardFolderPath);
            return this;
        }

        public FileServerReadSettingsArgs build() {
            return new FileServerReadSettingsArgs(deleteFilesAfterCompletion, disableMetricsCollection, enablePartitionDiscovery, fileFilter, fileListPath, maxConcurrentConnections, modifiedDatetimeEnd, modifiedDatetimeStart, partitionRootPath, recursive, type, wildcardFileName, wildcardFolderPath);
        }
    }
}
