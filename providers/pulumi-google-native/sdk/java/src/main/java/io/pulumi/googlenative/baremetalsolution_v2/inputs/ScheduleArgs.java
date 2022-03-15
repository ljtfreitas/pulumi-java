// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A snapshot schedule.
 * 
 */
public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * A crontab-like specification that the schedule uses to take snapshots.
     * 
     */
    @Import(name="crontabSpec")
      private final @Nullable Output<String> crontabSpec;

    public Output<String> getCrontabSpec() {
        return this.crontabSpec == null ? Output.empty() : this.crontabSpec;
    }

    /**
     * A list of snapshot names created in this schedule.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The maximum number of snapshots to retain in this schedule.
     * 
     */
    @Import(name="retentionCount")
      private final @Nullable Output<Integer> retentionCount;

    public Output<Integer> getRetentionCount() {
        return this.retentionCount == null ? Output.empty() : this.retentionCount;
    }

    public ScheduleArgs(
        @Nullable Output<String> crontabSpec,
        @Nullable Output<String> prefix,
        @Nullable Output<Integer> retentionCount) {
        this.crontabSpec = crontabSpec;
        this.prefix = prefix;
        this.retentionCount = retentionCount;
    }

    private ScheduleArgs() {
        this.crontabSpec = Output.empty();
        this.prefix = Output.empty();
        this.retentionCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> crontabSpec;
        private @Nullable Output<String> prefix;
        private @Nullable Output<Integer> retentionCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crontabSpec = defaults.crontabSpec;
    	      this.prefix = defaults.prefix;
    	      this.retentionCount = defaults.retentionCount;
        }

        public Builder crontabSpec(@Nullable Output<String> crontabSpec) {
            this.crontabSpec = crontabSpec;
            return this;
        }

        public Builder crontabSpec(@Nullable String crontabSpec) {
            this.crontabSpec = Output.ofNullable(crontabSpec);
            return this;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }

        public Builder retentionCount(@Nullable Output<Integer> retentionCount) {
            this.retentionCount = retentionCount;
            return this;
        }

        public Builder retentionCount(@Nullable Integer retentionCount) {
            this.retentionCount = Output.ofNullable(retentionCount);
            return this;
        }
        public ScheduleArgs build() {
            return new ScheduleArgs(crontabSpec, prefix, retentionCount);
        }
    }
}
