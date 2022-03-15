// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceIamPolicyArgs Empty = new BackendServiceIamPolicyArgs();

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public BackendServiceIamPolicyArgs(
        @Nullable Output<String> name,
        Output<String> policyData,
        @Nullable Output<String> project) {
        this.name = name;
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private BackendServiceIamPolicyArgs() {
        this.name = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> policyData;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
            this.project = Output.ofNullable(project);
            return this;
        }
        public BackendServiceIamPolicyArgs build() {
            return new BackendServiceIamPolicyArgs(name, policyData, project);
        }
    }
}
