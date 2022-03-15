// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIdentityOidcGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIdentityOidcGetArgs Empty = new ClusterIdentityOidcGetArgs();

    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    @Import(name="issuer")
      private final @Nullable Output<String> issuer;

    public Output<String> getIssuer() {
        return this.issuer == null ? Output.empty() : this.issuer;
    }

    public ClusterIdentityOidcGetArgs(@Nullable Output<String> issuer) {
        this.issuer = issuer;
    }

    private ClusterIdentityOidcGetArgs() {
        this.issuer = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityOidcGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityOidcGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
        }

        public Builder issuer(@Nullable Output<String> issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder issuer(@Nullable String issuer) {
            this.issuer = Output.ofNullable(issuer);
            return this;
        }
        public ClusterIdentityOidcGetArgs build() {
            return new ClusterIdentityOidcGetArgs(issuer);
        }
    }
}
