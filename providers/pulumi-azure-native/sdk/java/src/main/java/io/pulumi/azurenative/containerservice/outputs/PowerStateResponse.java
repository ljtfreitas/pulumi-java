// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerStateResponse {
    /**
     * Tells whether the cluster is Running or Stopped
     * 
     */
    private final @Nullable String code;

    @CustomType.Constructor
    private PowerStateResponse(@CustomType.Parameter("code") @Nullable String code) {
        this.code = code;
    }

    /**
     * Tells whether the cluster is Running or Stopped
     * 
    */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public PowerStateResponse build() {
            return new PowerStateResponse(code);
        }
    }
}
