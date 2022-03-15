// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotAliasCloudWatchLogGroupLogDestination;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotAliasTextLogDestination {
    private final @Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch;

    @CustomType.Constructor
    private BotAliasTextLogDestination(@CustomType.Parameter("cloudWatch") @Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    public Optional<BotAliasCloudWatchLogGroupLogDestination> getCloudWatch() {
        return Optional.ofNullable(this.cloudWatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatch = defaults.cloudWatch;
        }

        public Builder cloudWatch(@Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch) {
            this.cloudWatch = cloudWatch;
            return this;
        }
        public BotAliasTextLogDestination build() {
            return new BotAliasTextLogDestination(cloudWatch);
        }
    }
}
