// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Authority encodes how Google will recognize identities from this Membership. See the workload identity documentation for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
 * 
 */
public final class AuthorityResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthorityResponse Empty = new AuthorityResponse();

    /**
     * An identity provider that reflects the `issuer` in the workload identity pool.
     * 
     */
    @InputImport(name="identityProvider", required=true)
      private final String identityProvider;

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length <2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer, unless `oidc_jwks` is set. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
     * 
     */
    @InputImport(name="issuer", required=true)
      private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
     * 
     */
    @InputImport(name="oidcJwks", required=true)
      private final String oidcJwks;

    public String getOidcJwks() {
        return this.oidcJwks;
    }

    /**
     * The name of the workload identity pool in which `issuer` will be recognized. There is a single Workload Identity Pool per Hub that is shared between all Memberships that belong to that Hub. For a Hub hosted in {PROJECT_ID}, the workload pool format is `{PROJECT_ID}.hub.id.goog`, although this is subject to change in newer versions of this API.
     * 
     */
    @InputImport(name="workloadIdentityPool", required=true)
      private final String workloadIdentityPool;

    public String getWorkloadIdentityPool() {
        return this.workloadIdentityPool;
    }

    public AuthorityResponse(
        String identityProvider,
        String issuer,
        String oidcJwks,
        String workloadIdentityPool) {
        this.identityProvider = Objects.requireNonNull(identityProvider, "expected parameter 'identityProvider' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.oidcJwks = Objects.requireNonNull(oidcJwks, "expected parameter 'oidcJwks' to be non-null");
        this.workloadIdentityPool = Objects.requireNonNull(workloadIdentityPool, "expected parameter 'workloadIdentityPool' to be non-null");
    }

    private AuthorityResponse() {
        this.identityProvider = null;
        this.issuer = null;
        this.oidcJwks = null;
        this.workloadIdentityPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identityProvider;
        private String issuer;
        private String oidcJwks;
        private String workloadIdentityPool;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProvider = defaults.identityProvider;
    	      this.issuer = defaults.issuer;
    	      this.oidcJwks = defaults.oidcJwks;
    	      this.workloadIdentityPool = defaults.workloadIdentityPool;
        }

        public Builder setIdentityProvider(String identityProvider) {
            this.identityProvider = Objects.requireNonNull(identityProvider);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setOidcJwks(String oidcJwks) {
            this.oidcJwks = Objects.requireNonNull(oidcJwks);
            return this;
        }

        public Builder setWorkloadIdentityPool(String workloadIdentityPool) {
            this.workloadIdentityPool = Objects.requireNonNull(workloadIdentityPool);
            return this;
        }
        public AuthorityResponse build() {
            return new AuthorityResponse(identityProvider, issuer, oidcJwks, workloadIdentityPool);
        }
    }
}
