// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallApplicationRuleProtocolArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of an application rule.
 * 
 */
public final class AzureFirewallApplicationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallApplicationRuleArgs Empty = new AzureFirewallApplicationRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * List of FQDN Tags for this rule.
     * 
     */
    @InputImport(name="fqdnTags")
        private final @Nullable Input<List<String>> fqdnTags;

    public Input<List<String>> getFqdnTags() {
        return this.fqdnTags == null ? Input.empty() : this.fqdnTags;
    }

    /**
     * Name of the application rule.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Array of ApplicationRuleProtocols.
     * 
     */
    @InputImport(name="protocols")
        private final @Nullable Input<List<AzureFirewallApplicationRuleProtocolArgs>> protocols;

    public Input<List<AzureFirewallApplicationRuleProtocolArgs>> getProtocols() {
        return this.protocols == null ? Input.empty() : this.protocols;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @InputImport(name="sourceAddresses")
        private final @Nullable Input<List<String>> sourceAddresses;

    public Input<List<String>> getSourceAddresses() {
        return this.sourceAddresses == null ? Input.empty() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @InputImport(name="sourceIpGroups")
        private final @Nullable Input<List<String>> sourceIpGroups;

    public Input<List<String>> getSourceIpGroups() {
        return this.sourceIpGroups == null ? Input.empty() : this.sourceIpGroups;
    }

    /**
     * List of FQDNs for this rule.
     * 
     */
    @InputImport(name="targetFqdns")
        private final @Nullable Input<List<String>> targetFqdns;

    public Input<List<String>> getTargetFqdns() {
        return this.targetFqdns == null ? Input.empty() : this.targetFqdns;
    }

    public AzureFirewallApplicationRuleArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> fqdnTags,
        @Nullable Input<String> name,
        @Nullable Input<List<AzureFirewallApplicationRuleProtocolArgs>> protocols,
        @Nullable Input<List<String>> sourceAddresses,
        @Nullable Input<List<String>> sourceIpGroups,
        @Nullable Input<List<String>> targetFqdns) {
        this.description = description;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
    }

    private AzureFirewallApplicationRuleArgs() {
        this.description = Input.empty();
        this.fqdnTags = Input.empty();
        this.name = Input.empty();
        this.protocols = Input.empty();
        this.sourceAddresses = Input.empty();
        this.sourceIpGroups = Input.empty();
        this.targetFqdns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> fqdnTags;
        private @Nullable Input<String> name;
        private @Nullable Input<List<AzureFirewallApplicationRuleProtocolArgs>> protocols;
        private @Nullable Input<List<String>> sourceAddresses;
        private @Nullable Input<List<String>> sourceIpGroups;
        private @Nullable Input<List<String>> targetFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFqdnTags(@Nullable Input<List<String>> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }

        public Builder setFqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = Input.ofNullable(fqdnTags);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProtocols(@Nullable Input<List<AzureFirewallApplicationRuleProtocolArgs>> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setProtocols(@Nullable List<AzureFirewallApplicationRuleProtocolArgs> protocols) {
            this.protocols = Input.ofNullable(protocols);
            return this;
        }

        public Builder setSourceAddresses(@Nullable Input<List<String>> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = Input.ofNullable(sourceAddresses);
            return this;
        }

        public Builder setSourceIpGroups(@Nullable Input<List<String>> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder setSourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = Input.ofNullable(sourceIpGroups);
            return this;
        }

        public Builder setTargetFqdns(@Nullable Input<List<String>> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }

        public Builder setTargetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = Input.ofNullable(targetFqdns);
            return this;
        }
        public AzureFirewallApplicationRuleArgs build() {
            return new AzureFirewallApplicationRuleArgs(description, fqdnTags, name, protocols, sourceAddresses, sourceIpGroups, targetFqdns);
        }
    }
}
