// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.enums.PublicNetworkAccess;
import io.pulumi.azurenative.eventgrid.inputs.InboundIpRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="disableLocalAuth")
      private final @Nullable Output<Boolean> disableLocalAuth;

    public Output<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Output.empty() : this.disableLocalAuth;
    }

    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    @Import(name="inboundIpRules")
      private final @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;

    public Output<List<InboundIpRuleArgs>> getInboundIpRules() {
        return this.inboundIpRules == null ? Output.empty() : this.inboundIpRules;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @Import(name="partnerNamespaceName")
      private final @Nullable Output<String> partnerNamespaceName;

    public Output<String> getPartnerNamespaceName() {
        return this.partnerNamespaceName == null ? Output.empty() : this.partnerNamespaceName;
    }

    /**
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     */
    @Import(name="partnerRegistrationFullyQualifiedId")
      private final @Nullable Output<String> partnerRegistrationFullyQualifiedId;

    public Output<String> getPartnerRegistrationFullyQualifiedId() {
        return this.partnerRegistrationFullyQualifiedId == null ? Output.empty() : this.partnerRegistrationFullyQualifiedId;
    }

    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules" />
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PartnerNamespaceArgs(
        @Nullable Output<Boolean> disableLocalAuth,
        @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules,
        @Nullable Output<String> location,
        @Nullable Output<String> partnerNamespaceName,
        @Nullable Output<String> partnerRegistrationFullyQualifiedId,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.disableLocalAuth = disableLocalAuth == null ? Output.ofNullable(false) : disableLocalAuth;
        this.inboundIpRules = inboundIpRules;
        this.location = location;
        this.partnerNamespaceName = partnerNamespaceName;
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        this.publicNetworkAccess = publicNetworkAccess == null ? Output.ofLeft("Enabled") : publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private PartnerNamespaceArgs() {
        this.disableLocalAuth = Output.empty();
        this.inboundIpRules = Output.empty();
        this.location = Output.empty();
        this.partnerNamespaceName = Output.empty();
        this.partnerRegistrationFullyQualifiedId = Output.empty();
        this.publicNetworkAccess = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableLocalAuth;
        private @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;
        private @Nullable Output<String> location;
        private @Nullable Output<String> partnerNamespaceName;
        private @Nullable Output<String> partnerRegistrationFullyQualifiedId;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder disableLocalAuth(@Nullable Output<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Output.ofNullable(disableLocalAuth);
            return this;
        }

        public Builder inboundIpRules(@Nullable Output<List<InboundIpRuleArgs>> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
            return this;
        }

        public Builder inboundIpRules(@Nullable List<InboundIpRuleArgs> inboundIpRules) {
            this.inboundIpRules = Output.ofNullable(inboundIpRules);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder partnerNamespaceName(@Nullable Output<String> partnerNamespaceName) {
            this.partnerNamespaceName = partnerNamespaceName;
            return this;
        }

        public Builder partnerNamespaceName(@Nullable String partnerNamespaceName) {
            this.partnerNamespaceName = Output.ofNullable(partnerNamespaceName);
            return this;
        }

        public Builder partnerRegistrationFullyQualifiedId(@Nullable Output<String> partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
            return this;
        }

        public Builder partnerRegistrationFullyQualifiedId(@Nullable String partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = Output.ofNullable(partnerRegistrationFullyQualifiedId);
            return this;
        }

        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public PartnerNamespaceArgs build() {
            return new PartnerNamespaceArgs(disableLocalAuth, inboundIpRules, location, partnerNamespaceName, partnerRegistrationFullyQualifiedId, publicNetworkAccess, resourceGroupName, tags);
        }
    }
}
