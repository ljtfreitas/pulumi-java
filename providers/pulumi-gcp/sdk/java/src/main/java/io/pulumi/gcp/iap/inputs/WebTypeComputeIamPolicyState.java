// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebTypeComputeIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final WebTypeComputeIamPolicyState Empty = new WebTypeComputeIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Output.empty() : this.policyData;
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

    public WebTypeComputeIamPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project) {
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
    }

    private WebTypeComputeIamPolicyState() {
        this.etag = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTypeComputeIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTypeComputeIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder policyData(@Nullable String policyData) {
            this.policyData = Output.ofNullable(policyData);
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
        public WebTypeComputeIamPolicyState build() {
            return new WebTypeComputeIamPolicyState(etag, policyData, project);
        }
    }
}
