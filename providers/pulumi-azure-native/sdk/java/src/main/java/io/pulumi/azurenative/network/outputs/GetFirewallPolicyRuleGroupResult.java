// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FirewallPolicyFilterRuleResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyNatRuleResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallPolicyRuleGroupResult {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the Firewall Policy Rule Group resource.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The provisioning state of the firewall policy rule group resource.
     * 
     */
    private final String provisioningState;
    /**
     * Group of Firewall Policy rules.
     * 
     */
    private final @Nullable List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>> rules;
    /**
     * Rule Group type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","priority","provisioningState","rules","type"})
    private GetFirewallPolicyRuleGroupResult(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>> rules,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.rules = rules;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the Firewall Policy Rule Group resource.
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The provisioning state of the firewall policy rule group resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Group of Firewall Policy rules.
     * 
     */
    public List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * Rule Group type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyRuleGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>> rules;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyRuleGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRules(@Nullable List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFirewallPolicyRuleGroupResult build() {
            return new GetFirewallPolicyRuleGroupResult(etag, id, name, priority, provisioningState, rules, type);
        }
    }
}
