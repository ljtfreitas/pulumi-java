// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.ClientCertificateConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication information for accessing the master endpoint. Authentication can be done using HTTP basic auth or using client certificates.
 * 
 */
public final class MasterAuthResponse extends io.pulumi.resources.InvokeArgs {

    public static final MasterAuthResponse Empty = new MasterAuthResponse();

    /**
     * [Output only] Base64-encoded public certificate used by clients to authenticate to the cluster endpoint.
     * 
     */
    @InputImport(name="clientCertificate", required=true)
      private final String clientCertificate;

    public String getClientCertificate() {
        return this.clientCertificate;
    }

    /**
     * Configuration for client certificate authentication on the cluster. For clusters before v1.12, if no configuration is specified, a client certificate is issued.
     * 
     */
    @InputImport(name="clientCertificateConfig", required=true)
      private final ClientCertificateConfigResponse clientCertificateConfig;

    public ClientCertificateConfigResponse getClientCertificateConfig() {
        return this.clientCertificateConfig;
    }

    /**
     * [Output only] Base64-encoded private key used by clients to authenticate to the cluster endpoint.
     * 
     */
    @InputImport(name="clientKey", required=true)
      private final String clientKey;

    public String getClientKey() {
        return this.clientKey;
    }

    @InputImport(name="clusterCaCertificate", required=true)
      private final String clusterCaCertificate;

    public String getClusterCaCertificate() {
        return this.clusterCaCertificate;
    }

    /**
     * The password to use for HTTP basic authentication to the master endpoint. Because the master endpoint is open to the Internet, you should create a strong password. If a password is provided for cluster creation, username must be non-empty. Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * The username to use for HTTP basic authentication to the master endpoint. For clusters v1.6.0 and later, basic authentication can be disabled by leaving username unspecified (or setting it to the empty string). Warning: basic authentication is deprecated, and will be removed in GKE control plane versions 1.19 and newer. For a list of recommended authentication methods, see: https://cloud.google.com/kubernetes-engine/docs/how-to/api-server-authentication
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public MasterAuthResponse(
        String clientCertificate,
        ClientCertificateConfigResponse clientCertificateConfig,
        String clientKey,
        String clusterCaCertificate,
        String password,
        String username) {
        this.clientCertificate = Objects.requireNonNull(clientCertificate, "expected parameter 'clientCertificate' to be non-null");
        this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig, "expected parameter 'clientCertificateConfig' to be non-null");
        this.clientKey = Objects.requireNonNull(clientKey, "expected parameter 'clientKey' to be non-null");
        this.clusterCaCertificate = Objects.requireNonNull(clusterCaCertificate, "expected parameter 'clusterCaCertificate' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MasterAuthResponse() {
        this.clientCertificate = null;
        this.clientCertificateConfig = null;
        this.clientKey = null;
        this.clusterCaCertificate = null;
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientCertificate;
        private ClientCertificateConfigResponse clientCertificateConfig;
        private String clientKey;
        private String clusterCaCertificate;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateConfig = defaults.clientCertificateConfig;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setClientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }

        public Builder setClientCertificateConfig(ClientCertificateConfigResponse clientCertificateConfig) {
            this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig);
            return this;
        }

        public Builder setClientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }

        public Builder setClusterCaCertificate(String clusterCaCertificate) {
            this.clusterCaCertificate = Objects.requireNonNull(clusterCaCertificate);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public MasterAuthResponse build() {
            return new MasterAuthResponse(clientCertificate, clientCertificateConfig, clientKey, clusterCaCertificate, password, username);
        }
    }
}
