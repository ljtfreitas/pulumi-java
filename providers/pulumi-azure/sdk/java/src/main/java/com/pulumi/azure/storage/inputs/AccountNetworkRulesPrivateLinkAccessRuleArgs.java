// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountNetworkRulesPrivateLinkAccessRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountNetworkRulesPrivateLinkAccessRuleArgs Empty = new AccountNetworkRulesPrivateLinkAccessRuleArgs();

    /**
     * The resource id of the resource access rule to be granted access.
     * 
     */
    @Import(name="endpointResourceId", required=true)
    private Output<String> endpointResourceId;

    /**
     * @return The resource id of the resource access rule to be granted access.
     * 
     */
    public Output<String> endpointResourceId() {
        return this.endpointResourceId;
    }

    /**
     * The tenant id of the resource of the resource access rule to be granted access. Defaults to the current tenant id.
     * 
     */
    @Import(name="endpointTenantId")
    private @Nullable Output<String> endpointTenantId;

    /**
     * @return The tenant id of the resource of the resource access rule to be granted access. Defaults to the current tenant id.
     * 
     */
    public Optional<Output<String>> endpointTenantId() {
        return Optional.ofNullable(this.endpointTenantId);
    }

    private AccountNetworkRulesPrivateLinkAccessRuleArgs() {}

    private AccountNetworkRulesPrivateLinkAccessRuleArgs(AccountNetworkRulesPrivateLinkAccessRuleArgs $) {
        this.endpointResourceId = $.endpointResourceId;
        this.endpointTenantId = $.endpointTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountNetworkRulesPrivateLinkAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountNetworkRulesPrivateLinkAccessRuleArgs $;

        public Builder() {
            $ = new AccountNetworkRulesPrivateLinkAccessRuleArgs();
        }

        public Builder(AccountNetworkRulesPrivateLinkAccessRuleArgs defaults) {
            $ = new AccountNetworkRulesPrivateLinkAccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointResourceId The resource id of the resource access rule to be granted access.
         * 
         * @return builder
         * 
         */
        public Builder endpointResourceId(Output<String> endpointResourceId) {
            $.endpointResourceId = endpointResourceId;
            return this;
        }

        /**
         * @param endpointResourceId The resource id of the resource access rule to be granted access.
         * 
         * @return builder
         * 
         */
        public Builder endpointResourceId(String endpointResourceId) {
            return endpointResourceId(Output.of(endpointResourceId));
        }

        /**
         * @param endpointTenantId The tenant id of the resource of the resource access rule to be granted access. Defaults to the current tenant id.
         * 
         * @return builder
         * 
         */
        public Builder endpointTenantId(@Nullable Output<String> endpointTenantId) {
            $.endpointTenantId = endpointTenantId;
            return this;
        }

        /**
         * @param endpointTenantId The tenant id of the resource of the resource access rule to be granted access. Defaults to the current tenant id.
         * 
         * @return builder
         * 
         */
        public Builder endpointTenantId(String endpointTenantId) {
            return endpointTenantId(Output.of(endpointTenantId));
        }

        public AccountNetworkRulesPrivateLinkAccessRuleArgs build() {
            $.endpointResourceId = Objects.requireNonNull($.endpointResourceId, "expected parameter 'endpointResourceId' to be non-null");
            return $;
        }
    }

}
