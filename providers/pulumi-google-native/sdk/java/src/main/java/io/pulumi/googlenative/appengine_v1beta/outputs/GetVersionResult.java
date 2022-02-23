// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.appengine_v1beta.outputs.ApiConfigHandlerResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.AutomaticScalingResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.BasicScalingResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.DeploymentResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.EndpointsApiServiceResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.EntrypointResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.ErrorHandlerResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.HealthCheckResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.LibraryResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.LivenessCheckResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.ManualScalingResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.NetworkResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.ReadinessCheckResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.ResourcesResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.UrlMapResponse;
import io.pulumi.googlenative.appengine_v1beta.outputs.VpcAccessConnectorResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetVersionResult {
    /**
     * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
     * 
     */
    private final ApiConfigHandlerResponse apiConfig;
    /**
     * app_engine_apis allows second generation runtimes to access the App Engine APIs.
     * 
     */
    private final Boolean appEngineApis;
    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
     * 
     */
    private final AutomaticScalingResponse automaticScaling;
    /**
     * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * 
     */
    private final BasicScalingResponse basicScaling;
    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    private final Map<String,String> betaSettings;
    /**
     * Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final Map<String,String> buildEnvVariables;
    /**
     * Time that this version was created.
     * 
     */
    private final String createTime;
    /**
     * Email address of the user who created this version.
     * 
     */
    private final String createdBy;
    /**
     * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final String defaultExpiration;
    /**
     * Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final DeploymentResponse deployment;
    /**
     * Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.
     * 
     */
    private final String diskUsageBytes;
    /**
     * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
     * 
     */
    private final EndpointsApiServiceResponse endpointsApiService;
    /**
     * The entrypoint for the application.
     * 
     */
    private final EntrypointResponse entrypoint;
    /**
     * App Engine execution environment for this version.Defaults to standard.
     * 
     */
    private final String env;
    /**
     * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final Map<String,String> envVariables;
    /**
     * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final List<ErrorHandlerResponse> errorHandlers;
    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final List<UrlMapResponse> handlers;
    /**
     * Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final HealthCheckResponse healthCheck;
    /**
     * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
     * 
     */
    private final List<String> inboundServices;
    /**
     * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
     * 
     */
    private final String instanceClass;
    /**
     * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final List<LibraryResponse> libraries;
    /**
     * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
     * 
     */
    private final LivenessCheckResponse livenessCheck;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
     * 
     */
    private final ManualScalingResponse manualScaling;
    /**
     * Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.
     * 
     */
    private final String name;
    /**
     * Extra network settings. Only applicable in the App Engine flexible environment.
     * 
     */
    private final NetworkResponse network;
    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final String nobuildFilesRegex;
    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
     * 
     */
    private final ReadinessCheckResponse readinessCheck;
    /**
     * Machine resources for this version. Only applicable in the App Engine flexible environment.
     * 
     */
    private final ResourcesResponse resources;
    /**
     * Desired runtime. Example: python27.
     * 
     */
    private final String runtime;
    /**
     * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
     * 
     */
    private final String runtimeApiVersion;
    /**
     * The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
     * 
     */
    private final String runtimeChannel;
    /**
     * The path or name of the app's main executable.
     * 
     */
    private final String runtimeMainExecutablePath;
    /**
     * The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
     * 
     */
    private final String serviceAccount;
    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
     * 
     */
    private final String servingStatus;
    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    private final Boolean threadsafe;
    /**
     * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"
     * 
     */
    private final String versionUrl;
    /**
     * Whether to deploy this version in a container on a virtual machine.
     * 
     */
    private final Boolean vm;
    /**
     * Enables VPC connectivity for standard apps.
     * 
     */
    private final VpcAccessConnectorResponse vpcAccessConnector;

    @OutputCustomType.Constructor({"apiConfig","appEngineApis","automaticScaling","basicScaling","betaSettings","buildEnvVariables","createTime","createdBy","defaultExpiration","deployment","diskUsageBytes","endpointsApiService","entrypoint","env","envVariables","errorHandlers","handlers","healthCheck","inboundServices","instanceClass","libraries","livenessCheck","manualScaling","name","network","nobuildFilesRegex","readinessCheck","resources","runtime","runtimeApiVersion","runtimeChannel","runtimeMainExecutablePath","serviceAccount","servingStatus","threadsafe","versionUrl","vm","vpcAccessConnector"})
    private GetVersionResult(
        ApiConfigHandlerResponse apiConfig,
        Boolean appEngineApis,
        AutomaticScalingResponse automaticScaling,
        BasicScalingResponse basicScaling,
        Map<String,String> betaSettings,
        Map<String,String> buildEnvVariables,
        String createTime,
        String createdBy,
        String defaultExpiration,
        DeploymentResponse deployment,
        String diskUsageBytes,
        EndpointsApiServiceResponse endpointsApiService,
        EntrypointResponse entrypoint,
        String env,
        Map<String,String> envVariables,
        List<ErrorHandlerResponse> errorHandlers,
        List<UrlMapResponse> handlers,
        HealthCheckResponse healthCheck,
        List<String> inboundServices,
        String instanceClass,
        List<LibraryResponse> libraries,
        LivenessCheckResponse livenessCheck,
        ManualScalingResponse manualScaling,
        String name,
        NetworkResponse network,
        String nobuildFilesRegex,
        ReadinessCheckResponse readinessCheck,
        ResourcesResponse resources,
        String runtime,
        String runtimeApiVersion,
        String runtimeChannel,
        String runtimeMainExecutablePath,
        String serviceAccount,
        String servingStatus,
        Boolean threadsafe,
        String versionUrl,
        Boolean vm,
        VpcAccessConnectorResponse vpcAccessConnector) {
        this.apiConfig = Objects.requireNonNull(apiConfig);
        this.appEngineApis = Objects.requireNonNull(appEngineApis);
        this.automaticScaling = Objects.requireNonNull(automaticScaling);
        this.basicScaling = Objects.requireNonNull(basicScaling);
        this.betaSettings = Objects.requireNonNull(betaSettings);
        this.buildEnvVariables = Objects.requireNonNull(buildEnvVariables);
        this.createTime = Objects.requireNonNull(createTime);
        this.createdBy = Objects.requireNonNull(createdBy);
        this.defaultExpiration = Objects.requireNonNull(defaultExpiration);
        this.deployment = Objects.requireNonNull(deployment);
        this.diskUsageBytes = Objects.requireNonNull(diskUsageBytes);
        this.endpointsApiService = Objects.requireNonNull(endpointsApiService);
        this.entrypoint = Objects.requireNonNull(entrypoint);
        this.env = Objects.requireNonNull(env);
        this.envVariables = Objects.requireNonNull(envVariables);
        this.errorHandlers = Objects.requireNonNull(errorHandlers);
        this.handlers = Objects.requireNonNull(handlers);
        this.healthCheck = Objects.requireNonNull(healthCheck);
        this.inboundServices = Objects.requireNonNull(inboundServices);
        this.instanceClass = Objects.requireNonNull(instanceClass);
        this.libraries = Objects.requireNonNull(libraries);
        this.livenessCheck = Objects.requireNonNull(livenessCheck);
        this.manualScaling = Objects.requireNonNull(manualScaling);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.nobuildFilesRegex = Objects.requireNonNull(nobuildFilesRegex);
        this.readinessCheck = Objects.requireNonNull(readinessCheck);
        this.resources = Objects.requireNonNull(resources);
        this.runtime = Objects.requireNonNull(runtime);
        this.runtimeApiVersion = Objects.requireNonNull(runtimeApiVersion);
        this.runtimeChannel = Objects.requireNonNull(runtimeChannel);
        this.runtimeMainExecutablePath = Objects.requireNonNull(runtimeMainExecutablePath);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.servingStatus = Objects.requireNonNull(servingStatus);
        this.threadsafe = Objects.requireNonNull(threadsafe);
        this.versionUrl = Objects.requireNonNull(versionUrl);
        this.vm = Objects.requireNonNull(vm);
        this.vpcAccessConnector = Objects.requireNonNull(vpcAccessConnector);
    }

    /**
     * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
     * 
     */
    public ApiConfigHandlerResponse getApiConfig() {
        return this.apiConfig;
    }
    /**
     * app_engine_apis allows second generation runtimes to access the App Engine APIs.
     * 
     */
    public Boolean getAppEngineApis() {
        return this.appEngineApis;
    }
    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
     * 
     */
    public AutomaticScalingResponse getAutomaticScaling() {
        return this.automaticScaling;
    }
    /**
     * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * 
     */
    public BasicScalingResponse getBasicScaling() {
        return this.basicScaling;
    }
    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    public Map<String,String> getBetaSettings() {
        return this.betaSettings;
    }
    /**
     * Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Map<String,String> getBuildEnvVariables() {
        return this.buildEnvVariables;
    }
    /**
     * Time that this version was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Email address of the user who created this version.
     * 
     */
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
     * 
     */
    public String getDefaultExpiration() {
        return this.defaultExpiration;
    }
    /**
     * Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
     * 
     */
    public DeploymentResponse getDeployment() {
        return this.deployment;
    }
    /**
     * Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.
     * 
     */
    public String getDiskUsageBytes() {
        return this.diskUsageBytes;
    }
    /**
     * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
     * 
     */
    public EndpointsApiServiceResponse getEndpointsApiService() {
        return this.endpointsApiService;
    }
    /**
     * The entrypoint for the application.
     * 
     */
    public EntrypointResponse getEntrypoint() {
        return this.entrypoint;
    }
    /**
     * App Engine execution environment for this version.Defaults to standard.
     * 
     */
    public String getEnv() {
        return this.env;
    }
    /**
     * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Map<String,String> getEnvVariables() {
        return this.envVariables;
    }
    /**
     * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
     * 
     */
    public List<ErrorHandlerResponse> getErrorHandlers() {
        return this.errorHandlers;
    }
    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
     * 
     */
    public List<UrlMapResponse> getHandlers() {
        return this.handlers;
    }
    /**
     * Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    public HealthCheckResponse getHealthCheck() {
        return this.healthCheck;
    }
    /**
     * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
     * 
     */
    public List<String> getInboundServices() {
        return this.inboundServices;
    }
    /**
     * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
     * 
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }
    /**
     * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    public List<LibraryResponse> getLibraries() {
        return this.libraries;
    }
    /**
     * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
     * 
     */
    public LivenessCheckResponse getLivenessCheck() {
        return this.livenessCheck;
    }
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
     * 
     */
    public ManualScalingResponse getManualScaling() {
        return this.manualScaling;
    }
    /**
     * Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Extra network settings. Only applicable in the App Engine flexible environment.
     * 
     */
    public NetworkResponse getNetwork() {
        return this.network;
    }
    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
     * 
     */
    public String getNobuildFilesRegex() {
        return this.nobuildFilesRegex;
    }
    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
     * 
     */
    public ReadinessCheckResponse getReadinessCheck() {
        return this.readinessCheck;
    }
    /**
     * Machine resources for this version. Only applicable in the App Engine flexible environment.
     * 
     */
    public ResourcesResponse getResources() {
        return this.resources;
    }
    /**
     * Desired runtime. Example: python27.
     * 
     */
    public String getRuntime() {
        return this.runtime;
    }
    /**
     * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
     * 
     */
    public String getRuntimeApiVersion() {
        return this.runtimeApiVersion;
    }
    /**
     * The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
     * 
     */
    public String getRuntimeChannel() {
        return this.runtimeChannel;
    }
    /**
     * The path or name of the app's main executable.
     * 
     */
    public String getRuntimeMainExecutablePath() {
        return this.runtimeMainExecutablePath;
    }
    /**
     * The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
     * 
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
     * 
     */
    public String getServingStatus() {
        return this.servingStatus;
    }
    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    public Boolean getThreadsafe() {
        return this.threadsafe;
    }
    /**
     * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"
     * 
     */
    public String getVersionUrl() {
        return this.versionUrl;
    }
    /**
     * Whether to deploy this version in a container on a virtual machine.
     * 
     */
    public Boolean getVm() {
        return this.vm;
    }
    /**
     * Enables VPC connectivity for standard apps.
     * 
     */
    public VpcAccessConnectorResponse getVpcAccessConnector() {
        return this.vpcAccessConnector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigHandlerResponse apiConfig;
        private Boolean appEngineApis;
        private AutomaticScalingResponse automaticScaling;
        private BasicScalingResponse basicScaling;
        private Map<String,String> betaSettings;
        private Map<String,String> buildEnvVariables;
        private String createTime;
        private String createdBy;
        private String defaultExpiration;
        private DeploymentResponse deployment;
        private String diskUsageBytes;
        private EndpointsApiServiceResponse endpointsApiService;
        private EntrypointResponse entrypoint;
        private String env;
        private Map<String,String> envVariables;
        private List<ErrorHandlerResponse> errorHandlers;
        private List<UrlMapResponse> handlers;
        private HealthCheckResponse healthCheck;
        private List<String> inboundServices;
        private String instanceClass;
        private List<LibraryResponse> libraries;
        private LivenessCheckResponse livenessCheck;
        private ManualScalingResponse manualScaling;
        private String name;
        private NetworkResponse network;
        private String nobuildFilesRegex;
        private ReadinessCheckResponse readinessCheck;
        private ResourcesResponse resources;
        private String runtime;
        private String runtimeApiVersion;
        private String runtimeChannel;
        private String runtimeMainExecutablePath;
        private String serviceAccount;
        private String servingStatus;
        private Boolean threadsafe;
        private String versionUrl;
        private Boolean vm;
        private VpcAccessConnectorResponse vpcAccessConnector;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.appEngineApis = defaults.appEngineApis;
    	      this.automaticScaling = defaults.automaticScaling;
    	      this.basicScaling = defaults.basicScaling;
    	      this.betaSettings = defaults.betaSettings;
    	      this.buildEnvVariables = defaults.buildEnvVariables;
    	      this.createTime = defaults.createTime;
    	      this.createdBy = defaults.createdBy;
    	      this.defaultExpiration = defaults.defaultExpiration;
    	      this.deployment = defaults.deployment;
    	      this.diskUsageBytes = defaults.diskUsageBytes;
    	      this.endpointsApiService = defaults.endpointsApiService;
    	      this.entrypoint = defaults.entrypoint;
    	      this.env = defaults.env;
    	      this.envVariables = defaults.envVariables;
    	      this.errorHandlers = defaults.errorHandlers;
    	      this.handlers = defaults.handlers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.inboundServices = defaults.inboundServices;
    	      this.instanceClass = defaults.instanceClass;
    	      this.libraries = defaults.libraries;
    	      this.livenessCheck = defaults.livenessCheck;
    	      this.manualScaling = defaults.manualScaling;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nobuildFilesRegex = defaults.nobuildFilesRegex;
    	      this.readinessCheck = defaults.readinessCheck;
    	      this.resources = defaults.resources;
    	      this.runtime = defaults.runtime;
    	      this.runtimeApiVersion = defaults.runtimeApiVersion;
    	      this.runtimeChannel = defaults.runtimeChannel;
    	      this.runtimeMainExecutablePath = defaults.runtimeMainExecutablePath;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.servingStatus = defaults.servingStatus;
    	      this.threadsafe = defaults.threadsafe;
    	      this.versionUrl = defaults.versionUrl;
    	      this.vm = defaults.vm;
    	      this.vpcAccessConnector = defaults.vpcAccessConnector;
        }

        public Builder setApiConfig(ApiConfigHandlerResponse apiConfig) {
            this.apiConfig = Objects.requireNonNull(apiConfig);
            return this;
        }

        public Builder setAppEngineApis(Boolean appEngineApis) {
            this.appEngineApis = Objects.requireNonNull(appEngineApis);
            return this;
        }

        public Builder setAutomaticScaling(AutomaticScalingResponse automaticScaling) {
            this.automaticScaling = Objects.requireNonNull(automaticScaling);
            return this;
        }

        public Builder setBasicScaling(BasicScalingResponse basicScaling) {
            this.basicScaling = Objects.requireNonNull(basicScaling);
            return this;
        }

        public Builder setBetaSettings(Map<String,String> betaSettings) {
            this.betaSettings = Objects.requireNonNull(betaSettings);
            return this;
        }

        public Builder setBuildEnvVariables(Map<String,String> buildEnvVariables) {
            this.buildEnvVariables = Objects.requireNonNull(buildEnvVariables);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setDefaultExpiration(String defaultExpiration) {
            this.defaultExpiration = Objects.requireNonNull(defaultExpiration);
            return this;
        }

        public Builder setDeployment(DeploymentResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }

        public Builder setDiskUsageBytes(String diskUsageBytes) {
            this.diskUsageBytes = Objects.requireNonNull(diskUsageBytes);
            return this;
        }

        public Builder setEndpointsApiService(EndpointsApiServiceResponse endpointsApiService) {
            this.endpointsApiService = Objects.requireNonNull(endpointsApiService);
            return this;
        }

        public Builder setEntrypoint(EntrypointResponse entrypoint) {
            this.entrypoint = Objects.requireNonNull(entrypoint);
            return this;
        }

        public Builder setEnv(String env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setEnvVariables(Map<String,String> envVariables) {
            this.envVariables = Objects.requireNonNull(envVariables);
            return this;
        }

        public Builder setErrorHandlers(List<ErrorHandlerResponse> errorHandlers) {
            this.errorHandlers = Objects.requireNonNull(errorHandlers);
            return this;
        }

        public Builder setHandlers(List<UrlMapResponse> handlers) {
            this.handlers = Objects.requireNonNull(handlers);
            return this;
        }

        public Builder setHealthCheck(HealthCheckResponse healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setInboundServices(List<String> inboundServices) {
            this.inboundServices = Objects.requireNonNull(inboundServices);
            return this;
        }

        public Builder setInstanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }

        public Builder setLibraries(List<LibraryResponse> libraries) {
            this.libraries = Objects.requireNonNull(libraries);
            return this;
        }

        public Builder setLivenessCheck(LivenessCheckResponse livenessCheck) {
            this.livenessCheck = Objects.requireNonNull(livenessCheck);
            return this;
        }

        public Builder setManualScaling(ManualScalingResponse manualScaling) {
            this.manualScaling = Objects.requireNonNull(manualScaling);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(NetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNobuildFilesRegex(String nobuildFilesRegex) {
            this.nobuildFilesRegex = Objects.requireNonNull(nobuildFilesRegex);
            return this;
        }

        public Builder setReadinessCheck(ReadinessCheckResponse readinessCheck) {
            this.readinessCheck = Objects.requireNonNull(readinessCheck);
            return this;
        }

        public Builder setResources(ResourcesResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder setRuntimeApiVersion(String runtimeApiVersion) {
            this.runtimeApiVersion = Objects.requireNonNull(runtimeApiVersion);
            return this;
        }

        public Builder setRuntimeChannel(String runtimeChannel) {
            this.runtimeChannel = Objects.requireNonNull(runtimeChannel);
            return this;
        }

        public Builder setRuntimeMainExecutablePath(String runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = Objects.requireNonNull(runtimeMainExecutablePath);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setServingStatus(String servingStatus) {
            this.servingStatus = Objects.requireNonNull(servingStatus);
            return this;
        }

        public Builder setThreadsafe(Boolean threadsafe) {
            this.threadsafe = Objects.requireNonNull(threadsafe);
            return this;
        }

        public Builder setVersionUrl(String versionUrl) {
            this.versionUrl = Objects.requireNonNull(versionUrl);
            return this;
        }

        public Builder setVm(Boolean vm) {
            this.vm = Objects.requireNonNull(vm);
            return this;
        }

        public Builder setVpcAccessConnector(VpcAccessConnectorResponse vpcAccessConnector) {
            this.vpcAccessConnector = Objects.requireNonNull(vpcAccessConnector);
            return this;
        }
        public GetVersionResult build() {
            return new GetVersionResult(apiConfig, appEngineApis, automaticScaling, basicScaling, betaSettings, buildEnvVariables, createTime, createdBy, defaultExpiration, deployment, diskUsageBytes, endpointsApiService, entrypoint, env, envVariables, errorHandlers, handlers, healthCheck, inboundServices, instanceClass, libraries, livenessCheck, manualScaling, name, network, nobuildFilesRegex, readinessCheck, resources, runtime, runtimeApiVersion, runtimeChannel, runtimeMainExecutablePath, serviceAccount, servingStatus, threadsafe, versionUrl, vm, vpcAccessConnector);
        }
    }
}
