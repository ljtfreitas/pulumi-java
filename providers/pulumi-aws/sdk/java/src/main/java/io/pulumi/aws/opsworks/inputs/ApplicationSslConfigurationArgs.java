// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationSslConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationSslConfigurationArgs Empty = new ApplicationSslConfigurationArgs();

    /**
     * The contents of the certificate's domain.crt file.
     * 
     */
    @Import(name="certificate", required=true)
      private final Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate;
    }

    /**
     * Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    @Import(name="chain")
      private final @Nullable Output<String> chain;

    public Output<String> getChain() {
        return this.chain == null ? Output.empty() : this.chain;
    }

    /**
     * The private key; the contents of the certificate's domain.key file.
     * 
     */
    @Import(name="privateKey", required=true)
      private final Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey;
    }

    public ApplicationSslConfigurationArgs(
        Output<String> certificate,
        @Nullable Output<String> chain,
        Output<String> privateKey) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.chain = chain;
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private ApplicationSslConfigurationArgs() {
        this.certificate = Output.empty();
        this.chain = Output.empty();
        this.privateKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSslConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificate;
        private @Nullable Output<String> chain;
        private Output<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSslConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.chain = defaults.chain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder certificate(Output<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder certificate(String certificate) {
            this.certificate = Output.of(Objects.requireNonNull(certificate));
            return this;
        }

        public Builder chain(@Nullable Output<String> chain) {
            this.chain = chain;
            return this;
        }

        public Builder chain(@Nullable String chain) {
            this.chain = Output.ofNullable(chain);
            return this;
        }

        public Builder privateKey(Output<String> privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder privateKey(String privateKey) {
            this.privateKey = Output.of(Objects.requireNonNull(privateKey));
            return this;
        }
        public ApplicationSslConfigurationArgs build() {
            return new ApplicationSslConfigurationArgs(certificate, chain, privateKey);
        }
    }
}
