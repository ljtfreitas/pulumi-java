// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayAuthenticationCertificateResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayAutoscaleConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayBackendAddressPoolResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayBackendHttpSettingsResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayCustomErrorResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayFrontendIPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayFrontendPortResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayHttpListenerResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayIPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayPrivateEndpointConnectionResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayPrivateLinkConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayProbeResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayRedirectConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayRequestRoutingRuleResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleSetResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewaySkuResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewaySslCertificateResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewaySslPolicyResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewaySslProfileResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayTrustedClientCertificateResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayTrustedRootCertificateResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayUrlPathMapResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayWebApplicationFirewallConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application gateway resource.
 * 
 */
public final class ApplicationGatewayResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayResponse Empty = new ApplicationGatewayResponse();

    /**
     * Authentication certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="authenticationCertificates")
        private final @Nullable List<ApplicationGatewayAuthenticationCertificateResponse> authenticationCertificates;

    public List<ApplicationGatewayAuthenticationCertificateResponse> getAuthenticationCertificates() {
        return this.authenticationCertificates == null ? List.of() : this.authenticationCertificates;
    }

    /**
     * Autoscale Configuration.
     * 
     */
    @InputImport(name="autoscaleConfiguration")
        private final @Nullable ApplicationGatewayAutoscaleConfigurationResponse autoscaleConfiguration;

    public Optional<ApplicationGatewayAutoscaleConfigurationResponse> getAutoscaleConfiguration() {
        return this.autoscaleConfiguration == null ? Optional.empty() : Optional.ofNullable(this.autoscaleConfiguration);
    }

    /**
     * Backend address pool of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="backendAddressPools")
        private final @Nullable List<ApplicationGatewayBackendAddressPoolResponse> backendAddressPools;

    public List<ApplicationGatewayBackendAddressPoolResponse> getBackendAddressPools() {
        return this.backendAddressPools == null ? List.of() : this.backendAddressPools;
    }

    /**
     * Backend http settings of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="backendHttpSettingsCollection")
        private final @Nullable List<ApplicationGatewayBackendHttpSettingsResponse> backendHttpSettingsCollection;

    public List<ApplicationGatewayBackendHttpSettingsResponse> getBackendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection == null ? List.of() : this.backendHttpSettingsCollection;
    }

    /**
     * Custom error configurations of the application gateway resource.
     * 
     */
    @InputImport(name="customErrorConfigurations")
        private final @Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations;

    public List<ApplicationGatewayCustomErrorResponse> getCustomErrorConfigurations() {
        return this.customErrorConfigurations == null ? List.of() : this.customErrorConfigurations;
    }

    /**
     * Whether FIPS is enabled on the application gateway resource.
     * 
     */
    @InputImport(name="enableFips")
        private final @Nullable Boolean enableFips;

    public Optional<Boolean> getEnableFips() {
        return this.enableFips == null ? Optional.empty() : Optional.ofNullable(this.enableFips);
    }

    /**
     * Whether HTTP2 is enabled on the application gateway resource.
     * 
     */
    @InputImport(name="enableHttp2")
        private final @Nullable Boolean enableHttp2;

    public Optional<Boolean> getEnableHttp2() {
        return this.enableHttp2 == null ? Optional.empty() : Optional.ofNullable(this.enableHttp2);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
        private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Reference to the FirewallPolicy resource.
     * 
     */
    @InputImport(name="firewallPolicy")
        private final @Nullable SubResourceResponse firewallPolicy;

    public Optional<SubResourceResponse> getFirewallPolicy() {
        return this.firewallPolicy == null ? Optional.empty() : Optional.ofNullable(this.firewallPolicy);
    }

    /**
     * If true, associates a firewall policy with an application gateway regardless whether the policy differs from the WAF Config.
     * 
     */
    @InputImport(name="forceFirewallPolicyAssociation")
        private final @Nullable Boolean forceFirewallPolicyAssociation;

    public Optional<Boolean> getForceFirewallPolicyAssociation() {
        return this.forceFirewallPolicyAssociation == null ? Optional.empty() : Optional.ofNullable(this.forceFirewallPolicyAssociation);
    }

    /**
     * Frontend IP addresses of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="frontendIPConfigurations")
        private final @Nullable List<ApplicationGatewayFrontendIPConfigurationResponse> frontendIPConfigurations;

    public List<ApplicationGatewayFrontendIPConfigurationResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? List.of() : this.frontendIPConfigurations;
    }

    /**
     * Frontend ports of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="frontendPorts")
        private final @Nullable List<ApplicationGatewayFrontendPortResponse> frontendPorts;

    public List<ApplicationGatewayFrontendPortResponse> getFrontendPorts() {
        return this.frontendPorts == null ? List.of() : this.frontendPorts;
    }

    /**
     * Subnets of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="gatewayIPConfigurations")
        private final @Nullable List<ApplicationGatewayIPConfigurationResponse> gatewayIPConfigurations;

    public List<ApplicationGatewayIPConfigurationResponse> getGatewayIPConfigurations() {
        return this.gatewayIPConfigurations == null ? List.of() : this.gatewayIPConfigurations;
    }

    /**
     * Http listeners of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="httpListeners")
        private final @Nullable List<ApplicationGatewayHttpListenerResponse> httpListeners;

    public List<ApplicationGatewayHttpListenerResponse> getHttpListeners() {
        return this.httpListeners == null ? List.of() : this.httpListeners;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The identity of the application gateway, if configured.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable ManagedServiceIdentityResponse identity;

    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Operational state of the application gateway resource.
     * 
     */
    @InputImport(name="operationalState", required=true)
        private final String operationalState;

    public String getOperationalState() {
        return this.operationalState;
    }

    /**
     * Private Endpoint connections on application gateway.
     * 
     */
    @InputImport(name="privateEndpointConnections", required=true)
        private final List<ApplicationGatewayPrivateEndpointConnectionResponse> privateEndpointConnections;

    public List<ApplicationGatewayPrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * PrivateLink configurations on application gateway.
     * 
     */
    @InputImport(name="privateLinkConfigurations")
        private final @Nullable List<ApplicationGatewayPrivateLinkConfigurationResponse> privateLinkConfigurations;

    public List<ApplicationGatewayPrivateLinkConfigurationResponse> getPrivateLinkConfigurations() {
        return this.privateLinkConfigurations == null ? List.of() : this.privateLinkConfigurations;
    }

    /**
     * Probes of the application gateway resource.
     * 
     */
    @InputImport(name="probes")
        private final @Nullable List<ApplicationGatewayProbeResponse> probes;

    public List<ApplicationGatewayProbeResponse> getProbes() {
        return this.probes == null ? List.of() : this.probes;
    }

    /**
     * The provisioning state of the application gateway resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Redirect configurations of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="redirectConfigurations")
        private final @Nullable List<ApplicationGatewayRedirectConfigurationResponse> redirectConfigurations;

    public List<ApplicationGatewayRedirectConfigurationResponse> getRedirectConfigurations() {
        return this.redirectConfigurations == null ? List.of() : this.redirectConfigurations;
    }

    /**
     * Request routing rules of the application gateway resource.
     * 
     */
    @InputImport(name="requestRoutingRules")
        private final @Nullable List<ApplicationGatewayRequestRoutingRuleResponse> requestRoutingRules;

    public List<ApplicationGatewayRequestRoutingRuleResponse> getRequestRoutingRules() {
        return this.requestRoutingRules == null ? List.of() : this.requestRoutingRules;
    }

    /**
     * The resource GUID property of the application gateway resource.
     * 
     */
    @InputImport(name="resourceGuid", required=true)
        private final String resourceGuid;

    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Rewrite rules for the application gateway resource.
     * 
     */
    @InputImport(name="rewriteRuleSets")
        private final @Nullable List<ApplicationGatewayRewriteRuleSetResponse> rewriteRuleSets;

    public List<ApplicationGatewayRewriteRuleSetResponse> getRewriteRuleSets() {
        return this.rewriteRuleSets == null ? List.of() : this.rewriteRuleSets;
    }

    /**
     * SKU of the application gateway resource.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable ApplicationGatewaySkuResponse sku;

    public Optional<ApplicationGatewaySkuResponse> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * SSL certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="sslCertificates")
        private final @Nullable List<ApplicationGatewaySslCertificateResponse> sslCertificates;

    public List<ApplicationGatewaySslCertificateResponse> getSslCertificates() {
        return this.sslCertificates == null ? List.of() : this.sslCertificates;
    }

    /**
     * SSL policy of the application gateway resource.
     * 
     */
    @InputImport(name="sslPolicy")
        private final @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;

    public Optional<ApplicationGatewaySslPolicyResponse> getSslPolicy() {
        return this.sslPolicy == null ? Optional.empty() : Optional.ofNullable(this.sslPolicy);
    }

    /**
     * SSL profiles of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="sslProfiles")
        private final @Nullable List<ApplicationGatewaySslProfileResponse> sslProfiles;

    public List<ApplicationGatewaySslProfileResponse> getSslProfiles() {
        return this.sslProfiles == null ? List.of() : this.sslProfiles;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Trusted client certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="trustedClientCertificates")
        private final @Nullable List<ApplicationGatewayTrustedClientCertificateResponse> trustedClientCertificates;

    public List<ApplicationGatewayTrustedClientCertificateResponse> getTrustedClientCertificates() {
        return this.trustedClientCertificates == null ? List.of() : this.trustedClientCertificates;
    }

    /**
     * Trusted Root certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="trustedRootCertificates")
        private final @Nullable List<ApplicationGatewayTrustedRootCertificateResponse> trustedRootCertificates;

    public List<ApplicationGatewayTrustedRootCertificateResponse> getTrustedRootCertificates() {
        return this.trustedRootCertificates == null ? List.of() : this.trustedRootCertificates;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * URL path map of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @InputImport(name="urlPathMaps")
        private final @Nullable List<ApplicationGatewayUrlPathMapResponse> urlPathMaps;

    public List<ApplicationGatewayUrlPathMapResponse> getUrlPathMaps() {
        return this.urlPathMaps == null ? List.of() : this.urlPathMaps;
    }

    /**
     * Web application firewall configuration.
     * 
     */
    @InputImport(name="webApplicationFirewallConfiguration")
        private final @Nullable ApplicationGatewayWebApplicationFirewallConfigurationResponse webApplicationFirewallConfiguration;

    public Optional<ApplicationGatewayWebApplicationFirewallConfigurationResponse> getWebApplicationFirewallConfiguration() {
        return this.webApplicationFirewallConfiguration == null ? Optional.empty() : Optional.ofNullable(this.webApplicationFirewallConfiguration);
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @InputImport(name="zones")
        private final @Nullable List<String> zones;

    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public ApplicationGatewayResponse(
        @Nullable List<ApplicationGatewayAuthenticationCertificateResponse> authenticationCertificates,
        @Nullable ApplicationGatewayAutoscaleConfigurationResponse autoscaleConfiguration,
        @Nullable List<ApplicationGatewayBackendAddressPoolResponse> backendAddressPools,
        @Nullable List<ApplicationGatewayBackendHttpSettingsResponse> backendHttpSettingsCollection,
        @Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations,
        @Nullable Boolean enableFips,
        @Nullable Boolean enableHttp2,
        String etag,
        @Nullable SubResourceResponse firewallPolicy,
        @Nullable Boolean forceFirewallPolicyAssociation,
        @Nullable List<ApplicationGatewayFrontendIPConfigurationResponse> frontendIPConfigurations,
        @Nullable List<ApplicationGatewayFrontendPortResponse> frontendPorts,
        @Nullable List<ApplicationGatewayIPConfigurationResponse> gatewayIPConfigurations,
        @Nullable List<ApplicationGatewayHttpListenerResponse> httpListeners,
        @Nullable String id,
        @Nullable ManagedServiceIdentityResponse identity,
        @Nullable String location,
        String name,
        String operationalState,
        List<ApplicationGatewayPrivateEndpointConnectionResponse> privateEndpointConnections,
        @Nullable List<ApplicationGatewayPrivateLinkConfigurationResponse> privateLinkConfigurations,
        @Nullable List<ApplicationGatewayProbeResponse> probes,
        String provisioningState,
        @Nullable List<ApplicationGatewayRedirectConfigurationResponse> redirectConfigurations,
        @Nullable List<ApplicationGatewayRequestRoutingRuleResponse> requestRoutingRules,
        String resourceGuid,
        @Nullable List<ApplicationGatewayRewriteRuleSetResponse> rewriteRuleSets,
        @Nullable ApplicationGatewaySkuResponse sku,
        @Nullable List<ApplicationGatewaySslCertificateResponse> sslCertificates,
        @Nullable ApplicationGatewaySslPolicyResponse sslPolicy,
        @Nullable List<ApplicationGatewaySslProfileResponse> sslProfiles,
        @Nullable Map<String,String> tags,
        @Nullable List<ApplicationGatewayTrustedClientCertificateResponse> trustedClientCertificates,
        @Nullable List<ApplicationGatewayTrustedRootCertificateResponse> trustedRootCertificates,
        String type,
        @Nullable List<ApplicationGatewayUrlPathMapResponse> urlPathMaps,
        @Nullable ApplicationGatewayWebApplicationFirewallConfigurationResponse webApplicationFirewallConfiguration,
        @Nullable List<String> zones) {
        this.authenticationCertificates = authenticationCertificates;
        this.autoscaleConfiguration = autoscaleConfiguration;
        this.backendAddressPools = backendAddressPools;
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        this.customErrorConfigurations = customErrorConfigurations;
        this.enableFips = enableFips;
        this.enableHttp2 = enableHttp2;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.firewallPolicy = firewallPolicy;
        this.forceFirewallPolicyAssociation = forceFirewallPolicyAssociation;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.frontendPorts = frontendPorts;
        this.gatewayIPConfigurations = gatewayIPConfigurations;
        this.httpListeners = httpListeners;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operationalState = Objects.requireNonNull(operationalState, "expected parameter 'operationalState' to be non-null");
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections, "expected parameter 'privateEndpointConnections' to be non-null");
        this.privateLinkConfigurations = privateLinkConfigurations;
        this.probes = probes;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.redirectConfigurations = redirectConfigurations;
        this.requestRoutingRules = requestRoutingRules;
        this.resourceGuid = Objects.requireNonNull(resourceGuid, "expected parameter 'resourceGuid' to be non-null");
        this.rewriteRuleSets = rewriteRuleSets;
        this.sku = sku;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
        this.sslProfiles = sslProfiles;
        this.tags = tags;
        this.trustedClientCertificates = trustedClientCertificates;
        this.trustedRootCertificates = trustedRootCertificates;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.urlPathMaps = urlPathMaps;
        this.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
        this.zones = zones;
    }

    private ApplicationGatewayResponse() {
        this.authenticationCertificates = List.of();
        this.autoscaleConfiguration = null;
        this.backendAddressPools = List.of();
        this.backendHttpSettingsCollection = List.of();
        this.customErrorConfigurations = List.of();
        this.enableFips = null;
        this.enableHttp2 = null;
        this.etag = null;
        this.firewallPolicy = null;
        this.forceFirewallPolicyAssociation = null;
        this.frontendIPConfigurations = List.of();
        this.frontendPorts = List.of();
        this.gatewayIPConfigurations = List.of();
        this.httpListeners = List.of();
        this.id = null;
        this.identity = null;
        this.location = null;
        this.name = null;
        this.operationalState = null;
        this.privateEndpointConnections = List.of();
        this.privateLinkConfigurations = List.of();
        this.probes = List.of();
        this.provisioningState = null;
        this.redirectConfigurations = List.of();
        this.requestRoutingRules = List.of();
        this.resourceGuid = null;
        this.rewriteRuleSets = List.of();
        this.sku = null;
        this.sslCertificates = List.of();
        this.sslPolicy = null;
        this.sslProfiles = List.of();
        this.tags = Map.of();
        this.trustedClientCertificates = List.of();
        this.trustedRootCertificates = List.of();
        this.type = null;
        this.urlPathMaps = List.of();
        this.webApplicationFirewallConfiguration = null;
        this.zones = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayAuthenticationCertificateResponse> authenticationCertificates;
        private @Nullable ApplicationGatewayAutoscaleConfigurationResponse autoscaleConfiguration;
        private @Nullable List<ApplicationGatewayBackendAddressPoolResponse> backendAddressPools;
        private @Nullable List<ApplicationGatewayBackendHttpSettingsResponse> backendHttpSettingsCollection;
        private @Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations;
        private @Nullable Boolean enableFips;
        private @Nullable Boolean enableHttp2;
        private String etag;
        private @Nullable SubResourceResponse firewallPolicy;
        private @Nullable Boolean forceFirewallPolicyAssociation;
        private @Nullable List<ApplicationGatewayFrontendIPConfigurationResponse> frontendIPConfigurations;
        private @Nullable List<ApplicationGatewayFrontendPortResponse> frontendPorts;
        private @Nullable List<ApplicationGatewayIPConfigurationResponse> gatewayIPConfigurations;
        private @Nullable List<ApplicationGatewayHttpListenerResponse> httpListeners;
        private @Nullable String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private String operationalState;
        private List<ApplicationGatewayPrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable List<ApplicationGatewayPrivateLinkConfigurationResponse> privateLinkConfigurations;
        private @Nullable List<ApplicationGatewayProbeResponse> probes;
        private String provisioningState;
        private @Nullable List<ApplicationGatewayRedirectConfigurationResponse> redirectConfigurations;
        private @Nullable List<ApplicationGatewayRequestRoutingRuleResponse> requestRoutingRules;
        private String resourceGuid;
        private @Nullable List<ApplicationGatewayRewriteRuleSetResponse> rewriteRuleSets;
        private @Nullable ApplicationGatewaySkuResponse sku;
        private @Nullable List<ApplicationGatewaySslCertificateResponse> sslCertificates;
        private @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;
        private @Nullable List<ApplicationGatewaySslProfileResponse> sslProfiles;
        private @Nullable Map<String,String> tags;
        private @Nullable List<ApplicationGatewayTrustedClientCertificateResponse> trustedClientCertificates;
        private @Nullable List<ApplicationGatewayTrustedRootCertificateResponse> trustedRootCertificates;
        private String type;
        private @Nullable List<ApplicationGatewayUrlPathMapResponse> urlPathMaps;
        private @Nullable ApplicationGatewayWebApplicationFirewallConfigurationResponse webApplicationFirewallConfiguration;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationCertificates = defaults.authenticationCertificates;
    	      this.autoscaleConfiguration = defaults.autoscaleConfiguration;
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.backendHttpSettingsCollection = defaults.backendHttpSettingsCollection;
    	      this.customErrorConfigurations = defaults.customErrorConfigurations;
    	      this.enableFips = defaults.enableFips;
    	      this.enableHttp2 = defaults.enableHttp2;
    	      this.etag = defaults.etag;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.forceFirewallPolicyAssociation = defaults.forceFirewallPolicyAssociation;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.frontendPorts = defaults.frontendPorts;
    	      this.gatewayIPConfigurations = defaults.gatewayIPConfigurations;
    	      this.httpListeners = defaults.httpListeners;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.operationalState = defaults.operationalState;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.privateLinkConfigurations = defaults.privateLinkConfigurations;
    	      this.probes = defaults.probes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redirectConfigurations = defaults.redirectConfigurations;
    	      this.requestRoutingRules = defaults.requestRoutingRules;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.rewriteRuleSets = defaults.rewriteRuleSets;
    	      this.sku = defaults.sku;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.sslProfiles = defaults.sslProfiles;
    	      this.tags = defaults.tags;
    	      this.trustedClientCertificates = defaults.trustedClientCertificates;
    	      this.trustedRootCertificates = defaults.trustedRootCertificates;
    	      this.type = defaults.type;
    	      this.urlPathMaps = defaults.urlPathMaps;
    	      this.webApplicationFirewallConfiguration = defaults.webApplicationFirewallConfiguration;
    	      this.zones = defaults.zones;
        }

        public Builder setAuthenticationCertificates(@Nullable List<ApplicationGatewayAuthenticationCertificateResponse> authenticationCertificates) {
            this.authenticationCertificates = authenticationCertificates;
            return this;
        }

        public Builder setAutoscaleConfiguration(@Nullable ApplicationGatewayAutoscaleConfigurationResponse autoscaleConfiguration) {
            this.autoscaleConfiguration = autoscaleConfiguration;
            return this;
        }

        public Builder setBackendAddressPools(@Nullable List<ApplicationGatewayBackendAddressPoolResponse> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder setBackendHttpSettingsCollection(@Nullable List<ApplicationGatewayBackendHttpSettingsResponse> backendHttpSettingsCollection) {
            this.backendHttpSettingsCollection = backendHttpSettingsCollection;
            return this;
        }

        public Builder setCustomErrorConfigurations(@Nullable List<ApplicationGatewayCustomErrorResponse> customErrorConfigurations) {
            this.customErrorConfigurations = customErrorConfigurations;
            return this;
        }

        public Builder setEnableFips(@Nullable Boolean enableFips) {
            this.enableFips = enableFips;
            return this;
        }

        public Builder setEnableHttp2(@Nullable Boolean enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFirewallPolicy(@Nullable SubResourceResponse firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder setForceFirewallPolicyAssociation(@Nullable Boolean forceFirewallPolicyAssociation) {
            this.forceFirewallPolicyAssociation = forceFirewallPolicyAssociation;
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable List<ApplicationGatewayFrontendIPConfigurationResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder setFrontendPorts(@Nullable List<ApplicationGatewayFrontendPortResponse> frontendPorts) {
            this.frontendPorts = frontendPorts;
            return this;
        }

        public Builder setGatewayIPConfigurations(@Nullable List<ApplicationGatewayIPConfigurationResponse> gatewayIPConfigurations) {
            this.gatewayIPConfigurations = gatewayIPConfigurations;
            return this;
        }

        public Builder setHttpListeners(@Nullable List<ApplicationGatewayHttpListenerResponse> httpListeners) {
            this.httpListeners = httpListeners;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperationalState(String operationalState) {
            this.operationalState = Objects.requireNonNull(operationalState);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<ApplicationGatewayPrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setPrivateLinkConfigurations(@Nullable List<ApplicationGatewayPrivateLinkConfigurationResponse> privateLinkConfigurations) {
            this.privateLinkConfigurations = privateLinkConfigurations;
            return this;
        }

        public Builder setProbes(@Nullable List<ApplicationGatewayProbeResponse> probes) {
            this.probes = probes;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedirectConfigurations(@Nullable List<ApplicationGatewayRedirectConfigurationResponse> redirectConfigurations) {
            this.redirectConfigurations = redirectConfigurations;
            return this;
        }

        public Builder setRequestRoutingRules(@Nullable List<ApplicationGatewayRequestRoutingRuleResponse> requestRoutingRules) {
            this.requestRoutingRules = requestRoutingRules;
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setRewriteRuleSets(@Nullable List<ApplicationGatewayRewriteRuleSetResponse> rewriteRuleSets) {
            this.rewriteRuleSets = rewriteRuleSets;
            return this;
        }

        public Builder setSku(@Nullable ApplicationGatewaySkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSslCertificates(@Nullable List<ApplicationGatewaySslCertificateResponse> sslCertificates) {
            this.sslCertificates = sslCertificates;
            return this;
        }

        public Builder setSslPolicy(@Nullable ApplicationGatewaySslPolicyResponse sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslProfiles(@Nullable List<ApplicationGatewaySslProfileResponse> sslProfiles) {
            this.sslProfiles = sslProfiles;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrustedClientCertificates(@Nullable List<ApplicationGatewayTrustedClientCertificateResponse> trustedClientCertificates) {
            this.trustedClientCertificates = trustedClientCertificates;
            return this;
        }

        public Builder setTrustedRootCertificates(@Nullable List<ApplicationGatewayTrustedRootCertificateResponse> trustedRootCertificates) {
            this.trustedRootCertificates = trustedRootCertificates;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrlPathMaps(@Nullable List<ApplicationGatewayUrlPathMapResponse> urlPathMaps) {
            this.urlPathMaps = urlPathMaps;
            return this;
        }

        public Builder setWebApplicationFirewallConfiguration(@Nullable ApplicationGatewayWebApplicationFirewallConfigurationResponse webApplicationFirewallConfiguration) {
            this.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public ApplicationGatewayResponse build() {
            return new ApplicationGatewayResponse(authenticationCertificates, autoscaleConfiguration, backendAddressPools, backendHttpSettingsCollection, customErrorConfigurations, enableFips, enableHttp2, etag, firewallPolicy, forceFirewallPolicyAssociation, frontendIPConfigurations, frontendPorts, gatewayIPConfigurations, httpListeners, id, identity, location, name, operationalState, privateEndpointConnections, privateLinkConfigurations, probes, provisioningState, redirectConfigurations, requestRoutingRules, resourceGuid, rewriteRuleSets, sku, sslCertificates, sslPolicy, sslProfiles, tags, trustedClientCertificates, trustedRootCertificates, type, urlPathMaps, webApplicationFirewallConfiguration, zones);
        }
    }
}
