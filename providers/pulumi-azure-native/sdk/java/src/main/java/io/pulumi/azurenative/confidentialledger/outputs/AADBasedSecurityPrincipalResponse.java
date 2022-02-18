// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AADBasedSecurityPrincipalResponse {
    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    private final @Nullable String ledgerRoleName;
    /**
     * UUID/GUID based Principal Id of the Security Principal
     * 
     */
    private final @Nullable String principalId;
    /**
     * UUID/GUID based Tenant Id of the Security Principal
     * 
     */
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor({"ledgerRoleName","principalId","tenantId"})
    private AADBasedSecurityPrincipalResponse(
        @Nullable String ledgerRoleName,
        @Nullable String principalId,
        @Nullable String tenantId) {
        this.ledgerRoleName = ledgerRoleName;
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    public Optional<String> getLedgerRoleName() {
        return Optional.ofNullable(this.ledgerRoleName);
    }
    /**
     * UUID/GUID based Principal Id of the Security Principal
     * 
     */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * UUID/GUID based Tenant Id of the Security Principal
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AADBasedSecurityPrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ledgerRoleName;
        private @Nullable String principalId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AADBasedSecurityPrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ledgerRoleName = defaults.ledgerRoleName;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setLedgerRoleName(@Nullable String ledgerRoleName) {
            this.ledgerRoleName = ledgerRoleName;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public AADBasedSecurityPrincipalResponse build() {
            return new AADBasedSecurityPrincipalResponse(ledgerRoleName, principalId, tenantId);
        }
    }
}
