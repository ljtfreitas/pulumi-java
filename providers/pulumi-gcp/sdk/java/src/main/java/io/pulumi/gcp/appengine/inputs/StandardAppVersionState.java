// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionAutomaticScalingGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionBasicScalingGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionEntrypointGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionLibraryGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionManualScalingGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionVpcAccessConnectorGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionState extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionState Empty = new StandardAppVersionState();

    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics.
     * Structure is documented below.
     * 
     */
    @Import(name="automaticScaling")
      private final @Nullable Output<StandardAppVersionAutomaticScalingGetArgs> automaticScaling;

    public Output<StandardAppVersionAutomaticScalingGetArgs> automaticScaling() {
        return this.automaticScaling == null ? Codegen.empty() : this.automaticScaling;
    }

    /**
     * Basic scaling creates instances when your application receives requests. Each instance will be shut down when the application becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * Structure is documented below.
     * 
     */
    @Import(name="basicScaling")
      private final @Nullable Output<StandardAppVersionBasicScalingGetArgs> basicScaling;

    public Output<StandardAppVersionBasicScalingGetArgs> basicScaling() {
        return this.basicScaling == null ? Codegen.empty() : this.basicScaling;
    }

    /**
     * If set to `true`, the service will be deleted if it is the last version.
     * 
     */
    @Import(name="deleteServiceOnDestroy")
      private final @Nullable Output<Boolean> deleteServiceOnDestroy;

    public Output<Boolean> deleteServiceOnDestroy() {
        return this.deleteServiceOnDestroy == null ? Codegen.empty() : this.deleteServiceOnDestroy;
    }

    /**
     * Code and application artifacts that make up this version.
     * Structure is documented below.
     * 
     */
    @Import(name="deployment")
      private final @Nullable Output<StandardAppVersionDeploymentGetArgs> deployment;

    public Output<StandardAppVersionDeploymentGetArgs> deployment() {
        return this.deployment == null ? Codegen.empty() : this.deployment;
    }

    /**
     * The entrypoint for the application.
     * Structure is documented below.
     * 
     */
    @Import(name="entrypoint")
      private final @Nullable Output<StandardAppVersionEntrypointGetArgs> entrypoint;

    public Output<StandardAppVersionEntrypointGetArgs> entrypoint() {
        return this.entrypoint == null ? Codegen.empty() : this.entrypoint;
    }

    /**
     * Environment variables available to the application.
     * 
     */
    @Import(name="envVariables")
      private final @Nullable Output<Map<String,String>> envVariables;

    public Output<Map<String,String>> envVariables() {
        return this.envVariables == null ? Codegen.empty() : this.envVariables;
    }

    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests.
     * The first matching URL handles the request and other request handlers are not attempted.
     * Structure is documented below.
     * 
     */
    @Import(name="handlers")
      private final @Nullable Output<List<StandardAppVersionHandlerGetArgs>> handlers;

    public Output<List<StandardAppVersionHandlerGetArgs>> handlers() {
        return this.handlers == null ? Codegen.empty() : this.handlers;
    }

    /**
     * A list of the types of messages that this application is able to receive.
     * Each value may be one of `INBOUND_SERVICE_MAIL`, `INBOUND_SERVICE_MAIL_BOUNCE`, `INBOUND_SERVICE_XMPP_ERROR`, `INBOUND_SERVICE_XMPP_MESSAGE`, `INBOUND_SERVICE_XMPP_SUBSCRIBE`, `INBOUND_SERVICE_XMPP_PRESENCE`, `INBOUND_SERVICE_CHANNEL_PRESENCE`, and `INBOUND_SERVICE_WARMUP`.
     * 
     */
    @Import(name="inboundServices")
      private final @Nullable Output<List<String>> inboundServices;

    public Output<List<String>> inboundServices() {
        return this.inboundServices == null ? Codegen.empty() : this.inboundServices;
    }

    /**
     * Instance class that is used to run this version. Valid values are
     * AutomaticScaling: F1, F2, F4, F4_1G
     * BasicScaling or ManualScaling: B1, B2, B4, B4_1G, B8
     * Defaults to F1 for AutomaticScaling and B2 for ManualScaling and BasicScaling. If no scaling is specified, AutomaticScaling is chosen.
     * 
     */
    @Import(name="instanceClass")
      private final @Nullable Output<String> instanceClass;

    public Output<String> instanceClass() {
        return this.instanceClass == null ? Codegen.empty() : this.instanceClass;
    }

    /**
     * Configuration for third-party Python runtime libraries that are required by the application.
     * Structure is documented below.
     * 
     */
    @Import(name="libraries")
      private final @Nullable Output<List<StandardAppVersionLibraryGetArgs>> libraries;

    public Output<List<StandardAppVersionLibraryGetArgs>> libraries() {
        return this.libraries == null ? Codegen.empty() : this.libraries;
    }

    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    @Import(name="manualScaling")
      private final @Nullable Output<StandardAppVersionManualScalingGetArgs> manualScaling;

    public Output<StandardAppVersionManualScalingGetArgs> manualScaling() {
        return this.manualScaling == null ? Codegen.empty() : this.manualScaling;
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * If set to `true`, the application version will not be deleted.
     * 
     */
    @Import(name="noopOnDestroy")
      private final @Nullable Output<Boolean> noopOnDestroy;

    public Output<Boolean> noopOnDestroy() {
        return this.noopOnDestroy == null ? Codegen.empty() : this.noopOnDestroy;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Desired runtime. Example python27.
     * 
     */
    @Import(name="runtime")
      private final @Nullable Output<String> runtime;

    public Output<String> runtime() {
        return this.runtime == null ? Codegen.empty() : this.runtime;
    }

    /**
     * The version of the API in the given runtime environment.
     * Please see the app.yaml reference for valid values at `https://cloud.google.com/appengine/docs/standard/<language>/config/appref`\
     * Substitute `<language>` with `python`, `java`, `php`, `ruby`, `go` or `nodejs`.
     * 
     */
    @Import(name="runtimeApiVersion")
      private final @Nullable Output<String> runtimeApiVersion;

    public Output<String> runtimeApiVersion() {
        return this.runtimeApiVersion == null ? Codegen.empty() : this.runtimeApiVersion;
    }

    /**
     * AppEngine service resource
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    @Import(name="threadsafe")
      private final @Nullable Output<Boolean> threadsafe;

    public Output<Boolean> threadsafe() {
        return this.threadsafe == null ? Codegen.empty() : this.threadsafe;
    }

    /**
     * Relative name of the version within the service. For example, `v1`. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names,"default", "latest", and any name with the prefix "ah-".
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> versionId() {
        return this.versionId == null ? Codegen.empty() : this.versionId;
    }

    /**
     * Enables VPC connectivity for standard apps.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcAccessConnector")
      private final @Nullable Output<StandardAppVersionVpcAccessConnectorGetArgs> vpcAccessConnector;

    public Output<StandardAppVersionVpcAccessConnectorGetArgs> vpcAccessConnector() {
        return this.vpcAccessConnector == null ? Codegen.empty() : this.vpcAccessConnector;
    }

    public StandardAppVersionState(
        @Nullable Output<StandardAppVersionAutomaticScalingGetArgs> automaticScaling,
        @Nullable Output<StandardAppVersionBasicScalingGetArgs> basicScaling,
        @Nullable Output<Boolean> deleteServiceOnDestroy,
        @Nullable Output<StandardAppVersionDeploymentGetArgs> deployment,
        @Nullable Output<StandardAppVersionEntrypointGetArgs> entrypoint,
        @Nullable Output<Map<String,String>> envVariables,
        @Nullable Output<List<StandardAppVersionHandlerGetArgs>> handlers,
        @Nullable Output<List<String>> inboundServices,
        @Nullable Output<String> instanceClass,
        @Nullable Output<List<StandardAppVersionLibraryGetArgs>> libraries,
        @Nullable Output<StandardAppVersionManualScalingGetArgs> manualScaling,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> noopOnDestroy,
        @Nullable Output<String> project,
        @Nullable Output<String> runtime,
        @Nullable Output<String> runtimeApiVersion,
        @Nullable Output<String> service,
        @Nullable Output<Boolean> threadsafe,
        @Nullable Output<String> versionId,
        @Nullable Output<StandardAppVersionVpcAccessConnectorGetArgs> vpcAccessConnector) {
        this.automaticScaling = automaticScaling;
        this.basicScaling = basicScaling;
        this.deleteServiceOnDestroy = deleteServiceOnDestroy;
        this.deployment = deployment;
        this.entrypoint = entrypoint;
        this.envVariables = envVariables;
        this.handlers = handlers;
        this.inboundServices = inboundServices;
        this.instanceClass = instanceClass;
        this.libraries = libraries;
        this.manualScaling = manualScaling;
        this.name = name;
        this.noopOnDestroy = noopOnDestroy;
        this.project = project;
        this.runtime = runtime;
        this.runtimeApiVersion = runtimeApiVersion;
        this.service = service;
        this.threadsafe = threadsafe;
        this.versionId = versionId;
        this.vpcAccessConnector = vpcAccessConnector;
    }

    private StandardAppVersionState() {
        this.automaticScaling = Codegen.empty();
        this.basicScaling = Codegen.empty();
        this.deleteServiceOnDestroy = Codegen.empty();
        this.deployment = Codegen.empty();
        this.entrypoint = Codegen.empty();
        this.envVariables = Codegen.empty();
        this.handlers = Codegen.empty();
        this.inboundServices = Codegen.empty();
        this.instanceClass = Codegen.empty();
        this.libraries = Codegen.empty();
        this.manualScaling = Codegen.empty();
        this.name = Codegen.empty();
        this.noopOnDestroy = Codegen.empty();
        this.project = Codegen.empty();
        this.runtime = Codegen.empty();
        this.runtimeApiVersion = Codegen.empty();
        this.service = Codegen.empty();
        this.threadsafe = Codegen.empty();
        this.versionId = Codegen.empty();
        this.vpcAccessConnector = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StandardAppVersionAutomaticScalingGetArgs> automaticScaling;
        private @Nullable Output<StandardAppVersionBasicScalingGetArgs> basicScaling;
        private @Nullable Output<Boolean> deleteServiceOnDestroy;
        private @Nullable Output<StandardAppVersionDeploymentGetArgs> deployment;
        private @Nullable Output<StandardAppVersionEntrypointGetArgs> entrypoint;
        private @Nullable Output<Map<String,String>> envVariables;
        private @Nullable Output<List<StandardAppVersionHandlerGetArgs>> handlers;
        private @Nullable Output<List<String>> inboundServices;
        private @Nullable Output<String> instanceClass;
        private @Nullable Output<List<StandardAppVersionLibraryGetArgs>> libraries;
        private @Nullable Output<StandardAppVersionManualScalingGetArgs> manualScaling;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> noopOnDestroy;
        private @Nullable Output<String> project;
        private @Nullable Output<String> runtime;
        private @Nullable Output<String> runtimeApiVersion;
        private @Nullable Output<String> service;
        private @Nullable Output<Boolean> threadsafe;
        private @Nullable Output<String> versionId;
        private @Nullable Output<StandardAppVersionVpcAccessConnectorGetArgs> vpcAccessConnector;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticScaling = defaults.automaticScaling;
    	      this.basicScaling = defaults.basicScaling;
    	      this.deleteServiceOnDestroy = defaults.deleteServiceOnDestroy;
    	      this.deployment = defaults.deployment;
    	      this.entrypoint = defaults.entrypoint;
    	      this.envVariables = defaults.envVariables;
    	      this.handlers = defaults.handlers;
    	      this.inboundServices = defaults.inboundServices;
    	      this.instanceClass = defaults.instanceClass;
    	      this.libraries = defaults.libraries;
    	      this.manualScaling = defaults.manualScaling;
    	      this.name = defaults.name;
    	      this.noopOnDestroy = defaults.noopOnDestroy;
    	      this.project = defaults.project;
    	      this.runtime = defaults.runtime;
    	      this.runtimeApiVersion = defaults.runtimeApiVersion;
    	      this.service = defaults.service;
    	      this.threadsafe = defaults.threadsafe;
    	      this.versionId = defaults.versionId;
    	      this.vpcAccessConnector = defaults.vpcAccessConnector;
        }

        public Builder automaticScaling(@Nullable Output<StandardAppVersionAutomaticScalingGetArgs> automaticScaling) {
            this.automaticScaling = automaticScaling;
            return this;
        }
        public Builder automaticScaling(@Nullable StandardAppVersionAutomaticScalingGetArgs automaticScaling) {
            this.automaticScaling = Codegen.ofNullable(automaticScaling);
            return this;
        }
        public Builder basicScaling(@Nullable Output<StandardAppVersionBasicScalingGetArgs> basicScaling) {
            this.basicScaling = basicScaling;
            return this;
        }
        public Builder basicScaling(@Nullable StandardAppVersionBasicScalingGetArgs basicScaling) {
            this.basicScaling = Codegen.ofNullable(basicScaling);
            return this;
        }
        public Builder deleteServiceOnDestroy(@Nullable Output<Boolean> deleteServiceOnDestroy) {
            this.deleteServiceOnDestroy = deleteServiceOnDestroy;
            return this;
        }
        public Builder deleteServiceOnDestroy(@Nullable Boolean deleteServiceOnDestroy) {
            this.deleteServiceOnDestroy = Codegen.ofNullable(deleteServiceOnDestroy);
            return this;
        }
        public Builder deployment(@Nullable Output<StandardAppVersionDeploymentGetArgs> deployment) {
            this.deployment = deployment;
            return this;
        }
        public Builder deployment(@Nullable StandardAppVersionDeploymentGetArgs deployment) {
            this.deployment = Codegen.ofNullable(deployment);
            return this;
        }
        public Builder entrypoint(@Nullable Output<StandardAppVersionEntrypointGetArgs> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public Builder entrypoint(@Nullable StandardAppVersionEntrypointGetArgs entrypoint) {
            this.entrypoint = Codegen.ofNullable(entrypoint);
            return this;
        }
        public Builder envVariables(@Nullable Output<Map<String,String>> envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = Codegen.ofNullable(envVariables);
            return this;
        }
        public Builder handlers(@Nullable Output<List<StandardAppVersionHandlerGetArgs>> handlers) {
            this.handlers = handlers;
            return this;
        }
        public Builder handlers(@Nullable List<StandardAppVersionHandlerGetArgs> handlers) {
            this.handlers = Codegen.ofNullable(handlers);
            return this;
        }
        public Builder handlers(StandardAppVersionHandlerGetArgs... handlers) {
            return handlers(List.of(handlers));
        }
        public Builder inboundServices(@Nullable Output<List<String>> inboundServices) {
            this.inboundServices = inboundServices;
            return this;
        }
        public Builder inboundServices(@Nullable List<String> inboundServices) {
            this.inboundServices = Codegen.ofNullable(inboundServices);
            return this;
        }
        public Builder inboundServices(String... inboundServices) {
            return inboundServices(List.of(inboundServices));
        }
        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public Builder instanceClass(@Nullable String instanceClass) {
            this.instanceClass = Codegen.ofNullable(instanceClass);
            return this;
        }
        public Builder libraries(@Nullable Output<List<StandardAppVersionLibraryGetArgs>> libraries) {
            this.libraries = libraries;
            return this;
        }
        public Builder libraries(@Nullable List<StandardAppVersionLibraryGetArgs> libraries) {
            this.libraries = Codegen.ofNullable(libraries);
            return this;
        }
        public Builder libraries(StandardAppVersionLibraryGetArgs... libraries) {
            return libraries(List.of(libraries));
        }
        public Builder manualScaling(@Nullable Output<StandardAppVersionManualScalingGetArgs> manualScaling) {
            this.manualScaling = manualScaling;
            return this;
        }
        public Builder manualScaling(@Nullable StandardAppVersionManualScalingGetArgs manualScaling) {
            this.manualScaling = Codegen.ofNullable(manualScaling);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder noopOnDestroy(@Nullable Output<Boolean> noopOnDestroy) {
            this.noopOnDestroy = noopOnDestroy;
            return this;
        }
        public Builder noopOnDestroy(@Nullable Boolean noopOnDestroy) {
            this.noopOnDestroy = Codegen.ofNullable(noopOnDestroy);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder runtime(@Nullable Output<String> runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder runtime(@Nullable String runtime) {
            this.runtime = Codegen.ofNullable(runtime);
            return this;
        }
        public Builder runtimeApiVersion(@Nullable Output<String> runtimeApiVersion) {
            this.runtimeApiVersion = runtimeApiVersion;
            return this;
        }
        public Builder runtimeApiVersion(@Nullable String runtimeApiVersion) {
            this.runtimeApiVersion = Codegen.ofNullable(runtimeApiVersion);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder threadsafe(@Nullable Output<Boolean> threadsafe) {
            this.threadsafe = threadsafe;
            return this;
        }
        public Builder threadsafe(@Nullable Boolean threadsafe) {
            this.threadsafe = Codegen.ofNullable(threadsafe);
            return this;
        }
        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }
        public Builder versionId(@Nullable String versionId) {
            this.versionId = Codegen.ofNullable(versionId);
            return this;
        }
        public Builder vpcAccessConnector(@Nullable Output<StandardAppVersionVpcAccessConnectorGetArgs> vpcAccessConnector) {
            this.vpcAccessConnector = vpcAccessConnector;
            return this;
        }
        public Builder vpcAccessConnector(@Nullable StandardAppVersionVpcAccessConnectorGetArgs vpcAccessConnector) {
            this.vpcAccessConnector = Codegen.ofNullable(vpcAccessConnector);
            return this;
        }        public StandardAppVersionState build() {
            return new StandardAppVersionState(automaticScaling, basicScaling, deleteServiceOnDestroy, deployment, entrypoint, envVariables, handlers, inboundServices, instanceClass, libraries, manualScaling, name, noopOnDestroy, project, runtime, runtimeApiVersion, service, threadsafe, versionId, vpcAccessConnector);
        }
    }
}
