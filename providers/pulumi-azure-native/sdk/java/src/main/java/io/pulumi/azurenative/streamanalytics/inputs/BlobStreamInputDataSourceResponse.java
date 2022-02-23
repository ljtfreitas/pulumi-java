// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.StorageAccountResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a blob input data source that contains stream data.
 * 
 */
public final class BlobStreamInputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobStreamInputDataSourceResponse Empty = new BlobStreamInputDataSourceResponse();

    /**
     * The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="container")
        private final @Nullable String container;

    public Optional<String> getContainer() {
        return this.container == null ? Optional.empty() : Optional.ofNullable(this.container);
    }

    /**
     * The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    @InputImport(name="dateFormat")
        private final @Nullable String dateFormat;

    public Optional<String> getDateFormat() {
        return this.dateFormat == null ? Optional.empty() : Optional.ofNullable(this.dateFormat);
    }

    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    @InputImport(name="pathPattern")
        private final @Nullable String pathPattern;

    public Optional<String> getPathPattern() {
        return this.pathPattern == null ? Optional.empty() : Optional.ofNullable(this.pathPattern);
    }

    /**
     * The partition count of the blob input data source. Range 1 - 256.
     * 
     */
    @InputImport(name="sourcePartitionCount")
        private final @Nullable Integer sourcePartitionCount;

    public Optional<Integer> getSourcePartitionCount() {
        return this.sourcePartitionCount == null ? Optional.empty() : Optional.ofNullable(this.sourcePartitionCount);
    }

    /**
     * A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="storageAccounts")
        private final @Nullable List<StorageAccountResponse> storageAccounts;

    public List<StorageAccountResponse> getStorageAccounts() {
        return this.storageAccounts == null ? List.of() : this.storageAccounts;
    }

    /**
     * The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    @InputImport(name="timeFormat")
        private final @Nullable String timeFormat;

    public Optional<String> getTimeFormat() {
        return this.timeFormat == null ? Optional.empty() : Optional.ofNullable(this.timeFormat);
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/Blob'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public BlobStreamInputDataSourceResponse(
        @Nullable String container,
        @Nullable String dateFormat,
        @Nullable String pathPattern,
        @Nullable Integer sourcePartitionCount,
        @Nullable List<StorageAccountResponse> storageAccounts,
        @Nullable String timeFormat,
        String type) {
        this.container = container;
        this.dateFormat = dateFormat;
        this.pathPattern = pathPattern;
        this.sourcePartitionCount = sourcePartitionCount;
        this.storageAccounts = storageAccounts;
        this.timeFormat = timeFormat;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BlobStreamInputDataSourceResponse() {
        this.container = null;
        this.dateFormat = null;
        this.pathPattern = null;
        this.sourcePartitionCount = null;
        this.storageAccounts = List.of();
        this.timeFormat = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobStreamInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String container;
        private @Nullable String dateFormat;
        private @Nullable String pathPattern;
        private @Nullable Integer sourcePartitionCount;
        private @Nullable List<StorageAccountResponse> storageAccounts;
        private @Nullable String timeFormat;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobStreamInputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.dateFormat = defaults.dateFormat;
    	      this.pathPattern = defaults.pathPattern;
    	      this.sourcePartitionCount = defaults.sourcePartitionCount;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.timeFormat = defaults.timeFormat;
    	      this.type = defaults.type;
        }

        public Builder setContainer(@Nullable String container) {
            this.container = container;
            return this;
        }

        public Builder setDateFormat(@Nullable String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder setPathPattern(@Nullable String pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }

        public Builder setSourcePartitionCount(@Nullable Integer sourcePartitionCount) {
            this.sourcePartitionCount = sourcePartitionCount;
            return this;
        }

        public Builder setStorageAccounts(@Nullable List<StorageAccountResponse> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }

        public Builder setTimeFormat(@Nullable String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BlobStreamInputDataSourceResponse build() {
            return new BlobStreamInputDataSourceResponse(container, dateFormat, pathPattern, sourcePartitionCount, storageAccounts, timeFormat, type);
        }
    }
}
