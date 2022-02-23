// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ModelPackageGroupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupPolicyArgs Empty = new ModelPackageGroupPolicyArgs();

    /**
     * The name of the model package group.
     * 
     */
    @InputImport(name="modelPackageGroupName", required=true)
    private final Input<String> modelPackageGroupName;

    public Input<String> getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    @InputImport(name="resourcePolicy", required=true)
    private final Input<String> resourcePolicy;

    public Input<String> getResourcePolicy() {
        return this.resourcePolicy;
    }

    public ModelPackageGroupPolicyArgs(
        Input<String> modelPackageGroupName,
        Input<String> resourcePolicy) {
        this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName, "expected parameter 'modelPackageGroupName' to be non-null");
        this.resourcePolicy = Objects.requireNonNull(resourcePolicy, "expected parameter 'resourcePolicy' to be non-null");
    }

    private ModelPackageGroupPolicyArgs() {
        this.modelPackageGroupName = Input.empty();
        this.resourcePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> modelPackageGroupName;
        private Input<String> resourcePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.resourcePolicy = defaults.resourcePolicy;
        }

        public Builder setModelPackageGroupName(Input<String> modelPackageGroupName) {
            this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName);
            return this;
        }

        public Builder setModelPackageGroupName(String modelPackageGroupName) {
            this.modelPackageGroupName = Input.of(Objects.requireNonNull(modelPackageGroupName));
            return this;
        }

        public Builder setResourcePolicy(Input<String> resourcePolicy) {
            this.resourcePolicy = Objects.requireNonNull(resourcePolicy);
            return this;
        }

        public Builder setResourcePolicy(String resourcePolicy) {
            this.resourcePolicy = Input.of(Objects.requireNonNull(resourcePolicy));
            return this;
        }
        public ModelPackageGroupPolicyArgs build() {
            return new ModelPackageGroupPolicyArgs(modelPackageGroupName, resourcePolicy);
        }
    }
}
