// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageArgs Empty = new StageArgs();

    /**
     * Enables access logs for the API stage. Detailed below.
     * 
     */
    @InputImport(name="accessLogSettings")
    private final @Nullable Input<StageAccessLogSettingsArgs> accessLogSettings;

    public Input<StageAccessLogSettingsArgs> getAccessLogSettings() {
        return this.accessLogSettings == null ? Input.empty() : this.accessLogSettings;
    }

    /**
     * Specifies whether a cache cluster is enabled for the stage
     * 
     */
    @InputImport(name="cacheClusterEnabled")
    private final @Nullable Input<Boolean> cacheClusterEnabled;

    public Input<Boolean> getCacheClusterEnabled() {
        return this.cacheClusterEnabled == null ? Input.empty() : this.cacheClusterEnabled;
    }

    /**
     * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     * 
     */
    @InputImport(name="cacheClusterSize")
    private final @Nullable Input<String> cacheClusterSize;

    public Input<String> getCacheClusterSize() {
        return this.cacheClusterSize == null ? Input.empty() : this.cacheClusterSize;
    }

    /**
     * The identifier of a client certificate for the stage.
     * 
     */
    @InputImport(name="clientCertificateId")
    private final @Nullable Input<String> clientCertificateId;

    public Input<String> getClientCertificateId() {
        return this.clientCertificateId == null ? Input.empty() : this.clientCertificateId;
    }

    /**
     * The ID of the deployment that the stage points to
     * 
     */
    @InputImport(name="deployment", required=true)
    private final Input<String> deployment;

    public Input<String> getDeployment() {
        return this.deployment;
    }

    /**
     * The description of the stage
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The version of the associated API documentation
     * 
     */
    @InputImport(name="documentationVersion")
    private final @Nullable Input<String> documentationVersion;

    public Input<String> getDocumentationVersion() {
        return this.documentationVersion == null ? Input.empty() : this.documentationVersion;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @InputImport(name="restApi", required=true)
    private final Input<String> restApi;

    public Input<String> getRestApi() {
        return this.restApi;
    }

    /**
     * The name of the stage
     * 
     */
    @InputImport(name="stageName", required=true)
    private final Input<String> stageName;

    public Input<String> getStageName() {
        return this.stageName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map that defines the stage variables
     * 
     */
    @InputImport(name="variables")
    private final @Nullable Input<Map<String,String>> variables;

    public Input<Map<String,String>> getVariables() {
        return this.variables == null ? Input.empty() : this.variables;
    }

    /**
     * Whether active tracing with X-ray is enabled. Defaults to `false`.
     * 
     */
    @InputImport(name="xrayTracingEnabled")
    private final @Nullable Input<Boolean> xrayTracingEnabled;

    public Input<Boolean> getXrayTracingEnabled() {
        return this.xrayTracingEnabled == null ? Input.empty() : this.xrayTracingEnabled;
    }

    public StageArgs(
        @Nullable Input<StageAccessLogSettingsArgs> accessLogSettings,
        @Nullable Input<Boolean> cacheClusterEnabled,
        @Nullable Input<String> cacheClusterSize,
        @Nullable Input<String> clientCertificateId,
        Input<String> deployment,
        @Nullable Input<String> description,
        @Nullable Input<String> documentationVersion,
        Input<String> restApi,
        Input<String> stageName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> variables,
        @Nullable Input<Boolean> xrayTracingEnabled) {
        this.accessLogSettings = accessLogSettings;
        this.cacheClusterEnabled = cacheClusterEnabled;
        this.cacheClusterSize = cacheClusterSize;
        this.clientCertificateId = clientCertificateId;
        this.deployment = Objects.requireNonNull(deployment, "expected parameter 'deployment' to be non-null");
        this.description = description;
        this.documentationVersion = documentationVersion;
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
        this.stageName = Objects.requireNonNull(stageName, "expected parameter 'stageName' to be non-null");
        this.tags = tags;
        this.variables = variables;
        this.xrayTracingEnabled = xrayTracingEnabled;
    }

    private StageArgs() {
        this.accessLogSettings = Input.empty();
        this.cacheClusterEnabled = Input.empty();
        this.cacheClusterSize = Input.empty();
        this.clientCertificateId = Input.empty();
        this.deployment = Input.empty();
        this.description = Input.empty();
        this.documentationVersion = Input.empty();
        this.restApi = Input.empty();
        this.stageName = Input.empty();
        this.tags = Input.empty();
        this.variables = Input.empty();
        this.xrayTracingEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StageAccessLogSettingsArgs> accessLogSettings;
        private @Nullable Input<Boolean> cacheClusterEnabled;
        private @Nullable Input<String> cacheClusterSize;
        private @Nullable Input<String> clientCertificateId;
        private Input<String> deployment;
        private @Nullable Input<String> description;
        private @Nullable Input<String> documentationVersion;
        private Input<String> restApi;
        private Input<String> stageName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> variables;
        private @Nullable Input<Boolean> xrayTracingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSettings = defaults.accessLogSettings;
    	      this.cacheClusterEnabled = defaults.cacheClusterEnabled;
    	      this.cacheClusterSize = defaults.cacheClusterSize;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.deployment = defaults.deployment;
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.restApi = defaults.restApi;
    	      this.stageName = defaults.stageName;
    	      this.tags = defaults.tags;
    	      this.variables = defaults.variables;
    	      this.xrayTracingEnabled = defaults.xrayTracingEnabled;
        }

        public Builder setAccessLogSettings(@Nullable Input<StageAccessLogSettingsArgs> accessLogSettings) {
            this.accessLogSettings = accessLogSettings;
            return this;
        }

        public Builder setAccessLogSettings(@Nullable StageAccessLogSettingsArgs accessLogSettings) {
            this.accessLogSettings = Input.ofNullable(accessLogSettings);
            return this;
        }

        public Builder setCacheClusterEnabled(@Nullable Input<Boolean> cacheClusterEnabled) {
            this.cacheClusterEnabled = cacheClusterEnabled;
            return this;
        }

        public Builder setCacheClusterEnabled(@Nullable Boolean cacheClusterEnabled) {
            this.cacheClusterEnabled = Input.ofNullable(cacheClusterEnabled);
            return this;
        }

        public Builder setCacheClusterSize(@Nullable Input<String> cacheClusterSize) {
            this.cacheClusterSize = cacheClusterSize;
            return this;
        }

        public Builder setCacheClusterSize(@Nullable String cacheClusterSize) {
            this.cacheClusterSize = Input.ofNullable(cacheClusterSize);
            return this;
        }

        public Builder setClientCertificateId(@Nullable Input<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder setClientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Input.ofNullable(clientCertificateId);
            return this;
        }

        public Builder setDeployment(Input<String> deployment) {
            this.deployment = Objects.requireNonNull(deployment);
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

        public Builder setDocumentationVersion(@Nullable Input<String> documentationVersion) {
            this.documentationVersion = documentationVersion;
            return this;
        }

        public Builder setDocumentationVersion(@Nullable String documentationVersion) {
            this.documentationVersion = Input.ofNullable(documentationVersion);
            return this;
        }

        public Builder setRestApi(Input<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }

        public Builder setStageName(Input<String> stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }

        public Builder setStageName(String stageName) {
            this.stageName = Input.of(Objects.requireNonNull(stageName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVariables(@Nullable Input<Map<String,String>> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setVariables(@Nullable Map<String,String> variables) {
            this.variables = Input.ofNullable(variables);
            return this;
        }

        public Builder setXrayTracingEnabled(@Nullable Input<Boolean> xrayTracingEnabled) {
            this.xrayTracingEnabled = xrayTracingEnabled;
            return this;
        }

        public Builder setXrayTracingEnabled(@Nullable Boolean xrayTracingEnabled) {
            this.xrayTracingEnabled = Input.ofNullable(xrayTracingEnabled);
            return this;
        }
        public StageArgs build() {
            return new StageArgs(accessLogSettings, cacheClusterEnabled, cacheClusterSize, clientCertificateId, deployment, description, documentationVersion, restApi, stageName, tags, variables, xrayTracingEnabled);
        }
    }
}
