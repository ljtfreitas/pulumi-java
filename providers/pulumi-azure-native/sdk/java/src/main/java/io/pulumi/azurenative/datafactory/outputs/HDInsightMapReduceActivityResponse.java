// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HDInsightMapReduceActivityResponse {
    private final @Nullable List<Object> arguments;
    private final Object className;
    private final @Nullable Map<String,Object> defines;
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    private final @Nullable String description;
    private final @Nullable String getDebugInfo;
    private final Object jarFilePath;
    private final @Nullable List<Object> jarLibs;
    private final @Nullable LinkedServiceReferenceResponse jarLinkedService;
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    private final String name;
    private final @Nullable ActivityPolicyResponse policy;
    private final @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
    private final String type;
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"arguments","className","defines","dependsOn","description","getDebugInfo","jarFilePath","jarLibs","jarLinkedService","linkedServiceName","name","policy","storageLinkedServices","type","userProperties"})
    private HDInsightMapReduceActivityResponse(
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
        this.className = Objects.requireNonNull(className);
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.jarFilePath = Objects.requireNonNull(jarFilePath);
        this.jarLibs = jarLibs;
        this.jarLinkedService = jarLinkedService;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name);
        this.policy = policy;
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    public List<Object> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    public Object getClassName() {
        return this.className;
    }
    public Map<String,Object> getDefines() {
        return this.defines == null ? Map.of() : this.defines;
    }
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getGetDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }
    public Object getJarFilePath() {
        return this.jarFilePath;
    }
    public List<Object> getJarLibs() {
        return this.jarLibs == null ? List.of() : this.jarLibs;
    }
    public Optional<LinkedServiceReferenceResponse> getJarLinkedService() {
        return Optional.ofNullable(this.jarLinkedService);
    }
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    public String getName() {
        return this.name;
    }
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public List<LinkedServiceReferenceResponse> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? List.of() : this.storageLinkedServices;
    }
    public String getType() {
        return this.type;
    }
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
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