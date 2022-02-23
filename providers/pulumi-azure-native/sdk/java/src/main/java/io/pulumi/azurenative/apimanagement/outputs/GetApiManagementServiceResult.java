// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.AdditionalLocationResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceIdentityResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceSkuPropertiesResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiVersionConstraintResponse;
import io.pulumi.azurenative.apimanagement.outputs.CertificateConfigurationResponse;
import io.pulumi.azurenative.apimanagement.outputs.HostnameConfigurationResponse;
import io.pulumi.azurenative.apimanagement.outputs.VirtualNetworkConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApiManagementServiceResult {
    /**
     * Additional datacenter locations of the API Management service.
     * 
     */
    private final @Nullable List<AdditionalLocationResponse> additionalLocations;
    /**
     * Control Plane Apis version constraint for the API Management service.
     * 
     */
    private final @Nullable ApiVersionConstraintResponse apiVersionConstraint;
    /**
     * List of Certificates that need to be installed in the API Management service. Max supported certificates that can be installed is 10.
     * 
     */
    private final @Nullable List<CertificateConfigurationResponse> certificates;
    /**
     * Creation UTC date of the API Management service.The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final String createdAtUtc;
    /**
     * Custom properties of the API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168` will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0, 1.1 and 1.2).</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11` can be used to disable just TLS 1.1.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10` can be used to disable TLS 1.0 on an API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11` can be used to disable just TLS 1.1 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10` can be used to disable TLS 1.0 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2` can be used to enable HTTP2 protocol on an API Management service.</br>Not specifying any of these properties on PATCH operation will reset omitted properties' values to their defaults. For all the settings except Http2 the default value is `True` if the service was created on or before April 1st 2018 and `False` otherwise. Http2 setting's default value is `False`.</br></br>You can disable any of next ciphers by using settings `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA. For example, `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`. The default value is `true` for them.  Note: next ciphers can't be disabled since they are required by Azure CloudService internal components: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384
     * 
     */
    private final @Nullable Map<String,String> customProperties;
    /**
     * DEveloper Portal endpoint URL of the API Management service.
     * 
     */
    private final String developerPortalUrl;
    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in master region.
     * 
     */
    private final @Nullable Boolean disableGateway;
    /**
     * Property only meant to be used for Consumption SKU Service. This enforces a client certificate to be presented on each request to the gateway. This also enables the ability to authenticate the certificate in the policy on the gateway.
     * 
     */
    private final @Nullable Boolean enableClientCertificate;
    /**
     * ETag of the resource.
     * 
     */
    private final String etag;
    /**
     * Gateway URL of the API Management service in the Default Region.
     * 
     */
    private final String gatewayRegionalUrl;
    /**
     * Gateway URL of the API Management service.
     * 
     */
    private final String gatewayUrl;
    /**
     * Custom hostname configuration of the API Management service.
     * 
     */
    private final @Nullable List<HostnameConfigurationResponse> hostnameConfigurations;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Managed service identity of the Api Management service.
     * 
     */
    private final @Nullable ApiManagementServiceIdentityResponse identity;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Management API endpoint URL of the API Management service.
     * 
     */
    private final String managementApiUrl;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Email address from which the notification will be sent.
     * 
     */
    private final @Nullable String notificationSenderEmail;
    /**
     * Publisher portal endpoint Url of the API Management service.
     * 
     */
    private final String portalUrl;
    /**
     * Private Static Load Balanced IP addresses of the API Management service in Primary region which is deployed in an Internal Virtual Network. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    private final List<String> privateIPAddresses;
    /**
     * The current provisioning state of the API Management service which can be one of the following: Created/Activating/Succeeded/Updating/Failed/Stopped/Terminating/TerminationFailed/Deleted.
     * 
     */
    private final String provisioningState;
    /**
     * Public Static Load Balanced IP addresses of the API Management service in Primary region. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    private final List<String> publicIPAddresses;
    /**
     * Publisher email.
     * 
     */
    private final String publisherEmail;
    /**
     * Publisher name.
     * 
     */
    private final String publisherName;
    /**
     * Undelete Api Management Service if it was previously soft-deleted. If this flag is specified and set to True all other properties will be ignored.
     * 
     */
    private final @Nullable Boolean restore;
    /**
     * SCM endpoint URL of the API Management service.
     * 
     */
    private final String scmUrl;
    /**
     * SKU properties of the API Management service.
     * 
     */
    private final ApiManagementServiceSkuPropertiesResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The provisioning state of the API Management service, which is targeted by the long running operation started on the service.
     * 
     */
    private final String targetProvisioningState;
    /**
     * Resource type for API Management resource is set to Microsoft.ApiManagement.
     * 
     */
    private final String type;
    /**
     * Virtual network configuration of the API Management service.
     * 
     */
    private final @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
    /**
     * The type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only.
     * 
     */
    private final @Nullable String virtualNetworkType;
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"additionalLocations","apiVersionConstraint","certificates","createdAtUtc","customProperties","developerPortalUrl","disableGateway","enableClientCertificate","etag","gatewayRegionalUrl","gatewayUrl","hostnameConfigurations","id","identity","location","managementApiUrl","name","notificationSenderEmail","portalUrl","privateIPAddresses","provisioningState","publicIPAddresses","publisherEmail","publisherName","restore","scmUrl","sku","tags","targetProvisioningState","type","virtualNetworkConfiguration","virtualNetworkType","zones"})
    private GetApiManagementServiceResult(
        @Nullable List<AdditionalLocationResponse> additionalLocations,
        @Nullable ApiVersionConstraintResponse apiVersionConstraint,
        @Nullable List<CertificateConfigurationResponse> certificates,
        String createdAtUtc,
        @Nullable Map<String,String> customProperties,
        String developerPortalUrl,
        @Nullable Boolean disableGateway,
        @Nullable Boolean enableClientCertificate,
        String etag,
        String gatewayRegionalUrl,
        String gatewayUrl,
        @Nullable List<HostnameConfigurationResponse> hostnameConfigurations,
        String id,
        @Nullable ApiManagementServiceIdentityResponse identity,
        String location,
        String managementApiUrl,
        String name,
        @Nullable String notificationSenderEmail,
        String portalUrl,
        List<String> privateIPAddresses,
        String provisioningState,
        List<String> publicIPAddresses,
        String publisherEmail,
        String publisherName,
        @Nullable Boolean restore,
        String scmUrl,
        ApiManagementServiceSkuPropertiesResponse sku,
        @Nullable Map<String,String> tags,
        String targetProvisioningState,
        String type,
        @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration,
        @Nullable String virtualNetworkType,
        @Nullable List<String> zones) {
        this.additionalLocations = additionalLocations;
        this.apiVersionConstraint = apiVersionConstraint;
        this.certificates = certificates;
        this.createdAtUtc = Objects.requireNonNull(createdAtUtc);
        this.customProperties = customProperties;
        this.developerPortalUrl = Objects.requireNonNull(developerPortalUrl);
        this.disableGateway = disableGateway;
        this.enableClientCertificate = enableClientCertificate;
        this.etag = Objects.requireNonNull(etag);
        this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
        this.gatewayUrl = Objects.requireNonNull(gatewayUrl);
        this.hostnameConfigurations = hostnameConfigurations;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = Objects.requireNonNull(location);
        this.managementApiUrl = Objects.requireNonNull(managementApiUrl);
        this.name = Objects.requireNonNull(name);
        this.notificationSenderEmail = notificationSenderEmail;
        this.portalUrl = Objects.requireNonNull(portalUrl);
        this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
        this.publisherEmail = Objects.requireNonNull(publisherEmail);
        this.publisherName = Objects.requireNonNull(publisherName);
        this.restore = restore;
        this.scmUrl = Objects.requireNonNull(scmUrl);
        this.sku = Objects.requireNonNull(sku);
        this.tags = tags;
        this.targetProvisioningState = Objects.requireNonNull(targetProvisioningState);
        this.type = Objects.requireNonNull(type);
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.virtualNetworkType = virtualNetworkType;
        this.zones = zones;
    }

    /**
     * Additional datacenter locations of the API Management service.
     * 
     */
    public List<AdditionalLocationResponse> getAdditionalLocations() {
        return this.additionalLocations == null ? List.of() : this.additionalLocations;
    }
    /**
     * Control Plane Apis version constraint for the API Management service.
     * 
     */
    public Optional<ApiVersionConstraintResponse> getApiVersionConstraint() {
        return Optional.ofNullable(this.apiVersionConstraint);
    }
    /**
     * List of Certificates that need to be installed in the API Management service. Max supported certificates that can be installed is 10.
     * 
     */
    public List<CertificateConfigurationResponse> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    /**
     * Creation UTC date of the API Management service.The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public String getCreatedAtUtc() {
        return this.createdAtUtc;
    }
    /**
     * Custom properties of the API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168` will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0, 1.1 and 1.2).</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11` can be used to disable just TLS 1.1.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10` can be used to disable TLS 1.0 on an API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11` can be used to disable just TLS 1.1 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10` can be used to disable TLS 1.0 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2` can be used to enable HTTP2 protocol on an API Management service.</br>Not specifying any of these properties on PATCH operation will reset omitted properties' values to their defaults. For all the settings except Http2 the default value is `True` if the service was created on or before April 1st 2018 and `False` otherwise. Http2 setting's default value is `False`.</br></br>You can disable any of next ciphers by using settings `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA. For example, `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`. The default value is `true` for them.  Note: next ciphers can't be disabled since they are required by Azure CloudService internal components: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384
     * 
     */
    public Map<String,String> getCustomProperties() {
        return this.customProperties == null ? Map.of() : this.customProperties;
    }
    /**
     * DEveloper Portal endpoint URL of the API Management service.
     * 
     */
    public String getDeveloperPortalUrl() {
        return this.developerPortalUrl;
    }
    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in master region.
     * 
     */
    public Optional<Boolean> getDisableGateway() {
        return Optional.ofNullable(this.disableGateway);
    }
    /**
     * Property only meant to be used for Consumption SKU Service. This enforces a client certificate to be presented on each request to the gateway. This also enables the ability to authenticate the certificate in the policy on the gateway.
     * 
     */
    public Optional<Boolean> getEnableClientCertificate() {
        return Optional.ofNullable(this.enableClientCertificate);
    }
    /**
     * ETag of the resource.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Gateway URL of the API Management service in the Default Region.
     * 
     */
    public String getGatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }
    /**
     * Gateway URL of the API Management service.
     * 
     */
    public String getGatewayUrl() {
        return this.gatewayUrl;
    }
    /**
     * Custom hostname configuration of the API Management service.
     * 
     */
    public List<HostnameConfigurationResponse> getHostnameConfigurations() {
        return this.hostnameConfigurations == null ? List.of() : this.hostnameConfigurations;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Managed service identity of the Api Management service.
     * 
     */
    public Optional<ApiManagementServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Resource location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Management API endpoint URL of the API Management service.
     * 
     */
    public String getManagementApiUrl() {
        return this.managementApiUrl;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Email address from which the notification will be sent.
     * 
     */
    public Optional<String> getNotificationSenderEmail() {
        return Optional.ofNullable(this.notificationSenderEmail);
    }
    /**
     * Publisher portal endpoint Url of the API Management service.
     * 
     */
    public String getPortalUrl() {
        return this.portalUrl;
    }
    /**
     * Private Static Load Balanced IP addresses of the API Management service in Primary region which is deployed in an Internal Virtual Network. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    public List<String> getPrivateIPAddresses() {
        return this.privateIPAddresses;
    }
    /**
     * The current provisioning state of the API Management service which can be one of the following: Created/Activating/Succeeded/Updating/Failed/Stopped/Terminating/TerminationFailed/Deleted.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Static Load Balanced IP addresses of the API Management service in Primary region. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    public List<String> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    /**
     * Publisher email.
     * 
     */
    public String getPublisherEmail() {
        return this.publisherEmail;
    }
    /**
     * Publisher name.
     * 
     */
    public String getPublisherName() {
        return this.publisherName;
    }
    /**
     * Undelete Api Management Service if it was previously soft-deleted. If this flag is specified and set to True all other properties will be ignored.
     * 
     */
    public Optional<Boolean> getRestore() {
        return Optional.ofNullable(this.restore);
    }
    /**
     * SCM endpoint URL of the API Management service.
     * 
     */
    public String getScmUrl() {
        return this.scmUrl;
    }
    /**
     * SKU properties of the API Management service.
     * 
     */
    public ApiManagementServiceSkuPropertiesResponse getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The provisioning state of the API Management service, which is targeted by the long running operation started on the service.
     * 
     */
    public String getTargetProvisioningState() {
        return this.targetProvisioningState;
    }
    /**
     * Resource type for API Management resource is set to Microsoft.ApiManagement.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Virtual network configuration of the API Management service.
     * 
     */
    public Optional<VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }
    /**
     * The type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only.
     * 
     */
    public Optional<String> getVirtualNetworkType() {
        return Optional.ofNullable(this.virtualNetworkType);
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiManagementServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AdditionalLocationResponse> additionalLocations;
        private @Nullable ApiVersionConstraintResponse apiVersionConstraint;
        private @Nullable List<CertificateConfigurationResponse> certificates;
        private String createdAtUtc;
        private @Nullable Map<String,String> customProperties;
        private String developerPortalUrl;
        private @Nullable Boolean disableGateway;
        private @Nullable Boolean enableClientCertificate;
        private String etag;
        private String gatewayRegionalUrl;
        private String gatewayUrl;
        private @Nullable List<HostnameConfigurationResponse> hostnameConfigurations;
        private String id;
        private @Nullable ApiManagementServiceIdentityResponse identity;
        private String location;
        private String managementApiUrl;
        private String name;
        private @Nullable String notificationSenderEmail;
        private String portalUrl;
        private List<String> privateIPAddresses;
        private String provisioningState;
        private List<String> publicIPAddresses;
        private String publisherEmail;
        private String publisherName;
        private @Nullable Boolean restore;
        private String scmUrl;
        private ApiManagementServiceSkuPropertiesResponse sku;
        private @Nullable Map<String,String> tags;
        private String targetProvisioningState;
        private String type;
        private @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
        private @Nullable String virtualNetworkType;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiManagementServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLocations = defaults.additionalLocations;
    	      this.apiVersionConstraint = defaults.apiVersionConstraint;
    	      this.certificates = defaults.certificates;
    	      this.createdAtUtc = defaults.createdAtUtc;
    	      this.customProperties = defaults.customProperties;
    	      this.developerPortalUrl = defaults.developerPortalUrl;
    	      this.disableGateway = defaults.disableGateway;
    	      this.enableClientCertificate = defaults.enableClientCertificate;
    	      this.etag = defaults.etag;
    	      this.gatewayRegionalUrl = defaults.gatewayRegionalUrl;
    	      this.gatewayUrl = defaults.gatewayUrl;
    	      this.hostnameConfigurations = defaults.hostnameConfigurations;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managementApiUrl = defaults.managementApiUrl;
    	      this.name = defaults.name;
    	      this.notificationSenderEmail = defaults.notificationSenderEmail;
    	      this.portalUrl = defaults.portalUrl;
    	      this.privateIPAddresses = defaults.privateIPAddresses;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddresses = defaults.publicIPAddresses;
    	      this.publisherEmail = defaults.publisherEmail;
    	      this.publisherName = defaults.publisherName;
    	      this.restore = defaults.restore;
    	      this.scmUrl = defaults.scmUrl;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.targetProvisioningState = defaults.targetProvisioningState;
    	      this.type = defaults.type;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.virtualNetworkType = defaults.virtualNetworkType;
    	      this.zones = defaults.zones;
        }

        public Builder setAdditionalLocations(@Nullable List<AdditionalLocationResponse> additionalLocations) {
            this.additionalLocations = additionalLocations;
            return this;
        }

        public Builder setApiVersionConstraint(@Nullable ApiVersionConstraintResponse apiVersionConstraint) {
            this.apiVersionConstraint = apiVersionConstraint;
            return this;
        }

        public Builder setCertificates(@Nullable List<CertificateConfigurationResponse> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setCreatedAtUtc(String createdAtUtc) {
            this.createdAtUtc = Objects.requireNonNull(createdAtUtc);
            return this;
        }

        public Builder setCustomProperties(@Nullable Map<String,String> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        public Builder setDeveloperPortalUrl(String developerPortalUrl) {
            this.developerPortalUrl = Objects.requireNonNull(developerPortalUrl);
            return this;
        }

        public Builder setDisableGateway(@Nullable Boolean disableGateway) {
            this.disableGateway = disableGateway;
            return this;
        }

        public Builder setEnableClientCertificate(@Nullable Boolean enableClientCertificate) {
            this.enableClientCertificate = enableClientCertificate;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setGatewayRegionalUrl(String gatewayRegionalUrl) {
            this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
            return this;
        }

        public Builder setGatewayUrl(String gatewayUrl) {
            this.gatewayUrl = Objects.requireNonNull(gatewayUrl);
            return this;
        }

        public Builder setHostnameConfigurations(@Nullable List<HostnameConfigurationResponse> hostnameConfigurations) {
            this.hostnameConfigurations = hostnameConfigurations;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ApiManagementServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagementApiUrl(String managementApiUrl) {
            this.managementApiUrl = Objects.requireNonNull(managementApiUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationSenderEmail(@Nullable String notificationSenderEmail) {
            this.notificationSenderEmail = notificationSenderEmail;
            return this;
        }

        public Builder setPortalUrl(String portalUrl) {
            this.portalUrl = Objects.requireNonNull(portalUrl);
            return this;
        }

        public Builder setPrivateIPAddresses(List<String> privateIPAddresses) {
            this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddresses(List<String> publicIPAddresses) {
            this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
            return this;
        }

        public Builder setPublisherEmail(String publisherEmail) {
            this.publisherEmail = Objects.requireNonNull(publisherEmail);
            return this;
        }

        public Builder setPublisherName(String publisherName) {
            this.publisherName = Objects.requireNonNull(publisherName);
            return this;
        }

        public Builder setRestore(@Nullable Boolean restore) {
            this.restore = restore;
            return this;
        }

        public Builder setScmUrl(String scmUrl) {
            this.scmUrl = Objects.requireNonNull(scmUrl);
            return this;
        }

        public Builder setSku(ApiManagementServiceSkuPropertiesResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetProvisioningState(String targetProvisioningState) {
            this.targetProvisioningState = Objects.requireNonNull(targetProvisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        public Builder setVirtualNetworkType(@Nullable String virtualNetworkType) {
            this.virtualNetworkType = virtualNetworkType;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetApiManagementServiceResult build() {
            return new GetApiManagementServiceResult(additionalLocations, apiVersionConstraint, certificates, createdAtUtc, customProperties, developerPortalUrl, disableGateway, enableClientCertificate, etag, gatewayRegionalUrl, gatewayUrl, hostnameConfigurations, id, identity, location, managementApiUrl, name, notificationSenderEmail, portalUrl, privateIPAddresses, provisioningState, publicIPAddresses, publisherEmail, publisherName, restore, scmUrl, sku, tags, targetProvisioningState, type, virtualNetworkConfiguration, virtualNetworkType, zones);
        }
    }
}
