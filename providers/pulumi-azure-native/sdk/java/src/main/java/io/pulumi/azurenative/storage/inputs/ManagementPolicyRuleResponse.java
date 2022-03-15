// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ManagementPolicyDefinitionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that wraps the Lifecycle rule. Each rule is uniquely defined by name.
 * 
 */
public final class ManagementPolicyRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicyRuleResponse Empty = new ManagementPolicyRuleResponse();

    /**
     * An object that defines the Lifecycle rule.
     * 
     */
    @Import(name="definition", required=true)
      private final ManagementPolicyDefinitionResponse definition;

    public ManagementPolicyDefinitionResponse getDefinition() {
        return this.definition;
    }

    /**
     * Rule is enabled if set to true.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The valid value is Lifecycle
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ManagementPolicyRuleResponse(
        ManagementPolicyDefinitionResponse definition,
        @Nullable Boolean enabled,
        String name,
        String type) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.enabled = enabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagementPolicyRuleResponse() {
        this.definition = null;
        this.enabled = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyDefinitionResponse definition;
        private @Nullable Boolean enabled;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder definition(ManagementPolicyDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagementPolicyRuleResponse build() {
            return new ManagementPolicyRuleResponse(definition, enabled, name, type);
        }
    }
}
