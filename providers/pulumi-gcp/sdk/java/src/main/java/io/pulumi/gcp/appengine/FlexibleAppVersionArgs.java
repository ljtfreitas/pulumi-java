// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionApiConfigArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionEndpointsApiServiceArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionEntrypointArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionLivenessCheckArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionManualScalingArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionNetworkArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionReadinessCheckArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionVpcAccessConnectorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionArgs Empty = new FlexibleAppVersionArgs();

    /**
     * Serving configuration for Google Cloud Endpoints.
     * Structure is documented below.
     * 
     */
    @Import(name="apiConfig")
      private final @Nullable Output<FlexibleAppVersionApiConfigArgs> apiConfig;

    public Output<FlexibleAppVersionApiConfigArgs> getApiConfig() {
        return this.apiConfig == null ? Output.empty() : this.apiConfig;
    }

    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics.
     * Structure is documented below.
     * 
     */
    @Import(name="automaticScaling")
      private final @Nullable Output<FlexibleAppVersionAutomaticScalingArgs> automaticScaling;

    public Output<FlexibleAppVersionAutomaticScalingArgs> getAutomaticScaling() {
        return this.automaticScaling == null ? Output.empty() : this.automaticScaling;
    }

    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    @Import(name="betaSettings")
      private final @Nullable Output<Map<String,String>> betaSettings;

    public Output<Map<String,String>> getBetaSettings() {
        return this.betaSettings == null ? Output.empty() : this.betaSettings;
    }

    /**
     * Duration that static files should be cached by web proxies and browsers.
     * Only applicable if the corresponding StaticFilesHandler does not specify its own expiration time.
     * 
     */
    @Import(name="defaultExpiration")
      private final @Nullable Output<String> defaultExpiration;

    public Output<String> getDefaultExpiration() {
        return this.defaultExpiration == null ? Output.empty() : this.defaultExpiration;
    }

    /**
     * If set to `true`, the service will be deleted if it is the last version.
     * 
     */
    @Import(name="deleteServiceOnDestroy")
      private final @Nullable Output<Boolean> deleteServiceOnDestroy;

    public Output<Boolean> getDeleteServiceOnDestroy() {
        return this.deleteServiceOnDestroy == null ? Output.empty() : this.deleteServiceOnDestroy;
    }

    /**
     * Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    @Import(name="deployment")
      private final @Nullable Output<FlexibleAppVersionDeploymentArgs> deployment;

    public Output<FlexibleAppVersionDeploymentArgs> getDeployment() {
        return this.deployment == null ? Output.empty() : this.deployment;
    }

    /**
     * Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    @Import(name="endpointsApiService")
      private final @Nullable Output<FlexibleAppVersionEndpointsApiServiceArgs> endpointsApiService;

    public Output<FlexibleAppVersionEndpointsApiServiceArgs> getEndpointsApiService() {
        return this.endpointsApiService == null ? Output.empty() : this.endpointsApiService;
    }

    /**
     * The entrypoint for the application.
     * Structure is documented below.
     * 
     */
    @Import(name="entrypoint")
      private final @Nullable Output<FlexibleAppVersionEntrypointArgs> entrypoint;

    public Output<FlexibleAppVersionEntrypointArgs> getEntrypoint() {
        return this.entrypoint == null ? Output.empty() : this.entrypoint;
    }

    /**
     * Environment variables available to the application.  As these are not returned in the API request, the provider will not detect any changes made outside of the config.
     * 
     */
    @Import(name="envVariables")
      private final @Nullable Output<Map<String,String>> envVariables;

    public Output<Map<String,String>> getEnvVariables() {
        return this.envVariables == null ? Output.empty() : this.envVariables;
    }

    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests.
     * The first matching URL handles the request and other request handlers are not attempted.
     * Structure is documented below.
     * 
     */
    @Import(name="handlers")
      private final @Nullable Output<List<FlexibleAppVersionHandlerArgs>> handlers;

    public Output<List<FlexibleAppVersionHandlerArgs>> getHandlers() {
        return this.handlers == null ? Output.empty() : this.handlers;
    }

    /**
     * A list of the types of messages that this application is able to receive.
     * Each value may be one of `INBOUND_SERVICE_MAIL`, `INBOUND_SERVICE_MAIL_BOUNCE`, `INBOUND_SERVICE_XMPP_ERROR`, `INBOUND_SERVICE_XMPP_MESSAGE`, `INBOUND_SERVICE_XMPP_SUBSCRIBE`, `INBOUND_SERVICE_XMPP_PRESENCE`, `INBOUND_SERVICE_CHANNEL_PRESENCE`, and `INBOUND_SERVICE_WARMUP`.
     * 
     */
    @Import(name="inboundServices")
      private final @Nullable Output<List<String>> inboundServices;

    public Output<List<String>> getInboundServices() {
        return this.inboundServices == null ? Output.empty() : this.inboundServices;
    }

    /**
     * Instance class that is used to run this version. Valid values are
     * AutomaticScaling: F1, F2, F4, F4_1G
     * ManualScaling: B1, B2, B4, B8, B4_1G
     * Defaults to F1 for AutomaticScaling and B1 for ManualScaling.
     * 
     */
    @Import(name="instanceClass")
      private final @Nullable Output<String> instanceClass;

    public Output<String> getInstanceClass() {
        return this.instanceClass == null ? Output.empty() : this.instanceClass;
    }

    /**
     * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
     * Structure is documented below.
     * 
     */
    @Import(name="livenessCheck", required=true)
      private final Output<FlexibleAppVersionLivenessCheckArgs> livenessCheck;

    public Output<FlexibleAppVersionLivenessCheckArgs> getLivenessCheck() {
        return this.livenessCheck;
    }

    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    @Import(name="manualScaling")
      private final @Nullable Output<FlexibleAppVersionManualScalingArgs> manualScaling;

    public Output<FlexibleAppVersionManualScalingArgs> getManualScaling() {
        return this.manualScaling == null ? Output.empty() : this.manualScaling;
    }

    /**
     * Extra network settings
     * Structure is documented below.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<FlexibleAppVersionNetworkArgs> network;

    public Output<FlexibleAppVersionNetworkArgs> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.
     * 
     */
    @Import(name="nobuildFilesRegex")
      private final @Nullable Output<String> nobuildFilesRegex;

    public Output<String> getNobuildFilesRegex() {
        return this.nobuildFilesRegex == null ? Output.empty() : this.nobuildFilesRegex;
    }

    /**
     * If set to `true`, the application version will not be deleted.
     * 
     */
    @Import(name="noopOnDestroy")
      private final @Nullable Output<Boolean> noopOnDestroy;

    public Output<Boolean> getNoopOnDestroy() {
        return this.noopOnDestroy == null ? Output.empty() : this.noopOnDestroy;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.
     * Structure is documented below.
     * 
     */
    @Import(name="readinessCheck", required=true)
      private final Output<FlexibleAppVersionReadinessCheckArgs> readinessCheck;

    public Output<FlexibleAppVersionReadinessCheckArgs> getReadinessCheck() {
        return this.readinessCheck;
    }

    /**
     * Machine resources for a version.
     * Structure is documented below.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<FlexibleAppVersionResourcesArgs> resources;

    public Output<FlexibleAppVersionResourcesArgs> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * Desired runtime. Example python27.
     * 
     */
    @Import(name="runtime", required=true)
      private final Output<String> runtime;

    public Output<String> getRuntime() {
        return this.runtime;
    }

    /**
     * The version of the API in the given runtime environment.
     * Please see the app.yaml reference for valid values at `https://cloud.google.com/appengine/docs/standard/<language>/config/appref`\
     * Substitute `<language>` with `python`, `java`, `php`, `ruby`, `go` or `nodejs`.
     * 
     */
    @Import(name="runtimeApiVersion")
      private final @Nullable Output<String> runtimeApiVersion;

    public Output<String> getRuntimeApiVersion() {
        return this.runtimeApiVersion == null ? Output.empty() : this.runtimeApiVersion;
    }

    /**
     * The channel of the runtime to use. Only available for some runtimes.
     * 
     */
    @Import(name="runtimeChannel")
      private final @Nullable Output<String> runtimeChannel;

    public Output<String> getRuntimeChannel() {
        return this.runtimeChannel == null ? Output.empty() : this.runtimeChannel;
    }

    /**
     * The path or name of the app's main executable.
     * 
     */
    @Import(name="runtimeMainExecutablePath")
      private final @Nullable Output<String> runtimeMainExecutablePath;

    public Output<String> getRuntimeMainExecutablePath() {
        return this.runtimeMainExecutablePath == null ? Output.empty() : this.runtimeMainExecutablePath;
    }

    /**
     * AppEngine service resource. Can contain numbers, letters, and hyphens.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.
     * Default value is `SERVING`.
     * Possible values are `SERVING` and `STOPPED`.
     * 
     */
    @Import(name="servingStatus")
      private final @Nullable Output<String> servingStatus;

    public Output<String> getServingStatus() {
        return this.servingStatus == null ? Output.empty() : this.servingStatus;
    }

    /**
     * Relative name of the version within the service. For example, `v1`. Version names can contain only lowercase letters, numbers, or hyphens.
     * Reserved names,"default", "latest", and any name with the prefix "ah-".
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId == null ? Output.empty() : this.versionId;
    }

    /**
     * Enables VPC connectivity for standard apps.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcAccessConnector")
      private final @Nullable Output<FlexibleAppVersionVpcAccessConnectorArgs> vpcAccessConnector;

    public Output<FlexibleAppVersionVpcAccessConnectorArgs> getVpcAccessConnector() {
        return this.vpcAccessConnector == null ? Output.empty() : this.vpcAccessConnector;
    }

    public FlexibleAppVersionArgs(
        @Nullable Output<FlexibleAppVersionApiConfigArgs> apiConfig,
        @Nullable Output<FlexibleAppVersionAutomaticScalingArgs> automaticScaling,
        @Nullable Output<Map<String,String>> betaSettings,
        @Nullable Output<String> defaultExpiration,
        @Nullable Output<Boolean> deleteServiceOnDestroy,
        @Nullable Output<FlexibleAppVersionDeploymentArgs> deployment,
        @Nullable Output<FlexibleAppVersionEndpointsApiServiceArgs> endpointsApiService,
        @Nullable Output<FlexibleAppVersionEntrypointArgs> entrypoint,
        @Nullable Output<Map<String,String>> envVariables,
        @Nullable Output<List<FlexibleAppVersionHandlerArgs>> handlers,
        @Nullable Output<List<String>> inboundServices,
        @Nullable Output<String> instanceClass,
        Output<FlexibleAppVersionLivenessCheckArgs> livenessCheck,
        @Nullable Output<FlexibleAppVersionManualScalingArgs> manualScaling,
        @Nullable Output<FlexibleAppVersionNetworkArgs> network,
        @Nullable Output<String> nobuildFilesRegex,
        @Nullable Output<Boolean> noopOnDestroy,
        @Nullable Output<String> project,
        Output<FlexibleAppVersionReadinessCheckArgs> readinessCheck,
        @Nullable Output<FlexibleAppVersionResourcesArgs> resources,
        Output<String> runtime,
        @Nullable Output<String> runtimeApiVersion,
        @Nullable Output<String> runtimeChannel,
        @Nullable Output<String> runtimeMainExecutablePath,
        Output<String> service,
        @Nullable Output<String> servingStatus,
        @Nullable Output<String> versionId,
        @Nullable Output<FlexibleAppVersionVpcAccessConnectorArgs> vpcAccessConnector) {
        this.apiConfig = apiConfig;
        this.automaticScaling = automaticScaling;
        this.betaSettings = betaSettings;
        this.defaultExpiration = defaultExpiration;
        this.deleteServiceOnDestroy = deleteServiceOnDestroy;
        this.deployment = deployment;
        this.endpointsApiService = endpointsApiService;
        this.entrypoint = entrypoint;
        this.envVariables = envVariables;
        this.handlers = handlers;
        this.inboundServices = inboundServices;
        this.instanceClass = instanceClass;
        this.livenessCheck = Objects.requireNonNull(livenessCheck, "expected parameter 'livenessCheck' to be non-null");
        this.manualScaling = manualScaling;
        this.network = network;
        this.nobuildFilesRegex = nobuildFilesRegex;
        this.noopOnDestroy = noopOnDestroy;
        this.project = project;
        this.readinessCheck = Objects.requireNonNull(readinessCheck, "expected parameter 'readinessCheck' to be non-null");
        this.resources = resources;
        this.runtime = Objects.requireNonNull(runtime, "expected parameter 'runtime' to be non-null");
        this.runtimeApiVersion = runtimeApiVersion;
        this.runtimeChannel = runtimeChannel;
        this.runtimeMainExecutablePath = runtimeMainExecutablePath;
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.servingStatus = servingStatus;
        this.versionId = versionId;
        this.vpcAccessConnector = vpcAccessConnector;
    }

    private FlexibleAppVersionArgs() {
        this.apiConfig = Output.empty();
        this.automaticScaling = Output.empty();
        this.betaSettings = Output.empty();
        this.defaultExpiration = Output.empty();
        this.deleteServiceOnDestroy = Output.empty();
        this.deployment = Output.empty();
        this.endpointsApiService = Output.empty();
        this.entrypoint = Output.empty();
        this.envVariables = Output.empty();
        this.handlers = Output.empty();
        this.inboundServices = Output.empty();
        this.instanceClass = Output.empty();
        this.livenessCheck = Output.empty();
        this.manualScaling = Output.empty();
        this.network = Output.empty();
        this.nobuildFilesRegex = Output.empty();
        this.noopOnDestroy = Output.empty();
        this.project = Output.empty();
        this.readinessCheck = Output.empty();
        this.resources = Output.empty();
        this.runtime = Output.empty();
        this.runtimeApiVersion = Output.empty();
        this.runtimeChannel = Output.empty();
        this.runtimeMainExecutablePath = Output.empty();
        this.service = Output.empty();
        this.servingStatus = Output.empty();
        this.versionId = Output.empty();
        this.vpcAccessConnector = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlexibleAppVersionApiConfigArgs> apiConfig;
        private @Nullable Output<FlexibleAppVersionAutomaticScalingArgs> automaticScaling;
        private @Nullable Output<Map<String,String>> betaSettings;
        private @Nullable Output<String> defaultExpiration;
        private @Nullable Output<Boolean> deleteServiceOnDestroy;
        private @Nullable Output<FlexibleAppVersionDeploymentArgs> deployment;
        private @Nullable Output<FlexibleAppVersionEndpointsApiServiceArgs> endpointsApiService;
        private @Nullable Output<FlexibleAppVersionEntrypointArgs> entrypoint;
        private @Nullable Output<Map<String,String>> envVariables;
        private @Nullable Output<List<FlexibleAppVersionHandlerArgs>> handlers;
        private @Nullable Output<List<String>> inboundServices;
        private @Nullable Output<String> instanceClass;
        private Output<FlexibleAppVersionLivenessCheckArgs> livenessCheck;
        private @Nullable Output<FlexibleAppVersionManualScalingArgs> manualScaling;
        private @Nullable Output<FlexibleAppVersionNetworkArgs> network;
        private @Nullable Output<String> nobuildFilesRegex;
        private @Nullable Output<Boolean> noopOnDestroy;
        private @Nullable Output<String> project;
        private Output<FlexibleAppVersionReadinessCheckArgs> readinessCheck;
        private @Nullable Output<FlexibleAppVersionResourcesArgs> resources;
        private Output<String> runtime;
        private @Nullable Output<String> runtimeApiVersion;
        private @Nullable Output<String> runtimeChannel;
        private @Nullable Output<String> runtimeMainExecutablePath;
        private Output<String> service;
        private @Nullable Output<String> servingStatus;
        private @Nullable Output<String> versionId;
        private @Nullable Output<FlexibleAppVersionVpcAccessConnectorArgs> vpcAccessConnector;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.automaticScaling = defaults.automaticScaling;
    	      this.betaSettings = defaults.betaSettings;
    	      this.defaultExpiration = defaults.defaultExpiration;
    	      this.deleteServiceOnDestroy = defaults.deleteServiceOnDestroy;
    	      this.deployment = defaults.deployment;
    	      this.endpointsApiService = defaults.endpointsApiService;
    	      this.entrypoint = defaults.entrypoint;
    	      this.envVariables = defaults.envVariables;
    	      this.handlers = defaults.handlers;
    	      this.inboundServices = defaults.inboundServices;
    	      this.instanceClass = defaults.instanceClass;
    	      this.livenessCheck = defaults.livenessCheck;
    	      this.manualScaling = defaults.manualScaling;
    	      this.network = defaults.network;
    	      this.nobuildFilesRegex = defaults.nobuildFilesRegex;
    	      this.noopOnDestroy = defaults.noopOnDestroy;
    	      this.project = defaults.project;
    	      this.readinessCheck = defaults.readinessCheck;
    	      this.resources = defaults.resources;
    	      this.runtime = defaults.runtime;
    	      this.runtimeApiVersion = defaults.runtimeApiVersion;
    	      this.runtimeChannel = defaults.runtimeChannel;
    	      this.runtimeMainExecutablePath = defaults.runtimeMainExecutablePath;
    	      this.service = defaults.service;
    	      this.servingStatus = defaults.servingStatus;
    	      this.versionId = defaults.versionId;
    	      this.vpcAccessConnector = defaults.vpcAccessConnector;
        }

        public Builder apiConfig(@Nullable Output<FlexibleAppVersionApiConfigArgs> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        public Builder apiConfig(@Nullable FlexibleAppVersionApiConfigArgs apiConfig) {
            this.apiConfig = Output.ofNullable(apiConfig);
            return this;
        }

        public Builder automaticScaling(@Nullable Output<FlexibleAppVersionAutomaticScalingArgs> automaticScaling) {
            this.automaticScaling = automaticScaling;
            return this;
        }

        public Builder automaticScaling(@Nullable FlexibleAppVersionAutomaticScalingArgs automaticScaling) {
            this.automaticScaling = Output.ofNullable(automaticScaling);
            return this;
        }

        public Builder betaSettings(@Nullable Output<Map<String,String>> betaSettings) {
            this.betaSettings = betaSettings;
            return this;
        }

        public Builder betaSettings(@Nullable Map<String,String> betaSettings) {
            this.betaSettings = Output.ofNullable(betaSettings);
            return this;
        }

        public Builder defaultExpiration(@Nullable Output<String> defaultExpiration) {
            this.defaultExpiration = defaultExpiration;
            return this;
        }

        public Builder defaultExpiration(@Nullable String defaultExpiration) {
            this.defaultExpiration = Output.ofNullable(defaultExpiration);
            return this;
        }

        public Builder deleteServiceOnDestroy(@Nullable Output<Boolean> deleteServiceOnDestroy) {
            this.deleteServiceOnDestroy = deleteServiceOnDestroy;
            return this;
        }

        public Builder deleteServiceOnDestroy(@Nullable Boolean deleteServiceOnDestroy) {
            this.deleteServiceOnDestroy = Output.ofNullable(deleteServiceOnDestroy);
            return this;
        }

        public Builder deployment(@Nullable Output<FlexibleAppVersionDeploymentArgs> deployment) {
            this.deployment = deployment;
            return this;
        }

        public Builder deployment(@Nullable FlexibleAppVersionDeploymentArgs deployment) {
            this.deployment = Output.ofNullable(deployment);
            return this;
        }

        public Builder endpointsApiService(@Nullable Output<FlexibleAppVersionEndpointsApiServiceArgs> endpointsApiService) {
            this.endpointsApiService = endpointsApiService;
            return this;
        }

        public Builder endpointsApiService(@Nullable FlexibleAppVersionEndpointsApiServiceArgs endpointsApiService) {
            this.endpointsApiService = Output.ofNullable(endpointsApiService);
            return this;
        }

        public Builder entrypoint(@Nullable Output<FlexibleAppVersionEntrypointArgs> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Builder entrypoint(@Nullable FlexibleAppVersionEntrypointArgs entrypoint) {
            this.entrypoint = Output.ofNullable(entrypoint);
            return this;
        }

        public Builder envVariables(@Nullable Output<Map<String,String>> envVariables) {
            this.envVariables = envVariables;
            return this;
        }

        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = Output.ofNullable(envVariables);
            return this;
        }

        public Builder handlers(@Nullable Output<List<FlexibleAppVersionHandlerArgs>> handlers) {
            this.handlers = handlers;
            return this;
        }

        public Builder handlers(@Nullable List<FlexibleAppVersionHandlerArgs> handlers) {
            this.handlers = Output.ofNullable(handlers);
            return this;
        }

        public Builder inboundServices(@Nullable Output<List<String>> inboundServices) {
            this.inboundServices = inboundServices;
            return this;
        }

        public Builder inboundServices(@Nullable List<String> inboundServices) {
            this.inboundServices = Output.ofNullable(inboundServices);
            return this;
        }

        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        public Builder instanceClass(@Nullable String instanceClass) {
            this.instanceClass = Output.ofNullable(instanceClass);
            return this;
        }

        public Builder livenessCheck(Output<FlexibleAppVersionLivenessCheckArgs> livenessCheck) {
            this.livenessCheck = Objects.requireNonNull(livenessCheck);
            return this;
        }

        public Builder livenessCheck(FlexibleAppVersionLivenessCheckArgs livenessCheck) {
            this.livenessCheck = Output.of(Objects.requireNonNull(livenessCheck));
            return this;
        }

        public Builder manualScaling(@Nullable Output<FlexibleAppVersionManualScalingArgs> manualScaling) {
            this.manualScaling = manualScaling;
            return this;
        }

        public Builder manualScaling(@Nullable FlexibleAppVersionManualScalingArgs manualScaling) {
            this.manualScaling = Output.ofNullable(manualScaling);
            return this;
        }

        public Builder network(@Nullable Output<FlexibleAppVersionNetworkArgs> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable FlexibleAppVersionNetworkArgs network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder nobuildFilesRegex(@Nullable Output<String> nobuildFilesRegex) {
            this.nobuildFilesRegex = nobuildFilesRegex;
            return this;
        }

        public Builder nobuildFilesRegex(@Nullable String nobuildFilesRegex) {
            this.nobuildFilesRegex = Output.ofNullable(nobuildFilesRegex);
            return this;
        }

        public Builder noopOnDestroy(@Nullable Output<Boolean> noopOnDestroy) {
            this.noopOnDestroy = noopOnDestroy;
            return this;
        }

        public Builder noopOnDestroy(@Nullable Boolean noopOnDestroy) {
            this.noopOnDestroy = Output.ofNullable(noopOnDestroy);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder readinessCheck(Output<FlexibleAppVersionReadinessCheckArgs> readinessCheck) {
            this.readinessCheck = Objects.requireNonNull(readinessCheck);
            return this;
        }

        public Builder readinessCheck(FlexibleAppVersionReadinessCheckArgs readinessCheck) {
            this.readinessCheck = Output.of(Objects.requireNonNull(readinessCheck));
            return this;
        }

        public Builder resources(@Nullable Output<FlexibleAppVersionResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable FlexibleAppVersionResourcesArgs resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }

        public Builder runtime(Output<String> runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder runtime(String runtime) {
            this.runtime = Output.of(Objects.requireNonNull(runtime));
            return this;
        }

        public Builder runtimeApiVersion(@Nullable Output<String> runtimeApiVersion) {
            this.runtimeApiVersion = runtimeApiVersion;
            return this;
        }

        public Builder runtimeApiVersion(@Nullable String runtimeApiVersion) {
            this.runtimeApiVersion = Output.ofNullable(runtimeApiVersion);
            return this;
        }

        public Builder runtimeChannel(@Nullable Output<String> runtimeChannel) {
            this.runtimeChannel = runtimeChannel;
            return this;
        }

        public Builder runtimeChannel(@Nullable String runtimeChannel) {
            this.runtimeChannel = Output.ofNullable(runtimeChannel);
            return this;
        }

        public Builder runtimeMainExecutablePath(@Nullable Output<String> runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = runtimeMainExecutablePath;
            return this;
        }

        public Builder runtimeMainExecutablePath(@Nullable String runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = Output.ofNullable(runtimeMainExecutablePath);
            return this;
        }

        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }

        public Builder servingStatus(@Nullable Output<String> servingStatus) {
            this.servingStatus = servingStatus;
            return this;
        }

        public Builder servingStatus(@Nullable String servingStatus) {
            this.servingStatus = Output.ofNullable(servingStatus);
            return this;
        }

        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionId(@Nullable String versionId) {
            this.versionId = Output.ofNullable(versionId);
            return this;
        }

        public Builder vpcAccessConnector(@Nullable Output<FlexibleAppVersionVpcAccessConnectorArgs> vpcAccessConnector) {
            this.vpcAccessConnector = vpcAccessConnector;
            return this;
        }

        public Builder vpcAccessConnector(@Nullable FlexibleAppVersionVpcAccessConnectorArgs vpcAccessConnector) {
            this.vpcAccessConnector = Output.ofNullable(vpcAccessConnector);
            return this;
        }
        public FlexibleAppVersionArgs build() {
            return new FlexibleAppVersionArgs(apiConfig, automaticScaling, betaSettings, defaultExpiration, deleteServiceOnDestroy, deployment, endpointsApiService, entrypoint, envVariables, handlers, inboundServices, instanceClass, livenessCheck, manualScaling, network, nobuildFilesRegex, noopOnDestroy, project, readinessCheck, resources, runtime, runtimeApiVersion, runtimeChannel, runtimeMainExecutablePath, service, servingStatus, versionId, vpcAccessConnector);
        }
    }
}
