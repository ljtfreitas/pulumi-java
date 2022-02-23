// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.inputs;

import io.pulumi.azurenative.confidentialledger.enums.LedgerRoleName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AAD based security principal with associated Ledger RoleName
 * 
 */
public final class AADBasedSecurityPrincipalArgs extends io.pulumi.resources.ResourceArgs {

    public static final AADBasedSecurityPrincipalArgs Empty = new AADBasedSecurityPrincipalArgs();

    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    @InputImport(name="ledgerRoleName")
        private final @Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName;

    public Input<Either<String,LedgerRoleName>> getLedgerRoleName() {
        return this.ledgerRoleName == null ? Input.empty() : this.ledgerRoleName;
    }

    /**
     * UUID/GUID based Principal Id of the Security Principal
     * 
     */
    @InputImport(name="principalId")
        private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * UUID/GUID based Tenant Id of the Security Principal
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public AADBasedSecurityPrincipalArgs(
        @Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName,
        @Nullable Input<String> principalId,
        @Nullable Input<String> tenantId) {
        this.ledgerRoleName = ledgerRoleName;
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    private AADBasedSecurityPrincipalArgs() {
        this.ledgerRoleName = Input.empty();
        this.principalId = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AADBasedSecurityPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName;
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AADBasedSecurityPrincipalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ledgerRoleName = defaults.ledgerRoleName;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setLedgerRoleName(@Nullable Input<Either<String,LedgerRoleName>> ledgerRoleName) {
            this.ledgerRoleName = ledgerRoleName;
            return this;
        }

        public Builder setLedgerRoleName(@Nullable Either<String,LedgerRoleName> ledgerRoleName) {
            this.ledgerRoleName = Input.ofNullable(ledgerRoleName);
            return this;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }
        public AADBasedSecurityPrincipalArgs build() {
            return new AADBasedSecurityPrincipalArgs(ledgerRoleName, principalId, tenantId);
        }
    }
}
