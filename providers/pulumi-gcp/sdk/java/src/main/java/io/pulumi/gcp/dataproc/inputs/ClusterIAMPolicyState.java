// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIAMPolicyState Empty = new ClusterIAMPolicyState();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster == null ? Output.empty() : this.cluster;
    }

    /**
     * (Computed) The etag of the clusters's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Output.empty() : this.policyData;
    }

    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    public ClusterIAMPolicyState(
        @Nullable Output<String> cluster,
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.cluster = cluster;
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.region = region;
    }

    private ClusterIAMPolicyState() {
        this.cluster = Output.empty();
        this.etag = Output.empty();
        this.policyData = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cluster;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder cluster(@Nullable String cluster) {
            this.cluster = Output.ofNullable(cluster);
            return this;
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public ClusterIAMPolicyState build() {
            return new ClusterIAMPolicyState(cluster, etag, policyData, project, region);
        }
    }
}
