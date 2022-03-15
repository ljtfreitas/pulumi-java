// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SecureStringResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
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

    @CustomType.Constructor
    private IntegrationRuntimeSsisCatalogInfoResponse(
        @CustomType.Parameter("catalogAdminPassword") @Nullable SecureStringResponse catalogAdminPassword,
        @CustomType.Parameter("catalogAdminUserName") @Nullable String catalogAdminUserName,
        @CustomType.Parameter("catalogPricingTier") @Nullable String catalogPricingTier,
        @CustomType.Parameter("catalogServerEndpoint") @Nullable String catalogServerEndpoint) {
        this.catalogAdminPassword = catalogAdminPassword;
        this.catalogAdminUserName = catalogAdminUserName;
        this.catalogPricingTier = catalogPricingTier;
        this.catalogServerEndpoint = catalogServerEndpoint;
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

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogAdminPassword = defaults.catalogAdminPassword;
    	      this.catalogAdminUserName = defaults.catalogAdminUserName;
    	      this.catalogPricingTier = defaults.catalogPricingTier;
    	      this.catalogServerEndpoint = defaults.catalogServerEndpoint;
        }

        public Builder catalogAdminPassword(@Nullable SecureStringResponse catalogAdminPassword) {
            this.catalogAdminPassword = catalogAdminPassword;
            return this;
        }

        public Builder catalogAdminUserName(@Nullable String catalogAdminUserName) {
            this.catalogAdminUserName = catalogAdminUserName;
            return this;
        }

        public Builder catalogPricingTier(@Nullable String catalogPricingTier) {
            this.catalogPricingTier = catalogPricingTier;
            return this;
        }

        public Builder catalogServerEndpoint(@Nullable String catalogServerEndpoint) {
            this.catalogServerEndpoint = catalogServerEndpoint;
            return this;
        }
        public IntegrationRuntimeSsisCatalogInfoResponse build() {
            return new IntegrationRuntimeSsisCatalogInfoResponse(catalogAdminPassword, catalogAdminUserName, catalogPricingTier, catalogServerEndpoint);
        }
    }
}
