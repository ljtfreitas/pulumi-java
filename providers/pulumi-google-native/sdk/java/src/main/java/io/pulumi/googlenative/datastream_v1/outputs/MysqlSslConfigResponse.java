// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MysqlSslConfigResponse {
    /**
     * Input only. PEM-encoded certificate of the CA that signed the source database server's certificate.
     * 
     */
    private final String caCertificate;
    /**
     * Indicates whether the ca_certificate field is set.
     * 
     */
    private final Boolean caCertificateSet;
    /**
     * Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the 'client_key' and the 'ca_certificate' fields are mandatory.
     * 
     */
    private final String clientCertificate;
    /**
     * Indicates whether the client_certificate field is set.
     * 
     */
    private final Boolean clientCertificateSet;
    /**
     * Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' and the 'ca_certificate' fields are mandatory.
     * 
     */
    private final String clientKey;
    /**
     * Indicates whether the client_key field is set.
     * 
     */
    private final Boolean clientKeySet;

    @CustomType.Constructor
    private MysqlSslConfigResponse(
        @CustomType.Parameter("caCertificate") String caCertificate,
        @CustomType.Parameter("caCertificateSet") Boolean caCertificateSet,
        @CustomType.Parameter("clientCertificate") String clientCertificate,
        @CustomType.Parameter("clientCertificateSet") Boolean clientCertificateSet,
        @CustomType.Parameter("clientKey") String clientKey,
        @CustomType.Parameter("clientKeySet") Boolean clientKeySet) {
        this.caCertificate = caCertificate;
        this.caCertificateSet = caCertificateSet;
        this.clientCertificate = clientCertificate;
        this.clientCertificateSet = clientCertificateSet;
        this.clientKey = clientKey;
        this.clientKeySet = clientKeySet;
    }

    /**
     * Input only. PEM-encoded certificate of the CA that signed the source database server's certificate.
     * 
    */
    public String getCaCertificate() {
        return this.caCertificate;
    }
    /**
     * Indicates whether the ca_certificate field is set.
     * 
    */
    public Boolean getCaCertificateSet() {
        return this.caCertificateSet;
    }
    /**
     * Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the 'client_key' and the 'ca_certificate' fields are mandatory.
     * 
    */
    public String getClientCertificate() {
        return this.clientCertificate;
    }
    /**
     * Indicates whether the client_certificate field is set.
     * 
    */
    public Boolean getClientCertificateSet() {
        return this.clientCertificateSet;
    }
    /**
     * Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' and the 'ca_certificate' fields are mandatory.
     * 
    */
    public String getClientKey() {
        return this.clientKey;
    }
    /**
     * Indicates whether the client_key field is set.
     * 
    */
    public Boolean getClientKeySet() {
        return this.clientKeySet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSslConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private Boolean caCertificateSet;
        private String clientCertificate;
        private Boolean clientCertificateSet;
        private String clientKey;
        private Boolean clientKeySet;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSslConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.caCertificateSet = defaults.caCertificateSet;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateSet = defaults.clientCertificateSet;
    	      this.clientKey = defaults.clientKey;
    	      this.clientKeySet = defaults.clientKeySet;
        }

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }

        public Builder caCertificateSet(Boolean caCertificateSet) {
            this.caCertificateSet = Objects.requireNonNull(caCertificateSet);
            return this;
        }

        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder clientCertificateSet(Boolean clientCertificateSet) {
            this.clientCertificateSet = Objects.requireNonNull(clientCertificateSet);
            return this;
        }

        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder clientKeySet(Boolean clientKeySet) {
            this.clientKeySet = Objects.requireNonNull(clientKeySet);
            return this;
        }
        public MysqlSslConfigResponse build() {
            return new MysqlSslConfigResponse(caCertificate, caCertificateSet, clientCertificate, clientCertificateSet, clientKey, clientKeySet);
        }
    }
}
