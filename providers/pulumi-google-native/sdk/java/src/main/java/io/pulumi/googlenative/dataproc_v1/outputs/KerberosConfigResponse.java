// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KerberosConfigResponse {
    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    private final String crossRealmTrustAdminServer;
    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    private final String crossRealmTrustKdc;
    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    private final String crossRealmTrustRealm;
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    private final String crossRealmTrustSharedPasswordUri;
    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    private final Boolean enableKerberos;
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    private final String kdcDbKeyUri;
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    private final String keyPasswordUri;
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    private final String keystorePasswordUri;
    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private final String keystoreUri;
    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    private final String kmsKeyUri;
    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    private final String realm;
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    private final String rootPrincipalPasswordUri;
    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    private final Integer tgtLifetimeHours;
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    private final String truststorePasswordUri;
    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private final String truststoreUri;

    @CustomType.Constructor
    private KerberosConfigResponse(
        @CustomType.Parameter("crossRealmTrustAdminServer") String crossRealmTrustAdminServer,
        @CustomType.Parameter("crossRealmTrustKdc") String crossRealmTrustKdc,
        @CustomType.Parameter("crossRealmTrustRealm") String crossRealmTrustRealm,
        @CustomType.Parameter("crossRealmTrustSharedPasswordUri") String crossRealmTrustSharedPasswordUri,
        @CustomType.Parameter("enableKerberos") Boolean enableKerberos,
        @CustomType.Parameter("kdcDbKeyUri") String kdcDbKeyUri,
        @CustomType.Parameter("keyPasswordUri") String keyPasswordUri,
        @CustomType.Parameter("keystorePasswordUri") String keystorePasswordUri,
        @CustomType.Parameter("keystoreUri") String keystoreUri,
        @CustomType.Parameter("kmsKeyUri") String kmsKeyUri,
        @CustomType.Parameter("realm") String realm,
        @CustomType.Parameter("rootPrincipalPasswordUri") String rootPrincipalPasswordUri,
        @CustomType.Parameter("tgtLifetimeHours") Integer tgtLifetimeHours,
        @CustomType.Parameter("truststorePasswordUri") String truststorePasswordUri,
        @CustomType.Parameter("truststoreUri") String truststoreUri) {
        this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = crossRealmTrustKdc;
        this.crossRealmTrustRealm = crossRealmTrustRealm;
        this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
        this.enableKerberos = enableKerberos;
        this.kdcDbKeyUri = kdcDbKeyUri;
        this.keyPasswordUri = keyPasswordUri;
        this.keystorePasswordUri = keystorePasswordUri;
        this.keystoreUri = keystoreUri;
        this.kmsKeyUri = kmsKeyUri;
        this.realm = realm;
        this.rootPrincipalPasswordUri = rootPrincipalPasswordUri;
        this.tgtLifetimeHours = tgtLifetimeHours;
        this.truststorePasswordUri = truststorePasswordUri;
        this.truststoreUri = truststoreUri;
    }

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
    */
    public String getCrossRealmTrustAdminServer() {
        return this.crossRealmTrustAdminServer;
    }
    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
    */
    public String getCrossRealmTrustKdc() {
        return this.crossRealmTrustKdc;
    }
    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
    */
    public String getCrossRealmTrustRealm() {
        return this.crossRealmTrustRealm;
    }
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
    */
    public String getCrossRealmTrustSharedPasswordUri() {
        return this.crossRealmTrustSharedPasswordUri;
    }
    /**
     * Optional. Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
    */
    public Boolean getEnableKerberos() {
        return this.enableKerberos;
    }
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
    */
    public String getKdcDbKeyUri() {
        return this.kdcDbKeyUri;
    }
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
    */
    public String getKeyPasswordUri() {
        return this.keyPasswordUri;
    }
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
    */
    public String getKeystorePasswordUri() {
        return this.keystorePasswordUri;
    }
    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
    */
    public String getKeystoreUri() {
        return this.keystoreUri;
    }
    /**
     * Optional. The uri of the KMS key used to encrypt various sensitive files.
     * 
    */
    public String getKmsKeyUri() {
        return this.kmsKeyUri;
    }
    /**
     * Optional. The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
    */
    public String getRealm() {
        return this.realm;
    }
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
    */
    public String getRootPrincipalPasswordUri() {
        return this.rootPrincipalPasswordUri;
    }
    /**
     * Optional. The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
    */
    public Integer getTgtLifetimeHours() {
        return this.tgtLifetimeHours;
    }
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
    */
    public String getTruststorePasswordUri() {
        return this.truststorePasswordUri;
    }
    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
    */
    public String getTruststoreUri() {
        return this.truststoreUri;
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
