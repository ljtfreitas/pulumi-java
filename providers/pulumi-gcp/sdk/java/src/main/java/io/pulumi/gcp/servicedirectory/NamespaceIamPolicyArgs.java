// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceIamPolicyArgs Empty = new NamespaceIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
        private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public NamespaceIamPolicyArgs(
        @Nullable Input<String> name,
        Input<String> policyData) {
        this.name = name;
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private NamespaceIamPolicyArgs() {
        this.name = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyData = defaults.policyData;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }
        public NamespaceIamPolicyArgs build() {
            return new NamespaceIamPolicyArgs(name, policyData);
        }
    }
}
