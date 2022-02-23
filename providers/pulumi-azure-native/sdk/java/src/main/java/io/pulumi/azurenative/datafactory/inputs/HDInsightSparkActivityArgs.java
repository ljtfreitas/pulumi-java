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
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HDInsight Spark activity.
 * 
 */
public final class HDInsightSparkActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final HDInsightSparkActivityArgs Empty = new HDInsightSparkActivityArgs();

    /**
     * The user-specified arguments to HDInsightSparkActivity.
     * 
     */
    @InputImport(name="arguments")
        private final @Nullable Input<List<Object>> arguments;

    public Input<List<Object>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * The application's Java/Spark main class.
     * 
     */
    @InputImport(name="className")
        private final @Nullable Input<String> className;

    public Input<String> getClassName() {
        return this.className == null ? Input.empty() : this.className;
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
     * The relative path to the root folder of the code/package to be executed. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="entryFilePath", required=true)
        private final Input<Object> entryFilePath;

    public Input<Object> getEntryFilePath() {
        return this.entryFilePath;
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
     * The user to impersonate that will execute the job. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="proxyUser")
        private final @Nullable Input<Object> proxyUser;

    public Input<Object> getProxyUser() {
        return this.proxyUser == null ? Input.empty() : this.proxyUser;
    }

    /**
     * The root path in 'sparkJobLinkedService' for all the job’s files. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rootPath", required=true)
        private final Input<Object> rootPath;

    public Input<Object> getRootPath() {
        return this.rootPath;
    }

    /**
     * Spark configuration property.
     * 
     */
    @InputImport(name="sparkConfig")
        private final @Nullable Input<Map<String,Object>> sparkConfig;

    public Input<Map<String,Object>> getSparkConfig() {
        return this.sparkConfig == null ? Input.empty() : this.sparkConfig;
    }

    /**
     * The storage linked service for uploading the entry file and dependencies, and for receiving logs.
     * 
     */
    @InputImport(name="sparkJobLinkedService")
        private final @Nullable Input<LinkedServiceReferenceArgs> sparkJobLinkedService;

    public Input<LinkedServiceReferenceArgs> getSparkJobLinkedService() {
        return this.sparkJobLinkedService == null ? Input.empty() : this.sparkJobLinkedService;
    }

    /**
     * Type of activity.
     * Expected value is 'HDInsightSpark'.
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

    public HDInsightSparkActivityArgs(
        @Nullable Input<List<Object>> arguments,
        @Nullable Input<String> className,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        Input<Object> entryFilePath,
        @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<Object> proxyUser,
        Input<Object> rootPath,
        @Nullable Input<Map<String,Object>> sparkConfig,
        @Nullable Input<LinkedServiceReferenceArgs> sparkJobLinkedService,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.arguments = arguments;
        this.className = className;
        this.dependsOn = dependsOn;
        this.description = description;
        this.entryFilePath = Objects.requireNonNull(entryFilePath, "expected parameter 'entryFilePath' to be non-null");
        this.getDebugInfo = getDebugInfo;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.proxyUser = proxyUser;
        this.rootPath = Objects.requireNonNull(rootPath, "expected parameter 'rootPath' to be non-null");
        this.sparkConfig = sparkConfig;
        this.sparkJobLinkedService = sparkJobLinkedService;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private HDInsightSparkActivityArgs() {
        this.arguments = Input.empty();
        this.className = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.entryFilePath = Input.empty();
        this.getDebugInfo = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.proxyUser = Input.empty();
        this.rootPath = Input.empty();
        this.sparkConfig = Input.empty();
        this.sparkJobLinkedService = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightSparkActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> arguments;
        private @Nullable Input<String> className;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private Input<Object> entryFilePath;
        private @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<Object> proxyUser;
        private Input<Object> rootPath;
        private @Nullable Input<Map<String,Object>> sparkConfig;
        private @Nullable Input<LinkedServiceReferenceArgs> sparkJobLinkedService;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightSparkActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.className = defaults.className;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.entryFilePath = defaults.entryFilePath;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.proxyUser = defaults.proxyUser;
    	      this.rootPath = defaults.rootPath;
    	      this.sparkConfig = defaults.sparkConfig;
    	      this.sparkJobLinkedService = defaults.sparkJobLinkedService;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setArguments(@Nullable Input<List<Object>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable List<Object> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setClassName(@Nullable Input<String> className) {
            this.className = className;
            return this;
        }

        public Builder setClassName(@Nullable String className) {
            this.className = Input.ofNullable(className);
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

        public Builder setEntryFilePath(Input<Object> entryFilePath) {
            this.entryFilePath = Objects.requireNonNull(entryFilePath);
            return this;
        }

        public Builder setEntryFilePath(Object entryFilePath) {
            this.entryFilePath = Input.of(Objects.requireNonNull(entryFilePath));
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

        public Builder setProxyUser(@Nullable Input<Object> proxyUser) {
            this.proxyUser = proxyUser;
            return this;
        }

        public Builder setProxyUser(@Nullable Object proxyUser) {
            this.proxyUser = Input.ofNullable(proxyUser);
            return this;
        }

        public Builder setRootPath(Input<Object> rootPath) {
            this.rootPath = Objects.requireNonNull(rootPath);
            return this;
        }

        public Builder setRootPath(Object rootPath) {
            this.rootPath = Input.of(Objects.requireNonNull(rootPath));
            return this;
        }

        public Builder setSparkConfig(@Nullable Input<Map<String,Object>> sparkConfig) {
            this.sparkConfig = sparkConfig;
            return this;
        }

        public Builder setSparkConfig(@Nullable Map<String,Object> sparkConfig) {
            this.sparkConfig = Input.ofNullable(sparkConfig);
            return this;
        }

        public Builder setSparkJobLinkedService(@Nullable Input<LinkedServiceReferenceArgs> sparkJobLinkedService) {
            this.sparkJobLinkedService = sparkJobLinkedService;
            return this;
        }

        public Builder setSparkJobLinkedService(@Nullable LinkedServiceReferenceArgs sparkJobLinkedService) {
            this.sparkJobLinkedService = Input.ofNullable(sparkJobLinkedService);
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
        public HDInsightSparkActivityArgs build() {
            return new HDInsightSparkActivityArgs(arguments, className, dependsOn, description, entryFilePath, getDebugInfo, linkedServiceName, name, policy, proxyUser, rootPath, sparkConfig, sparkJobLinkedService, type, userProperties);
        }
    }
}
