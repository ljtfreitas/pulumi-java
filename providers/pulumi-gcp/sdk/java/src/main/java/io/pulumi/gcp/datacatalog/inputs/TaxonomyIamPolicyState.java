// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyIamPolicyState Empty = new TaxonomyIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData == null ? Codegen.empty() : this.policyData;
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

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="taxonomy")
      private final @Nullable Output<String> taxonomy;

    public Output<String> taxonomy() {
        return this.taxonomy == null ? Codegen.empty() : this.taxonomy;
    }

    public TaxonomyIamPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> taxonomy) {
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.region = region;
        this.taxonomy = taxonomy;
    }

    private TaxonomyIamPolicyState() {
        this.etag = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.taxonomy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.taxonomy = defaults.taxonomy;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }
        public Builder policyData(@Nullable String policyData) {
            this.policyData = Codegen.ofNullable(policyData);
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
        }
        public Builder taxonomy(@Nullable Output<String> taxonomy) {
            this.taxonomy = taxonomy;
            return this;
        }
        public Builder taxonomy(@Nullable String taxonomy) {
            this.taxonomy = Codegen.ofNullable(taxonomy);
            return this;
        }        public TaxonomyIamPolicyState build() {
            return new TaxonomyIamPolicyState(etag, policyData, project, region, taxonomy);
        }
    }
}
