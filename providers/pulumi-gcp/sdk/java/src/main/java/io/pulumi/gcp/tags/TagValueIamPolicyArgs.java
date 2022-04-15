// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TagValueIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagValueIamPolicyArgs Empty = new TagValueIamPolicyArgs();

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagValue", required=true)
      private final Output<String> tagValue;

    public Output<String> tagValue() {
        return this.tagValue;
    }

    public TagValueIamPolicyArgs(
        Output<String> policyData,
        Output<String> tagValue) {
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.tagValue = Objects.requireNonNull(tagValue, "expected parameter 'tagValue' to be non-null");
    }

    private TagValueIamPolicyArgs() {
        this.policyData = Codegen.empty();
        this.tagValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyData;
        private Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyData = defaults.policyData;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
            return this;
        }
        public Builder tagValue(Output<String> tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }
        public Builder tagValue(String tagValue) {
            this.tagValue = Output.of(Objects.requireNonNull(tagValue));
            return this;
        }        public TagValueIamPolicyArgs build() {
            return new TagValueIamPolicyArgs(policyData, tagValue);
        }
    }
}
