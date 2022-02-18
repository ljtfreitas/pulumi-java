// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Required validation properties for tokens generated with RSA algorithm.
 * 
 */
public final class RsaTokenKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RsaTokenKeyResponse Empty = new RsaTokenKeyResponse();

    /**
     * RSA algorithm to be used: RS256, RS384 or RS512.
     * 
     */
    @InputImport(name="alg", required=true)
    private final String alg;

    public String getAlg() {
        return this.alg;
    }

    /**
     * RSA public key exponent.
     * 
     */
    @InputImport(name="e", required=true)
    private final String e;

    public String getE() {
        return this.e;
    }

    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    @InputImport(name="kid", required=true)
    private final String kid;

    public String getKid() {
        return this.kid;
    }

    /**
     * RSA public key modulus.
     * 
     */
    @InputImport(name="n", required=true)
    private final String n;

    public String getN() {
        return this.n;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.RsaTokenKey'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public RsaTokenKeyResponse(
        String alg,
        String e,
        String kid,
        String n,
        String type) {
        this.alg = Objects.requireNonNull(alg, "expected parameter 'alg' to be non-null");
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.kid = Objects.requireNonNull(kid, "expected parameter 'kid' to be non-null");
        this.n = Objects.requireNonNull(n, "expected parameter 'n' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RsaTokenKeyResponse() {
        this.alg = null;
        this.e = null;
        this.kid = null;
        this.n = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alg;
        private String e;
        private String kid;
        private String n;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RsaTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.e = defaults.e;
    	      this.kid = defaults.kid;
    	      this.n = defaults.n;
    	      this.type = defaults.type;
        }

        public Builder setAlg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }

        public Builder setE(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }

        public Builder setKid(String kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }

        public Builder setN(String n) {
            this.n = Objects.requireNonNull(n);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RsaTokenKeyResponse build() {
            return new RsaTokenKeyResponse(alg, e, kid, n, type);
        }
    }
}
