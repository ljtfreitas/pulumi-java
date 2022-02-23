// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.TransitGatewayTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransitGatewayResult {
    private final @Nullable String associationDefaultRouteTableId;
    private final @Nullable String autoAcceptSharedAttachments;
    private final @Nullable String defaultRouteTableAssociation;
    private final @Nullable String defaultRouteTablePropagation;
    private final @Nullable String description;
    private final @Nullable String dnsSupport;
    private final @Nullable String id;
    private final @Nullable String propagationDefaultRouteTableId;
    private final @Nullable List<TransitGatewayTag> tags;
    private final @Nullable List<String> transitGatewayCidrBlocks;
    private final @Nullable String vpnEcmpSupport;

    @OutputCustomType.Constructor({"associationDefaultRouteTableId","autoAcceptSharedAttachments","defaultRouteTableAssociation","defaultRouteTablePropagation","description","dnsSupport","id","propagationDefaultRouteTableId","tags","transitGatewayCidrBlocks","vpnEcmpSupport"})
    private GetTransitGatewayResult(
        @Nullable String associationDefaultRouteTableId,
        @Nullable String autoAcceptSharedAttachments,
        @Nullable String defaultRouteTableAssociation,
        @Nullable String defaultRouteTablePropagation,
        @Nullable String description,
        @Nullable String dnsSupport,
        @Nullable String id,
        @Nullable String propagationDefaultRouteTableId,
        @Nullable List<TransitGatewayTag> tags,
        @Nullable List<String> transitGatewayCidrBlocks,
        @Nullable String vpnEcmpSupport) {
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        this.description = description;
        this.dnsSupport = dnsSupport;
        this.id = id;
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
        this.tags = tags;
        this.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    public Optional<String> getAssociationDefaultRouteTableId() {
        return Optional.ofNullable(this.associationDefaultRouteTableId);
    }
    public Optional<String> getAutoAcceptSharedAttachments() {
        return Optional.ofNullable(this.autoAcceptSharedAttachments);
    }
    public Optional<String> getDefaultRouteTableAssociation() {
        return Optional.ofNullable(this.defaultRouteTableAssociation);
    }
    public Optional<String> getDefaultRouteTablePropagation() {
        return Optional.ofNullable(this.defaultRouteTablePropagation);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDnsSupport() {
        return Optional.ofNullable(this.dnsSupport);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getPropagationDefaultRouteTableId() {
        return Optional.ofNullable(this.propagationDefaultRouteTableId);
    }
    public List<TransitGatewayTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<String> getTransitGatewayCidrBlocks() {
        return this.transitGatewayCidrBlocks == null ? List.of() : this.transitGatewayCidrBlocks;
    }
    public Optional<String> getVpnEcmpSupport() {
        return Optional.ofNullable(this.vpnEcmpSupport);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String associationDefaultRouteTableId;
        private @Nullable String autoAcceptSharedAttachments;
        private @Nullable String defaultRouteTableAssociation;
        private @Nullable String defaultRouteTablePropagation;
        private @Nullable String description;
        private @Nullable String dnsSupport;
        private @Nullable String id;
        private @Nullable String propagationDefaultRouteTableId;
        private @Nullable List<TransitGatewayTag> tags;
        private @Nullable List<String> transitGatewayCidrBlocks;
        private @Nullable String vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.id = defaults.id;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.transitGatewayCidrBlocks = defaults.transitGatewayCidrBlocks;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder setAssociationDefaultRouteTableId(@Nullable String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = associationDefaultRouteTableId;
            return this;
        }

        public Builder setAutoAcceptSharedAttachments(@Nullable String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            return this;
        }

        public Builder setDefaultRouteTableAssociation(@Nullable String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            return this;
        }

        public Builder setDefaultRouteTablePropagation(@Nullable String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPropagationDefaultRouteTableId(@Nullable String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
            return this;
        }

        public Builder setTags(@Nullable List<TransitGatewayTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTransitGatewayCidrBlocks(@Nullable List<String> transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
            return this;
        }

        public Builder setVpnEcmpSupport(@Nullable String vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }
        public GetTransitGatewayResult build() {
            return new GetTransitGatewayResult(associationDefaultRouteTableId, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, id, propagationDefaultRouteTableId, tags, transitGatewayCidrBlocks, vpnEcmpSupport);
        }
    }
}
