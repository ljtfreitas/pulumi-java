// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertBasedSecurityPrincipalResponse {
    /**
     * Base64 encoded public key of the user cert (.pem or .cer)
     * 
     */
    private final @Nullable String cert;
    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    private final @Nullable String ledgerRoleName;

    @OutputCustomType.Constructor({"cert","ledgerRoleName"})
    private CertBasedSecurityPrincipalResponse(
        @Nullable String cert,
        @Nullable String ledgerRoleName) {
        this.cert = cert;
        this.ledgerRoleName = ledgerRoleName;
    }

    /**
     * Base64 encoded public key of the user cert (.pem or .cer)
     * 
     */
    public Optional<String> getCert() {
        return Optional.ofNullable(this.cert);
    }
    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    public Optional<String> getLedgerRoleName() {
        return Optional.ofNullable(this.ledgerRoleName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertBasedSecurityPrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cert;
        private @Nullable String ledgerRoleName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertBasedSecurityPrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.ledgerRoleName = defaults.ledgerRoleName;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }

        public Builder setLedgerRoleName(@Nullable String ledgerRoleName) {
            this.ledgerRoleName = ledgerRoleName;
            return this;
        }

        public CertBasedSecurityPrincipalResponse build() {
            return new CertBasedSecurityPrincipalResponse(cert, ledgerRoleName);
        }
    }
}
