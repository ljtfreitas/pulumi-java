// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionIamPolicyArgs Empty = new FunctionIamPolicyArgs();

    @Import(name="cloudFunction", required=true)
      private final Output<String> cloudFunction;

    public Output<String> cloudFunction() {
        return this.cloudFunction;
    }

    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public FunctionIamPolicyArgs(
        Output<String> cloudFunction,
        Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.cloudFunction = Objects.requireNonNull(cloudFunction, "expected parameter 'cloudFunction' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
    }

    private FunctionIamPolicyArgs() {
        this.cloudFunction = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudFunction;
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder cloudFunction(Output<String> cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }
        public Builder cloudFunction(String cloudFunction) {
            this.cloudFunction = Output.of(Objects.requireNonNull(cloudFunction));
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
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public FunctionIamPolicyArgs build() {
            return new FunctionIamPolicyArgs(cloudFunction, policyData, project, region);
        }
    }
}
