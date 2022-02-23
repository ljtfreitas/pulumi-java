// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enabled configuration.
 * 
 */
public final class EnabledConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnabledConfigArgs Empty = new EnabledConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @InputImport(name="enabled")
        private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public EnabledConfigArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private EnabledConfigArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnabledConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnabledConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public EnabledConfigArgs build() {
            return new EnabledConfigArgs(enabled);
        }
    }
}
