// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HDInsightStreamingActivityResponse {
    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    private final @Nullable List<Object> arguments;
    /**
     * Combiner executable name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object combiner;
    /**
     * Command line environment values.
     * 
     */
    private final @Nullable List<Object> commandEnvironment;
    /**
     * Allows user to specify defines for streaming job request.
     * 
     */
    private final @Nullable Map<String,Object> defines;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Linked service reference where the files are located.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse fileLinkedService;
    /**
     * Paths to streaming job files. Can be directories.
     * 
     */
    private final List<Object> filePaths;
    /**
     * Debug info option.
     * 
     */
    private final @Nullable String getDebugInfo;
    /**
     * Input blob path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object input;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Mapper executable name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object mapper;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Output blob path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object output;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Reducer executable name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object reducer;
    /**
     * Storage linked service references.
     * 
     */
    private final @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
    /**
     * Type of activity.
     * Expected value is 'HDInsightStreaming'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"arguments","combiner","commandEnvironment","defines","dependsOn","description","fileLinkedService","filePaths","getDebugInfo","input","linkedServiceName","mapper","name","output","policy","reducer","storageLinkedServices","type","userProperties"})
    private HDInsightStreamingActivityResponse(
        @Nullable List<Object> arguments,
        @Nullable Object combiner,
        @Nullable List<Object> commandEnvironment,
        @Nullable Map<String,Object> defines,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable LinkedServiceReferenceResponse fileLinkedService,
        List<Object> filePaths,
        @Nullable String getDebugInfo,
        Object input,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        Object mapper,
        String name,
        Object output,
        @Nullable ActivityPolicyResponse policy,
        Object reducer,
        @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.arguments = arguments;
        this.combiner = combiner;
        this.commandEnvironment = commandEnvironment;
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.fileLinkedService = fileLinkedService;
        this.filePaths = Objects.requireNonNull(filePaths);
        this.getDebugInfo = getDebugInfo;
        this.input = Objects.requireNonNull(input);
        this.linkedServiceName = linkedServiceName;
        this.mapper = Objects.requireNonNull(mapper);
        this.name = Objects.requireNonNull(name);
        this.output = Objects.requireNonNull(output);
        this.policy = policy;
        this.reducer = Objects.requireNonNull(reducer);
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    public List<Object> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    /**
     * Combiner executable name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getCombiner() {
        return Optional.ofNullable(this.combiner);
    }
    /**
     * Command line environment values.
     * 
     */
    public List<Object> getCommandEnvironment() {
        return this.commandEnvironment == null ? List.of() : this.commandEnvironment;
    }
    /**
     * Allows user to specify defines for streaming job request.
     * 
     */
    public Map<String,Object> getDefines() {
        return this.defines == null ? Map.of() : this.defines;
    }
    /**
     * Activity depends on condition.
     * 
     */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Linked service reference where the files are located.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> getFileLinkedService() {
        return Optional.ofNullable(this.fileLinkedService);
    }
    /**
     * Paths to streaming job files. Can be directories.
     * 
     */
    public List<Object> getFilePaths() {
        return this.filePaths;
    }
    /**
     * Debug info option.
     * 
     */
    public Optional<String> getGetDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }
    /**
     * Input blob path. Type: string (or Expression with resultType string).
     * 
     */
    public Object getInput() {
        return this.input;
    }
    /**
     * Linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Mapper executable name. Type: string (or Expression with resultType string).
     * 
     */
    public Object getMapper() {
        return this.mapper;
    }
    /**
     * Activity name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Output blob path. Type: string (or Expression with resultType string).
     * 
     */
    public Object getOutput() {
        return this.output;
    }
    /**
     * Activity policy.
     * 
     */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Reducer executable name. Type: string (or Expression with resultType string).
     * 
     */
    public Object getReducer() {
        return this.reducer;
    }
    /**
     * Storage linked service references.
     * 
     */
    public List<LinkedServiceReferenceResponse> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? List.of() : this.storageLinkedServices;
    }
    /**
     * Type of activity.
     * Expected value is 'HDInsightStreaming'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
     */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightStreamingActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> arguments;
        private @Nullable Object combiner;
        private @Nullable List<Object> commandEnvironment;
        private @Nullable Map<String,Object> defines;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable LinkedServiceReferenceResponse fileLinkedService;
        private List<Object> filePaths;
        private @Nullable String getDebugInfo;
        private Object input;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private Object mapper;
        private String name;
        private Object output;
        private @Nullable ActivityPolicyResponse policy;
        private Object reducer;
        private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightStreamingActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.combiner = defaults.combiner;
    	      this.commandEnvironment = defaults.commandEnvironment;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.fileLinkedService = defaults.fileLinkedService;
    	      this.filePaths = defaults.filePaths;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.input = defaults.input;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.mapper = defaults.mapper;
    	      this.name = defaults.name;
    	      this.output = defaults.output;
    	      this.policy = defaults.policy;
    	      this.reducer = defaults.reducer;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setArguments(@Nullable List<Object> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setCombiner(@Nullable Object combiner) {
            this.combiner = combiner;
            return this;
        }

        public Builder setCommandEnvironment(@Nullable List<Object> commandEnvironment) {
            this.commandEnvironment = commandEnvironment;
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

        public Builder setFileLinkedService(@Nullable LinkedServiceReferenceResponse fileLinkedService) {
            this.fileLinkedService = fileLinkedService;
            return this;
        }

        public Builder setFilePaths(List<Object> filePaths) {
            this.filePaths = Objects.requireNonNull(filePaths);
            return this;
        }

        public Builder setGetDebugInfo(@Nullable String getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder setInput(Object input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setMapper(Object mapper) {
            this.mapper = Objects.requireNonNull(mapper);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutput(Object output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setReducer(Object reducer) {
            this.reducer = Objects.requireNonNull(reducer);
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
        public HDInsightStreamingActivityResponse build() {
            return new HDInsightStreamingActivityResponse(arguments, combiner, commandEnvironment, defines, dependsOn, description, fileLinkedService, filePaths, getDebugInfo, input, linkedServiceName, mapper, name, output, policy, reducer, storageLinkedServices, type, userProperties);
        }
    }
}
