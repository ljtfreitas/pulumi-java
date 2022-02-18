// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.HDInsightActivityDebugInfoOption;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HDInsight Hive activity type.
 * 
 */
public final class HDInsightHiveActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final HDInsightHiveActivityArgs Empty = new HDInsightHiveActivityArgs();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @InputImport(name="arguments")
    private final @Nullable Input<List<Object>> arguments;

    public Input<List<Object>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * Allows user to specify defines for Hive job request.
     * 
     */
    @InputImport(name="defines")
    private final @Nullable Input<Map<String,Object>> defines;

    public Input<Map<String,Object>> getDefines() {
        return this.defines == null ? Input.empty() : this.defines;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Debug info option.
     * 
     */
    @InputImport(name="getDebugInfo")
    private final @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    public Input<Either<String,HDInsightActivityDebugInfoOption>> getGetDebugInfo() {
        return this.getDebugInfo == null ? Input.empty() : this.getDebugInfo;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    @InputImport(name="queryTimeout")
    private final @Nullable Input<Integer> queryTimeout;

    public Input<Integer> getQueryTimeout() {
        return this.queryTimeout == null ? Input.empty() : this.queryTimeout;
    }

    /**
     * Script linked service reference.
     * 
     */
    @InputImport(name="scriptLinkedService")
    private final @Nullable Input<LinkedServiceReferenceArgs> scriptLinkedService;

    public Input<LinkedServiceReferenceArgs> getScriptLinkedService() {
        return this.scriptLinkedService == null ? Input.empty() : this.scriptLinkedService;
    }

    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="scriptPath")
    private final @Nullable Input<Object> scriptPath;

    public Input<Object> getScriptPath() {
        return this.scriptPath == null ? Input.empty() : this.scriptPath;
    }

    /**
     * Storage linked service references.
     * 
     */
    @InputImport(name="storageLinkedServices")
    private final @Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    public Input<List<LinkedServiceReferenceArgs>> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? Input.empty() : this.storageLinkedServices;
    }

    /**
     * Type of activity.
     * Expected value is 'HDInsightHive'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    /**
     * User specified arguments under hivevar namespace.
     * 
     */
    @InputImport(name="variables")
    private final @Nullable Input<List<Object>> variables;

    public Input<List<Object>> getVariables() {
        return this.variables == null ? Input.empty() : this.variables;
    }

    public HDInsightHiveActivityArgs(
        @Nullable Input<List<Object>> arguments,
        @Nullable Input<Map<String,Object>> defines,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<Integer> queryTimeout,
        @Nullable Input<LinkedServiceReferenceArgs> scriptLinkedService,
        @Nullable Input<Object> scriptPath,
        @Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties,
        @Nullable Input<List<Object>> variables) {
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

    private HDInsightHiveActivityArgs() {
        this.arguments = Input.empty();
        this.defines = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.getDebugInfo = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.queryTimeout = Input.empty();
        this.scriptLinkedService = Input.empty();
        this.scriptPath = Input.empty();
        this.storageLinkedServices = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
        this.variables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightHiveActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> arguments;
        private @Nullable Input<Map<String,Object>> defines;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<Integer> queryTimeout;
        private @Nullable Input<LinkedServiceReferenceArgs> scriptLinkedService;
        private @Nullable Input<Object> scriptPath;
        private @Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;
        private @Nullable Input<List<Object>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightHiveActivityArgs defaults) {
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

        public Builder setArguments(@Nullable Input<List<Object>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable List<Object> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setDefines(@Nullable Input<Map<String,Object>> defines) {
            this.defines = defines;
            return this;
        }

        public Builder setDefines(@Nullable Map<String,Object> defines) {
            this.defines = Input.ofNullable(defines);
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGetDebugInfo(@Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder setGetDebugInfo(@Nullable Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            this.getDebugInfo = Input.ofNullable(getDebugInfo);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setQueryTimeout(@Nullable Input<Integer> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Integer queryTimeout) {
            this.queryTimeout = Input.ofNullable(queryTimeout);
            return this;
        }

        public Builder setScriptLinkedService(@Nullable Input<LinkedServiceReferenceArgs> scriptLinkedService) {
            this.scriptLinkedService = scriptLinkedService;
            return this;
        }

        public Builder setScriptLinkedService(@Nullable LinkedServiceReferenceArgs scriptLinkedService) {
            this.scriptLinkedService = Input.ofNullable(scriptLinkedService);
            return this;
        }

        public Builder setScriptPath(@Nullable Input<Object> scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public Builder setScriptPath(@Nullable Object scriptPath) {
            this.scriptPath = Input.ofNullable(scriptPath);
            return this;
        }

        public Builder setStorageLinkedServices(@Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
            return this;
        }

        public Builder setStorageLinkedServices(@Nullable List<LinkedServiceReferenceArgs> storageLinkedServices) {
            this.storageLinkedServices = Input.ofNullable(storageLinkedServices);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public Builder setVariables(@Nullable Input<List<Object>> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setVariables(@Nullable List<Object> variables) {
            this.variables = Input.ofNullable(variables);
            return this;
        }

        public HDInsightHiveActivityArgs build() {
            return new HDInsightHiveActivityArgs(arguments, defines, dependsOn, description, getDebugInfo, linkedServiceName, name, policy, queryTimeout, scriptLinkedService, scriptPath, storageLinkedServices, type, userProperties, variables);
        }
    }
}
