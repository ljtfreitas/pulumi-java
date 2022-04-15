// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class PolicyBooleanPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyBooleanPolicyArgs Empty = new PolicyBooleanPolicyArgs();

    /**
     * If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    @Import(name="enforced", required=true)
      private final Output<Boolean> enforced;

    public Output<Boolean> enforced() {
        return this.enforced;
    }

    public PolicyBooleanPolicyArgs(Output<Boolean> enforced) {
        this.enforced = Objects.requireNonNull(enforced, "expected parameter 'enforced' to be non-null");
    }

    private PolicyBooleanPolicyArgs() {
        this.enforced = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyBooleanPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyBooleanPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder enforced(Output<Boolean> enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }
        public Builder enforced(Boolean enforced) {
            this.enforced = Output.of(Objects.requireNonNull(enforced));
            return this;
        }        public PolicyBooleanPolicyArgs build() {
            return new PolicyBooleanPolicyArgs(enforced);
        }
    }
}
