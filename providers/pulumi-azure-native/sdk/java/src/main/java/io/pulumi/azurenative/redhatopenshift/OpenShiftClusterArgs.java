// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift;

import io.pulumi.azurenative.redhatopenshift.inputs.APIServerProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.ClusterProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.ConsoleProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.IngressProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.MasterProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.ServicePrincipalProfileArgs;
import io.pulumi.azurenative.redhatopenshift.inputs.WorkerProfileArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenShiftClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftClusterArgs Empty = new OpenShiftClusterArgs();

    /**
     * The cluster API server profile.
     * 
     */
    @Import(name="apiserverProfile")
      private final @Nullable Output<APIServerProfileArgs> apiserverProfile;

    public Output<APIServerProfileArgs> getApiserverProfile() {
        return this.apiserverProfile == null ? Output.empty() : this.apiserverProfile;
    }

    /**
     * The cluster profile.
     * 
     */
    @Import(name="clusterProfile")
      private final @Nullable Output<ClusterProfileArgs> clusterProfile;

    public Output<ClusterProfileArgs> getClusterProfile() {
        return this.clusterProfile == null ? Output.empty() : this.clusterProfile;
    }

    /**
     * The console profile.
     * 
     */
    @Import(name="consoleProfile")
      private final @Nullable Output<ConsoleProfileArgs> consoleProfile;

    public Output<ConsoleProfileArgs> getConsoleProfile() {
        return this.consoleProfile == null ? Output.empty() : this.consoleProfile;
    }

    /**
     * The cluster ingress profiles.
     * 
     */
    @Import(name="ingressProfiles")
      private final @Nullable Output<List<IngressProfileArgs>> ingressProfiles;

    public Output<List<IngressProfileArgs>> getIngressProfiles() {
        return this.ingressProfiles == null ? Output.empty() : this.ingressProfiles;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The cluster master profile.
     * 
     */
    @Import(name="masterProfile")
      private final @Nullable Output<MasterProfileArgs> masterProfile;

    public Output<MasterProfileArgs> getMasterProfile() {
        return this.masterProfile == null ? Output.empty() : this.masterProfile;
    }

    /**
     * The cluster network profile.
     * 
     */
    @Import(name="networkProfile")
      private final @Nullable Output<NetworkProfileArgs> networkProfile;

    public Output<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Output.empty() : this.networkProfile;
    }

    /**
     * The cluster provisioning state (immutable).
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the OpenShift cluster resource.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * The cluster service principal profile.
     * 
     */
    @Import(name="servicePrincipalProfile")
      private final @Nullable Output<ServicePrincipalProfileArgs> servicePrincipalProfile;

    public Output<ServicePrincipalProfileArgs> getServicePrincipalProfile() {
        return this.servicePrincipalProfile == null ? Output.empty() : this.servicePrincipalProfile;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The cluster worker profiles.
     * 
     */
    @Import(name="workerProfiles")
      private final @Nullable Output<List<WorkerProfileArgs>> workerProfiles;

    public Output<List<WorkerProfileArgs>> getWorkerProfiles() {
        return this.workerProfiles == null ? Output.empty() : this.workerProfiles;
    }

    public OpenShiftClusterArgs(
        @Nullable Output<APIServerProfileArgs> apiserverProfile,
        @Nullable Output<ClusterProfileArgs> clusterProfile,
        @Nullable Output<ConsoleProfileArgs> consoleProfile,
        @Nullable Output<List<IngressProfileArgs>> ingressProfiles,
        @Nullable Output<String> location,
        @Nullable Output<MasterProfileArgs> masterProfile,
        @Nullable Output<NetworkProfileArgs> networkProfile,
        @Nullable Output<String> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<ServicePrincipalProfileArgs> servicePrincipalProfile,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<WorkerProfileArgs>> workerProfiles) {
        this.apiserverProfile = apiserverProfile;
        this.clusterProfile = clusterProfile;
        this.consoleProfile = consoleProfile;
        this.ingressProfiles = ingressProfiles;
        this.location = location;
        this.masterProfile = masterProfile;
        this.networkProfile = networkProfile;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.servicePrincipalProfile = servicePrincipalProfile;
        this.tags = tags;
        this.workerProfiles = workerProfiles;
    }

    private OpenShiftClusterArgs() {
        this.apiserverProfile = Output.empty();
        this.clusterProfile = Output.empty();
        this.consoleProfile = Output.empty();
        this.ingressProfiles = Output.empty();
        this.location = Output.empty();
        this.masterProfile = Output.empty();
        this.networkProfile = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.servicePrincipalProfile = Output.empty();
        this.tags = Output.empty();
        this.workerProfiles = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<APIServerProfileArgs> apiserverProfile;
        private @Nullable Output<ClusterProfileArgs> clusterProfile;
        private @Nullable Output<ConsoleProfileArgs> consoleProfile;
        private @Nullable Output<List<IngressProfileArgs>> ingressProfiles;
        private @Nullable Output<String> location;
        private @Nullable Output<MasterProfileArgs> masterProfile;
        private @Nullable Output<NetworkProfileArgs> networkProfile;
        private @Nullable Output<String> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<ServicePrincipalProfileArgs> servicePrincipalProfile;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<WorkerProfileArgs>> workerProfiles;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiserverProfile = defaults.apiserverProfile;
    	      this.clusterProfile = defaults.clusterProfile;
    	      this.consoleProfile = defaults.consoleProfile;
    	      this.ingressProfiles = defaults.ingressProfiles;
    	      this.location = defaults.location;
    	      this.masterProfile = defaults.masterProfile;
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.servicePrincipalProfile = defaults.servicePrincipalProfile;
    	      this.tags = defaults.tags;
    	      this.workerProfiles = defaults.workerProfiles;
        }

        public Builder apiserverProfile(@Nullable Output<APIServerProfileArgs> apiserverProfile) {
            this.apiserverProfile = apiserverProfile;
            return this;
        }

        public Builder apiserverProfile(@Nullable APIServerProfileArgs apiserverProfile) {
            this.apiserverProfile = Output.ofNullable(apiserverProfile);
            return this;
        }

        public Builder clusterProfile(@Nullable Output<ClusterProfileArgs> clusterProfile) {
            this.clusterProfile = clusterProfile;
            return this;
        }

        public Builder clusterProfile(@Nullable ClusterProfileArgs clusterProfile) {
            this.clusterProfile = Output.ofNullable(clusterProfile);
            return this;
        }

        public Builder consoleProfile(@Nullable Output<ConsoleProfileArgs> consoleProfile) {
            this.consoleProfile = consoleProfile;
            return this;
        }

        public Builder consoleProfile(@Nullable ConsoleProfileArgs consoleProfile) {
            this.consoleProfile = Output.ofNullable(consoleProfile);
            return this;
        }

        public Builder ingressProfiles(@Nullable Output<List<IngressProfileArgs>> ingressProfiles) {
            this.ingressProfiles = ingressProfiles;
            return this;
        }

        public Builder ingressProfiles(@Nullable List<IngressProfileArgs> ingressProfiles) {
            this.ingressProfiles = Output.ofNullable(ingressProfiles);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder masterProfile(@Nullable Output<MasterProfileArgs> masterProfile) {
            this.masterProfile = masterProfile;
            return this;
        }

        public Builder masterProfile(@Nullable MasterProfileArgs masterProfile) {
            this.masterProfile = Output.ofNullable(masterProfile);
            return this;
        }

        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Output.ofNullable(networkProfile);
            return this;
        }

        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }

        public Builder servicePrincipalProfile(@Nullable Output<ServicePrincipalProfileArgs> servicePrincipalProfile) {
            this.servicePrincipalProfile = servicePrincipalProfile;
            return this;
        }

        public Builder servicePrincipalProfile(@Nullable ServicePrincipalProfileArgs servicePrincipalProfile) {
            this.servicePrincipalProfile = Output.ofNullable(servicePrincipalProfile);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder workerProfiles(@Nullable Output<List<WorkerProfileArgs>> workerProfiles) {
            this.workerProfiles = workerProfiles;
            return this;
        }

        public Builder workerProfiles(@Nullable List<WorkerProfileArgs> workerProfiles) {
            this.workerProfiles = Output.ofNullable(workerProfiles);
            return this;
        }
        public OpenShiftClusterArgs build() {
            return new OpenShiftClusterArgs(apiserverProfile, clusterProfile, consoleProfile, ingressProfiles, location, masterProfile, networkProfile, provisioningState, resourceGroupName, resourceName, servicePrincipalProfile, tags, workerProfiles);
        }
    }
}
