// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyRuleConditionNetworkProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule condition of type nat.
 * 
 */
public final class NatRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NatRuleConditionArgs Empty = new NatRuleConditionArgs();

    /**
     * Description of the rule condition.
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
     * List of destination ports.
     * 
     */
    @InputImport(name="destinationPorts")
        private final @Nullable Input<List<String>> destinationPorts;

    public Input<List<String>> getDestinationPorts() {
        return this.destinationPorts == null ? Input.empty() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    @InputImport(name="ipProtocols")
        private final @Nullable Input<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols;

    public Input<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> getIpProtocols() {
        return this.ipProtocols == null ? Input.empty() : this.ipProtocols;
    }

    /**
     * Name of the rule condition.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Rule Condition Type.
     * Expected value is 'NatRuleCondition'.
     * 
     */
    @InputImport(name="ruleConditionType", required=true)
        private final Input<String> ruleConditionType;

    public Input<String> getRuleConditionType() {
        return this.ruleConditionType;
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

    public NatRuleConditionArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> destinationAddresses,
        @Nullable Input<List<String>> destinationPorts,
        @Nullable Input<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols,
        @Nullable Input<String> name,
        Input<String> ruleConditionType,
        @Nullable Input<List<String>> sourceAddresses,
        @Nullable Input<List<String>> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleConditionType = Objects.requireNonNull(ruleConditionType, "expected parameter 'ruleConditionType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private NatRuleConditionArgs() {
        this.description = Input.empty();
        this.destinationAddresses = Input.empty();
        this.destinationPorts = Input.empty();
        this.ipProtocols = Input.empty();
        this.name = Input.empty();
        this.ruleConditionType = Input.empty();
        this.sourceAddresses = Input.empty();
        this.sourceIpGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> destinationAddresses;
        private @Nullable Input<List<String>> destinationPorts;
        private @Nullable Input<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols;
        private @Nullable Input<String> name;
        private Input<String> ruleConditionType;
        private @Nullable Input<List<String>> sourceAddresses;
        private @Nullable Input<List<String>> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NatRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleConditionType = defaults.ruleConditionType;
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

        public Builder setDestinationPorts(@Nullable Input<List<String>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = Input.ofNullable(destinationPorts);
            return this;
        }

        public Builder setIpProtocols(@Nullable Input<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder setIpProtocols(@Nullable List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>> ipProtocols) {
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

        public Builder setRuleConditionType(Input<String> ruleConditionType) {
            this.ruleConditionType = Objects.requireNonNull(ruleConditionType);
            return this;
        }

        public Builder setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = Input.of(Objects.requireNonNull(ruleConditionType));
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
        public NatRuleConditionArgs build() {
            return new NatRuleConditionArgs(description, destinationAddresses, destinationPorts, ipProtocols, name, ruleConditionType, sourceAddresses, sourceIpGroups);
        }
    }
}
