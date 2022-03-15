// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.DraDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ProcessServerDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.PushInstallerDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RcmProxyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ReplicationAgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ReprotectAgentDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InMageRcmFabricSpecificDetailsResponse {
    /**
     * The list of agent details.
     * 
     */
    private final List<AgentDetailsResponse> agentDetails;
    /**
     * The control plane Uri.
     * 
     */
    private final String controlPlaneUri;
    /**
     * The data plane Uri.
     * 
     */
    private final String dataPlaneUri;
    /**
     * The list of DRAs.
     * 
     */
    private final List<DraDetailsResponse> dras;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
     */
    private final String instanceType;
    /**
     * The ARM Id of the physical site.
     * 
     */
    private final String physicalSiteId;
    /**
     * The list of process servers.
     * 
     */
    private final List<ProcessServerDetailsResponse> processServers;
    /**
     * The list of push installers.
     * 
     */
    private final List<PushInstallerDetailsResponse> pushInstallers;
    /**
     * The list of RCM proxies.
     * 
     */
    private final List<RcmProxyDetailsResponse> rcmProxies;
    /**
     * The list of replication agents.
     * 
     */
    private final List<ReplicationAgentDetailsResponse> replicationAgents;
    /**
     * The list of reprotect agents.
     * 
     */
    private final List<ReprotectAgentDetailsResponse> reprotectAgents;
    /**
     * The service container Id.
     * 
     */
    private final String serviceContainerId;
    /**
     * The service endpoint.
     * 
     */
    private final String serviceEndpoint;
    /**
     * The service resource Id.
     * 
     */
    private final String serviceResourceId;
    /**
     * The ARM Id of the VMware site.
     * 
     */
    private final String vmwareSiteId;

    @CustomType.Constructor
    private InMageRcmFabricSpecificDetailsResponse(
        @CustomType.Parameter("agentDetails") List<AgentDetailsResponse> agentDetails,
        @CustomType.Parameter("controlPlaneUri") String controlPlaneUri,
        @CustomType.Parameter("dataPlaneUri") String dataPlaneUri,
        @CustomType.Parameter("dras") List<DraDetailsResponse> dras,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("physicalSiteId") String physicalSiteId,
        @CustomType.Parameter("processServers") List<ProcessServerDetailsResponse> processServers,
        @CustomType.Parameter("pushInstallers") List<PushInstallerDetailsResponse> pushInstallers,
        @CustomType.Parameter("rcmProxies") List<RcmProxyDetailsResponse> rcmProxies,
        @CustomType.Parameter("replicationAgents") List<ReplicationAgentDetailsResponse> replicationAgents,
        @CustomType.Parameter("reprotectAgents") List<ReprotectAgentDetailsResponse> reprotectAgents,
        @CustomType.Parameter("serviceContainerId") String serviceContainerId,
        @CustomType.Parameter("serviceEndpoint") String serviceEndpoint,
        @CustomType.Parameter("serviceResourceId") String serviceResourceId,
        @CustomType.Parameter("vmwareSiteId") String vmwareSiteId) {
        this.agentDetails = agentDetails;
        this.controlPlaneUri = controlPlaneUri;
        this.dataPlaneUri = dataPlaneUri;
        this.dras = dras;
        this.instanceType = instanceType;
        this.physicalSiteId = physicalSiteId;
        this.processServers = processServers;
        this.pushInstallers = pushInstallers;
        this.rcmProxies = rcmProxies;
        this.replicationAgents = replicationAgents;
        this.reprotectAgents = reprotectAgents;
        this.serviceContainerId = serviceContainerId;
        this.serviceEndpoint = serviceEndpoint;
        this.serviceResourceId = serviceResourceId;
        this.vmwareSiteId = vmwareSiteId;
    }

    /**
     * The list of agent details.
     * 
    */
    public List<AgentDetailsResponse> getAgentDetails() {
        return this.agentDetails;
    }
    /**
     * The control plane Uri.
     * 
    */
    public String getControlPlaneUri() {
        return this.controlPlaneUri;
    }
    /**
     * The data plane Uri.
     * 
    */
    public String getDataPlaneUri() {
        return this.dataPlaneUri;
    }
    /**
     * The list of DRAs.
     * 
    */
    public List<DraDetailsResponse> getDras() {
        return this.dras;
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The ARM Id of the physical site.
     * 
    */
    public String getPhysicalSiteId() {
        return this.physicalSiteId;
    }
    /**
     * The list of process servers.
     * 
    */
    public List<ProcessServerDetailsResponse> getProcessServers() {
        return this.processServers;
    }
    /**
     * The list of push installers.
     * 
    */
    public List<PushInstallerDetailsResponse> getPushInstallers() {
        return this.pushInstallers;
    }
    /**
     * The list of RCM proxies.
     * 
    */
    public List<RcmProxyDetailsResponse> getRcmProxies() {
        return this.rcmProxies;
    }
    /**
     * The list of replication agents.
     * 
    */
    public List<ReplicationAgentDetailsResponse> getReplicationAgents() {
        return this.replicationAgents;
    }
    /**
     * The list of reprotect agents.
     * 
    */
    public List<ReprotectAgentDetailsResponse> getReprotectAgents() {
        return this.reprotectAgents;
    }
    /**
     * The service container Id.
     * 
    */
    public String getServiceContainerId() {
        return this.serviceContainerId;
    }
    /**
     * The service endpoint.
     * 
    */
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * The service resource Id.
     * 
    */
    public String getServiceResourceId() {
        return this.serviceResourceId;
    }
    /**
     * The ARM Id of the VMware site.
     * 
    */
    public String getVmwareSiteId() {
        return this.vmwareSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmFabricSpecificDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AgentDetailsResponse> agentDetails;
        private String controlPlaneUri;
        private String dataPlaneUri;
        private List<DraDetailsResponse> dras;
        private String instanceType;
        private String physicalSiteId;
        private List<ProcessServerDetailsResponse> processServers;
        private List<PushInstallerDetailsResponse> pushInstallers;
        private List<RcmProxyDetailsResponse> rcmProxies;
        private List<ReplicationAgentDetailsResponse> replicationAgents;
        private List<ReprotectAgentDetailsResponse> reprotectAgents;
        private String serviceContainerId;
        private String serviceEndpoint;
        private String serviceResourceId;
        private String vmwareSiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmFabricSpecificDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentDetails = defaults.agentDetails;
    	      this.controlPlaneUri = defaults.controlPlaneUri;
    	      this.dataPlaneUri = defaults.dataPlaneUri;
    	      this.dras = defaults.dras;
    	      this.instanceType = defaults.instanceType;
    	      this.physicalSiteId = defaults.physicalSiteId;
    	      this.processServers = defaults.processServers;
    	      this.pushInstallers = defaults.pushInstallers;
    	      this.rcmProxies = defaults.rcmProxies;
    	      this.replicationAgents = defaults.replicationAgents;
    	      this.reprotectAgents = defaults.reprotectAgents;
    	      this.serviceContainerId = defaults.serviceContainerId;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.serviceResourceId = defaults.serviceResourceId;
    	      this.vmwareSiteId = defaults.vmwareSiteId;
        }

        public Builder agentDetails(List<AgentDetailsResponse> agentDetails) {
            this.agentDetails = Objects.requireNonNull(agentDetails);
            return this;
        }

        public Builder controlPlaneUri(String controlPlaneUri) {
            this.controlPlaneUri = Objects.requireNonNull(controlPlaneUri);
            return this;
        }

        public Builder dataPlaneUri(String dataPlaneUri) {
            this.dataPlaneUri = Objects.requireNonNull(dataPlaneUri);
            return this;
        }

        public Builder dras(List<DraDetailsResponse> dras) {
            this.dras = Objects.requireNonNull(dras);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder physicalSiteId(String physicalSiteId) {
            this.physicalSiteId = Objects.requireNonNull(physicalSiteId);
            return this;
        }

        public Builder processServers(List<ProcessServerDetailsResponse> processServers) {
            this.processServers = Objects.requireNonNull(processServers);
            return this;
        }

        public Builder pushInstallers(List<PushInstallerDetailsResponse> pushInstallers) {
            this.pushInstallers = Objects.requireNonNull(pushInstallers);
            return this;
        }

        public Builder rcmProxies(List<RcmProxyDetailsResponse> rcmProxies) {
            this.rcmProxies = Objects.requireNonNull(rcmProxies);
            return this;
        }

        public Builder replicationAgents(List<ReplicationAgentDetailsResponse> replicationAgents) {
            this.replicationAgents = Objects.requireNonNull(replicationAgents);
            return this;
        }

        public Builder reprotectAgents(List<ReprotectAgentDetailsResponse> reprotectAgents) {
            this.reprotectAgents = Objects.requireNonNull(reprotectAgents);
            return this;
        }

        public Builder serviceContainerId(String serviceContainerId) {
            this.serviceContainerId = Objects.requireNonNull(serviceContainerId);
            return this;
        }

        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }

        public Builder serviceResourceId(String serviceResourceId) {
            this.serviceResourceId = Objects.requireNonNull(serviceResourceId);
            return this;
        }

        public Builder vmwareSiteId(String vmwareSiteId) {
            this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId);
            return this;
        }
        public InMageRcmFabricSpecificDetailsResponse build() {
            return new InMageRcmFabricSpecificDetailsResponse(agentDetails, controlPlaneUri, dataPlaneUri, dras, instanceType, physicalSiteId, processServers, pushInstallers, rcmProxies, replicationAgents, reprotectAgents, serviceContainerId, serviceEndpoint, serviceResourceId, vmwareSiteId);
        }
    }
}
