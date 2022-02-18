// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.inputs.SetValueResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The request parameters for a scheduling run against a task file.
 * 
 */
public final class FileTaskRunRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileTaskRunRequestResponse Empty = new FileTaskRunRequestResponse();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @InputImport(name="agentConfiguration")
    private final @Nullable AgentPropertiesResponse agentConfiguration;

    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return this.agentConfiguration == null ? Optional.empty() : Optional.ofNullable(this.agentConfiguration);
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @InputImport(name="agentPoolName")
    private final @Nullable String agentPoolName;

    public Optional<String> getAgentPoolName() {
        return this.agentPoolName == null ? Optional.empty() : Optional.ofNullable(this.agentPoolName);
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable CredentialsResponse credentials;

    public Optional<CredentialsResponse> getCredentials() {
        return this.credentials == null ? Optional.empty() : Optional.ofNullable(this.credentials);
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @InputImport(name="isArchiveEnabled")
    private final @Nullable Boolean isArchiveEnabled;

    public Optional<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Optional.empty() : Optional.ofNullable(this.isArchiveEnabled);
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @InputImport(name="logTemplate")
    private final @Nullable String logTemplate;

    public Optional<String> getLogTemplate() {
        return this.logTemplate == null ? Optional.empty() : Optional.ofNullable(this.logTemplate);
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @InputImport(name="platform", required=true)
    private final PlatformPropertiesResponse platform;

    public PlatformPropertiesResponse getPlatform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @InputImport(name="sourceLocation")
    private final @Nullable String sourceLocation;

    public Optional<String> getSourceLocation() {
        return this.sourceLocation == null ? Optional.empty() : Optional.ofNullable(this.sourceLocation);
    }

    /**
     * The template/definition file path relative to the source.
     * 
     */
    @InputImport(name="taskFilePath", required=true)
    private final String taskFilePath;

    public String getTaskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Integer timeout;

    public Optional<Integer> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * The type of the run request.
     * Expected value is 'FileTaskRunRequest'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @InputImport(name="values")
    private final @Nullable List<SetValueResponse> values;

    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    /**
     * The values/parameters file path relative to the source.
     * 
     */
    @InputImport(name="valuesFilePath")
    private final @Nullable String valuesFilePath;

    public Optional<String> getValuesFilePath() {
        return this.valuesFilePath == null ? Optional.empty() : Optional.ofNullable(this.valuesFilePath);
    }

    public FileTaskRunRequestResponse(
        @Nullable AgentPropertiesResponse agentConfiguration,
        @Nullable String agentPoolName,
        @Nullable CredentialsResponse credentials,
        @Nullable Boolean isArchiveEnabled,
        @Nullable String logTemplate,
        PlatformPropertiesResponse platform,
        @Nullable String sourceLocation,
        String taskFilePath,
        @Nullable Integer timeout,
        String type,
        @Nullable List<SetValueResponse> values,
        @Nullable String valuesFilePath) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.isArchiveEnabled = isArchiveEnabled == null ? false : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.taskFilePath = Objects.requireNonNull(taskFilePath, "expected parameter 'taskFilePath' to be non-null");
        this.timeout = timeout == null ? 3600 : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    private FileTaskRunRequestResponse() {
        this.agentConfiguration = null;
        this.agentPoolName = null;
        this.credentials = null;
        this.isArchiveEnabled = null;
        this.logTemplate = null;
        this.platform = null;
        this.sourceLocation = null;
        this.taskFilePath = null;
        this.timeout = null;
        this.type = null;
        this.values = List.of();
        this.valuesFilePath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable CredentialsResponse credentials;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String logTemplate;
        private PlatformPropertiesResponse platform;
        private @Nullable String sourceLocation;
        private String taskFilePath;
        private @Nullable Integer timeout;
        private String type;
        private @Nullable List<SetValueResponse> values;
        private @Nullable String valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setPlatform(PlatformPropertiesResponse platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setTaskFilePath(String taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }

        public Builder setValuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }

        public FileTaskRunRequestResponse build() {
            return new FileTaskRunRequestResponse(agentConfiguration, agentPoolName, credentials, isArchiveEnabled, logTemplate, platform, sourceLocation, taskFilePath, timeout, type, values, valuesFilePath);
        }
    }
}
