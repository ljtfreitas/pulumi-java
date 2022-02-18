// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the Power State of the cluster
 * 
 */
public final class PowerStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PowerStateResponse Empty = new PowerStateResponse();

    /**
     * Tells whether the cluster is Running or Stopped
     * 
     */
    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    public PowerStateResponse(@Nullable String code) {
        this.code = code;
    }

    private PowerStateResponse() {
        this.code = null;
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

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public PowerStateResponse build() {
            return new PowerStateResponse(code);
        }
    }
}
