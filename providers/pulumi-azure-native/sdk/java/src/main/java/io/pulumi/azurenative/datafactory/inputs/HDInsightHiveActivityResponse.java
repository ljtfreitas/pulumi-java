// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HDInsight Hive activity type.
 * 
 */
public final class HDInsightHiveActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final HDInsightHiveActivityResponse Empty = new HDInsightHiveActivityResponse();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @InputImport(name="arguments")
    private final @Nullable List<Object> arguments;

    public List<Object> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }

    /**
     * Allows user to specify defines for Hive job request.
     * 
     */
    @InputImport(name="defines")
    private final @Nullable Map<String,Object> defines;

    public Map<String,Object> getDefines() {
        return this.defines == null ? Map.of() : this.defines;
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
     * Debug info option.
     * 
     */
    @InputImport(name="getDebugInfo")
    private final @Nullable String getDebugInfo;

    public Optional<String> getGetDebugInfo() {
        return this.getDebugInfo == null ? Optional.empty() : Optional.ofNullable(this.getDebugInfo);
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
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    @InputImport(name="queryTimeout")
    private final @Nullable Integer queryTimeout;

    public Optional<Integer> getQueryTimeout() {
        return this.queryTimeout == null ? Optional.empty() : Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Script linked service reference.
     * 
     */
    @InputImport(name="scriptLinkedService")
    private final @Nullable LinkedServiceReferenceResponse scriptLinkedService;

    public Optional<LinkedServiceReferenceResponse> getScriptLinkedService() {
        return this.scriptLinkedService == null ? Optional.empty() : Optional.ofNullable(this.scriptLinkedService);
    }

    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="scriptPath")
    private final @Nullable Object scriptPath;

    public Optional<Object> getScriptPath() {
        return this.scriptPath == null ? Optional.empty() : Optional.ofNullable(this.scriptPath);
    }

    /**
     * Storage linked service references.
     * 
     */
    @InputImport(name="storageLinkedServices")
    private final @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;

    public List<LinkedServiceReferenceResponse> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? List.of() : this.storageLinkedServices;
    }

    /**
     * Type of activity.
     * Expected value is 'HDInsightHive'.
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

    /**
     * User specified arguments under hivevar namespace.
     * 
     */
    @InputImport(name="variables")
    private final @Nullable List<Object> variables;

    public List<Object> getVariables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public HDInsightHiveActivityResponse(
        @Nullable List<Object> arguments,
        @Nullable Map<String,Object> defines,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable String getDebugInfo,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Integer queryTimeout,
        @Nullable LinkedServiceReferenceResponse scriptLinkedService,
        @Nullable Object scriptPath,
        @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        @Nullable List<Object> variables) {
        this.arguments = arguments;
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.queryTimeout = queryTimeout;
        this.scriptLinkedService = scriptLinkedService;
        this.scriptPath = scriptPath;
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.variables = variables;
    }

    private HDInsightHiveActivityResponse() {
        this.arguments = List.of();
        this.defines = Map.of();
        this.dependsOn = List.of();
        this.description = null;
        this.getDebugInfo = null;
        this.linkedServiceName = null;
        this.name = null;
        this.policy = null;
        this.queryTimeout = null;
        this.scriptLinkedService = null;
        this.scriptPath = null;
        this.storageLinkedServices = List.of();
        this.type = null;
        this.userProperties = List.of();
        this.variables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightHiveActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> arguments;
        private @Nullable Map<String,Object> defines;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable String getDebugInfo;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Integer queryTimeout;
        private @Nullable LinkedServiceReferenceResponse scriptLinkedService;
        private @Nullable Object scriptPath;
        private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable List<Object> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightHiveActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.scriptLinkedService = defaults.scriptLinkedService;
    	      this.scriptPath = defaults.scriptPath;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.variables = defaults.variables;
        }

        public Builder setArguments(@Nullable List<Object> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setDefines(@Nullable Map<String,Object> defines) {
            this.defines = defines;
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

        public Builder setGetDebugInfo(@Nullable String getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
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

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setScriptLinkedService(@Nullable LinkedServiceReferenceResponse scriptLinkedService) {
            this.scriptLinkedService = scriptLinkedService;
            return this;
        }

        public Builder setScriptPath(@Nullable Object scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public Builder setStorageLinkedServices(@Nullable List<LinkedServiceReferenceResponse> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
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

        public Builder setVariables(@Nullable List<Object> variables) {
            this.variables = variables;
            return this;
        }

        public HDInsightHiveActivityResponse build() {
            return new HDInsightHiveActivityResponse(arguments, defines, dependsOn, description, getDebugInfo, linkedServiceName, name, policy, queryTimeout, scriptLinkedService, scriptPath, storageLinkedServices, type, userProperties, variables);
        }
    }
}
