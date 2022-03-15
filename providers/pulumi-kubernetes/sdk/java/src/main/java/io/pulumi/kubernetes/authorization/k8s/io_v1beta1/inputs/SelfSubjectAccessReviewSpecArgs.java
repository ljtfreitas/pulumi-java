// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs.NonResourceAttributesArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs.ResourceAttributesArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public final class SelfSubjectAccessReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelfSubjectAccessReviewSpecArgs Empty = new SelfSubjectAccessReviewSpecArgs();

    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    @Import(name="nonResourceAttributes")
      private final @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes;

    public Output<NonResourceAttributesArgs> getNonResourceAttributes() {
        return this.nonResourceAttributes == null ? Output.empty() : this.nonResourceAttributes;
    }

    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    @Import(name="resourceAttributes")
      private final @Nullable Output<ResourceAttributesArgs> resourceAttributes;

    public Output<ResourceAttributesArgs> getResourceAttributes() {
        return this.resourceAttributes == null ? Output.empty() : this.resourceAttributes;
    }

    public SelfSubjectAccessReviewSpecArgs(
        @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes,
        @Nullable Output<ResourceAttributesArgs> resourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
    }

    private SelfSubjectAccessReviewSpecArgs() {
        this.nonResourceAttributes = Output.empty();
        this.resourceAttributes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectAccessReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NonResourceAttributesArgs> nonResourceAttributes;
        private @Nullable Output<ResourceAttributesArgs> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectAccessReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder nonResourceAttributes(@Nullable Output<NonResourceAttributesArgs> nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }

        public Builder nonResourceAttributes(@Nullable NonResourceAttributesArgs nonResourceAttributes) {
            this.nonResourceAttributes = Output.ofNullable(nonResourceAttributes);
            return this;
        }

        public Builder resourceAttributes(@Nullable Output<ResourceAttributesArgs> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder resourceAttributes(@Nullable ResourceAttributesArgs resourceAttributes) {
            this.resourceAttributes = Output.ofNullable(resourceAttributes);
            return this;
        }
        public SelfSubjectAccessReviewSpecArgs build() {
            return new SelfSubjectAccessReviewSpecArgs(nonResourceAttributes, resourceAttributes);
        }
    }
}
