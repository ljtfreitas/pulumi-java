// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceExecResourceExecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OSPolicyResourceExecResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceExecResourceArgs Empty = new OSPolicyResourceExecResourceArgs();

    @InputImport(name="enforce")
    private final @Nullable Input<OSPolicyResourceExecResourceExecArgs> enforce;

    public Input<OSPolicyResourceExecResourceExecArgs> getEnforce() {
        return this.enforce == null ? Input.empty() : this.enforce;
    }

    @InputImport(name="validate", required=true)
    private final Input<OSPolicyResourceExecResourceExecArgs> validate;

    public Input<OSPolicyResourceExecResourceExecArgs> getValidate() {
        return this.validate;
    }

    public OSPolicyResourceExecResourceArgs(
        @Nullable Input<OSPolicyResourceExecResourceExecArgs> enforce,
        Input<OSPolicyResourceExecResourceExecArgs> validate) {
        this.enforce = enforce;
        this.validate = Objects.requireNonNull(validate, "expected parameter 'validate' to be non-null");
    }

    private OSPolicyResourceExecResourceArgs() {
        this.enforce = Input.empty();
        this.validate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceExecResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OSPolicyResourceExecResourceExecArgs> enforce;
        private Input<OSPolicyResourceExecResourceExecArgs> validate;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceExecResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforce = defaults.enforce;
    	      this.validate = defaults.validate;
        }

        public Builder setEnforce(@Nullable Input<OSPolicyResourceExecResourceExecArgs> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder setEnforce(@Nullable OSPolicyResourceExecResourceExecArgs enforce) {
            this.enforce = Input.ofNullable(enforce);
            return this;
        }

        public Builder setValidate(Input<OSPolicyResourceExecResourceExecArgs> validate) {
            this.validate = Objects.requireNonNull(validate);
            return this;
        }

        public Builder setValidate(OSPolicyResourceExecResourceExecArgs validate) {
            this.validate = Input.of(Objects.requireNonNull(validate));
            return this;
        }

        public OSPolicyResourceExecResourceArgs build() {
            return new OSPolicyResourceExecResourceArgs(enforce, validate);
        }
    }
}