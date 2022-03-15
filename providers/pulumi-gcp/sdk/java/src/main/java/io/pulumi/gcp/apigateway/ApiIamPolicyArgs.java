// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiIamPolicyArgs Empty = new ApiIamPolicyArgs();

    @Import(name="api", required=true)
      private final Output<String> api;

    public Output<String> getApi() {
        return this.api;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ApiIamPolicyArgs(
        Output<String> api,
        Output<String> policyData,
        @Nullable Output<String> project) {
        this.api = Objects.requireNonNull(api, "expected parameter 'api' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private ApiIamPolicyArgs() {
        this.api = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> api;
        private Output<String> policyData;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder api(Output<String> api) {
            this.api = Objects.requireNonNull(api);
            return this;
        }

        public Builder api(String api) {
            this.api = Output.of(Objects.requireNonNull(api));
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
        public ApiIamPolicyArgs build() {
            return new ApiIamPolicyArgs(api, policyData, project);
        }
    }
}
