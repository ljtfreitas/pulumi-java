// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs;
import io.pulumi.gcp.container.inputs.AzureClusterFleetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterNetworkingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterArgs Empty = new AzureClusterArgs();

    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Required. Configuration related to the cluster RBAC settings.
     * 
     */
    @Import(name="authorization", required=true)
      private final Output<AzureClusterAuthorizationArgs> authorization;

    public Output<AzureClusterAuthorizationArgs> authorization() {
        return this.authorization;
    }

    /**
     * Required. The Azure region where the cluster runs. Each Google Cloud region supports a subset of nearby Azure regions. You can call to list all supported Azure regions within a given Google Cloud region.
     * 
     */
    @Import(name="azureRegion", required=true)
      private final Output<String> azureRegion;

    public Output<String> azureRegion() {
        return this.azureRegion;
    }

    /**
     * Required. Name of the AzureClient. The `AzureClient` resource must reside on the same GCP project and region as the `AzureCluster`. `AzureClient` names are formatted as `projects/<project-number>/locations/<region>/azureClients/<client-id>`. See Resource Names (https:cloud.google.com/apis/design/resource_names) for more details on Google Cloud resource names.
     * 
     */
    @Import(name="client", required=true)
      private final Output<String> client;

    public Output<String> client() {
        return this.client;
    }

    /**
     * Required. Configuration related to the cluster control plane.
     * 
     */
    @Import(name="controlPlane", required=true)
      private final Output<AzureClusterControlPlaneArgs> controlPlane;

    public Output<AzureClusterControlPlaneArgs> controlPlane() {
        return this.controlPlane;
    }

    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Fleet configuration.
     * 
     */
    @Import(name="fleet", required=true)
      private final Output<AzureClusterFleetArgs> fleet;

    public Output<AzureClusterFleetArgs> fleet() {
        return this.fleet;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The name of this resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Required. Cluster-wide networking configuration.
     * 
     */
    @Import(name="networking", required=true)
      private final Output<AzureClusterNetworkingArgs> networking;

    public Output<AzureClusterNetworkingArgs> networking() {
        return this.networking;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/<subscription-id>/resourceGroups/<resource-group-name>`
     * 
     */
    @Import(name="resourceGroupId", required=true)
      private final Output<String> resourceGroupId;

    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    public AzureClusterArgs(
        @Nullable Output<Map<String,String>> annotations,
        Output<AzureClusterAuthorizationArgs> authorization,
        Output<String> azureRegion,
        Output<String> client,
        Output<AzureClusterControlPlaneArgs> controlPlane,
        @Nullable Output<String> description,
        Output<AzureClusterFleetArgs> fleet,
        Output<String> location,
        @Nullable Output<String> name,
        Output<AzureClusterNetworkingArgs> networking,
        @Nullable Output<String> project,
        Output<String> resourceGroupId) {
        this.annotations = annotations;
        this.authorization = Objects.requireNonNull(authorization, "expected parameter 'authorization' to be non-null");
        this.azureRegion = Objects.requireNonNull(azureRegion, "expected parameter 'azureRegion' to be non-null");
        this.client = Objects.requireNonNull(client, "expected parameter 'client' to be non-null");
        this.controlPlane = Objects.requireNonNull(controlPlane, "expected parameter 'controlPlane' to be non-null");
        this.description = description;
        this.fleet = Objects.requireNonNull(fleet, "expected parameter 'fleet' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.networking = Objects.requireNonNull(networking, "expected parameter 'networking' to be non-null");
        this.project = project;
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
    }

    private AzureClusterArgs() {
        this.annotations = Codegen.empty();
        this.authorization = Codegen.empty();
        this.azureRegion = Codegen.empty();
        this.client = Codegen.empty();
        this.controlPlane = Codegen.empty();
        this.description = Codegen.empty();
        this.fleet = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.networking = Codegen.empty();
        this.project = Codegen.empty();
        this.resourceGroupId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private Output<AzureClusterAuthorizationArgs> authorization;
        private Output<String> azureRegion;
        private Output<String> client;
        private Output<AzureClusterControlPlaneArgs> controlPlane;
        private @Nullable Output<String> description;
        private Output<AzureClusterFleetArgs> fleet;
        private Output<String> location;
        private @Nullable Output<String> name;
        private Output<AzureClusterNetworkingArgs> networking;
        private @Nullable Output<String> project;
        private Output<String> resourceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authorization = defaults.authorization;
    	      this.azureRegion = defaults.azureRegion;
    	      this.client = defaults.client;
    	      this.controlPlane = defaults.controlPlane;
    	      this.description = defaults.description;
    	      this.fleet = defaults.fleet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networking = defaults.networking;
    	      this.project = defaults.project;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder authorization(Output<AzureClusterAuthorizationArgs> authorization) {
            this.authorization = Objects.requireNonNull(authorization);
            return this;
        }
        public Builder authorization(AzureClusterAuthorizationArgs authorization) {
            this.authorization = Output.of(Objects.requireNonNull(authorization));
            return this;
        }
        public Builder azureRegion(Output<String> azureRegion) {
            this.azureRegion = Objects.requireNonNull(azureRegion);
            return this;
        }
        public Builder azureRegion(String azureRegion) {
            this.azureRegion = Output.of(Objects.requireNonNull(azureRegion));
            return this;
        }
        public Builder client(Output<String> client) {
            this.client = Objects.requireNonNull(client);
            return this;
        }
        public Builder client(String client) {
            this.client = Output.of(Objects.requireNonNull(client));
            return this;
        }
        public Builder controlPlane(Output<AzureClusterControlPlaneArgs> controlPlane) {
            this.controlPlane = Objects.requireNonNull(controlPlane);
            return this;
        }
        public Builder controlPlane(AzureClusterControlPlaneArgs controlPlane) {
            this.controlPlane = Output.of(Objects.requireNonNull(controlPlane));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fleet(Output<AzureClusterFleetArgs> fleet) {
            this.fleet = Objects.requireNonNull(fleet);
            return this;
        }
        public Builder fleet(AzureClusterFleetArgs fleet) {
            this.fleet = Output.of(Objects.requireNonNull(fleet));
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
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
        public Builder networking(Output<AzureClusterNetworkingArgs> networking) {
            this.networking = Objects.requireNonNull(networking);
            return this;
        }
        public Builder networking(AzureClusterNetworkingArgs networking) {
            this.networking = Output.of(Objects.requireNonNull(networking));
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
        public Builder resourceGroupId(Output<String> resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Output.of(Objects.requireNonNull(resourceGroupId));
            return this;
        }        public AzureClusterArgs build() {
            return new AzureClusterArgs(annotations, authorization, azureRegion, client, controlPlane, description, fleet, location, name, networking, project, resourceGroupId);
        }
    }
}
