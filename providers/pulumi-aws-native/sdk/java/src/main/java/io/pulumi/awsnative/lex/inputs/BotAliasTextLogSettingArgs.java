// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasTextLogDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasTextLogSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasTextLogSettingArgs Empty = new BotAliasTextLogSettingArgs();

    @InputImport(name="destination")
        private final @Nullable Input<BotAliasTextLogDestinationArgs> destination;

    public Input<BotAliasTextLogDestinationArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    @InputImport(name="enabled")
        private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public BotAliasTextLogSettingArgs(
        @Nullable Input<BotAliasTextLogDestinationArgs> destination,
        @Nullable Input<Boolean> enabled) {
        this.destination = destination;
        this.enabled = enabled;
    }

    private BotAliasTextLogSettingArgs() {
        this.destination = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotAliasTextLogDestinationArgs> destination;
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDestination(@Nullable Input<BotAliasTextLogDestinationArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable BotAliasTextLogDestinationArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public BotAliasTextLogSettingArgs build() {
            return new BotAliasTextLogSettingArgs(destination, enabled);
        }
    }
}
