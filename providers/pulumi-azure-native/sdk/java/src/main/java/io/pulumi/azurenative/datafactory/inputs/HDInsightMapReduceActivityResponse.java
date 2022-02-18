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
 * HDInsight MapReduce activity type.
 * 
 */
public final class HDInsightMapReduceActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final HDInsightMapReduceActivityResponse Empty = new HDInsightMapReduceActivityResponse();

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
     * Class name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="className", required=true)
    private final Object className;

    public Object getClassName() {
        return this.className;
    }

    /**
     * Allows user to specify defines for the MapReduce job request.
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
     * Jar path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="jarFilePath", required=true)
    private final Object jarFilePath;

    public Object getJarFilePath() {
        return this.jarFilePath;
    }

    /**
     * Jar libs.
     * 
     */
    @InputImport(name="jarLibs")
    private final @Nullable List<Object> jarLibs;

    public List<Object> getJarLibs() {
        return this.jarLibs == null ? List.of() : this.jarLibs;
    }

    /**
     * Jar linked service reference.
     * 
     */
    @InputImport(name="jarLinkedService")
    private final @Nullable LinkedServiceReferenceResponse jarLinkedService;

    public Optional<LinkedServiceReferenceResponse> getJarLinkedService() {
        return this.jarLinkedService == null ? Optional.empty() : Optional.ofNullable(this.jarLinkedService);
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
     * Expected value is 'HDInsightMapReduce'.
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

    public HDInsightMapReduceActivityResponse(
        @Nullable List<Object> arguments,
        Object className,
        @Nullable Map<String,Object> defines,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable String getDebugInfo,
        Object jarFilePath,
        @Nullable List<Object> jarLibs,
        @Nullable LinkedServiceReferenceResponse jarLinkedService,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.arguments = arguments;
        this.className = Objects.requireNonNull(className, "expected parameter 'className' to be non-null");
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.jarFilePath = Objects.requireNonNull(jarFilePath, "expected parameter 'jarFilePath' to be non-null");
        this.jarLibs = jarLibs;
        this.jarLinkedService = jarLinkedService;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private HDInsightMapReduceActivityResponse() {
        this.arguments = List.of();
        this.className = null;
        this.defines = Map.of();
        this.dependsOn = List.of();
        this.description = null;
        this.getDebugInfo = null;
        this.jarFilePath = null;
        this.jarLibs = List.of();
        this.jarLinkedService = null;
        this.linkedServiceName = null;
        this.name = null;
        this.policy = null;
        this.storageLinkedServices = List.of();
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightMapReduceActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> arguments;
        private Object className;
        private @Nullable Map<String,Object> defines;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable String getDebugInfo;
        private Object jarFilePath;
        private @Nullable List<Object> jarLibs;
        private @Nullable LinkedServiceReferenceResponse jarLinkedService;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightMapReduceActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.className = defaults.className;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.jarFilePath = defaults.jarFilePath;
    	      this.jarLibs = defaults.jarLibs;
    	      this.jarLinkedService = defaults.jarLinkedService;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setArguments(@Nullable List<Object> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setClassName(Object className) {
            this.className = Objects.requireNonNull(className);
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

        public Builder setJarFilePath(Object jarFilePath) {
            this.jarFilePath = Objects.requireNonNull(jarFilePath);
            return this;
        }

        public Builder setJarLibs(@Nullable List<Object> jarLibs) {
            this.jarLibs = jarLibs;
            return this;
        }

        public Builder setJarLinkedService(@Nullable LinkedServiceReferenceResponse jarLinkedService) {
            this.jarLinkedService = jarLinkedService;
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

        public HDInsightMapReduceActivityResponse build() {
            return new HDInsightMapReduceActivityResponse(arguments, className, defines, dependsOn, description, getDebugInfo, jarFilePath, jarLibs, jarLinkedService, linkedServiceName, name, policy, storageLinkedServices, type, userProperties);
        }
    }
}
