// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.RegionNetworkEndpointGroupNetworkEndpointType;
import io.pulumi.googlenative.compute_alpha.enums.RegionNetworkEndpointGroupType;
import io.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupAppEngineArgs;
import io.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupCloudFunctionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupCloudRunArgs;
import io.pulumi.googlenative.compute_alpha.inputs.NetworkEndpointGroupServerlessDeploymentArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupArgs Empty = new RegionNetworkEndpointGroupArgs();

    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="appEngine")
      private final @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine;

    public Output<NetworkEndpointGroupAppEngineArgs> getAppEngine() {
        return this.appEngine == null ? Output.empty() : this.appEngine;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="cloudFunction")
      private final @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;

    public Output<NetworkEndpointGroupCloudFunctionArgs> getCloudFunction() {
        return this.cloudFunction == null ? Output.empty() : this.cloudFunction;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    @Import(name="cloudRun")
      private final @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun;

    public Output<NetworkEndpointGroupCloudRunArgs> getCloudRun() {
        return this.cloudRun == null ? Output.empty() : this.cloudRun;
    }

    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    @Import(name="defaultPort")
      private final @Nullable Output<Integer> defaultPort;

    public Output<Integer> getDefaultPort() {
        return this.defaultPort == null ? Output.empty() : this.defaultPort;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    @Import(name="networkEndpointType")
      private final @Nullable Output<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType;

    public Output<RegionNetworkEndpointGroupNetworkEndpointType> getNetworkEndpointType() {
        return this.networkEndpointType == null ? Output.empty() : this.networkEndpointType;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    @Import(name="pscTargetService")
      private final @Nullable Output<String> pscTargetService;

    public Output<String> getPscTargetService() {
        return this.pscTargetService == null ? Output.empty() : this.pscTargetService;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    @Import(name="serverlessDeployment")
      private final @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment;

    public Output<NetworkEndpointGroupServerlessDeploymentArgs> getServerlessDeployment() {
        return this.serverlessDeployment == null ? Output.empty() : this.serverlessDeployment;
    }

    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<RegionNetworkEndpointGroupType> type;

    public Output<RegionNetworkEndpointGroupType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public RegionNetworkEndpointGroupArgs(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine,
        @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction,
        @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun,
        @Nullable Output<Integer> defaultPort,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType,
        @Nullable Output<String> project,
        @Nullable Output<String> pscTargetService,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment,
        @Nullable Output<String> subnetwork,
        @Nullable Output<RegionNetworkEndpointGroupType> type) {
        this.annotations = annotations;
        this.appEngine = appEngine;
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.defaultPort = defaultPort;
        this.description = description;
        this.name = name;
        this.network = network;
        this.networkEndpointType = networkEndpointType;
        this.project = project;
        this.pscTargetService = pscTargetService;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.serverlessDeployment = serverlessDeployment;
        this.subnetwork = subnetwork;
        this.type = type;
    }

    private RegionNetworkEndpointGroupArgs() {
        this.annotations = Output.empty();
        this.appEngine = Output.empty();
        this.cloudFunction = Output.empty();
        this.cloudRun = Output.empty();
        this.defaultPort = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.networkEndpointType = Output.empty();
        this.project = Output.empty();
        this.pscTargetService = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.serverlessDeployment = Output.empty();
        this.subnetwork = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine;
        private @Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction;
        private @Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun;
        private @Nullable Output<Integer> defaultPort;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType;
        private @Nullable Output<String> project;
        private @Nullable Output<String> pscTargetService;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<RegionNetworkEndpointGroupType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.appEngine = defaults.appEngine;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
    	      this.pscTargetService = defaults.pscTargetService;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.serverlessDeployment = defaults.serverlessDeployment;
    	      this.subnetwork = defaults.subnetwork;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder appEngine(@Nullable Output<NetworkEndpointGroupAppEngineArgs> appEngine) {
            this.appEngine = appEngine;
            return this;
        }

        public Builder appEngine(@Nullable NetworkEndpointGroupAppEngineArgs appEngine) {
            this.appEngine = Output.ofNullable(appEngine);
            return this;
        }

        public Builder cloudFunction(@Nullable Output<NetworkEndpointGroupCloudFunctionArgs> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }

        public Builder cloudFunction(@Nullable NetworkEndpointGroupCloudFunctionArgs cloudFunction) {
            this.cloudFunction = Output.ofNullable(cloudFunction);
            return this;
        }

        public Builder cloudRun(@Nullable Output<NetworkEndpointGroupCloudRunArgs> cloudRun) {
            this.cloudRun = cloudRun;
            return this;
        }

        public Builder cloudRun(@Nullable NetworkEndpointGroupCloudRunArgs cloudRun) {
            this.cloudRun = Output.ofNullable(cloudRun);
            return this;
        }

        public Builder defaultPort(@Nullable Output<Integer> defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }

        public Builder defaultPort(@Nullable Integer defaultPort) {
            this.defaultPort = Output.ofNullable(defaultPort);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder networkEndpointType(@Nullable Output<RegionNetworkEndpointGroupNetworkEndpointType> networkEndpointType) {
            this.networkEndpointType = networkEndpointType;
            return this;
        }

        public Builder networkEndpointType(@Nullable RegionNetworkEndpointGroupNetworkEndpointType networkEndpointType) {
            this.networkEndpointType = Output.ofNullable(networkEndpointType);
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

        public Builder pscTargetService(@Nullable Output<String> pscTargetService) {
            this.pscTargetService = pscTargetService;
            return this;
        }

        public Builder pscTargetService(@Nullable String pscTargetService) {
            this.pscTargetService = Output.ofNullable(pscTargetService);
            return this;
        }

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder serverlessDeployment(@Nullable Output<NetworkEndpointGroupServerlessDeploymentArgs> serverlessDeployment) {
            this.serverlessDeployment = serverlessDeployment;
            return this;
        }

        public Builder serverlessDeployment(@Nullable NetworkEndpointGroupServerlessDeploymentArgs serverlessDeployment) {
            this.serverlessDeployment = Output.ofNullable(serverlessDeployment);
            return this;
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }

        public Builder type(@Nullable Output<RegionNetworkEndpointGroupType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable RegionNetworkEndpointGroupType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public RegionNetworkEndpointGroupArgs build() {
            return new RegionNetworkEndpointGroupArgs(annotations, appEngine, cloudFunction, cloudRun, defaultPort, description, name, network, networkEndpointType, project, pscTargetService, region, requestId, serverlessDeployment, subnetwork, type);
        }
    }
}
