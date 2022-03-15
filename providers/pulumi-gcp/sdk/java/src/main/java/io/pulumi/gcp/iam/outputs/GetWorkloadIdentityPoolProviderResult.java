// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderAw;
import io.pulumi.gcp.iam.outputs.GetWorkloadIdentityPoolProviderOidc;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkloadIdentityPoolProviderResult {
    private final String attributeCondition;
    private final Map<String,String> attributeMapping;
    private final List<GetWorkloadIdentityPoolProviderAw> aws;
    private final String description;
    private final Boolean disabled;
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final List<GetWorkloadIdentityPoolProviderOidc> oidcs;
    private final @Nullable String project;
    private final String state;
    private final String workloadIdentityPoolId;
    private final String workloadIdentityPoolProviderId;

    @CustomType.Constructor
    private GetWorkloadIdentityPoolProviderResult(
        @CustomType.Parameter("attributeCondition") String attributeCondition,
        @CustomType.Parameter("attributeMapping") Map<String,String> attributeMapping,
        @CustomType.Parameter("aws") List<GetWorkloadIdentityPoolProviderAw> aws,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("oidcs") List<GetWorkloadIdentityPoolProviderOidc> oidcs,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("workloadIdentityPoolId") String workloadIdentityPoolId,
        @CustomType.Parameter("workloadIdentityPoolProviderId") String workloadIdentityPoolProviderId) {
        this.attributeCondition = attributeCondition;
        this.attributeMapping = attributeMapping;
        this.aws = aws;
        this.description = description;
        this.disabled = disabled;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.oidcs = oidcs;
        this.project = project;
        this.state = state;
        this.workloadIdentityPoolId = workloadIdentityPoolId;
        this.workloadIdentityPoolProviderId = workloadIdentityPoolProviderId;
    }

    public String getAttributeCondition() {
        return this.attributeCondition;
    }
    public Map<String,String> getAttributeMapping() {
        return this.attributeMapping;
    }
    public List<GetWorkloadIdentityPoolProviderAw> getAws() {
        return this.aws;
    }
    public String getDescription() {
        return this.description;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public List<GetWorkloadIdentityPoolProviderOidc> getOidcs() {
        return this.oidcs;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getState() {
        return this.state;
    }
    public String getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }
    public String getWorkloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeCondition;
        private Map<String,String> attributeMapping;
        private List<GetWorkloadIdentityPoolProviderAw> aws;
        private String description;
        private Boolean disabled;
        private String displayName;
        private String id;
        private String name;
        private List<GetWorkloadIdentityPoolProviderOidc> oidcs;
        private @Nullable String project;
        private String state;
        private String workloadIdentityPoolId;
        private String workloadIdentityPoolProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeCondition = defaults.attributeCondition;
    	      this.attributeMapping = defaults.attributeMapping;
    	      this.aws = defaults.aws;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.oidcs = defaults.oidcs;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
    	      this.workloadIdentityPoolProviderId = defaults.workloadIdentityPoolProviderId;
        }

        public Builder attributeCondition(String attributeCondition) {
            this.attributeCondition = Objects.requireNonNull(attributeCondition);
            return this;
        }

        public Builder attributeMapping(Map<String,String> attributeMapping) {
            this.attributeMapping = Objects.requireNonNull(attributeMapping);
            return this;
        }

        public Builder aws(List<GetWorkloadIdentityPoolProviderAw> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder oidcs(List<GetWorkloadIdentityPoolProviderOidc> oidcs) {
            this.oidcs = Objects.requireNonNull(oidcs);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }

        public Builder workloadIdentityPoolProviderId(String workloadIdentityPoolProviderId) {
            this.workloadIdentityPoolProviderId = Objects.requireNonNull(workloadIdentityPoolProviderId);
            return this;
        }
        public GetWorkloadIdentityPoolProviderResult build() {
            return new GetWorkloadIdentityPoolProviderResult(attributeCondition, attributeMapping, aws, description, disabled, displayName, id, name, oidcs, project, state, workloadIdentityPoolId, workloadIdentityPoolProviderId);
        }
    }
}
