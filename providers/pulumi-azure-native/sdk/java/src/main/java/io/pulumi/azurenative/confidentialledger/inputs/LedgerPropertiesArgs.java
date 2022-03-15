// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.inputs;

import io.pulumi.azurenative.confidentialledger.enums.LedgerType;
import io.pulumi.azurenative.confidentialledger.inputs.AADBasedSecurityPrincipalArgs;
import io.pulumi.azurenative.confidentialledger.inputs.CertBasedSecurityPrincipalArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional Confidential Ledger properties.
 * 
 */
public final class LedgerPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LedgerPropertiesArgs Empty = new LedgerPropertiesArgs();

    /**
     * Array of all AAD based Security Principals.
     * 
     */
    @Import(name="aadBasedSecurityPrincipals")
      private final @Nullable Output<List<AADBasedSecurityPrincipalArgs>> aadBasedSecurityPrincipals;

    public Output<List<AADBasedSecurityPrincipalArgs>> getAadBasedSecurityPrincipals() {
        return this.aadBasedSecurityPrincipals == null ? Output.empty() : this.aadBasedSecurityPrincipals;
    }

    /**
     * Array of all cert based Security Principals.
     * 
     */
    @Import(name="certBasedSecurityPrincipals")
      private final @Nullable Output<List<CertBasedSecurityPrincipalArgs>> certBasedSecurityPrincipals;

    public Output<List<CertBasedSecurityPrincipalArgs>> getCertBasedSecurityPrincipals() {
        return this.certBasedSecurityPrincipals == null ? Output.empty() : this.certBasedSecurityPrincipals;
    }

    /**
     * Name of the Blob Storage Account for saving ledger files
     * 
     */
    @Import(name="ledgerStorageAccount")
      private final @Nullable Output<String> ledgerStorageAccount;

    public Output<String> getLedgerStorageAccount() {
        return this.ledgerStorageAccount == null ? Output.empty() : this.ledgerStorageAccount;
    }

    /**
     * Type of Confidential Ledger
     * 
     */
    @Import(name="ledgerType")
      private final @Nullable Output<Either<String,LedgerType>> ledgerType;

    public Output<Either<String,LedgerType>> getLedgerType() {
        return this.ledgerType == null ? Output.empty() : this.ledgerType;
    }

    public LedgerPropertiesArgs(
        @Nullable Output<List<AADBasedSecurityPrincipalArgs>> aadBasedSecurityPrincipals,
        @Nullable Output<List<CertBasedSecurityPrincipalArgs>> certBasedSecurityPrincipals,
        @Nullable Output<String> ledgerStorageAccount,
        @Nullable Output<Either<String,LedgerType>> ledgerType) {
        this.aadBasedSecurityPrincipals = aadBasedSecurityPrincipals;
        this.certBasedSecurityPrincipals = certBasedSecurityPrincipals;
        this.ledgerStorageAccount = ledgerStorageAccount;
        this.ledgerType = ledgerType;
    }

    private LedgerPropertiesArgs() {
        this.aadBasedSecurityPrincipals = Output.empty();
        this.certBasedSecurityPrincipals = Output.empty();
        this.ledgerStorageAccount = Output.empty();
        this.ledgerType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LedgerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AADBasedSecurityPrincipalArgs>> aadBasedSecurityPrincipals;
        private @Nullable Output<List<CertBasedSecurityPrincipalArgs>> certBasedSecurityPrincipals;
        private @Nullable Output<String> ledgerStorageAccount;
        private @Nullable Output<Either<String,LedgerType>> ledgerType;

        public Builder() {
    	      // Empty
        }

        public Builder(LedgerPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadBasedSecurityPrincipals = defaults.aadBasedSecurityPrincipals;
    	      this.certBasedSecurityPrincipals = defaults.certBasedSecurityPrincipals;
    	      this.ledgerStorageAccount = defaults.ledgerStorageAccount;
    	      this.ledgerType = defaults.ledgerType;
        }

        public Builder aadBasedSecurityPrincipals(@Nullable Output<List<AADBasedSecurityPrincipalArgs>> aadBasedSecurityPrincipals) {
            this.aadBasedSecurityPrincipals = aadBasedSecurityPrincipals;
            return this;
        }

        public Builder aadBasedSecurityPrincipals(@Nullable List<AADBasedSecurityPrincipalArgs> aadBasedSecurityPrincipals) {
            this.aadBasedSecurityPrincipals = Output.ofNullable(aadBasedSecurityPrincipals);
            return this;
        }

        public Builder certBasedSecurityPrincipals(@Nullable Output<List<CertBasedSecurityPrincipalArgs>> certBasedSecurityPrincipals) {
            this.certBasedSecurityPrincipals = certBasedSecurityPrincipals;
            return this;
        }

        public Builder certBasedSecurityPrincipals(@Nullable List<CertBasedSecurityPrincipalArgs> certBasedSecurityPrincipals) {
            this.certBasedSecurityPrincipals = Output.ofNullable(certBasedSecurityPrincipals);
            return this;
        }

        public Builder ledgerStorageAccount(@Nullable Output<String> ledgerStorageAccount) {
            this.ledgerStorageAccount = ledgerStorageAccount;
            return this;
        }

        public Builder ledgerStorageAccount(@Nullable String ledgerStorageAccount) {
            this.ledgerStorageAccount = Output.ofNullable(ledgerStorageAccount);
            return this;
        }

        public Builder ledgerType(@Nullable Output<Either<String,LedgerType>> ledgerType) {
            this.ledgerType = ledgerType;
            return this;
        }

        public Builder ledgerType(@Nullable Either<String,LedgerType> ledgerType) {
            this.ledgerType = Output.ofNullable(ledgerType);
            return this;
        }
        public LedgerPropertiesArgs build() {
            return new LedgerPropertiesArgs(aadBasedSecurityPrincipals, certBasedSecurityPrincipals, ledgerStorageAccount, ledgerType);
        }
    }
}
