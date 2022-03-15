// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters for a quick task run request.
 * 
 */
public final class EncodedTaskRunRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncodedTaskRunRequestArgs Empty = new EncodedTaskRunRequestArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @Import(name="agentConfiguration")
      private final @Nullable Output<AgentPropertiesArgs> agentConfiguration;

    public Output<AgentPropertiesArgs> getAgentConfiguration() {
        return this.agentConfiguration == null ? Output.empty() : this.agentConfiguration;
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @Import(name="agentPoolName")
      private final @Nullable Output<String> agentPoolName;

    public Output<String> getAgentPoolName() {
        return this.agentPoolName == null ? Output.empty() : this.agentPoolName;
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<CredentialsArgs> credentials;

    public Output<CredentialsArgs> getCredentials() {
        return this.credentials == null ? Output.empty() : this.credentials;
    }

    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    @Import(name="encodedTaskContent", required=true)
      private final Output<String> encodedTaskContent;

    public Output<String> getEncodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    @Import(name="encodedValuesContent")
      private final @Nullable Output<String> encodedValuesContent;

    public Output<String> getEncodedValuesContent() {
        return this.encodedValuesContent == null ? Output.empty() : this.encodedValuesContent;
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @Import(name="isArchiveEnabled")
      private final @Nullable Output<Boolean> isArchiveEnabled;

    public Output<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Output.empty() : this.isArchiveEnabled;
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @Import(name="logTemplate")
      private final @Nullable Output<String> logTemplate;

    public Output<String> getLogTemplate() {
        return this.logTemplate == null ? Output.empty() : this.logTemplate;
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @Import(name="platform", required=true)
      private final Output<PlatformPropertiesArgs> platform;

    public Output<PlatformPropertiesArgs> getPlatform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @Import(name="sourceLocation")
      private final @Nullable Output<String> sourceLocation;

    public Output<String> getSourceLocation() {
        return this.sourceLocation == null ? Output.empty() : this.sourceLocation;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The type of the run request.
     * Expected value is 'EncodedTaskRunRequest'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<SetValueArgs>> values;

    public Output<List<SetValueArgs>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public EncodedTaskRunRequestArgs(
        @Nullable Output<AgentPropertiesArgs> agentConfiguration,
        @Nullable Output<String> agentPoolName,
        @Nullable Output<CredentialsArgs> credentials,
        Output<String> encodedTaskContent,
        @Nullable Output<String> encodedValuesContent,
        @Nullable Output<Boolean> isArchiveEnabled,
        @Nullable Output<String> logTemplate,
        Output<PlatformPropertiesArgs> platform,
        @Nullable Output<String> sourceLocation,
        @Nullable Output<Integer> timeout,
        Output<String> type,
        @Nullable Output<List<SetValueArgs>> values) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent, "expected parameter 'encodedTaskContent' to be non-null");
        this.encodedValuesContent = encodedValuesContent;
        this.isArchiveEnabled = isArchiveEnabled == null ? Output.ofNullable(false) : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.timeout = timeout == null ? Output.ofNullable(3600) : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private EncodedTaskRunRequestArgs() {
        this.agentConfiguration = Output.empty();
        this.agentPoolName = Output.empty();
        this.credentials = Output.empty();
        this.encodedTaskContent = Output.empty();
        this.encodedValuesContent = Output.empty();
        this.isArchiveEnabled = Output.empty();
        this.logTemplate = Output.empty();
        this.platform = Output.empty();
        this.sourceLocation = Output.empty();
        this.timeout = Output.empty();
        this.type = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Output<String> agentPoolName;
        private @Nullable Output<CredentialsArgs> credentials;
        private Output<String> encodedTaskContent;
        private @Nullable Output<String> encodedValuesContent;
        private @Nullable Output<Boolean> isArchiveEnabled;
        private @Nullable Output<String> logTemplate;
        private Output<PlatformPropertiesArgs> platform;
        private @Nullable Output<String> sourceLocation;
        private @Nullable Output<Integer> timeout;
        private Output<String> type;
        private @Nullable Output<List<SetValueArgs>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskRunRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder agentConfiguration(@Nullable Output<AgentPropertiesArgs> agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder agentConfiguration(@Nullable AgentPropertiesArgs agentConfiguration) {
            this.agentConfiguration = Output.ofNullable(agentConfiguration);
            return this;
        }

        public Builder agentPoolName(@Nullable Output<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Output.ofNullable(agentPoolName);
            return this;
        }

        public Builder credentials(@Nullable Output<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder credentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Output.ofNullable(credentials);
            return this;
        }

        public Builder encodedTaskContent(Output<String> encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }

        public Builder encodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Output.of(Objects.requireNonNull(encodedTaskContent));
            return this;
        }

        public Builder encodedValuesContent(@Nullable Output<String> encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }

        public Builder encodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = Output.ofNullable(encodedValuesContent);
            return this;
        }

        public Builder isArchiveEnabled(@Nullable Output<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Output.ofNullable(isArchiveEnabled);
            return this;
        }

        public Builder logTemplate(@Nullable Output<String> logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder logTemplate(@Nullable String logTemplate) {
            this.logTemplate = Output.ofNullable(logTemplate);
            return this;
        }

        public Builder platform(Output<PlatformPropertiesArgs> platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder platform(PlatformPropertiesArgs platform) {
            this.platform = Output.of(Objects.requireNonNull(platform));
            return this;
        }

        public Builder sourceLocation(@Nullable Output<String> sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder sourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = Output.ofNullable(sourceLocation);
            return this;
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<SetValueArgs> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public EncodedTaskRunRequestArgs build() {
            return new EncodedTaskRunRequestArgs(agentConfiguration, agentPoolName, credentials, encodedTaskContent, encodedValuesContent, isArchiveEnabled, logTemplate, platform, sourceLocation, timeout, type, values);
        }
    }
}
