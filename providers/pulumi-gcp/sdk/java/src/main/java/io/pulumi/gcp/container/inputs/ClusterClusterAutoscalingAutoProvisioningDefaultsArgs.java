// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingAutoProvisioningDefaultsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingAutoProvisioningDefaultsArgs Empty = new ClusterClusterAutoscalingAutoProvisioningDefaultsArgs();

    /**
     * The image type to use for this node. Note that changing the image type
     * will delete and recreate all nodes in the node pool.
     * 
     */
    @Import(name="imageType")
      private final @Nullable Output<String> imageType;

    public Output<String> getImageType() {
        return this.imageType == null ? Output.empty() : this.imageType;
    }

    /**
     * Minimum CPU platform to be used by this instance.
     * The instance may be scheduled on the specified or newer CPU platform. Applicable
     * values are the friendly names of CPU platforms, such as `Intel Haswell`. See the
     * [official documentation](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for more information.
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Output.empty() : this.minCpuPlatform;
    }

    /**
     * The set of Google API scopes to be made available
     * on all of the node VMs under the "default" service account.
     * Use the "https://www.googleapis.com/auth/cloud-platform" scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     */
    @Import(name="oauthScopes")
      private final @Nullable Output<List<String>> oauthScopes;

    public Output<List<String>> getOauthScopes() {
        return this.oauthScopes == null ? Output.empty() : this.oauthScopes;
    }

    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    public ClusterClusterAutoscalingAutoProvisioningDefaultsArgs(
        @Nullable Output<String> imageType,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<List<String>> oauthScopes,
        @Nullable Output<String> serviceAccount) {
        this.imageType = imageType;
        this.minCpuPlatform = minCpuPlatform;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
    }

    private ClusterClusterAutoscalingAutoProvisioningDefaultsArgs() {
        this.imageType = Output.empty();
        this.minCpuPlatform = Output.empty();
        this.oauthScopes = Output.empty();
        this.serviceAccount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscalingAutoProvisioningDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> imageType;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<List<String>> oauthScopes;
        private @Nullable Output<String> serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscalingAutoProvisioningDefaultsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder imageType(@Nullable Output<String> imageType) {
            this.imageType = imageType;
            return this;
        }

        public Builder imageType(@Nullable String imageType) {
            this.imageType = Output.ofNullable(imageType);
            return this;
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Output.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Output.ofNullable(oauthScopes);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }
        public ClusterClusterAutoscalingAutoProvisioningDefaultsArgs build() {
            return new ClusterClusterAutoscalingAutoProvisioningDefaultsArgs(imageType, minCpuPlatform, oauthScopes, serviceAccount);
        }
    }
}
