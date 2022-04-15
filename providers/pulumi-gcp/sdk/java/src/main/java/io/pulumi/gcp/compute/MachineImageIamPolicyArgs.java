// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageIamPolicyArgs Empty = new MachineImageIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="machineImage", required=true)
      private final Output<String> machineImage;

    public Output<String> machineImage() {
        return this.machineImage;
    }

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
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public MachineImageIamPolicyArgs(
        Output<String> machineImage,
        Output<String> policyData,
        @Nullable Output<String> project) {
        this.machineImage = Objects.requireNonNull(machineImage, "expected parameter 'machineImage' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private MachineImageIamPolicyArgs() {
        this.machineImage = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> machineImage;
        private Output<String> policyData;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineImage = defaults.machineImage;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder machineImage(Output<String> machineImage) {
            this.machineImage = Objects.requireNonNull(machineImage);
            return this;
        }
        public Builder machineImage(String machineImage) {
            this.machineImage = Output.of(Objects.requireNonNull(machineImage));
            return this;
        }
        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public MachineImageIamPolicyArgs build() {
            return new MachineImageIamPolicyArgs(machineImage, policyData, project);
        }
    }
}
