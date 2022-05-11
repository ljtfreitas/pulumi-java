// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterReverseProxyCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterReverseProxyCertificateArgs Empty = new ClusterReverseProxyCertificateArgs();

    /**
     * The Thumbprint of the Certificate.
     * 
     */
    @Import(name="thumbprint", required=true)
    private Output<String> thumbprint;

    /**
     * @return The Thumbprint of the Certificate.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    /**
     * The Secondary Thumbprint of the Certificate.
     * 
     */
    @Import(name="thumbprintSecondary")
    private @Nullable Output<String> thumbprintSecondary;

    /**
     * @return The Secondary Thumbprint of the Certificate.
     * 
     */
    public Optional<Output<String>> thumbprintSecondary() {
        return Optional.ofNullable(this.thumbprintSecondary);
    }

    /**
     * The X509 Store where the Certificate Exists, such as `My`.
     * 
     */
    @Import(name="x509StoreName", required=true)
    private Output<String> x509StoreName;

    /**
     * @return The X509 Store where the Certificate Exists, such as `My`.
     * 
     */
    public Output<String> x509StoreName() {
        return this.x509StoreName;
    }

    private ClusterReverseProxyCertificateArgs() {}

    private ClusterReverseProxyCertificateArgs(ClusterReverseProxyCertificateArgs $) {
        this.thumbprint = $.thumbprint;
        this.thumbprintSecondary = $.thumbprintSecondary;
        this.x509StoreName = $.x509StoreName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterReverseProxyCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterReverseProxyCertificateArgs $;

        public Builder() {
            $ = new ClusterReverseProxyCertificateArgs();
        }

        public Builder(ClusterReverseProxyCertificateArgs defaults) {
            $ = new ClusterReverseProxyCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param thumbprint The Thumbprint of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The Thumbprint of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param thumbprintSecondary The Secondary Thumbprint of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintSecondary(@Nullable Output<String> thumbprintSecondary) {
            $.thumbprintSecondary = thumbprintSecondary;
            return this;
        }

        /**
         * @param thumbprintSecondary The Secondary Thumbprint of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintSecondary(String thumbprintSecondary) {
            return thumbprintSecondary(Output.of(thumbprintSecondary));
        }

        /**
         * @param x509StoreName The X509 Store where the Certificate Exists, such as `My`.
         * 
         * @return builder
         * 
         */
        public Builder x509StoreName(Output<String> x509StoreName) {
            $.x509StoreName = x509StoreName;
            return this;
        }

        /**
         * @param x509StoreName The X509 Store where the Certificate Exists, such as `My`.
         * 
         * @return builder
         * 
         */
        public Builder x509StoreName(String x509StoreName) {
            return x509StoreName(Output.of(x509StoreName));
        }

        public ClusterReverseProxyCertificateArgs build() {
            $.thumbprint = Objects.requireNonNull($.thumbprint, "expected parameter 'thumbprint' to be non-null");
            $.x509StoreName = Objects.requireNonNull($.x509StoreName, "expected parameter 'x509StoreName' to be non-null");
            return $;
        }
    }

}
