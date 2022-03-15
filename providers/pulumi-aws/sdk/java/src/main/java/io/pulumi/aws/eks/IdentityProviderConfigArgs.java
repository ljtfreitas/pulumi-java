// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityProviderConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityProviderConfigArgs Empty = new IdentityProviderConfigArgs();

    /**
     * Name of the EKS Cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    @Import(name="oidc", required=true)
      private final Output<IdentityProviderConfigOidcArgs> oidc;

    public Output<IdentityProviderConfigOidcArgs> getOidc() {
        return this.oidc;
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

    public IdentityProviderConfigArgs(
        Output<String> clusterName,
        Output<IdentityProviderConfigOidcArgs> oidc,
        @Nullable Output<Map<String,String>> tags) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.oidc = Objects.requireNonNull(oidc, "expected parameter 'oidc' to be non-null");
        this.tags = tags;
    }

    private IdentityProviderConfigArgs() {
        this.clusterName = Output.empty();
        this.oidc = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private Output<IdentityProviderConfigOidcArgs> oidc;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.oidc = defaults.oidc;
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

        public Builder oidc(Output<IdentityProviderConfigOidcArgs> oidc) {
            this.oidc = Objects.requireNonNull(oidc);
            return this;
        }

        public Builder oidc(IdentityProviderConfigOidcArgs oidc) {
            this.oidc = Output.of(Objects.requireNonNull(oidc));
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
        public IdentityProviderConfigArgs build() {
            return new IdentityProviderConfigArgs(clusterName, oidc, tags);
        }
    }
}
