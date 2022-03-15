// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.AttributeArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.ExprArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a user's consent in terms of the resources that can be accessed and under what conditions.
 * 
 */
public final class GoogleCloudHealthcareV1beta1ConsentPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1beta1ConsentPolicyArgs Empty = new GoogleCloudHealthcareV1beta1ConsentPolicyArgs();

    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&&`), `OR` (`||`).
     * 
     */
    @Import(name="authorizationRule", required=true)
      private final Output<ExprArgs> authorizationRule;

    public Output<ExprArgs> getAuthorizationRule() {
        return this.authorizationRule;
    }

    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
     */
    @Import(name="resourceAttributes")
      private final @Nullable Output<List<AttributeArgs>> resourceAttributes;

    public Output<List<AttributeArgs>> getResourceAttributes() {
        return this.resourceAttributes == null ? Output.empty() : this.resourceAttributes;
    }

    public GoogleCloudHealthcareV1beta1ConsentPolicyArgs(
        Output<ExprArgs> authorizationRule,
        @Nullable Output<List<AttributeArgs>> resourceAttributes) {
        this.authorizationRule = Objects.requireNonNull(authorizationRule, "expected parameter 'authorizationRule' to be non-null");
        this.resourceAttributes = resourceAttributes;
    }

    private GoogleCloudHealthcareV1beta1ConsentPolicyArgs() {
        this.authorizationRule = Output.empty();
        this.resourceAttributes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1ConsentPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ExprArgs> authorizationRule;
        private @Nullable Output<List<AttributeArgs>> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1ConsentPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRule = defaults.authorizationRule;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder authorizationRule(Output<ExprArgs> authorizationRule) {
            this.authorizationRule = Objects.requireNonNull(authorizationRule);
            return this;
        }

        public Builder authorizationRule(ExprArgs authorizationRule) {
            this.authorizationRule = Output.of(Objects.requireNonNull(authorizationRule));
            return this;
        }

        public Builder resourceAttributes(@Nullable Output<List<AttributeArgs>> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder resourceAttributes(@Nullable List<AttributeArgs> resourceAttributes) {
            this.resourceAttributes = Output.ofNullable(resourceAttributes);
            return this;
        }
        public GoogleCloudHealthcareV1beta1ConsentPolicyArgs build() {
            return new GoogleCloudHealthcareV1beta1ConsentPolicyArgs(authorizationRule, resourceAttributes);
        }
    }
}
