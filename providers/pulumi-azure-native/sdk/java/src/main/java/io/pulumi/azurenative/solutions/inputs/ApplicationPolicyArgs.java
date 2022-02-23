// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed application policy.
 * 
 */
public final class ApplicationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationPolicyArgs Empty = new ApplicationPolicyArgs();

    /**
     * The policy name
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The policy parameters.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<String> parameters;

    public Input<String> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The policy definition Id.
     * 
     */
    @InputImport(name="policyDefinitionId")
        private final @Nullable Input<String> policyDefinitionId;

    public Input<String> getPolicyDefinitionId() {
        return this.policyDefinitionId == null ? Input.empty() : this.policyDefinitionId;
    }

    public ApplicationPolicyArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> parameters,
        @Nullable Input<String> policyDefinitionId) {
        this.name = name;
        this.parameters = parameters;
        this.policyDefinitionId = policyDefinitionId;
    }

    private ApplicationPolicyArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.policyDefinitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> parameters;
        private @Nullable Input<String> policyDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParameters(@Nullable Input<String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPolicyDefinitionId(@Nullable Input<String> policyDefinitionId) {
            this.policyDefinitionId = policyDefinitionId;
            return this;
        }

        public Builder setPolicyDefinitionId(@Nullable String policyDefinitionId) {
            this.policyDefinitionId = Input.ofNullable(policyDefinitionId);
            return this;
        }
        public ApplicationPolicyArgs build() {
            return new ApplicationPolicyArgs(name, parameters, policyDefinitionId);
        }
    }
}
