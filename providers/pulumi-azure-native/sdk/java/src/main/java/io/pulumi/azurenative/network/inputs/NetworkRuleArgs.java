// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyRuleNetworkProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of type network.
 * 
 */
public final class NetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleArgs Empty = new NetworkRuleArgs();

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
     * List of destination IP addresses or Service Tags.
     * 
     */
    @InputImport(name="destinationAddresses")
        private final @Nullable Input<List<String>> destinationAddresses;

    public Input<List<String>> getDestinationAddresses() {
        return this.destinationAddresses == null ? Input.empty() : this.destinationAddresses;
    }

    /**
     * List of destination FQDNs.
     * 
     */
    @InputImport(name="destinationFqdns")
        private final @Nullable Input<List<String>> destinationFqdns;

    public Input<List<String>> getDestinationFqdns() {
        return this.destinationFqdns == null ? Input.empty() : this.destinationFqdns;
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @InputImport(name="destinationIpGroups")
        private final @Nullable Input<List<String>> destinationIpGroups;

    public Input<List<String>> getDestinationIpGroups() {
        return this.destinationIpGroups == null ? Input.empty() : this.destinationIpGroups;
    }

    /**
     * List of destination ports.
     * 
     */
    @InputImport(name="destinationPorts")
        private final @Nullable Input<List<String>> destinationPorts;

    public Input<List<String>> getDestinationPorts() {
        return this.destinationPorts == null ? Input.empty() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     * 
     */
    @InputImport(name="ipProtocols")
        private final @Nullable Input<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols;

    public Input<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> getIpProtocols() {
        return this.ipProtocols == null ? Input.empty() : this.ipProtocols;
    }

    /**
     * Name of the rule.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Rule Type.
     * Expected value is 'NetworkRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
        private final Input<String> ruleType;

    public Input<String> getRuleType() {
        return this.ruleType;
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

    public NetworkRuleArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> destinationAddresses,
        @Nullable Input<List<String>> destinationFqdns,
        @Nullable Input<List<String>> destinationIpGroups,
        @Nullable Input<List<String>> destinationPorts,
        @Nullable Input<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols,
        @Nullable Input<String> name,
        Input<String> ruleType,
        @Nullable Input<List<String>> sourceAddresses,
        @Nullable Input<List<String>> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationFqdns = destinationFqdns;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private NetworkRuleArgs() {
        this.description = Input.empty();
        this.destinationAddresses = Input.empty();
        this.destinationFqdns = Input.empty();
        this.destinationIpGroups = Input.empty();
        this.destinationPorts = Input.empty();
        this.ipProtocols = Input.empty();
        this.name = Input.empty();
        this.ruleType = Input.empty();
        this.sourceAddresses = Input.empty();
        this.sourceIpGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> destinationAddresses;
        private @Nullable Input<List<String>> destinationFqdns;
        private @Nullable Input<List<String>> destinationIpGroups;
        private @Nullable Input<List<String>> destinationPorts;
        private @Nullable Input<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols;
        private @Nullable Input<String> name;
        private Input<String> ruleType;
        private @Nullable Input<List<String>> sourceAddresses;
        private @Nullable Input<List<String>> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationFqdns = defaults.destinationFqdns;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationAddresses(@Nullable Input<List<String>> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder setDestinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = Input.ofNullable(destinationAddresses);
            return this;
        }

        public Builder setDestinationFqdns(@Nullable Input<List<String>> destinationFqdns) {
            this.destinationFqdns = destinationFqdns;
            return this;
        }

        public Builder setDestinationFqdns(@Nullable List<String> destinationFqdns) {
            this.destinationFqdns = Input.ofNullable(destinationFqdns);
            return this;
        }

        public Builder setDestinationIpGroups(@Nullable Input<List<String>> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }

        public Builder setDestinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = Input.ofNullable(destinationIpGroups);
            return this;
        }

        public Builder setDestinationPorts(@Nullable Input<List<String>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = Input.ofNullable(destinationPorts);
            return this;
        }

        public Builder setIpProtocols(@Nullable Input<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder setIpProtocols(@Nullable List<Either<String,FirewallPolicyRuleNetworkProtocol>> ipProtocols) {
            this.ipProtocols = Input.ofNullable(ipProtocols);
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

        public Builder setRuleType(Input<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
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
        public NetworkRuleArgs build() {
            return new NetworkRuleArgs(description, destinationAddresses, destinationFqdns, destinationIpGroups, destinationPorts, ipProtocols, name, ruleType, sourceAddresses, sourceIpGroups);
        }
    }
}
