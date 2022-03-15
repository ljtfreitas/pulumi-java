// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasAudioLogDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings for logging audio of conversations between Amazon Lex and a user. You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
 * 
 */
public final class BotAliasAudioLogSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasAudioLogSettingArgs Empty = new BotAliasAudioLogSettingArgs();

    @Import(name="destination", required=true)
      private final Output<BotAliasAudioLogDestinationArgs> destination;

    public Output<BotAliasAudioLogDestinationArgs> getDestination() {
        return this.destination;
    }

    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public BotAliasAudioLogSettingArgs(
        Output<BotAliasAudioLogDestinationArgs> destination,
        Output<Boolean> enabled) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private BotAliasAudioLogSettingArgs() {
        this.destination = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BotAliasAudioLogDestinationArgs> destination;
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder destination(Output<BotAliasAudioLogDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder destination(BotAliasAudioLogDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public BotAliasAudioLogSettingArgs build() {
            return new BotAliasAudioLogSettingArgs(destination, enabled);
        }
    }
}
