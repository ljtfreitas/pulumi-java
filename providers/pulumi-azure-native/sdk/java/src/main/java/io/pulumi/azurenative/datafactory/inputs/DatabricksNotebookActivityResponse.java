// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DatabricksNotebook activity.
 * 
 */
public final class DatabricksNotebookActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabricksNotebookActivityResponse Empty = new DatabricksNotebookActivityResponse();

    /**
     * Base parameters to be used for each run of this job.If the notebook takes a parameter that is not specified, the default value from the notebook will be used.
     * 
     */
    @InputImport(name="baseParameters")
    private final @Nullable Map<String,Object> baseParameters;

    public Map<String,Object> getBaseParameters() {
        return this.baseParameters == null ? Map.of() : this.baseParameters;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    @InputImport(name="libraries")
    private final @Nullable List<Map<String,Object>> libraries;

    public List<Map<String,Object>> getLibraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The absolute path of the notebook to be run in the Databricks Workspace. This path must begin with a slash. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="notebookPath", required=true)
    private final Object notebookPath;

    public Object getNotebookPath() {
        return this.notebookPath;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is 'DatabricksNotebook'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public DatabricksNotebookActivityResponse(
        @Nullable Map<String,Object> baseParameters,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable List<Map<String,Object>> libraries,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        Object notebookPath,
        @Nullable ActivityPolicyResponse policy,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.baseParameters = baseParameters;
        this.dependsOn = dependsOn;
        this.description = description;
        this.libraries = libraries;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.notebookPath = Objects.requireNonNull(notebookPath, "expected parameter 'notebookPath' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private DatabricksNotebookActivityResponse() {
        this.baseParameters = Map.of();
        this.dependsOn = List.of();
        this.description = null;
        this.libraries = List.of();
        this.linkedServiceName = null;
        this.name = null;
        this.notebookPath = null;
        this.policy = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksNotebookActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> baseParameters;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable List<Map<String,Object>> libraries;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private Object notebookPath;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksNotebookActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.libraries = defaults.libraries;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.notebookPath = defaults.notebookPath;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setBaseParameters(@Nullable Map<String,Object> baseParameters) {
            this.baseParameters = baseParameters;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLibraries(@Nullable List<Map<String,Object>> libraries) {
            this.libraries = libraries;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotebookPath(Object notebookPath) {
            this.notebookPath = Objects.requireNonNull(notebookPath);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public DatabricksNotebookActivityResponse build() {
            return new DatabricksNotebookActivityResponse(baseParameters, dependsOn, description, libraries, linkedServiceName, name, notebookPath, policy, type, userProperties);
        }
    }
}
