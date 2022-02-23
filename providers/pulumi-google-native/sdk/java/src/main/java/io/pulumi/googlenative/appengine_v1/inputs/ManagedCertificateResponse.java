// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A certificate managed by App Engine.
 * 
 */
public final class ManagedCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedCertificateResponse Empty = new ManagedCertificateResponse();

    /**
     * Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.
     * 
     */
    @InputImport(name="lastRenewalTime", required=true)
      private final String lastRenewalTime;

    public String getLastRenewalTime() {
        return this.lastRenewalTime;
    }

    /**
     * Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public ManagedCertificateResponse(
        String lastRenewalTime,
        String status) {
        this.lastRenewalTime = Objects.requireNonNull(lastRenewalTime, "expected parameter 'lastRenewalTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ManagedCertificateResponse() {
        this.lastRenewalTime = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastRenewalTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRenewalTime = defaults.lastRenewalTime;
    	      this.status = defaults.status;
        }

        public Builder setLastRenewalTime(String lastRenewalTime) {
            this.lastRenewalTime = Objects.requireNonNull(lastRenewalTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ManagedCertificateResponse build() {
            return new ManagedCertificateResponse(lastRenewalTime, status);
        }
    }
}
