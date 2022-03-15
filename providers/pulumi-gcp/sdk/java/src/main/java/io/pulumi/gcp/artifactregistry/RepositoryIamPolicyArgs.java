// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.artifactregistry;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryIamPolicyArgs Empty = new RepositoryIamPolicyArgs();

    /**
     * The name of the location this repository is located in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
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

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="repository", required=true)
      private final Output<String> repository;

    public Output<String> getRepository() {
        return this.repository;
    }

    public RepositoryIamPolicyArgs(
        @Nullable Output<String> location,
        Output<String> policyData,
        @Nullable Output<String> project,
        Output<String> repository) {
        this.location = location;
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
    }

    private RepositoryIamPolicyArgs() {
        this.location = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
        this.repository = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private Output<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.repository = defaults.repository;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder repository(Output<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder repository(String repository) {
            this.repository = Output.of(Objects.requireNonNull(repository));
            return this;
        }
        public RepositoryIamPolicyArgs build() {
            return new RepositoryIamPolicyArgs(location, policyData, project, repository);
        }
    }
}
