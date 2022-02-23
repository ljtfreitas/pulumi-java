// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.ArgumentArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters for a docker quick build.
 * 
 */
public final class DockerBuildRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerBuildRequestArgs Empty = new DockerBuildRequestArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @InputImport(name="agentConfiguration")
        private final @Nullable Input<AgentPropertiesArgs> agentConfiguration;

    public Input<AgentPropertiesArgs> getAgentConfiguration() {
        return this.agentConfiguration == null ? Input.empty() : this.agentConfiguration;
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @InputImport(name="agentPoolName")
        private final @Nullable Input<String> agentPoolName;

    public Input<String> getAgentPoolName() {
        return this.agentPoolName == null ? Input.empty() : this.agentPoolName;
    }

    /**
     * The collection of override arguments to be used when executing the run.
     * 
     */
    @InputImport(name="arguments")
        private final @Nullable Input<List<ArgumentArgs>> arguments;

    public Input<List<ArgumentArgs>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @InputImport(name="credentials")
        private final @Nullable Input<CredentialsArgs> credentials;

    public Input<CredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * The Docker file path relative to the source location.
     * 
     */
    @InputImport(name="dockerFilePath", required=true)
        private final Input<String> dockerFilePath;

    public Input<String> getDockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * The fully qualified image names including the repository and tag.
     * 
     */
    @InputImport(name="imageNames")
        private final @Nullable Input<List<String>> imageNames;

    public Input<List<String>> getImageNames() {
        return this.imageNames == null ? Input.empty() : this.imageNames;
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @InputImport(name="isArchiveEnabled")
        private final @Nullable Input<Boolean> isArchiveEnabled;

    public Input<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Input.empty() : this.isArchiveEnabled;
    }

    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
     */
    @InputImport(name="isPushEnabled")
        private final @Nullable Input<Boolean> isPushEnabled;

    public Input<Boolean> getIsPushEnabled() {
        return this.isPushEnabled == null ? Input.empty() : this.isPushEnabled;
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @InputImport(name="logTemplate")
        private final @Nullable Input<String> logTemplate;

    public Input<String> getLogTemplate() {
        return this.logTemplate == null ? Input.empty() : this.logTemplate;
    }

    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
     */
    @InputImport(name="noCache")
        private final @Nullable Input<Boolean> noCache;

    public Input<Boolean> getNoCache() {
        return this.noCache == null ? Input.empty() : this.noCache;
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @InputImport(name="platform", required=true)
        private final Input<PlatformPropertiesArgs> platform;

    public Input<PlatformPropertiesArgs> getPlatform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @InputImport(name="sourceLocation")
        private final @Nullable Input<String> sourceLocation;

    public Input<String> getSourceLocation() {
        return this.sourceLocation == null ? Input.empty() : this.sourceLocation;
    }

    /**
     * The name of the target build stage for the docker build.
     * 
     */
    @InputImport(name="target")
        private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @InputImport(name="timeout")
        private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The type of the run request.
     * Expected value is 'DockerBuildRequest'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DockerBuildRequestArgs(
        @Nullable Input<AgentPropertiesArgs> agentConfiguration,
        @Nullable Input<String> agentPoolName,
        @Nullable Input<List<ArgumentArgs>> arguments,
        @Nullable Input<CredentialsArgs> credentials,
        Input<String> dockerFilePath,
        @Nullable Input<List<String>> imageNames,
        @Nullable Input<Boolean> isArchiveEnabled,
        @Nullable Input<Boolean> isPushEnabled,
        @Nullable Input<String> logTemplate,
        @Nullable Input<Boolean> noCache,
        Input<PlatformPropertiesArgs> platform,
        @Nullable Input<String> sourceLocation,
        @Nullable Input<String> target,
        @Nullable Input<Integer> timeout,
        Input<String> type) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.arguments = arguments;
        this.credentials = credentials;
        this.dockerFilePath = Objects.requireNonNull(dockerFilePath, "expected parameter 'dockerFilePath' to be non-null");
        this.imageNames = imageNames;
        this.isArchiveEnabled = isArchiveEnabled == null ? Input.ofNullable(false) : isArchiveEnabled;
        this.isPushEnabled = isPushEnabled == null ? Input.ofNullable(true) : isPushEnabled;
        this.logTemplate = logTemplate;
        this.noCache = noCache == null ? Input.ofNullable(false) : noCache;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.target = target;
        this.timeout = timeout == null ? Input.ofNullable(3600) : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DockerBuildRequestArgs() {
        this.agentConfiguration = Input.empty();
        this.agentPoolName = Input.empty();
        this.arguments = Input.empty();
        this.credentials = Input.empty();
        this.dockerFilePath = Input.empty();
        this.imageNames = Input.empty();
        this.isArchiveEnabled = Input.empty();
        this.isPushEnabled = Input.empty();
        this.logTemplate = Input.empty();
        this.noCache = Input.empty();
        this.platform = Input.empty();
        this.sourceLocation = Input.empty();
        this.target = Input.empty();
        this.timeout = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Input<String> agentPoolName;
        private @Nullable Input<List<ArgumentArgs>> arguments;
        private @Nullable Input<CredentialsArgs> credentials;
        private Input<String> dockerFilePath;
        private @Nullable Input<List<String>> imageNames;
        private @Nullable Input<Boolean> isArchiveEnabled;
        private @Nullable Input<Boolean> isPushEnabled;
        private @Nullable Input<String> logTemplate;
        private @Nullable Input<Boolean> noCache;
        private Input<PlatformPropertiesArgs> platform;
        private @Nullable Input<String> sourceLocation;
        private @Nullable Input<String> target;
        private @Nullable Input<Integer> timeout;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.arguments = defaults.arguments;
    	      this.credentials = defaults.credentials;
    	      this.dockerFilePath = defaults.dockerFilePath;
    	      this.imageNames = defaults.imageNames;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.noCache = defaults.noCache;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
        }

        public Builder setAgentConfiguration(@Nullable Input<AgentPropertiesArgs> agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesArgs agentConfiguration) {
            this.agentConfiguration = Input.ofNullable(agentConfiguration);
            return this;
        }

        public Builder setAgentPoolName(@Nullable Input<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Input.ofNullable(agentPoolName);
            return this;
        }

        public Builder setArguments(@Nullable Input<List<ArgumentArgs>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable List<ArgumentArgs> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setCredentials(@Nullable Input<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setDockerFilePath(Input<String> dockerFilePath) {
            this.dockerFilePath = Objects.requireNonNull(dockerFilePath);
            return this;
        }

        public Builder setDockerFilePath(String dockerFilePath) {
            this.dockerFilePath = Input.of(Objects.requireNonNull(dockerFilePath));
            return this;
        }

        public Builder setImageNames(@Nullable Input<List<String>> imageNames) {
            this.imageNames = imageNames;
            return this;
        }

        public Builder setImageNames(@Nullable List<String> imageNames) {
            this.imageNames = Input.ofNullable(imageNames);
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Input<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Input.ofNullable(isArchiveEnabled);
            return this;
        }

        public Builder setIsPushEnabled(@Nullable Input<Boolean> isPushEnabled) {
            this.isPushEnabled = isPushEnabled;
            return this;
        }

        public Builder setIsPushEnabled(@Nullable Boolean isPushEnabled) {
            this.isPushEnabled = Input.ofNullable(isPushEnabled);
            return this;
        }

        public Builder setLogTemplate(@Nullable Input<String> logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = Input.ofNullable(logTemplate);
            return this;
        }

        public Builder setNoCache(@Nullable Input<Boolean> noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder setNoCache(@Nullable Boolean noCache) {
            this.noCache = Input.ofNullable(noCache);
            return this;
        }

        public Builder setPlatform(Input<PlatformPropertiesArgs> platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setPlatform(PlatformPropertiesArgs platform) {
            this.platform = Input.of(Objects.requireNonNull(platform));
            return this;
        }

        public Builder setSourceLocation(@Nullable Input<String> sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = Input.ofNullable(sourceLocation);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
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
        public DockerBuildRequestArgs build() {
            return new DockerBuildRequestArgs(agentConfiguration, agentPoolName, arguments, credentials, dockerFilePath, imageNames, isArchiveEnabled, isPushEnabled, logTemplate, noCache, platform, sourceLocation, target, timeout, type);
        }
    }
}
