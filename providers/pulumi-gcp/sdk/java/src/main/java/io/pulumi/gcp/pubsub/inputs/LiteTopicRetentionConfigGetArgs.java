// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicRetentionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicRetentionConfigGetArgs Empty = new LiteTopicRetentionConfigGetArgs();

    /**
     * The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic's partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
     */
    @Import(name="perPartitionBytes", required=true)
      private final Output<String> perPartitionBytes;

    public Output<String> getPerPartitionBytes() {
        return this.perPartitionBytes;
    }

    /**
     * How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example: "3.5s".
     * 
     */
    @Import(name="period")
      private final @Nullable Output<String> period;

    public Output<String> getPeriod() {
        return this.period == null ? Output.empty() : this.period;
    }

    public LiteTopicRetentionConfigGetArgs(
        Output<String> perPartitionBytes,
        @Nullable Output<String> period) {
        this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes, "expected parameter 'perPartitionBytes' to be non-null");
        this.period = period;
    }

    private LiteTopicRetentionConfigGetArgs() {
        this.perPartitionBytes = Output.empty();
        this.period = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicRetentionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> perPartitionBytes;
        private @Nullable Output<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicRetentionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        public Builder perPartitionBytes(Output<String> perPartitionBytes) {
            this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes);
            return this;
        }

        public Builder perPartitionBytes(String perPartitionBytes) {
            this.perPartitionBytes = Output.of(Objects.requireNonNull(perPartitionBytes));
            return this;
        }

        public Builder period(@Nullable Output<String> period) {
            this.period = period;
            return this;
        }

        public Builder period(@Nullable String period) {
            this.period = Output.ofNullable(period);
            return this;
        }
        public LiteTopicRetentionConfigGetArgs build() {
            return new LiteTopicRetentionConfigGetArgs(perPartitionBytes, period);
        }
    }
}
