// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.CmdkeySetupResponse;
import io.pulumi.azurenative.synapse.outputs.ComponentSetupResponse;
import io.pulumi.azurenative.synapse.outputs.EnvironmentVariableSetupResponse;
import io.pulumi.azurenative.synapse.outputs.IntegrationRuntimeCustomSetupScriptPropertiesResponse;
import io.pulumi.azurenative.synapse.outputs.IntegrationRuntimeDataProxyPropertiesResponse;
import io.pulumi.azurenative.synapse.outputs.IntegrationRuntimeSsisCatalogInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeSsisPropertiesResponse {
    /**
     * Catalog information for managed dedicated integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo;
    /**
     * Custom setup script properties for a managed dedicated integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties;
    /**
     * Data proxy properties for a managed dedicated integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties;
    /**
     * The edition for the SSIS Integration Runtime
     * 
     */
    private final @Nullable String edition;
    /**
     * Custom setup without script properties for a SSIS integration runtime.
     * 
     */
    private final @Nullable List<Object> expressCustomSetupProperties;
    /**
     * License type for bringing your own license scenario.
     * 
     */
    private final @Nullable String licenseType;

    @OutputCustomType.Constructor({"catalogInfo","customSetupScriptProperties","dataProxyProperties","edition","expressCustomSetupProperties","licenseType"})
    private IntegrationRuntimeSsisPropertiesResponse(
        @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo,
        @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties,
        @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties,
        @Nullable String edition,
        @Nullable List<Object> expressCustomSetupProperties,
        @Nullable String licenseType) {
        this.catalogInfo = catalogInfo;
        this.customSetupScriptProperties = customSetupScriptProperties;
        this.dataProxyProperties = dataProxyProperties;
        this.edition = edition;
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        this.licenseType = licenseType;
    }

    /**
     * Catalog information for managed dedicated integration runtime.
     * 
     */
    public Optional<IntegrationRuntimeSsisCatalogInfoResponse> getCatalogInfo() {
        return Optional.ofNullable(this.catalogInfo);
    }
    /**
     * Custom setup script properties for a managed dedicated integration runtime.
     * 
     */
    public Optional<IntegrationRuntimeCustomSetupScriptPropertiesResponse> getCustomSetupScriptProperties() {
        return Optional.ofNullable(this.customSetupScriptProperties);
    }
    /**
     * Data proxy properties for a managed dedicated integration runtime.
     * 
     */
    public Optional<IntegrationRuntimeDataProxyPropertiesResponse> getDataProxyProperties() {
        return Optional.ofNullable(this.dataProxyProperties);
    }
    /**
     * The edition for the SSIS Integration Runtime
     * 
     */
    public Optional<String> getEdition() {
        return Optional.ofNullable(this.edition);
    }
    /**
     * Custom setup without script properties for a SSIS integration runtime.
     * 
     */
    public List<Object> getExpressCustomSetupProperties() {
        return this.expressCustomSetupProperties == null ? List.of() : this.expressCustomSetupProperties;
    }
    /**
     * License type for bringing your own license scenario.
     * 
     */
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo;
        private @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties;
        private @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties;
        private @Nullable String edition;
        private @Nullable List<Object> expressCustomSetupProperties;
        private @Nullable String licenseType;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogInfo = defaults.catalogInfo;
    	      this.customSetupScriptProperties = defaults.customSetupScriptProperties;
    	      this.dataProxyProperties = defaults.dataProxyProperties;
    	      this.edition = defaults.edition;
    	      this.expressCustomSetupProperties = defaults.expressCustomSetupProperties;
    	      this.licenseType = defaults.licenseType;
        }

        public Builder setCatalogInfo(@Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo) {
            this.catalogInfo = catalogInfo;
            return this;
        }

        public Builder setCustomSetupScriptProperties(@Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties) {
            this.customSetupScriptProperties = customSetupScriptProperties;
            return this;
        }

        public Builder setDataProxyProperties(@Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties) {
            this.dataProxyProperties = dataProxyProperties;
            return this;
        }

        public Builder setEdition(@Nullable String edition) {
            this.edition = edition;
            return this;
        }

        public Builder setExpressCustomSetupProperties(@Nullable List<Object> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = expressCustomSetupProperties;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public IntegrationRuntimeSsisPropertiesResponse build() {
            return new IntegrationRuntimeSsisPropertiesResponse(catalogInfo, customSetupScriptProperties, dataProxyProperties, edition, expressCustomSetupProperties, licenseType);
        }
    }
}
