// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.outputs;

import io.pulumi.aws.ec2transitgateway.outputs.GetVpnAttachmentFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpnAttachmentResult {
    private final @Nullable List<GetVpnAttachmentFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Key-value tags for the EC2 Transit Gateway VPN Attachment
     * 
     */
    private final Map<String,String> tags;
    private final @Nullable String transitGatewayId;
    private final @Nullable String vpnConnectionId;

    @CustomType.Constructor
    private GetVpnAttachmentResult(
        @CustomType.Parameter("filters") @Nullable List<GetVpnAttachmentFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("transitGatewayId") @Nullable String transitGatewayId,
        @CustomType.Parameter("vpnConnectionId") @Nullable String vpnConnectionId) {
        this.filters = filters;
        this.id = id;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
        this.vpnConnectionId = vpnConnectionId;
    }

    public List<GetVpnAttachmentFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway VPN Attachment
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    public Optional<String> getTransitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }
    public Optional<String> getVpnConnectionId() {
        return Optional.ofNullable(this.vpnConnectionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetVpnAttachmentFilter> filters;
        private String id;
        private Map<String,String> tags;
        private @Nullable String transitGatewayId;
        private @Nullable String vpnConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpnConnectionId = defaults.vpnConnectionId;
        }

        public Builder filters(@Nullable List<GetVpnAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder vpnConnectionId(@Nullable String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public GetVpnAttachmentResult build() {
            return new GetVpnAttachmentResult(filters, id, tags, transitGatewayId, vpnConnectionId);
        }
    }
}
