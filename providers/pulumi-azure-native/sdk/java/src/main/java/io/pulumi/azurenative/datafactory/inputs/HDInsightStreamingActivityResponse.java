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
 * HDInsight streaming activity type.
 * 
 */
public final class HDInsightStreamingActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final HDInsightStreamingActivityResponse Empty = new HDInsightStreamingActivityResponse();

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
     * Combiner executable name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="combiner")
    private final @Nullable Object combiner;

    public Optional<Object> getCombiner() {
        return this.combiner == null ? Optional.empty() : Optional.ofNullable(this.combiner);
    }

    /**
     * Command line environment values.
     * 
     */
    @InputImport(name="commandEnvironment")
    private final @Nullable List<Object> commandEnvironment;

    public List<Object> getCommandEnvironment() {
        return this.commandEnvironment == null ? List.of() : this.commandEnvironment;
    }

    /**
     * Allows user to specify defines for streaming job request.
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
     * Linked service reference where the files are located.
     * 
     */
    @InputImport(name="fileLinkedService")
    private final @Nullable LinkedServiceReferenceResponse fileLinkedService;

    public Optional<LinkedServiceReferenceResponse> getFileLinkedService() {
        return this.fileLinkedService == null ? Optional.empty() : Optional.ofNullable(this.fileLinkedService);
    }

    /**
     * Paths to streaming job files. Can be directories.
     * 
     */
    @InputImport(name="filePaths", required=true)
    private final List<Object> filePaths;

    public List<Object> getFilePaths() {
        return this.filePaths;
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
     * Input blob path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="input", required=true)
    private final Object input;

    public Object getInput() {
        return this.input;
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
     * Mapper executable name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mapper", required=true)
    private final Object mapper;

    public Object getMapper() {
        return this.mapper;
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
     * Output blob path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="output", required=true)
    private final Object output;

    public Object getOutput() {
        return this.output;
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
     * Reducer executable name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="reducer", required=true)
    private final Object reducer;

    public Object getReducer() {
        return this.reducer;
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
     * Expected value is 'HDInsightStreaming'.
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

    public HDInsightStreamingActivityResponse(
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
        this.filePaths = Objects.requireNonNull(filePaths, "expected parameter 'filePaths' to be non-null");
        this.getDebugInfo = getDebugInfo;
        this.input = Objects.requireNonNull(input, "expected parameter 'input' to be non-null");
        this.linkedServiceName = linkedServiceName;
        this.mapper = Objects.requireNonNull(mapper, "expected parameter 'mapper' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.policy = policy;
        this.reducer = Objects.requireNonNull(reducer, "expected parameter 'reducer' to be non-null");
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private HDInsightStreamingActivityResponse() {
        this.arguments = List.of();
        this.combiner = null;
        this.commandEnvironment = List.of();
        this.defines = Map.of();
        this.dependsOn = List.of();
        this.description = null;
        this.fileLinkedService = null;
        this.filePaths = List.of();
        this.getDebugInfo = null;
        this.input = null;
        this.linkedServiceName = null;
        this.mapper = null;
        this.name = null;
        this.output = null;
        this.policy = null;
        this.reducer = null;
        this.storageLinkedServices = List.of();
        this.type = null;
        this.userProperties = List.of();
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
