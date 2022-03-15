// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AdvancedApiOpsConfigResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1ConnectorsPlatformConfigResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1IntegrationConfigResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1MonetizationConfigResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1AddonsConfigResponse {
    /**
     * Configuration for the Advanced API Ops add-on.
     * 
     */
    private final GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig;
    /**
     * Configuration for the Connectors Platform add-on.
     * 
     */
    private final GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig;
    /**
     * Configuration for the Integration add-on.
     * 
     */
    private final GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig;
    /**
     * Configuration for the Monetization add-on.
     * 
     */
    private final GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig;

    @CustomType.Constructor
    private GoogleCloudApigeeV1AddonsConfigResponse(
        @CustomType.Parameter("advancedApiOpsConfig") GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig,
        @CustomType.Parameter("connectorsPlatformConfig") GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig,
        @CustomType.Parameter("integrationConfig") GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig,
        @CustomType.Parameter("monetizationConfig") GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig) {
        this.advancedApiOpsConfig = advancedApiOpsConfig;
        this.connectorsPlatformConfig = connectorsPlatformConfig;
        this.integrationConfig = integrationConfig;
        this.monetizationConfig = monetizationConfig;
    }

    /**
     * Configuration for the Advanced API Ops add-on.
     * 
    */
    public GoogleCloudApigeeV1AdvancedApiOpsConfigResponse getAdvancedApiOpsConfig() {
        return this.advancedApiOpsConfig;
    }
    /**
     * Configuration for the Connectors Platform add-on.
     * 
    */
    public GoogleCloudApigeeV1ConnectorsPlatformConfigResponse getConnectorsPlatformConfig() {
        return this.connectorsPlatformConfig;
    }
    /**
     * Configuration for the Integration add-on.
     * 
    */
    public GoogleCloudApigeeV1IntegrationConfigResponse getIntegrationConfig() {
        return this.integrationConfig;
    }
    /**
     * Configuration for the Monetization add-on.
     * 
    */
    public GoogleCloudApigeeV1MonetizationConfigResponse getMonetizationConfig() {
        return this.monetizationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AddonsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig;
        private GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig;
        private GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig;
        private GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AddonsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedApiOpsConfig = defaults.advancedApiOpsConfig;
    	      this.connectorsPlatformConfig = defaults.connectorsPlatformConfig;
    	      this.integrationConfig = defaults.integrationConfig;
    	      this.monetizationConfig = defaults.monetizationConfig;
        }

        public Builder advancedApiOpsConfig(GoogleCloudApigeeV1AdvancedApiOpsConfigResponse advancedApiOpsConfig) {
            this.advancedApiOpsConfig = Objects.requireNonNull(advancedApiOpsConfig);
            return this;
        }

        public Builder connectorsPlatformConfig(GoogleCloudApigeeV1ConnectorsPlatformConfigResponse connectorsPlatformConfig) {
            this.connectorsPlatformConfig = Objects.requireNonNull(connectorsPlatformConfig);
            return this;
        }

        public Builder integrationConfig(GoogleCloudApigeeV1IntegrationConfigResponse integrationConfig) {
            this.integrationConfig = Objects.requireNonNull(integrationConfig);
            return this;
        }

        public Builder monetizationConfig(GoogleCloudApigeeV1MonetizationConfigResponse monetizationConfig) {
            this.monetizationConfig = Objects.requireNonNull(monetizationConfig);
            return this;
        }
        public GoogleCloudApigeeV1AddonsConfigResponse build() {
            return new GoogleCloudApigeeV1AddonsConfigResponse(advancedApiOpsConfig, connectorsPlatformConfig, integrationConfig, monetizationConfig);
        }
    }
}
