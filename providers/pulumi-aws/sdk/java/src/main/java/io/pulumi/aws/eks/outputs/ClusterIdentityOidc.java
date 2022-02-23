// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterIdentityOidc {
    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    private final @Nullable String issuer;

    @OutputCustomType.Constructor({"issuer"})
    private ClusterIdentityOidc(@Nullable String issuer) {
        this.issuer = issuer;
    }

    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    public Optional<String> getIssuer() {
        return Optional.ofNullable(this.issuer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
        }

        public Builder setIssuer(@Nullable String issuer) {
            this.issuer = issuer;
            return this;
        }
        public ClusterIdentityOidc build() {
            return new ClusterIdentityOidc(issuer);
        }
    }
}