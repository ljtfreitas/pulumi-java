// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FileSystemHttpLogsConfigResponse {
    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     * 
     */
    private final @Nullable Integer retentionInMb;

    @CustomType.Constructor
    private FileSystemHttpLogsConfigResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("retentionInDays") @Nullable Integer retentionInDays,
        @CustomType.Parameter("retentionInMb") @Nullable Integer retentionInMb) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
        this.retentionInMb = retentionInMb;
    }

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     * 
    */
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     * 
    */
    public Optional<Integer> getRetentionInMb() {
        return Optional.ofNullable(this.retentionInMb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemHttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer retentionInDays;
        private @Nullable Integer retentionInMb;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemHttpLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.retentionInMb = defaults.retentionInMb;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder retentionInMb(@Nullable Integer retentionInMb) {
            this.retentionInMb = retentionInMb;
            return this;
        }
        public FileSystemHttpLogsConfigResponse build() {
            return new FileSystemHttpLogsConfigResponse(enabled, retentionInDays, retentionInMb);
        }
    }
}
