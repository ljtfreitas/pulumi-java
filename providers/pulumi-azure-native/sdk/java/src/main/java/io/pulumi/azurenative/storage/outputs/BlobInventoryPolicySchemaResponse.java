// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobInventoryPolicyRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BlobInventoryPolicySchemaResponse {
    private final String destination;
    private final Boolean enabled;
    private final List<BlobInventoryPolicyRuleResponse> rules;
    private final String type;

    @OutputCustomType.Constructor({"destination","enabled","rules","type"})
    private BlobInventoryPolicySchemaResponse(
        String destination,
        Boolean enabled,
        List<BlobInventoryPolicyRuleResponse> rules,
        String type) {
        this.destination = Objects.requireNonNull(destination);
        this.enabled = Objects.requireNonNull(enabled);
        this.rules = Objects.requireNonNull(rules);
        this.type = Objects.requireNonNull(type);
    }

    public String getDestination() {
        return this.destination;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public List<BlobInventoryPolicyRuleResponse> getRules() {
        return this.rules;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicySchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private Boolean enabled;
        private List<BlobInventoryPolicyRuleResponse> rules;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicySchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
        }

        public Builder setDestination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setRules(List<BlobInventoryPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BlobInventoryPolicySchemaResponse build() {
            return new BlobInventoryPolicySchemaResponse(destination, enabled, rules, type);
        }
    }
}