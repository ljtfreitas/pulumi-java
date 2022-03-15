// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasCloudWatchLogGroupLogDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
 * 
 */
public final class BotAliasTextLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasTextLogDestinationArgs Empty = new BotAliasTextLogDestinationArgs();

    @Import(name="cloudWatch")
      private final @Nullable Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch;

    public Output<BotAliasCloudWatchLogGroupLogDestinationArgs> getCloudWatch() {
        return this.cloudWatch == null ? Output.empty() : this.cloudWatch;
    }

    public BotAliasTextLogDestinationArgs(@Nullable Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    private BotAliasTextLogDestinationArgs() {
        this.cloudWatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatch = defaults.cloudWatch;
        }

        public Builder cloudWatch(@Nullable Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch) {
            this.cloudWatch = cloudWatch;
            return this;
        }

        public Builder cloudWatch(@Nullable BotAliasCloudWatchLogGroupLogDestinationArgs cloudWatch) {
            this.cloudWatch = Output.ofNullable(cloudWatch);
            return this;
        }
        public BotAliasTextLogDestinationArgs build() {
            return new BotAliasTextLogDestinationArgs(cloudWatch);
        }
    }
}
