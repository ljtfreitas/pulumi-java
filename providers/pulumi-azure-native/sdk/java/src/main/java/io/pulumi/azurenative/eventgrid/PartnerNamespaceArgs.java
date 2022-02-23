// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.enums.PublicNetworkAccess;
import io.pulumi.azurenative.eventgrid.inputs.InboundIpRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartnerNamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartnerNamespaceArgs Empty = new PartnerNamespaceArgs();

    /**
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to the partner namespace.
     * 
     */
    @InputImport(name="disableLocalAuth")
        private final @Nullable Input<Boolean> disableLocalAuth;

    public Input<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Input.empty() : this.disableLocalAuth;
    }

    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    @InputImport(name="inboundIpRules")
        private final @Nullable Input<List<InboundIpRuleArgs>> inboundIpRules;

    public Input<List<InboundIpRuleArgs>> getInboundIpRules() {
        return this.inboundIpRules == null ? Input.empty() : this.inboundIpRules;
    }

    /**
     * Location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @InputImport(name="partnerNamespaceName")
        private final @Nullable Input<String> partnerNamespaceName;

    public Input<String> getPartnerNamespaceName() {
        return this.partnerNamespaceName == null ? Input.empty() : this.partnerNamespaceName;
    }

    /**
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     */
    @InputImport(name="partnerRegistrationFullyQualifiedId")
        private final @Nullable Input<String> partnerRegistrationFullyQualifiedId;

    public Input<String> getPartnerRegistrationFullyQualifiedId() {
        return this.partnerRegistrationFullyQualifiedId == null ? Input.empty() : this.partnerRegistrationFullyQualifiedId;
    }

    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules" />
     * 
     */
    @InputImport(name="publicNetworkAccess")
        private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PartnerNamespaceArgs(
        @Nullable Input<Boolean> disableLocalAuth,
        @Nullable Input<List<InboundIpRuleArgs>> inboundIpRules,
        @Nullable Input<String> location,
        @Nullable Input<String> partnerNamespaceName,
        @Nullable Input<String> partnerRegistrationFullyQualifiedId,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.disableLocalAuth = disableLocalAuth == null ? Input.ofNullable(false) : disableLocalAuth;
        this.inboundIpRules = inboundIpRules;
        this.location = location;
        this.partnerNamespaceName = partnerNamespaceName;
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        this.publicNetworkAccess = publicNetworkAccess == null ? Input.ofLeft("Enabled") : publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private PartnerNamespaceArgs() {
        this.disableLocalAuth = Input.empty();
        this.inboundIpRules = Input.empty();
        this.location = Input.empty();
        this.partnerNamespaceName = Input.empty();
        this.partnerRegistrationFullyQualifiedId = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableLocalAuth;
        private @Nullable Input<List<InboundIpRuleArgs>> inboundIpRules;
        private @Nullable Input<String> location;
        private @Nullable Input<String> partnerNamespaceName;
        private @Nullable Input<String> partnerRegistrationFullyQualifiedId;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.inboundIpRules = defaults.inboundIpRules;
    	      this.location = defaults.location;
    	      this.partnerNamespaceName = defaults.partnerNamespaceName;
    	      this.partnerRegistrationFullyQualifiedId = defaults.partnerRegistrationFullyQualifiedId;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDisableLocalAuth(@Nullable Input<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Input.ofNullable(disableLocalAuth);
            return this;
        }

        public Builder setInboundIpRules(@Nullable Input<List<InboundIpRuleArgs>> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
            return this;
        }

        public Builder setInboundIpRules(@Nullable List<InboundIpRuleArgs> inboundIpRules) {
            this.inboundIpRules = Input.ofNullable(inboundIpRules);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPartnerNamespaceName(@Nullable Input<String> partnerNamespaceName) {
            this.partnerNamespaceName = partnerNamespaceName;
            return this;
        }

        public Builder setPartnerNamespaceName(@Nullable String partnerNamespaceName) {
            this.partnerNamespaceName = Input.ofNullable(partnerNamespaceName);
            return this;
        }

        public Builder setPartnerRegistrationFullyQualifiedId(@Nullable Input<String> partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
            return this;
        }

        public Builder setPartnerRegistrationFullyQualifiedId(@Nullable String partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = Input.ofNullable(partnerRegistrationFullyQualifiedId);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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
        public PartnerNamespaceArgs build() {
            return new PartnerNamespaceArgs(disableLocalAuth, inboundIpRules, location, partnerNamespaceName, partnerRegistrationFullyQualifiedId, publicNetworkAccess, resourceGroupName, tags);
        }
    }
}
