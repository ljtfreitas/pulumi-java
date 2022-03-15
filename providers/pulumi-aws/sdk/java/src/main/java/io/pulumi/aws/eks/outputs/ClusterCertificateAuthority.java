// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCertificateAuthority {
    /**
     * Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    private final @Nullable String data;

    @CustomType.Constructor
    private ClusterCertificateAuthority(@CustomType.Parameter("data") @Nullable String data) {
        this.data = data;
    }

    /**
     * Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
    */
    public Optional<String> getData() {
        return Optional.ofNullable(this.data);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCertificateAuthority defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCertificateAuthority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public ClusterCertificateAuthority build() {
            return new ClusterCertificateAuthority(data);
        }
    }
}
