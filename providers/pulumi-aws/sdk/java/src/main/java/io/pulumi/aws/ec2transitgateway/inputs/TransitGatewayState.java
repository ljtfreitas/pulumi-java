// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayState extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayState Empty = new TransitGatewayState();

    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    @InputImport(name="amazonSideAsn")
    private final @Nullable Input<Integer> amazonSideAsn;

    public Input<Integer> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Input.empty() : this.amazonSideAsn;
    }

    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Identifier of the default association route table
     * 
     */
    @InputImport(name="associationDefaultRouteTableId")
    private final @Nullable Input<String> associationDefaultRouteTableId;

    public Input<String> getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId == null ? Input.empty() : this.associationDefaultRouteTableId;
    }

    /**
     * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @InputImport(name="autoAcceptSharedAttachments")
    private final @Nullable Input<String> autoAcceptSharedAttachments;

    public Input<String> getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments == null ? Input.empty() : this.autoAcceptSharedAttachments;
    }

    /**
     * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @InputImport(name="defaultRouteTableAssociation")
    private final @Nullable Input<String> defaultRouteTableAssociation;

    public Input<String> getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation == null ? Input.empty() : this.defaultRouteTableAssociation;
    }

    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @InputImport(name="defaultRouteTablePropagation")
    private final @Nullable Input<String> defaultRouteTablePropagation;

    public Input<String> getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation == null ? Input.empty() : this.defaultRouteTablePropagation;
    }

    /**
     * Description of the EC2 Transit Gateway.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @InputImport(name="dnsSupport")
    private final @Nullable Input<String> dnsSupport;

    public Input<String> getDnsSupport() {
        return this.dnsSupport == null ? Input.empty() : this.dnsSupport;
    }

    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    @InputImport(name="ownerId")
    private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * Identifier of the default propagation route table
     * 
     */
    @InputImport(name="propagationDefaultRouteTableId")
    private final @Nullable Input<String> propagationDefaultRouteTableId;

    public Input<String> getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId == null ? Input.empty() : this.propagationDefaultRouteTableId;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @InputImport(name="vpnEcmpSupport")
    private final @Nullable Input<String> vpnEcmpSupport;

    public Input<String> getVpnEcmpSupport() {
        return this.vpnEcmpSupport == null ? Input.empty() : this.vpnEcmpSupport;
    }

    public TransitGatewayState(
        @Nullable Input<Integer> amazonSideAsn,
        @Nullable Input<String> arn,
        @Nullable Input<String> associationDefaultRouteTableId,
        @Nullable Input<String> autoAcceptSharedAttachments,
        @Nullable Input<String> defaultRouteTableAssociation,
        @Nullable Input<String> defaultRouteTablePropagation,
        @Nullable Input<String> description,
        @Nullable Input<String> dnsSupport,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> propagationDefaultRouteTableId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> vpnEcmpSupport) {
        this.amazonSideAsn = amazonSideAsn;
        this.arn = arn;
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        this.description = description;
        this.dnsSupport = dnsSupport;
        this.ownerId = ownerId;
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    private TransitGatewayState() {
        this.amazonSideAsn = Input.empty();
        this.arn = Input.empty();
        this.associationDefaultRouteTableId = Input.empty();
        this.autoAcceptSharedAttachments = Input.empty();
        this.defaultRouteTableAssociation = Input.empty();
        this.defaultRouteTablePropagation = Input.empty();
        this.description = Input.empty();
        this.dnsSupport = Input.empty();
        this.ownerId = Input.empty();
        this.propagationDefaultRouteTableId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpnEcmpSupport = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> amazonSideAsn;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> associationDefaultRouteTableId;
        private @Nullable Input<String> autoAcceptSharedAttachments;
        private @Nullable Input<String> defaultRouteTableAssociation;
        private @Nullable Input<String> defaultRouteTablePropagation;
        private @Nullable Input<String> description;
        private @Nullable Input<String> dnsSupport;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> propagationDefaultRouteTableId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.ownerId = defaults.ownerId;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder setAmazonSideAsn(@Nullable Input<Integer> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }

        public Builder setAmazonSideAsn(@Nullable Integer amazonSideAsn) {
            this.amazonSideAsn = Input.ofNullable(amazonSideAsn);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAssociationDefaultRouteTableId(@Nullable Input<String> associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = associationDefaultRouteTableId;
            return this;
        }

        public Builder setAssociationDefaultRouteTableId(@Nullable String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = Input.ofNullable(associationDefaultRouteTableId);
            return this;
        }

        public Builder setAutoAcceptSharedAttachments(@Nullable Input<String> autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            return this;
        }

        public Builder setAutoAcceptSharedAttachments(@Nullable String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Input.ofNullable(autoAcceptSharedAttachments);
            return this;
        }

        public Builder setDefaultRouteTableAssociation(@Nullable Input<String> defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            return this;
        }

        public Builder setDefaultRouteTableAssociation(@Nullable String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Input.ofNullable(defaultRouteTableAssociation);
            return this;
        }

        public Builder setDefaultRouteTablePropagation(@Nullable Input<String> defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            return this;
        }

        public Builder setDefaultRouteTablePropagation(@Nullable String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Input.ofNullable(defaultRouteTablePropagation);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDnsSupport(@Nullable Input<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder setDnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Input.ofNullable(dnsSupport);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setPropagationDefaultRouteTableId(@Nullable Input<String> propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
            return this;
        }

        public Builder setPropagationDefaultRouteTableId(@Nullable String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = Input.ofNullable(propagationDefaultRouteTableId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVpnEcmpSupport(@Nullable Input<String> vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }

        public Builder setVpnEcmpSupport(@Nullable String vpnEcmpSupport) {
            this.vpnEcmpSupport = Input.ofNullable(vpnEcmpSupport);
            return this;
        }
        public TransitGatewayState build() {
            return new TransitGatewayState(amazonSideAsn, arn, associationDefaultRouteTableId, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, ownerId, propagationDefaultRouteTableId, tags, tagsAll, vpnEcmpSupport);
        }
    }
}
