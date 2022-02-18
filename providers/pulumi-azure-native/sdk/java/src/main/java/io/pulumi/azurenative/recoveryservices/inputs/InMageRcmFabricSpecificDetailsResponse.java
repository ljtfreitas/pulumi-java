// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.DraDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.ProcessServerDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.PushInstallerDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RcmProxyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.ReplicationAgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.ReprotectAgentDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * InMageRcm fabric specific details.
 * 
 */
public final class InMageRcmFabricSpecificDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageRcmFabricSpecificDetailsResponse Empty = new InMageRcmFabricSpecificDetailsResponse();

    /**
     * The list of agent details.
     * 
     */
    @InputImport(name="agentDetails", required=true)
    private final List<AgentDetailsResponse> agentDetails;

    public List<AgentDetailsResponse> getAgentDetails() {
        return this.agentDetails;
    }

    /**
     * The control plane Uri.
     * 
     */
    @InputImport(name="controlPlaneUri", required=true)
    private final String controlPlaneUri;

    public String getControlPlaneUri() {
        return this.controlPlaneUri;
    }

    /**
     * The data plane Uri.
     * 
     */
    @InputImport(name="dataPlaneUri", required=true)
    private final String dataPlaneUri;

    public String getDataPlaneUri() {
        return this.dataPlaneUri;
    }

    /**
     * The list of DRAs.
     * 
     */
    @InputImport(name="dras", required=true)
    private final List<DraDetailsResponse> dras;

    public List<DraDetailsResponse> getDras() {
        return this.dras;
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The ARM Id of the physical site.
     * 
     */
    @InputImport(name="physicalSiteId", required=true)
    private final String physicalSiteId;

    public String getPhysicalSiteId() {
        return this.physicalSiteId;
    }

    /**
     * The list of process servers.
     * 
     */
    @InputImport(name="processServers", required=true)
    private final List<ProcessServerDetailsResponse> processServers;

    public List<ProcessServerDetailsResponse> getProcessServers() {
        return this.processServers;
    }

    /**
     * The list of push installers.
     * 
     */
    @InputImport(name="pushInstallers", required=true)
    private final List<PushInstallerDetailsResponse> pushInstallers;

    public List<PushInstallerDetailsResponse> getPushInstallers() {
        return this.pushInstallers;
    }

    /**
     * The list of RCM proxies.
     * 
     */
    @InputImport(name="rcmProxies", required=true)
    private final List<RcmProxyDetailsResponse> rcmProxies;

    public List<RcmProxyDetailsResponse> getRcmProxies() {
        return this.rcmProxies;
    }

    /**
     * The list of replication agents.
     * 
     */
    @InputImport(name="replicationAgents", required=true)
    private final List<ReplicationAgentDetailsResponse> replicationAgents;

    public List<ReplicationAgentDetailsResponse> getReplicationAgents() {
        return this.replicationAgents;
    }

    /**
     * The list of reprotect agents.
     * 
     */
    @InputImport(name="reprotectAgents", required=true)
    private final List<ReprotectAgentDetailsResponse> reprotectAgents;

    public List<ReprotectAgentDetailsResponse> getReprotectAgents() {
        return this.reprotectAgents;
    }

    /**
     * The service container Id.
     * 
     */
    @InputImport(name="serviceContainerId", required=true)
    private final String serviceContainerId;

    public String getServiceContainerId() {
        return this.serviceContainerId;
    }

    /**
     * The service endpoint.
     * 
     */
    @InputImport(name="serviceEndpoint", required=true)
    private final String serviceEndpoint;

    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * The service resource Id.
     * 
     */
    @InputImport(name="serviceResourceId", required=true)
    private final String serviceResourceId;

    public String getServiceResourceId() {
        return this.serviceResourceId;
    }

    /**
     * The ARM Id of the VMware site.
     * 
     */
    @InputImport(name="vmwareSiteId", required=true)
    private final String vmwareSiteId;

    public String getVmwareSiteId() {
        return this.vmwareSiteId;
    }

    public InMageRcmFabricSpecificDetailsResponse(
        List<AgentDetailsResponse> agentDetails,
        String controlPlaneUri,
        String dataPlaneUri,
        List<DraDetailsResponse> dras,
        String instanceType,
        String physicalSiteId,
        List<ProcessServerDetailsResponse> processServers,
        List<PushInstallerDetailsResponse> pushInstallers,
        List<RcmProxyDetailsResponse> rcmProxies,
        List<ReplicationAgentDetailsResponse> replicationAgents,
        List<ReprotectAgentDetailsResponse> reprotectAgents,
        String serviceContainerId,
        String serviceEndpoint,
        String serviceResourceId,
        String vmwareSiteId) {
        this.agentDetails = Objects.requireNonNull(agentDetails, "expected parameter 'agentDetails' to be non-null");
        this.controlPlaneUri = Objects.requireNonNull(controlPlaneUri, "expected parameter 'controlPlaneUri' to be non-null");
        this.dataPlaneUri = Objects.requireNonNull(dataPlaneUri, "expected parameter 'dataPlaneUri' to be non-null");
        this.dras = Objects.requireNonNull(dras, "expected parameter 'dras' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.physicalSiteId = Objects.requireNonNull(physicalSiteId, "expected parameter 'physicalSiteId' to be non-null");
        this.processServers = Objects.requireNonNull(processServers, "expected parameter 'processServers' to be non-null");
        this.pushInstallers = Objects.requireNonNull(pushInstallers, "expected parameter 'pushInstallers' to be non-null");
        this.rcmProxies = Objects.requireNonNull(rcmProxies, "expected parameter 'rcmProxies' to be non-null");
        this.replicationAgents = Objects.requireNonNull(replicationAgents, "expected parameter 'replicationAgents' to be non-null");
        this.reprotectAgents = Objects.requireNonNull(reprotectAgents, "expected parameter 'reprotectAgents' to be non-null");
        this.serviceContainerId = Objects.requireNonNull(serviceContainerId, "expected parameter 'serviceContainerId' to be non-null");
        this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint, "expected parameter 'serviceEndpoint' to be non-null");
        this.serviceResourceId = Objects.requireNonNull(serviceResourceId, "expected parameter 'serviceResourceId' to be non-null");
        this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId, "expected parameter 'vmwareSiteId' to be non-null");
    }

    private InMageRcmFabricSpecificDetailsResponse() {
        this.agentDetails = List.of();
        this.controlPlaneUri = null;
        this.dataPlaneUri = null;
        this.dras = List.of();
        this.instanceType = null;
        this.physicalSiteId = null;
        this.processServers = List.of();
        this.pushInstallers = List.of();
        this.rcmProxies = List.of();
        this.replicationAgents = List.of();
        this.reprotectAgents = List.of();
        this.serviceContainerId = null;
        this.serviceEndpoint = null;
        this.serviceResourceId = null;
        this.vmwareSiteId = null;
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

        public Builder setAgentDetails(List<AgentDetailsResponse> agentDetails) {
            this.agentDetails = Objects.requireNonNull(agentDetails);
            return this;
        }

        public Builder setControlPlaneUri(String controlPlaneUri) {
            this.controlPlaneUri = Objects.requireNonNull(controlPlaneUri);
            return this;
        }

        public Builder setDataPlaneUri(String dataPlaneUri) {
            this.dataPlaneUri = Objects.requireNonNull(dataPlaneUri);
            return this;
        }

        public Builder setDras(List<DraDetailsResponse> dras) {
            this.dras = Objects.requireNonNull(dras);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPhysicalSiteId(String physicalSiteId) {
            this.physicalSiteId = Objects.requireNonNull(physicalSiteId);
            return this;
        }

        public Builder setProcessServers(List<ProcessServerDetailsResponse> processServers) {
            this.processServers = Objects.requireNonNull(processServers);
            return this;
        }

        public Builder setPushInstallers(List<PushInstallerDetailsResponse> pushInstallers) {
            this.pushInstallers = Objects.requireNonNull(pushInstallers);
            return this;
        }

        public Builder setRcmProxies(List<RcmProxyDetailsResponse> rcmProxies) {
            this.rcmProxies = Objects.requireNonNull(rcmProxies);
            return this;
        }

        public Builder setReplicationAgents(List<ReplicationAgentDetailsResponse> replicationAgents) {
            this.replicationAgents = Objects.requireNonNull(replicationAgents);
            return this;
        }

        public Builder setReprotectAgents(List<ReprotectAgentDetailsResponse> reprotectAgents) {
            this.reprotectAgents = Objects.requireNonNull(reprotectAgents);
            return this;
        }

        public Builder setServiceContainerId(String serviceContainerId) {
            this.serviceContainerId = Objects.requireNonNull(serviceContainerId);
            return this;
        }

        public Builder setServiceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }

        public Builder setServiceResourceId(String serviceResourceId) {
            this.serviceResourceId = Objects.requireNonNull(serviceResourceId);
            return this;
        }

        public Builder setVmwareSiteId(String vmwareSiteId) {
            this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId);
            return this;
        }

        public InMageRcmFabricSpecificDetailsResponse build() {
            return new InMageRcmFabricSpecificDetailsResponse(agentDetails, controlPlaneUri, dataPlaneUri, dras, instanceType, physicalSiteId, processServers, pushInstallers, rcmProxies, replicationAgents, reprotectAgents, serviceContainerId, serviceEndpoint, serviceResourceId, vmwareSiteId);
        }
    }
}
