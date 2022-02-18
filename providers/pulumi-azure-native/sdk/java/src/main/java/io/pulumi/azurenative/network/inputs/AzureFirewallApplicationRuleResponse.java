// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallApplicationRuleProtocolResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an application rule.
 * 
 */
public final class AzureFirewallApplicationRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallApplicationRuleResponse Empty = new AzureFirewallApplicationRuleResponse();

    /**
     * Description of the rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * List of FQDN Tags for this rule.
     * 
     */
    @InputImport(name="fqdnTags")
    private final @Nullable List<String> fqdnTags;

    public List<String> getFqdnTags() {
        return this.fqdnTags == null ? List.of() : this.fqdnTags;
    }

    /**
     * Name of the application rule.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Array of ApplicationRuleProtocols.
     * 
     */
    @InputImport(name="protocols")
    private final @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols;

    public List<AzureFirewallApplicationRuleProtocolResponse> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @InputImport(name="sourceAddresses")
    private final @Nullable List<String> sourceAddresses;

    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @InputImport(name="sourceIpGroups")
    private final @Nullable List<String> sourceIpGroups;

    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    /**
     * List of FQDNs for this rule.
     * 
     */
    @InputImport(name="targetFqdns")
    private final @Nullable List<String> targetFqdns;

    public List<String> getTargetFqdns() {
        return this.targetFqdns == null ? List.of() : this.targetFqdns;
    }

    public AzureFirewallApplicationRuleResponse(
        @Nullable String description,
        @Nullable List<String> fqdnTags,
        @Nullable String name,
        @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups,
        @Nullable List<String> targetFqdns) {
        this.description = description;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
    }

    private AzureFirewallApplicationRuleResponse() {
        this.description = null;
        this.fqdnTags = List.of();
        this.name = null;
        this.protocols = List.of();
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
        this.targetFqdns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> fqdnTags;
        private @Nullable String name;
        private @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable List<String> targetFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocols(@Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder setTargetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }

        public AzureFirewallApplicationRuleResponse build() {
            return new AzureFirewallApplicationRuleResponse(description, fqdnTags, name, protocols, sourceAddresses, sourceIpGroups, targetFqdns);
        }
    }
}
