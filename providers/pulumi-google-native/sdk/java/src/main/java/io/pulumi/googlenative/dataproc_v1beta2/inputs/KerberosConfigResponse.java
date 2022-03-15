// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies Kerberos related configuration.
 * 
 */
public final class KerberosConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final KerberosConfigResponse Empty = new KerberosConfigResponse();

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustAdminServer", required=true)
      private final String crossRealmTrustAdminServer;

    public String getCrossRealmTrustAdminServer() {
        return this.crossRealmTrustAdminServer;
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustKdc", required=true)
      private final String crossRealmTrustKdc;

    public String getCrossRealmTrustKdc() {
        return this.crossRealmTrustKdc;
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    @Import(name="crossRealmTrustRealm", required=true)
      private final String crossRealmTrustRealm;

    public String getCrossRealmTrustRealm() {
        return this.crossRealmTrustRealm;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    @Import(name="crossRealmTrustSharedPasswordUri", required=true)
      private final String crossRealmTrustSharedPasswordUri;

    public String getCrossRealmTrustSharedPasswordUri() {
        return this.crossRealmTrustSharedPasswordUri;
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    @Import(name="enableKerberos", required=true)
      private final Boolean enableKerberos;

    public Boolean getEnableKerberos() {
        return this.enableKerberos;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    @Import(name="kdcDbKeyUri", required=true)
      private final String kdcDbKeyUri;

    public String getKdcDbKeyUri() {
        return this.kdcDbKeyUri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keyPasswordUri", required=true)
      private final String keyPasswordUri;

    public String getKeyPasswordUri() {
        return this.keyPasswordUri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="keystorePasswordUri", required=true)
      private final String keystorePasswordUri;

    public String getKeystorePasswordUri() {
        return this.keystorePasswordUri;
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="keystoreUri", required=true)
      private final String keystoreUri;

    public String getKeystoreUri() {
        return this.keystoreUri;
    }

    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    @Import(name="kmsKeyUri", required=true)
      private final String kmsKeyUri;

    public String getKmsKeyUri() {
        return this.kmsKeyUri;
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    @Import(name="realm", required=true)
      private final String realm;

    public String getRealm() {
        return this.realm;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    @Import(name="rootPrincipalPasswordUri", required=true)
      private final String rootPrincipalPasswordUri;

    public String getRootPrincipalPasswordUri() {
        return this.rootPrincipalPasswordUri;
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    @Import(name="tgtLifetimeHours", required=true)
      private final Integer tgtLifetimeHours;

    public Integer getTgtLifetimeHours() {
        return this.tgtLifetimeHours;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    @Import(name="truststorePasswordUri", required=true)
      private final String truststorePasswordUri;

    public String getTruststorePasswordUri() {
        return this.truststorePasswordUri;
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    @Import(name="truststoreUri", required=true)
      private final String truststoreUri;

    public String getTruststoreUri() {
        return this.truststoreUri;
    }

    public KerberosConfigResponse(
        String crossRealmTrustAdminServer,
        String crossRealmTrustKdc,
        String crossRealmTrustRealm,
        String crossRealmTrustSharedPasswordUri,
        Boolean enableKerberos,
        String kdcDbKeyUri,
        String keyPasswordUri,
        String keystorePasswordUri,
        String keystoreUri,
        String kmsKeyUri,
        String realm,
        String rootPrincipalPasswordUri,
        Integer tgtLifetimeHours,
        String truststorePasswordUri,
        String truststoreUri) {
        this.crossRealmTrustAdminServer = Objects.requireNonNull(crossRealmTrustAdminServer, "expected parameter 'crossRealmTrustAdminServer' to be non-null");
        this.crossRealmTrustKdc = Objects.requireNonNull(crossRealmTrustKdc, "expected parameter 'crossRealmTrustKdc' to be non-null");
        this.crossRealmTrustRealm = Objects.requireNonNull(crossRealmTrustRealm, "expected parameter 'crossRealmTrustRealm' to be non-null");
        this.crossRealmTrustSharedPasswordUri = Objects.requireNonNull(crossRealmTrustSharedPasswordUri, "expected parameter 'crossRealmTrustSharedPasswordUri' to be non-null");
        this.enableKerberos = Objects.requireNonNull(enableKerberos, "expected parameter 'enableKerberos' to be non-null");
        this.kdcDbKeyUri = Objects.requireNonNull(kdcDbKeyUri, "expected parameter 'kdcDbKeyUri' to be non-null");
        this.keyPasswordUri = Objects.requireNonNull(keyPasswordUri, "expected parameter 'keyPasswordUri' to be non-null");
        this.keystorePasswordUri = Objects.requireNonNull(keystorePasswordUri, "expected parameter 'keystorePasswordUri' to be non-null");
        this.keystoreUri = Objects.requireNonNull(keystoreUri, "expected parameter 'keystoreUri' to be non-null");
        this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri, "expected parameter 'kmsKeyUri' to be non-null");
        this.realm = Objects.requireNonNull(realm, "expected parameter 'realm' to be non-null");
        this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri, "expected parameter 'rootPrincipalPasswordUri' to be non-null");
        this.tgtLifetimeHours = Objects.requireNonNull(tgtLifetimeHours, "expected parameter 'tgtLifetimeHours' to be non-null");
        this.truststorePasswordUri = Objects.requireNonNull(truststorePasswordUri, "expected parameter 'truststorePasswordUri' to be non-null");
        this.truststoreUri = Objects.requireNonNull(truststoreUri, "expected parameter 'truststoreUri' to be non-null");
    }

    private KerberosConfigResponse() {
        this.crossRealmTrustAdminServer = null;
        this.crossRealmTrustKdc = null;
        this.crossRealmTrustRealm = null;
        this.crossRealmTrustSharedPasswordUri = null;
        this.enableKerberos = null;
        this.kdcDbKeyUri = null;
        this.keyPasswordUri = null;
        this.keystorePasswordUri = null;
        this.keystoreUri = null;
        this.kmsKeyUri = null;
        this.realm = null;
        this.rootPrincipalPasswordUri = null;
        this.tgtLifetimeHours = null;
        this.truststorePasswordUri = null;
        this.truststoreUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KerberosConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String crossRealmTrustAdminServer;
        private String crossRealmTrustKdc;
        private String crossRealmTrustRealm;
        private String crossRealmTrustSharedPasswordUri;
        private Boolean enableKerberos;
        private String kdcDbKeyUri;
        private String keyPasswordUri;
        private String keystorePasswordUri;
        private String keystoreUri;
        private String kmsKeyUri;
        private String realm;
        private String rootPrincipalPasswordUri;
        private Integer tgtLifetimeHours;
        private String truststorePasswordUri;
        private String truststoreUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KerberosConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPasswordUri = defaults.crossRealmTrustSharedPasswordUri;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKeyUri = defaults.kdcDbKeyUri;
    	      this.keyPasswordUri = defaults.keyPasswordUri;
    	      this.keystorePasswordUri = defaults.keystorePasswordUri;
    	      this.keystoreUri = defaults.keystoreUri;
    	      this.kmsKeyUri = defaults.kmsKeyUri;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPasswordUri = defaults.rootPrincipalPasswordUri;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststorePasswordUri = defaults.truststorePasswordUri;
    	      this.truststoreUri = defaults.truststoreUri;
        }

        public Builder crossRealmTrustAdminServer(String crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = Objects.requireNonNull(crossRealmTrustAdminServer);
            return this;
        }

        public Builder crossRealmTrustKdc(String crossRealmTrustKdc) {
            this.crossRealmTrustKdc = Objects.requireNonNull(crossRealmTrustKdc);
            return this;
        }

        public Builder crossRealmTrustRealm(String crossRealmTrustRealm) {
            this.crossRealmTrustRealm = Objects.requireNonNull(crossRealmTrustRealm);
            return this;
        }

        public Builder crossRealmTrustSharedPasswordUri(String crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = Objects.requireNonNull(crossRealmTrustSharedPasswordUri);
            return this;
        }

        public Builder enableKerberos(Boolean enableKerberos) {
            this.enableKerberos = Objects.requireNonNull(enableKerberos);
            return this;
        }

        public Builder kdcDbKeyUri(String kdcDbKeyUri) {
            this.kdcDbKeyUri = Objects.requireNonNull(kdcDbKeyUri);
            return this;
        }

        public Builder keyPasswordUri(String keyPasswordUri) {
            this.keyPasswordUri = Objects.requireNonNull(keyPasswordUri);
            return this;
        }

        public Builder keystorePasswordUri(String keystorePasswordUri) {
            this.keystorePasswordUri = Objects.requireNonNull(keystorePasswordUri);
            return this;
        }

        public Builder keystoreUri(String keystoreUri) {
            this.keystoreUri = Objects.requireNonNull(keystoreUri);
            return this;
        }

        public Builder kmsKeyUri(String kmsKeyUri) {
            this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri);
            return this;
        }

        public Builder realm(String realm) {
            this.realm = Objects.requireNonNull(realm);
            return this;
        }

        public Builder rootPrincipalPasswordUri(String rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri);
            return this;
        }

        public Builder tgtLifetimeHours(Integer tgtLifetimeHours) {
            this.tgtLifetimeHours = Objects.requireNonNull(tgtLifetimeHours);
            return this;
        }

        public Builder truststorePasswordUri(String truststorePasswordUri) {
            this.truststorePasswordUri = Objects.requireNonNull(truststorePasswordUri);
            return this;
        }

        public Builder truststoreUri(String truststoreUri) {
            this.truststoreUri = Objects.requireNonNull(truststoreUri);
            return this;
        }
        public KerberosConfigResponse build() {
            return new KerberosConfigResponse(crossRealmTrustAdminServer, crossRealmTrustKdc, crossRealmTrustRealm, crossRealmTrustSharedPasswordUri, enableKerberos, kdcDbKeyUri, keyPasswordUri, keystorePasswordUri, keystoreUri, kmsKeyUri, realm, rootPrincipalPasswordUri, tgtLifetimeHours, truststorePasswordUri, truststoreUri);
        }
    }
}
