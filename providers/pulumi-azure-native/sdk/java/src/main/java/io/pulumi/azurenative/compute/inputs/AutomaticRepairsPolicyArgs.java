// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutomaticRepairsPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomaticRepairsPolicyArgs Empty = new AutomaticRepairsPolicyArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="gracePeriod")
    private final @Nullable Input<String> gracePeriod;

    public Input<String> getGracePeriod() {
        return this.gracePeriod == null ? Input.empty() : this.gracePeriod;
    }

    public AutomaticRepairsPolicyArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> gracePeriod) {
        this.enabled = enabled;
        this.gracePeriod = gracePeriod;
    }

    private AutomaticRepairsPolicyArgs() {
        this.enabled = Input.empty();
        this.gracePeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticRepairsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> gracePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticRepairsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.gracePeriod = defaults.gracePeriod;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setGracePeriod(@Nullable Input<String> gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }

        public Builder setGracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = Input.ofNullable(gracePeriod);
            return this;
        }

        public AutomaticRepairsPolicyArgs build() {
            return new AutomaticRepairsPolicyArgs(enabled, gracePeriod);
        }
    }
}