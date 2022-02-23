// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DefaultSnatStatus contains the desired state of whether default sNAT should be disabled on the cluster.
 * 
 */
public final class DefaultSnatStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSnatStatusArgs Empty = new DefaultSnatStatusArgs();

    /**
     * Disables cluster default sNAT rules.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    public DefaultSnatStatusArgs(@Nullable Input<Boolean> disabled) {
        this.disabled = disabled;
    }

    private DefaultSnatStatusArgs() {
        this.disabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSnatStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSnatStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }
        public DefaultSnatStatusArgs build() {
            return new DefaultSnatStatusArgs(disabled);
        }
    }
}
