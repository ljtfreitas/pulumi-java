// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnNatRuleMappingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNatRuleResult {
    /**
     * List of egress VpnSiteLinkConnections.
     * 
     */
    private final List<SubResourceResponse> egressVpnSiteLinkConnections;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The private IP address external mapping for NAT.
     * 
     */
    private final @Nullable List<VpnNatRuleMappingResponse> externalMappings;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * List of ingress VpnSiteLinkConnections.
     * 
     */
    private final List<SubResourceResponse> ingressVpnSiteLinkConnections;
    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    private final @Nullable List<VpnNatRuleMappingResponse> internalMappings;
    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    private final @Nullable String ipConfigurationId;
    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the NAT Rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"egressVpnSiteLinkConnections","etag","externalMappings","id","ingressVpnSiteLinkConnections","internalMappings","ipConfigurationId","mode","name","provisioningState","type"})
    private GetNatRuleResult(
        List<SubResourceResponse> egressVpnSiteLinkConnections,
        String etag,
        @Nullable List<VpnNatRuleMappingResponse> externalMappings,
        @Nullable String id,
        List<SubResourceResponse> ingressVpnSiteLinkConnections,
        @Nullable List<VpnNatRuleMappingResponse> internalMappings,
        @Nullable String ipConfigurationId,
        @Nullable String mode,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.egressVpnSiteLinkConnections = Objects.requireNonNull(egressVpnSiteLinkConnections);
        this.etag = Objects.requireNonNull(etag);
        this.externalMappings = externalMappings;
        this.id = id;
        this.ingressVpnSiteLinkConnections = Objects.requireNonNull(ingressVpnSiteLinkConnections);
        this.internalMappings = internalMappings;
        this.ipConfigurationId = ipConfigurationId;
        this.mode = mode;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of egress VpnSiteLinkConnections.
     * 
     */
    public List<SubResourceResponse> getEgressVpnSiteLinkConnections() {
        return this.egressVpnSiteLinkConnections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The private IP address external mapping for NAT.
     * 
     */
    public List<VpnNatRuleMappingResponse> getExternalMappings() {
        return this.externalMappings == null ? List.of() : this.externalMappings;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * List of ingress VpnSiteLinkConnections.
     * 
     */
    public List<SubResourceResponse> getIngressVpnSiteLinkConnections() {
        return this.ingressVpnSiteLinkConnections;
    }
    /**
     * The private IP address internal mapping for NAT.
     * 
     */
    public List<VpnNatRuleMappingResponse> getInternalMappings() {
        return this.internalMappings == null ? List.of() : this.internalMappings;
    }
    /**
     * The IP Configuration ID this NAT rule applies to.
     * 
     */
    public Optional<String> getIpConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }
    /**
     * The Source NAT direction of a VPN NAT.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the NAT Rule resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SubResourceResponse> egressVpnSiteLinkConnections;
        private String etag;
        private @Nullable List<VpnNatRuleMappingResponse> externalMappings;
        private @Nullable String id;
        private List<SubResourceResponse> ingressVpnSiteLinkConnections;
        private @Nullable List<VpnNatRuleMappingResponse> internalMappings;
        private @Nullable String ipConfigurationId;
        private @Nullable String mode;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressVpnSiteLinkConnections = defaults.egressVpnSiteLinkConnections;
    	      this.etag = defaults.etag;
    	      this.externalMappings = defaults.externalMappings;
    	      this.id = defaults.id;
    	      this.ingressVpnSiteLinkConnections = defaults.ingressVpnSiteLinkConnections;
    	      this.internalMappings = defaults.internalMappings;
    	      this.ipConfigurationId = defaults.ipConfigurationId;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setEgressVpnSiteLinkConnections(List<SubResourceResponse> egressVpnSiteLinkConnections) {
            this.egressVpnSiteLinkConnections = Objects.requireNonNull(egressVpnSiteLinkConnections);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExternalMappings(@Nullable List<VpnNatRuleMappingResponse> externalMappings) {
            this.externalMappings = externalMappings;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIngressVpnSiteLinkConnections(List<SubResourceResponse> ingressVpnSiteLinkConnections) {
            this.ingressVpnSiteLinkConnections = Objects.requireNonNull(ingressVpnSiteLinkConnections);
            return this;
        }

        public Builder setInternalMappings(@Nullable List<VpnNatRuleMappingResponse> internalMappings) {
            this.internalMappings = internalMappings;
            return this;
        }

        public Builder setIpConfigurationId(@Nullable String ipConfigurationId) {
            this.ipConfigurationId = ipConfigurationId;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetNatRuleResult build() {
            return new GetNatRuleResult(egressVpnSiteLinkConnections, etag, externalMappings, id, ingressVpnSiteLinkConnections, internalMappings, ipConfigurationId, mode, name, provisioningState, type);
        }
    }
}
