// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AliasRoutingStrategy {
    /**
     * ID of the Gamelift Fleet to point the alias to.
     * 
     */
    private final @Nullable String fleetId;
    /**
     * Message text to be used with the `TERMINAL` routing strategy.
     * 
     */
    private final @Nullable String message;
    /**
     * Type of routing strategyE.g., `SIMPLE` or `TERMINAL`
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AliasRoutingStrategy(
        @CustomType.Parameter("fleetId") @Nullable String fleetId,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("type") String type) {
        this.fleetId = fleetId;
        this.message = message;
        this.type = type;
    }

    /**
     * ID of the Gamelift Fleet to point the alias to.
     * 
    */
    public Optional<String> getFleetId() {
        return Optional.ofNullable(this.fleetId);
    }
    /**
     * Message text to be used with the `TERMINAL` routing strategy.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Type of routing strategyE.g., `SIMPLE` or `TERMINAL`
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasRoutingStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fleetId;
        private @Nullable String message;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasRoutingStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetId = defaults.fleetId;
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder fleetId(@Nullable String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AliasRoutingStrategy build() {
            return new AliasRoutingStrategy(fleetId, message, type);
        }
    }
}
