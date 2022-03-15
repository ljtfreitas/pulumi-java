// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasTextLogDestination;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasTextLogSetting extends io.pulumi.resources.InvokeArgs {

    public static final BotAliasTextLogSetting Empty = new BotAliasTextLogSetting();

    @Import(name="destination")
      private final @Nullable BotAliasTextLogDestination destination;

    public Optional<BotAliasTextLogDestination> getDestination() {
        return this.destination == null ? Optional.empty() : Optional.ofNullable(this.destination);
    }

    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public BotAliasTextLogSetting(
        @Nullable BotAliasTextLogDestination destination,
        @Nullable Boolean enabled) {
        this.destination = destination;
        this.enabled = enabled;
    }

    private BotAliasTextLogSetting() {
        this.destination = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotAliasTextLogDestination destination;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder destination(@Nullable BotAliasTextLogDestination destination) {
            this.destination = destination;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public BotAliasTextLogSetting build() {
            return new BotAliasTextLogSetting(destination, enabled);
        }
    }
}
