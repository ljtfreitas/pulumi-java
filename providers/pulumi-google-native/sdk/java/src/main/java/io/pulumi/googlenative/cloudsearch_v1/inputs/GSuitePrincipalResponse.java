// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GSuitePrincipalResponse extends io.pulumi.resources.InvokeArgs {

    public static final GSuitePrincipalResponse Empty = new GSuitePrincipalResponse();

    /**
     * This principal represents all users of the G Suite domain of the customer.
     * 
     */
    @InputImport(name="gsuiteDomain", required=true)
      private final Boolean gsuiteDomain;

    public Boolean getGsuiteDomain() {
        return this.gsuiteDomain;
    }

    /**
     * This principal references a G Suite group account
     * 
     */
    @InputImport(name="gsuiteGroupEmail", required=true)
      private final String gsuiteGroupEmail;

    public String getGsuiteGroupEmail() {
        return this.gsuiteGroupEmail;
    }

    /**
     * This principal references a G Suite user account
     * 
     */
    @InputImport(name="gsuiteUserEmail", required=true)
      private final String gsuiteUserEmail;

    public String getGsuiteUserEmail() {
        return this.gsuiteUserEmail;
    }

    public GSuitePrincipalResponse(
        Boolean gsuiteDomain,
        String gsuiteGroupEmail,
        String gsuiteUserEmail) {
        this.gsuiteDomain = Objects.requireNonNull(gsuiteDomain, "expected parameter 'gsuiteDomain' to be non-null");
        this.gsuiteGroupEmail = Objects.requireNonNull(gsuiteGroupEmail, "expected parameter 'gsuiteGroupEmail' to be non-null");
        this.gsuiteUserEmail = Objects.requireNonNull(gsuiteUserEmail, "expected parameter 'gsuiteUserEmail' to be non-null");
    }

    private GSuitePrincipalResponse() {
        this.gsuiteDomain = null;
        this.gsuiteGroupEmail = null;
        this.gsuiteUserEmail = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GSuitePrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean gsuiteDomain;
        private String gsuiteGroupEmail;
        private String gsuiteUserEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(GSuitePrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gsuiteDomain = defaults.gsuiteDomain;
    	      this.gsuiteGroupEmail = defaults.gsuiteGroupEmail;
    	      this.gsuiteUserEmail = defaults.gsuiteUserEmail;
        }

        public Builder setGsuiteDomain(Boolean gsuiteDomain) {
            this.gsuiteDomain = Objects.requireNonNull(gsuiteDomain);
            return this;
        }

        public Builder setGsuiteGroupEmail(String gsuiteGroupEmail) {
            this.gsuiteGroupEmail = Objects.requireNonNull(gsuiteGroupEmail);
            return this;
        }

        public Builder setGsuiteUserEmail(String gsuiteUserEmail) {
            this.gsuiteUserEmail = Objects.requireNonNull(gsuiteUserEmail);
            return this;
        }
        public GSuitePrincipalResponse build() {
            return new GSuitePrincipalResponse(gsuiteDomain, gsuiteGroupEmail, gsuiteUserEmail);
        }
    }
}
