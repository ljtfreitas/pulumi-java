// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureBlobStorageApplicationLogsConfigResponse {
    /**
     * Log level.
     * 
     */
    private final @Nullable String level;
    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * SAS url to a azure blob container with read/write/list/delete permissions.
     * 
     */
    private final @Nullable String sasUrl;

    @OutputCustomType.Constructor({"level","retentionInDays","sasUrl"})
    private AzureBlobStorageApplicationLogsConfigResponse(
        @Nullable String level,
        @Nullable Integer retentionInDays,
        @Nullable String sasUrl) {
        this.level = level;
        this.retentionInDays = retentionInDays;
        this.sasUrl = sasUrl;
    }

    /**
     * Log level.
     * 
     */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     * 
     */
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * SAS url to a azure blob container with read/write/list/delete permissions.
     * 
     */
    public Optional<String> getSasUrl() {
        return Optional.ofNullable(this.sasUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageApplicationLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String level;
        private @Nullable Integer retentionInDays;
        private @Nullable String sasUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageApplicationLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sasUrl = defaults.sasUrl;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setSasUrl(@Nullable String sasUrl) {
            this.sasUrl = sasUrl;
            return this;
        }

        public AzureBlobStorageApplicationLogsConfigResponse build() {
            return new AzureBlobStorageApplicationLogsConfigResponse(level, retentionInDays, sasUrl);
        }
    }
}
