// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelPackageGroupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupPolicyArgs Empty = new ModelPackageGroupPolicyArgs();

    /**
     * The name of the model package group.
     * 
     */
    @Import(name="modelPackageGroupName", required=true)
      private final Output<String> modelPackageGroupName;

    public Output<String> getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    @Import(name="resourcePolicy", required=true)
      private final Output<String> resourcePolicy;

    public Output<String> getResourcePolicy() {
        return this.resourcePolicy;
    }

    public ModelPackageGroupPolicyArgs(
        Output<String> modelPackageGroupName,
        Output<String> resourcePolicy) {
        this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName, "expected parameter 'modelPackageGroupName' to be non-null");
        this.resourcePolicy = Objects.requireNonNull(resourcePolicy, "expected parameter 'resourcePolicy' to be non-null");
    }

    private ModelPackageGroupPolicyArgs() {
        this.modelPackageGroupName = Output.empty();
        this.resourcePolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> modelPackageGroupName;
        private Output<String> resourcePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.resourcePolicy = defaults.resourcePolicy;
        }

        public Builder modelPackageGroupName(Output<String> modelPackageGroupName) {
            this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName);
            return this;
        }

        public Builder modelPackageGroupName(String modelPackageGroupName) {
            this.modelPackageGroupName = Output.of(Objects.requireNonNull(modelPackageGroupName));
            return this;
        }

        public Builder resourcePolicy(Output<String> resourcePolicy) {
            this.resourcePolicy = Objects.requireNonNull(resourcePolicy);
            return this;
        }

        public Builder resourcePolicy(String resourcePolicy) {
            this.resourcePolicy = Output.of(Objects.requireNonNull(resourcePolicy));
            return this;
        }
        public ModelPackageGroupPolicyArgs build() {
            return new ModelPackageGroupPolicyArgs(modelPackageGroupName, resourcePolicy);
        }
    }
}
