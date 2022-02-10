// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.P2SConnectionConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnClientConnectionHealthResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetP2sVpnGatewayP2sVpnConnectionHealthResult {
    private final @Nullable List<String> customDnsServers;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable Boolean isRoutingPreferenceInternet;
    private final String location;
    private final String name;
    private final @Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations;
    private final String provisioningState;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable SubResourceResponse virtualHub;
    private final VpnClientConnectionHealthResponse vpnClientConnectionHealth;
    private final @Nullable Integer vpnGatewayScaleUnit;
    private final @Nullable SubResourceResponse vpnServerConfiguration;

    @OutputCustomType.Constructor({"customDnsServers","etag","id","isRoutingPreferenceInternet","location","name","p2SConnectionConfigurations","provisioningState","tags","type","virtualHub","vpnClientConnectionHealth","vpnGatewayScaleUnit","vpnServerConfiguration"})
    private GetP2sVpnGatewayP2sVpnConnectionHealthResult(
        @Nullable List<String> customDnsServers,
        String etag,
        @Nullable String id,
        @Nullable Boolean isRoutingPreferenceInternet,
        String location,
        String name,
        @Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable SubResourceResponse virtualHub,
        VpnClientConnectionHealthResponse vpnClientConnectionHealth,
        @Nullable Integer vpnGatewayScaleUnit,
        @Nullable SubResourceResponse vpnServerConfiguration) {
        this.customDnsServers = customDnsServers;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.p2SConnectionConfigurations = p2SConnectionConfigurations;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualHub = virtualHub;
        this.vpnClientConnectionHealth = Objects.requireNonNull(vpnClientConnectionHealth);
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        this.vpnServerConfiguration = vpnServerConfiguration;
    }

    public List<String> getCustomDnsServers() {
        return this.customDnsServers == null ? List.of() : this.customDnsServers;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Boolean> getIsRoutingPreferenceInternet() {
        return Optional.ofNullable(this.isRoutingPreferenceInternet);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public List<P2SConnectionConfigurationResponse> getP2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations == null ? List.of() : this.p2SConnectionConfigurations;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<SubResourceResponse> getVirtualHub() {
        return Optional.ofNullable(this.virtualHub);
    }
    public VpnClientConnectionHealthResponse getVpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }
    public Optional<Integer> getVpnGatewayScaleUnit() {
        return Optional.ofNullable(this.vpnGatewayScaleUnit);
    }
    public Optional<SubResourceResponse> getVpnServerConfiguration() {
        return Optional.ofNullable(this.vpnServerConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetP2sVpnGatewayP2sVpnConnectionHealthResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customDnsServers;
        private String etag;
        private @Nullable String id;
        private @Nullable Boolean isRoutingPreferenceInternet;
        private String location;
        private String name;
        private @Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable SubResourceResponse virtualHub;
        private VpnClientConnectionHealthResponse vpnClientConnectionHealth;
        private @Nullable Integer vpnGatewayScaleUnit;
        private @Nullable SubResourceResponse vpnServerConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetP2sVpnGatewayP2sVpnConnectionHealthResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsServers = defaults.customDnsServers;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isRoutingPreferenceInternet = defaults.isRoutingPreferenceInternet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.p2SConnectionConfigurations = defaults.p2SConnectionConfigurations;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualHub = defaults.virtualHub;
    	      this.vpnClientConnectionHealth = defaults.vpnClientConnectionHealth;
    	      this.vpnGatewayScaleUnit = defaults.vpnGatewayScaleUnit;
    	      this.vpnServerConfiguration = defaults.vpnServerConfiguration;
        }

        public Builder setCustomDnsServers(@Nullable List<String> customDnsServers) {
            this.customDnsServers = customDnsServers;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIsRoutingPreferenceInternet(@Nullable Boolean isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setP2SConnectionConfigurations(@Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations) {
            this.p2SConnectionConfigurations = p2SConnectionConfigurations;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualHub(@Nullable SubResourceResponse virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public Builder setVpnClientConnectionHealth(VpnClientConnectionHealthResponse vpnClientConnectionHealth) {
            this.vpnClientConnectionHealth = Objects.requireNonNull(vpnClientConnectionHealth);
            return this;
        }

        public Builder setVpnGatewayScaleUnit(@Nullable Integer vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
            return this;
        }

        public Builder setVpnServerConfiguration(@Nullable SubResourceResponse vpnServerConfiguration) {
            this.vpnServerConfiguration = vpnServerConfiguration;
            return this;
        }

        public GetP2sVpnGatewayP2sVpnConnectionHealthResult build() {
            return new GetP2sVpnGatewayP2sVpnConnectionHealthResult(customDnsServers, etag, id, isRoutingPreferenceInternet, location, name, p2SConnectionConfigurations, provisioningState, tags, type, virtualHub, vpnClientConnectionHealth, vpnGatewayScaleUnit, vpnServerConfiguration);
        }
    }
}