// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotAliasAudioLogDestination;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class BotAliasAudioLogSetting {
    private final BotAliasAudioLogDestination destination;
    private final Boolean enabled;

    @CustomType.Constructor
    private BotAliasAudioLogSetting(
        @CustomType.Parameter("destination") BotAliasAudioLogDestination destination,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.destination = destination;
        this.enabled = enabled;
    }

    public BotAliasAudioLogDestination getDestination() {
        return this.destination;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasAudioLogDestination destination;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder destination(BotAliasAudioLogDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BotAliasAudioLogSetting build() {
            return new BotAliasAudioLogSetting(destination, enabled);
        }
    }
}
