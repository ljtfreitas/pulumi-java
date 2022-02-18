// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeSsisCatalogInfoResponse {
    /**
     * The password of the administrator user account of the catalog database.
     * 
     */
    private final @Nullable SecureStringResponse catalogAdminPassword;
    /**
     * The administrator user name of catalog database.
     * 
     */
    private final @Nullable String catalogAdminUserName;
    /**
     * The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    private final @Nullable String catalogPricingTier;
    /**
     * The catalog database server URL.
     * 
     */
    private final @Nullable String catalogServerEndpoint;
    /**
     * The dual standby pair name of Azure-SSIS Integration Runtimes to support SSISDB failover.
     * 
     */
    private final @Nullable String dualStandbyPairName;

    @OutputCustomType.Constructor({"catalogAdminPassword","catalogAdminUserName","catalogPricingTier","catalogServerEndpoint","dualStandbyPairName"})
    private IntegrationRuntimeSsisCatalogInfoResponse(
        @Nullable SecureStringResponse catalogAdminPassword,
        @Nullable String catalogAdminUserName,
        @Nullable String catalogPricingTier,
        @Nullable String catalogServerEndpoint,
        @Nullable String dualStandbyPairName) {
        this.catalogAdminPassword = catalogAdminPassword;
        this.catalogAdminUserName = catalogAdminUserName;
        this.catalogPricingTier = catalogPricingTier;
        this.catalogServerEndpoint = catalogServerEndpoint;
        this.dualStandbyPairName = dualStandbyPairName;
    }

    /**
     * The password of the administrator user account of the catalog database.
     * 
     */
    public Optional<SecureStringResponse> getCatalogAdminPassword() {
        return Optional.ofNullable(this.catalogAdminPassword);
    }
    /**
     * The administrator user name of catalog database.
     * 
     */
    public Optional<String> getCatalogAdminUserName() {
        return Optional.ofNullable(this.catalogAdminUserName);
    }
    /**
     * The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    public Optional<String> getCatalogPricingTier() {
        return Optional.ofNullable(this.catalogPricingTier);
    }
    /**
     * The catalog database server URL.
     * 
     */
    public Optional<String> getCatalogServerEndpoint() {
        return Optional.ofNullable(this.catalogServerEndpoint);
    }
    /**
     * The dual standby pair name of Azure-SSIS Integration Runtimes to support SSISDB failover.
     * 
     */
    public Optional<String> getDualStandbyPairName() {
        return Optional.ofNullable(this.dualStandbyPairName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecureStringResponse catalogAdminPassword;
        private @Nullable String catalogAdminUserName;
        private @Nullable String catalogPricingTier;
        private @Nullable String catalogServerEndpoint;
        private @Nullable String dualStandbyPairName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogAdminPassword = defaults.catalogAdminPassword;
    	      this.catalogAdminUserName = defaults.catalogAdminUserName;
    	      this.catalogPricingTier = defaults.catalogPricingTier;
    	      this.catalogServerEndpoint = defaults.catalogServerEndpoint;
    	      this.dualStandbyPairName = defaults.dualStandbyPairName;
        }

        public Builder setCatalogAdminPassword(@Nullable SecureStringResponse catalogAdminPassword) {
            this.catalogAdminPassword = catalogAdminPassword;
            return this;
        }

        public Builder setCatalogAdminUserName(@Nullable String catalogAdminUserName) {
            this.catalogAdminUserName = catalogAdminUserName;
            return this;
        }

        public Builder setCatalogPricingTier(@Nullable String catalogPricingTier) {
            this.catalogPricingTier = catalogPricingTier;
            return this;
        }

        public Builder setCatalogServerEndpoint(@Nullable String catalogServerEndpoint) {
            this.catalogServerEndpoint = catalogServerEndpoint;
            return this;
        }

        public Builder setDualStandbyPairName(@Nullable String dualStandbyPairName) {
            this.dualStandbyPairName = dualStandbyPairName;
            return this;
        }

        public IntegrationRuntimeSsisCatalogInfoResponse build() {
            return new IntegrationRuntimeSsisCatalogInfoResponse(catalogAdminPassword, catalogAdminUserName, catalogPricingTier, catalogServerEndpoint, dualStandbyPairName);
        }
    }
}
