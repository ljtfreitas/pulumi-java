// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationPolicyRestorePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyRestorePolicyArgs Empty = new OrganizationPolicyRestorePolicyArgs();

    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
     */
    @Import(name="default", required=true)
      private final Output<Boolean> $default;

    public Output<Boolean> get$default() {
        return this.$default;
    }

    public OrganizationPolicyRestorePolicyArgs(Output<Boolean> $default) {
        this.$default = Objects.requireNonNull($default, "expected parameter '$default' to be non-null");
    }

    private OrganizationPolicyRestorePolicyArgs() {
        this.$default = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyRestorePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> $default;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyRestorePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
        }

        public Builder $default(Output<Boolean> $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }

        public Builder $default(Boolean $default) {
            this.$default = Output.of(Objects.requireNonNull($default));
            return this;
        }
        public OrganizationPolicyRestorePolicyArgs build() {
            return new OrganizationPolicyRestorePolicyArgs($default);
        }
    }
}
