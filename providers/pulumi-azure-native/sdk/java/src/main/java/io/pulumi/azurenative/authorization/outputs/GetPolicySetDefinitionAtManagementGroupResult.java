// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponse;
import io.pulumi.azurenative.authorization.outputs.PolicyDefinitionGroupResponse;
import io.pulumi.azurenative.authorization.outputs.PolicyDefinitionReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPolicySetDefinitionAtManagementGroupResult {
    /**
     * The policy set definition description.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name of the policy set definition.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The ID of the policy set definition.
     * 
     */
    private final String id;
    /**
     * The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * The name of the policy set definition.
     * 
     */
    private final String name;
    /**
     * The policy set definition parameters that can be used in policy definition references.
     * 
     */
    private final @Nullable Map<String,ParameterDefinitionsValueResponse> parameters;
    /**
     * The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    private final @Nullable List<PolicyDefinitionGroupResponse> policyDefinitionGroups;
    /**
     * An array of policy definition references.
     * 
     */
    private final List<PolicyDefinitionReferenceResponse> policyDefinitions;
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    private final @Nullable String policyType;
    /**
     * The type of the resource (Microsoft.Authorization/policySetDefinitions).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","displayName","id","metadata","name","parameters","policyDefinitionGroups","policyDefinitions","policyType","type"})
    private GetPolicySetDefinitionAtManagementGroupResult(
        @Nullable String description,
        @Nullable String displayName,
        String id,
        @Nullable Object metadata,
        String name,
        @Nullable Map<String,ParameterDefinitionsValueResponse> parameters,
        @Nullable List<PolicyDefinitionGroupResponse> policyDefinitionGroups,
        List<PolicyDefinitionReferenceResponse> policyDefinitions,
        @Nullable String policyType,
        String type) {
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.policyDefinitionGroups = policyDefinitionGroups;
        this.policyDefinitions = Objects.requireNonNull(policyDefinitions);
        this.policyType = policyType;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The policy set definition description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name of the policy set definition.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The ID of the policy set definition.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The name of the policy set definition.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The policy set definition parameters that can be used in policy definition references.
     * 
     */
    public Map<String,ParameterDefinitionsValueResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    public List<PolicyDefinitionGroupResponse> getPolicyDefinitionGroups() {
        return this.policyDefinitionGroups == null ? List.of() : this.policyDefinitionGroups;
    }
    /**
     * An array of policy definition references.
     * 
     */
    public List<PolicyDefinitionReferenceResponse> getPolicyDefinitions() {
        return this.policyDefinitions;
    }
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    public Optional<String> getPolicyType() {
        return Optional.ofNullable(this.policyType);
    }
    /**
     * The type of the resource (Microsoft.Authorization/policySetDefinitions).
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicySetDefinitionAtManagementGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private @Nullable Object metadata;
        private String name;
        private @Nullable Map<String,ParameterDefinitionsValueResponse> parameters;
        private @Nullable List<PolicyDefinitionGroupResponse> policyDefinitionGroups;
        private List<PolicyDefinitionReferenceResponse> policyDefinitions;
        private @Nullable String policyType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicySetDefinitionAtManagementGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionGroups = defaults.policyDefinitionGroups;
    	      this.policyDefinitions = defaults.policyDefinitions;
    	      this.policyType = defaults.policyType;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterDefinitionsValueResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPolicyDefinitionGroups(@Nullable List<PolicyDefinitionGroupResponse> policyDefinitionGroups) {
            this.policyDefinitionGroups = policyDefinitionGroups;
            return this;
        }

        public Builder setPolicyDefinitions(List<PolicyDefinitionReferenceResponse> policyDefinitions) {
            this.policyDefinitions = Objects.requireNonNull(policyDefinitions);
            return this;
        }

        public Builder setPolicyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetPolicySetDefinitionAtManagementGroupResult build() {
            return new GetPolicySetDefinitionAtManagementGroupResult(description, displayName, id, metadata, name, parameters, policyDefinitionGroups, policyDefinitions, policyType, type);
        }
    }
}
