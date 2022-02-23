// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * IssuanceModes specifies the allowed ways in which Certificates may be requested from this CertificateAuthority.
 * 
 */
public final class IssuanceModesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IssuanceModesArgs Empty = new IssuanceModesArgs();

    /**
     * When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
     */
    @InputImport(name="allowConfigBasedIssuance", required=true)
      private final Input<Boolean> allowConfigBasedIssuance;

    public Input<Boolean> getAllowConfigBasedIssuance() {
        return this.allowConfigBasedIssuance;
    }

    /**
     * When true, allows callers to create Certificates by specifying a CSR.
     * 
     */
    @InputImport(name="allowCsrBasedIssuance", required=true)
      private final Input<Boolean> allowCsrBasedIssuance;

    public Input<Boolean> getAllowCsrBasedIssuance() {
        return this.allowCsrBasedIssuance;
    }

    public IssuanceModesArgs(
        Input<Boolean> allowConfigBasedIssuance,
        Input<Boolean> allowCsrBasedIssuance) {
        this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance, "expected parameter 'allowConfigBasedIssuance' to be non-null");
        this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance, "expected parameter 'allowCsrBasedIssuance' to be non-null");
    }

    private IssuanceModesArgs() {
        this.allowConfigBasedIssuance = Input.empty();
        this.allowCsrBasedIssuance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuanceModesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> allowConfigBasedIssuance;
        private Input<Boolean> allowCsrBasedIssuance;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuanceModesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigBasedIssuance = defaults.allowConfigBasedIssuance;
    	      this.allowCsrBasedIssuance = defaults.allowCsrBasedIssuance;
        }

        public Builder setAllowConfigBasedIssuance(Input<Boolean> allowConfigBasedIssuance) {
            this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance);
            return this;
        }

        public Builder setAllowConfigBasedIssuance(Boolean allowConfigBasedIssuance) {
            this.allowConfigBasedIssuance = Input.of(Objects.requireNonNull(allowConfigBasedIssuance));
            return this;
        }

        public Builder setAllowCsrBasedIssuance(Input<Boolean> allowCsrBasedIssuance) {
            this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance);
            return this;
        }

        public Builder setAllowCsrBasedIssuance(Boolean allowCsrBasedIssuance) {
            this.allowCsrBasedIssuance = Input.of(Objects.requireNonNull(allowCsrBasedIssuance));
            return this;
        }
        public IssuanceModesArgs build() {
            return new IssuanceModesArgs(allowConfigBasedIssuance, allowCsrBasedIssuance);
        }
    }
}
