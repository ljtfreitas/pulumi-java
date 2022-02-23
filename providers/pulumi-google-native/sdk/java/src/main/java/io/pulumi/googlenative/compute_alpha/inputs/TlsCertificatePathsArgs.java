// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] The paths to the mounted TLS Certificates and private key. The paths to the mounted TLS Certificates and private key.
 * 
 */
public final class TlsCertificatePathsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TlsCertificatePathsArgs Empty = new TlsCertificatePathsArgs();

    /**
     * The path to the file holding the client or server TLS certificate to use.
     * 
     */
    @InputImport(name="certificatePath")
      private final @Nullable Input<String> certificatePath;

    public Input<String> getCertificatePath() {
        return this.certificatePath == null ? Input.empty() : this.certificatePath;
    }

    /**
     * The path to the file holding the client or server private key.
     * 
     */
    @InputImport(name="privateKeyPath")
      private final @Nullable Input<String> privateKeyPath;

    public Input<String> getPrivateKeyPath() {
        return this.privateKeyPath == null ? Input.empty() : this.privateKeyPath;
    }

    public TlsCertificatePathsArgs(
        @Nullable Input<String> certificatePath,
        @Nullable Input<String> privateKeyPath) {
        this.certificatePath = certificatePath;
        this.privateKeyPath = privateKeyPath;
    }

    private TlsCertificatePathsArgs() {
        this.certificatePath = Input.empty();
        this.privateKeyPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificatePathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificatePath;
        private @Nullable Input<String> privateKeyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificatePathsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePath = defaults.certificatePath;
    	      this.privateKeyPath = defaults.privateKeyPath;
        }

        public Builder setCertificatePath(@Nullable Input<String> certificatePath) {
            this.certificatePath = certificatePath;
            return this;
        }

        public Builder setCertificatePath(@Nullable String certificatePath) {
            this.certificatePath = Input.ofNullable(certificatePath);
            return this;
        }

        public Builder setPrivateKeyPath(@Nullable Input<String> privateKeyPath) {
            this.privateKeyPath = privateKeyPath;
            return this;
        }

        public Builder setPrivateKeyPath(@Nullable String privateKeyPath) {
            this.privateKeyPath = Input.ofNullable(privateKeyPath);
            return this;
        }
        public TlsCertificatePathsArgs build() {
            return new TlsCertificatePathsArgs(certificatePath, privateKeyPath);
        }
    }
}
