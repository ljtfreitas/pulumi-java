// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.eks.inputs.FargateProfileSelectorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FargateProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FargateProfileArgs Empty = new FargateProfileArgs();

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Name of the EKS Fargate Profile.
     * 
     */
    @Import(name="fargateProfileName")
      private final @Nullable Output<String> fargateProfileName;

    public Output<String> getFargateProfileName() {
        return this.fargateProfileName == null ? Output.empty() : this.fargateProfileName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
     * 
     */
    @Import(name="podExecutionRoleArn", required=true)
      private final Output<String> podExecutionRoleArn;

    public Output<String> getPodExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }

    /**
     * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * 
     */
    @Import(name="selectors", required=true)
      private final Output<List<FargateProfileSelectorArgs>> selectors;

    public Output<List<FargateProfileSelectorArgs>> getSelectors() {
        return this.selectors;
    }

    /**
     * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Output.empty() : this.subnetIds;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FargateProfileArgs(
        Output<String> clusterName,
        @Nullable Output<String> fargateProfileName,
        Output<String> podExecutionRoleArn,
        Output<List<FargateProfileSelectorArgs>> selectors,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.fargateProfileName = fargateProfileName;
        this.podExecutionRoleArn = Objects.requireNonNull(podExecutionRoleArn, "expected parameter 'podExecutionRoleArn' to be non-null");
        this.selectors = Objects.requireNonNull(selectors, "expected parameter 'selectors' to be non-null");
        this.subnetIds = subnetIds;
        this.tags = tags;
    }

    private FargateProfileArgs() {
        this.clusterName = Output.empty();
        this.fargateProfileName = Output.empty();
        this.podExecutionRoleArn = Output.empty();
        this.selectors = Output.empty();
        this.subnetIds = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FargateProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> fargateProfileName;
        private Output<String> podExecutionRoleArn;
        private Output<List<FargateProfileSelectorArgs>> selectors;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FargateProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.fargateProfileName = defaults.fargateProfileName;
    	      this.podExecutionRoleArn = defaults.podExecutionRoleArn;
    	      this.selectors = defaults.selectors;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder fargateProfileName(@Nullable Output<String> fargateProfileName) {
            this.fargateProfileName = fargateProfileName;
            return this;
        }

        public Builder fargateProfileName(@Nullable String fargateProfileName) {
            this.fargateProfileName = Output.ofNullable(fargateProfileName);
            return this;
        }

        public Builder podExecutionRoleArn(Output<String> podExecutionRoleArn) {
            this.podExecutionRoleArn = Objects.requireNonNull(podExecutionRoleArn);
            return this;
        }

        public Builder podExecutionRoleArn(String podExecutionRoleArn) {
            this.podExecutionRoleArn = Output.of(Objects.requireNonNull(podExecutionRoleArn));
            return this;
        }

        public Builder selectors(Output<List<FargateProfileSelectorArgs>> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }

        public Builder selectors(List<FargateProfileSelectorArgs> selectors) {
            this.selectors = Output.of(Objects.requireNonNull(selectors));
            return this;
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Output.ofNullable(subnetIds);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public FargateProfileArgs build() {
            return new FargateProfileArgs(clusterName, fargateProfileName, podExecutionRoleArn, selectors, subnetIds, tags);
        }
    }
}
