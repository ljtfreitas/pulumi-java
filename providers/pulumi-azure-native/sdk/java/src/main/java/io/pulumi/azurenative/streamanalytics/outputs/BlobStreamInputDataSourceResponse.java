// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.StorageAccountResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobStreamInputDataSourceResponse {
    private final @Nullable String container;
    private final @Nullable String dateFormat;
    private final @Nullable String pathPattern;
    private final @Nullable Integer sourcePartitionCount;
    private final @Nullable List<StorageAccountResponse> storageAccounts;
    private final @Nullable String timeFormat;
    private final String type;

    @OutputCustomType.Constructor({"container","dateFormat","pathPattern","sourcePartitionCount","storageAccounts","timeFormat","type"})
    private BlobStreamInputDataSourceResponse(
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
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getContainer() {
        return Optional.ofNullable(this.container);
    }
    public Optional<String> getDateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }
    public Optional<String> getPathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }
    public Optional<Integer> getSourcePartitionCount() {
        return Optional.ofNullable(this.sourcePartitionCount);
    }
    public List<StorageAccountResponse> getStorageAccounts() {
        return this.storageAccounts == null ? List.of() : this.storageAccounts;
    }
    public Optional<String> getTimeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }
    public String getType() {
        return this.type;
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