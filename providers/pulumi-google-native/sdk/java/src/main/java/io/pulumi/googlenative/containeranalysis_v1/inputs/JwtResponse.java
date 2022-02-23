// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class JwtResponse extends io.pulumi.resources.InvokeArgs {

    public static final JwtResponse Empty = new JwtResponse();

    /**
     * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
     * 
     */
    @InputImport(name="compactJwt", required=true)
      private final String compactJwt;

    public String getCompactJwt() {
        return this.compactJwt;
    }

    public JwtResponse(String compactJwt) {
        this.compactJwt = Objects.requireNonNull(compactJwt, "expected parameter 'compactJwt' to be non-null");
    }

    private JwtResponse() {
        this.compactJwt = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compactJwt;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compactJwt = defaults.compactJwt;
        }

        public Builder setCompactJwt(String compactJwt) {
            this.compactJwt = Objects.requireNonNull(compactJwt);
            return this;
        }
        public JwtResponse build() {
            return new JwtResponse(compactJwt);
        }
    }
}
