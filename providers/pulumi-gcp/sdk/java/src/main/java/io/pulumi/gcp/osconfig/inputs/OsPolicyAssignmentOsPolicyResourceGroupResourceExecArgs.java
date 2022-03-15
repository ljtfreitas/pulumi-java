// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs();

    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
     * 
     */
    @Import(name="enforce")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> enforce;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> getEnforce() {
        return this.enforce == null ? Output.empty() : this.enforce;
    }

    /**
     * Required. What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
     * 
     */
    @Import(name="validate", required=true)
      private final Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> getValidate() {
        return this.validate;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs(
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> enforce,
        Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate) {
        this.enforce = enforce;
        this.validate = Objects.requireNonNull(validate, "expected parameter 'validate' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs() {
        this.enforce = Output.empty();
        this.validate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> enforce;
        private Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforce = defaults.enforce;
    	      this.validate = defaults.validate;
        }

        public Builder enforce(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder enforce(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs enforce) {
            this.enforce = Output.ofNullable(enforce);
            return this;
        }

        public Builder validate(Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate) {
            this.validate = Objects.requireNonNull(validate);
            return this;
        }

        public Builder validate(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs validate) {
            this.validate = Output.of(Objects.requireNonNull(validate));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs(enforce, validate);
        }
    }
}
