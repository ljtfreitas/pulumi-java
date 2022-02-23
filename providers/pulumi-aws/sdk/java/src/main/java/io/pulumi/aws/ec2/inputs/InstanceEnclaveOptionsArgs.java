// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceEnclaveOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceEnclaveOptionsArgs Empty = new InstanceEnclaveOptionsArgs();

    /**
     * Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public InstanceEnclaveOptionsArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private InstanceEnclaveOptionsArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEnclaveOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceEnclaveOptionsArgs defaults) {
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
        public InstanceEnclaveOptionsArgs build() {
            return new InstanceEnclaveOptionsArgs(enabled);
        }
    }
}
