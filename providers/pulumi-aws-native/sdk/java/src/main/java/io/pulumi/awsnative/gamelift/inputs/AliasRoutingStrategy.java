// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.enums.AliasRoutingStrategyType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasRoutingStrategy extends io.pulumi.resources.InvokeArgs {

    public static final AliasRoutingStrategy Empty = new AliasRoutingStrategy();

    @InputImport(name="fleetId")
    private final @Nullable String fleetId;

    public Optional<String> getFleetId() {
        return this.fleetId == null ? Optional.empty() : Optional.ofNullable(this.fleetId);
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="type", required=true)
    private final AliasRoutingStrategyType type;

    public AliasRoutingStrategyType getType() {
        return this.type;
    }

    public AliasRoutingStrategy(
        @Nullable String fleetId,
        @Nullable String message,
        AliasRoutingStrategyType type) {
        this.fleetId = fleetId;
        this.message = message;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AliasRoutingStrategy() {
        this.fleetId = null;
        this.message = null;
        this.type = null;
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
        private AliasRoutingStrategyType type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasRoutingStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetId = defaults.fleetId;
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder setFleetId(@Nullable String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setType(AliasRoutingStrategyType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AliasRoutingStrategy build() {
            return new AliasRoutingStrategy(fleetId, message, type);
        }
    }
}