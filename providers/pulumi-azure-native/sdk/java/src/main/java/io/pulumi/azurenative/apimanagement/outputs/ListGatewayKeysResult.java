// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListGatewayKeysResult {
    /**
     * Primary gateway key.
     * 
     */
    private final @Nullable String primary;
    /**
     * Secondary gateway key.
     * 
     */
    private final @Nullable String secondary;

    @OutputCustomType.Constructor({"primary","secondary"})
    private ListGatewayKeysResult(
        @Nullable String primary,
        @Nullable String secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    /**
     * Primary gateway key.
     * 
     */
    public Optional<String> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * Secondary gateway key.
     * 
     */
    public Optional<String> getSecondary() {
        return Optional.ofNullable(this.secondary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListGatewayKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primary;
        private @Nullable String secondary;

        public Builder() {
    	      // Empty
        }

        public Builder(ListGatewayKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.secondary = defaults.secondary;
        }

        public Builder setPrimary(@Nullable String primary) {
            this.primary = primary;
            return this;
        }

        public Builder setSecondary(@Nullable String secondary) {
            this.secondary = secondary;
            return this;
        }

        public ListGatewayKeysResult build() {
            return new ListGatewayKeysResult(primary, secondary);
        }
    }
}
