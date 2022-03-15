// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Http logs to file system configuration.
 * 
 */
public final class FileSystemHttpLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemHttpLogsConfigArgs Empty = new FileSystemHttpLogsConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     * 
     */
    @Import(name="retentionInDays")
      private final @Nullable Output<Integer> retentionInDays;

    public Output<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Output.empty() : this.retentionInDays;
    }

    /**
     * Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     * 
     */
    @Import(name="retentionInMb")
      private final @Nullable Output<Integer> retentionInMb;

    public Output<Integer> getRetentionInMb() {
        return this.retentionInMb == null ? Output.empty() : this.retentionInMb;
    }

    public FileSystemHttpLogsConfigArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> retentionInDays,
        @Nullable Output<Integer> retentionInMb) {
        this.enabled = enabled;
        this.retentionInDays = retentionInDays;
        this.retentionInMb = retentionInMb;
    }

    private FileSystemHttpLogsConfigArgs() {
        this.enabled = Output.empty();
        this.retentionInDays = Output.empty();
        this.retentionInMb = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemHttpLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> retentionInDays;
        private @Nullable Output<Integer> retentionInMb;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemHttpLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.retentionInMb = defaults.retentionInMb;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Output.ofNullable(retentionInDays);
            return this;
        }

        public Builder retentionInMb(@Nullable Output<Integer> retentionInMb) {
            this.retentionInMb = retentionInMb;
            return this;
        }

        public Builder retentionInMb(@Nullable Integer retentionInMb) {
            this.retentionInMb = Output.ofNullable(retentionInMb);
            return this;
        }
        public FileSystemHttpLogsConfigArgs build() {
            return new FileSystemHttpLogsConfigArgs(enabled, retentionInDays, retentionInMb);
        }
    }
}
