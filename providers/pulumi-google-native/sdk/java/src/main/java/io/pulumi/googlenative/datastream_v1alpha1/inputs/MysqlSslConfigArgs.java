// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL SSL configuration information.
 * 
 */
public final class MysqlSslConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlSslConfigArgs Empty = new MysqlSslConfigArgs();

    /**
     * Input only. PEM-encoded certificate of the CA that signed the source database server's certificate.
     * 
     */
    @InputImport(name="caCertificate")
      private final @Nullable Input<String> caCertificate;

    public Input<String> getCaCertificate() {
        return this.caCertificate == null ? Input.empty() : this.caCertificate;
    }

    /**
     * Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the 'client_key' and the 'ca_certificate' fields are mandatory.
     * 
     */
    @InputImport(name="clientCertificate")
      private final @Nullable Input<String> clientCertificate;

    public Input<String> getClientCertificate() {
        return this.clientCertificate == null ? Input.empty() : this.clientCertificate;
    }

    /**
     * Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' and the 'ca_certificate' fields are mandatory.
     * 
     */
    @InputImport(name="clientKey")
      private final @Nullable Input<String> clientKey;

    public Input<String> getClientKey() {
        return this.clientKey == null ? Input.empty() : this.clientKey;
    }

    public MysqlSslConfigArgs(
        @Nullable Input<String> caCertificate,
        @Nullable Input<String> clientCertificate,
        @Nullable Input<String> clientKey) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
    }

    private MysqlSslConfigArgs() {
        this.caCertificate = Input.empty();
        this.clientCertificate = Input.empty();
        this.clientKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSslConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caCertificate;
        private @Nullable Input<String> clientCertificate;
        private @Nullable Input<String> clientKey;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSslConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
        }

        public Builder setCaCertificate(@Nullable Input<String> caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }

        public Builder setCaCertificate(@Nullable String caCertificate) {
            this.caCertificate = Input.ofNullable(caCertificate);
            return this;
        }

        public Builder setClientCertificate(@Nullable Input<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        public Builder setClientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Input.ofNullable(clientCertificate);
            return this;
        }

        public Builder setClientKey(@Nullable Input<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        public Builder setClientKey(@Nullable String clientKey) {
            this.clientKey = Input.ofNullable(clientKey);
            return this;
        }
        public MysqlSslConfigArgs build() {
            return new MysqlSslConfigArgs(caCertificate, clientCertificate, clientKey);
        }
    }
}
