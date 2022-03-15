// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PropertiesResponseLockbox {
    /**
     * lockbox configuration
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private PropertiesResponseLockbox(@CustomType.Parameter("state") @Nullable String state) {
        this.state = state;
    }

    /**
     * lockbox configuration
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertiesResponseLockbox defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertiesResponseLockbox defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public PropertiesResponseLockbox build() {
            return new PropertiesResponseLockbox(state);
        }
    }
}
