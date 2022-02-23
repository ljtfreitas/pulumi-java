// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.AbortInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.CloudSQLInstanceInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.DeliverInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.DropInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.EndpointInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.FirewallInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.ForwardInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.ForwardingRuleInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.GKEMasterInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.InstanceInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.LoadBalancerInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.NetworkInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.RouteInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.VpnGatewayInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.VpnTunnelInfoResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StepResponse {
    /**
     * Display information of the final state "abort" and reason.
     * 
     */
    private final AbortInfoResponse abort;
    /**
     * This is a step that leads to the final state Drop.
     * 
     */
    private final Boolean causesDrop;
    /**
     * Display information of a Cloud SQL instance.
     * 
     */
    private final CloudSQLInstanceInfoResponse cloudSqlInstance;
    /**
     * Display information of the final state "deliver" and reason.
     * 
     */
    private final DeliverInfoResponse deliver;
    /**
     * A description of the step. Usually this is a summary of the state.
     * 
     */
    private final String description;
    /**
     * Display information of the final state "drop" and reason.
     * 
     */
    private final DropInfoResponse drop;
    /**
     * Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by state like NAT, or Connection Proxy.
     * 
     */
    private final EndpointInfoResponse endpoint;
    /**
     * Display information of a Compute Engine firewall rule.
     * 
     */
    private final FirewallInfoResponse firewall;
    /**
     * Display information of the final state "forward" and reason.
     * 
     */
    private final ForwardInfoResponse forward;
    /**
     * Display information of a Compute Engine forwarding rule.
     * 
     */
    private final ForwardingRuleInfoResponse forwardingRule;
    /**
     * Display information of a Google Kubernetes Engine cluster master.
     * 
     */
    private final GKEMasterInfoResponse gkeMaster;
    /**
     * Display information of a Compute Engine instance.
     * 
     */
    private final InstanceInfoResponse instance;
    /**
     * Display information of the load balancers.
     * 
     */
    private final LoadBalancerInfoResponse loadBalancer;
    /**
     * Display information of a Google Cloud network.
     * 
     */
    private final NetworkInfoResponse network;
    /**
     * Project ID that contains the configuration this step is validating.
     * 
     */
    private final String project;
    /**
     * Display information of a Compute Engine route.
     * 
     */
    private final RouteInfoResponse route;
    /**
     * Each step is in one of the pre-defined states.
     * 
     */
    private final String state;
    /**
     * Display information of a Compute Engine VPN gateway.
     * 
     */
    private final VpnGatewayInfoResponse vpnGateway;
    /**
     * Display information of a Compute Engine VPN tunnel.
     * 
     */
    private final VpnTunnelInfoResponse vpnTunnel;

    @OutputCustomType.Constructor({"abort","causesDrop","cloudSqlInstance","deliver","description","drop","endpoint","firewall","forward","forwardingRule","gkeMaster","instance","loadBalancer","network","project","route","state","vpnGateway","vpnTunnel"})
    private StepResponse(
        AbortInfoResponse abort,
        Boolean causesDrop,
        CloudSQLInstanceInfoResponse cloudSqlInstance,
        DeliverInfoResponse deliver,
        String description,
        DropInfoResponse drop,
        EndpointInfoResponse endpoint,
        FirewallInfoResponse firewall,
        ForwardInfoResponse forward,
        ForwardingRuleInfoResponse forwardingRule,
        GKEMasterInfoResponse gkeMaster,
        InstanceInfoResponse instance,
        LoadBalancerInfoResponse loadBalancer,
        NetworkInfoResponse network,
        String project,
        RouteInfoResponse route,
        String state,
        VpnGatewayInfoResponse vpnGateway,
        VpnTunnelInfoResponse vpnTunnel) {
        this.abort = Objects.requireNonNull(abort);
        this.causesDrop = Objects.requireNonNull(causesDrop);
        this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance);
        this.deliver = Objects.requireNonNull(deliver);
        this.description = Objects.requireNonNull(description);
        this.drop = Objects.requireNonNull(drop);
        this.endpoint = Objects.requireNonNull(endpoint);
        this.firewall = Objects.requireNonNull(firewall);
        this.forward = Objects.requireNonNull(forward);
        this.forwardingRule = Objects.requireNonNull(forwardingRule);
        this.gkeMaster = Objects.requireNonNull(gkeMaster);
        this.instance = Objects.requireNonNull(instance);
        this.loadBalancer = Objects.requireNonNull(loadBalancer);
        this.network = Objects.requireNonNull(network);
        this.project = Objects.requireNonNull(project);
        this.route = Objects.requireNonNull(route);
        this.state = Objects.requireNonNull(state);
        this.vpnGateway = Objects.requireNonNull(vpnGateway);
        this.vpnTunnel = Objects.requireNonNull(vpnTunnel);
    }

    /**
     * Display information of the final state "abort" and reason.
     * 
     */
    public AbortInfoResponse getAbort() {
        return this.abort;
    }
    /**
     * This is a step that leads to the final state Drop.
     * 
     */
    public Boolean getCausesDrop() {
        return this.causesDrop;
    }
    /**
     * Display information of a Cloud SQL instance.
     * 
     */
    public CloudSQLInstanceInfoResponse getCloudSqlInstance() {
        return this.cloudSqlInstance;
    }
    /**
     * Display information of the final state "deliver" and reason.
     * 
     */
    public DeliverInfoResponse getDeliver() {
        return this.deliver;
    }
    /**
     * A description of the step. Usually this is a summary of the state.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display information of the final state "drop" and reason.
     * 
     */
    public DropInfoResponse getDrop() {
        return this.drop;
    }
    /**
     * Display information of the source and destination under analysis. The endpoint information in an intermediate state may differ with the initial input, as it might be modified by state like NAT, or Connection Proxy.
     * 
     */
    public EndpointInfoResponse getEndpoint() {
        return this.endpoint;
    }
    /**
     * Display information of a Compute Engine firewall rule.
     * 
     */
    public FirewallInfoResponse getFirewall() {
        return this.firewall;
    }
    /**
     * Display information of the final state "forward" and reason.
     * 
     */
    public ForwardInfoResponse getForward() {
        return this.forward;
    }
    /**
     * Display information of a Compute Engine forwarding rule.
     * 
     */
    public ForwardingRuleInfoResponse getForwardingRule() {
        return this.forwardingRule;
    }
    /**
     * Display information of a Google Kubernetes Engine cluster master.
     * 
     */
    public GKEMasterInfoResponse getGkeMaster() {
        return this.gkeMaster;
    }
    /**
     * Display information of a Compute Engine instance.
     * 
     */
    public InstanceInfoResponse getInstance() {
        return this.instance;
    }
    /**
     * Display information of the load balancers.
     * 
     */
    public LoadBalancerInfoResponse getLoadBalancer() {
        return this.loadBalancer;
    }
    /**
     * Display information of a Google Cloud network.
     * 
     */
    public NetworkInfoResponse getNetwork() {
        return this.network;
    }
    /**
     * Project ID that contains the configuration this step is validating.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * Display information of a Compute Engine route.
     * 
     */
    public RouteInfoResponse getRoute() {
        return this.route;
    }
    /**
     * Each step is in one of the pre-defined states.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Display information of a Compute Engine VPN gateway.
     * 
     */
    public VpnGatewayInfoResponse getVpnGateway() {
        return this.vpnGateway;
    }
    /**
     * Display information of a Compute Engine VPN tunnel.
     * 
     */
    public VpnTunnelInfoResponse getVpnTunnel() {
        return this.vpnTunnel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbortInfoResponse abort;
        private Boolean causesDrop;
        private CloudSQLInstanceInfoResponse cloudSqlInstance;
        private DeliverInfoResponse deliver;
        private String description;
        private DropInfoResponse drop;
        private EndpointInfoResponse endpoint;
        private FirewallInfoResponse firewall;
        private ForwardInfoResponse forward;
        private ForwardingRuleInfoResponse forwardingRule;
        private GKEMasterInfoResponse gkeMaster;
        private InstanceInfoResponse instance;
        private LoadBalancerInfoResponse loadBalancer;
        private NetworkInfoResponse network;
        private String project;
        private RouteInfoResponse route;
        private String state;
        private VpnGatewayInfoResponse vpnGateway;
        private VpnTunnelInfoResponse vpnTunnel;

        public Builder() {
    	      // Empty
        }

        public Builder(StepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.causesDrop = defaults.causesDrop;
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.deliver = defaults.deliver;
    	      this.description = defaults.description;
    	      this.drop = defaults.drop;
    	      this.endpoint = defaults.endpoint;
    	      this.firewall = defaults.firewall;
    	      this.forward = defaults.forward;
    	      this.forwardingRule = defaults.forwardingRule;
    	      this.gkeMaster = defaults.gkeMaster;
    	      this.instance = defaults.instance;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.route = defaults.route;
    	      this.state = defaults.state;
    	      this.vpnGateway = defaults.vpnGateway;
    	      this.vpnTunnel = defaults.vpnTunnel;
        }

        public Builder setAbort(AbortInfoResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }

        public Builder setCausesDrop(Boolean causesDrop) {
            this.causesDrop = Objects.requireNonNull(causesDrop);
            return this;
        }

        public Builder setCloudSqlInstance(CloudSQLInstanceInfoResponse cloudSqlInstance) {
            this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance);
            return this;
        }

        public Builder setDeliver(DeliverInfoResponse deliver) {
            this.deliver = Objects.requireNonNull(deliver);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDrop(DropInfoResponse drop) {
            this.drop = Objects.requireNonNull(drop);
            return this;
        }

        public Builder setEndpoint(EndpointInfoResponse endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setFirewall(FirewallInfoResponse firewall) {
            this.firewall = Objects.requireNonNull(firewall);
            return this;
        }

        public Builder setForward(ForwardInfoResponse forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }

        public Builder setForwardingRule(ForwardingRuleInfoResponse forwardingRule) {
            this.forwardingRule = Objects.requireNonNull(forwardingRule);
            return this;
        }

        public Builder setGkeMaster(GKEMasterInfoResponse gkeMaster) {
            this.gkeMaster = Objects.requireNonNull(gkeMaster);
            return this;
        }

        public Builder setInstance(InstanceInfoResponse instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setLoadBalancer(LoadBalancerInfoResponse loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }

        public Builder setNetwork(NetworkInfoResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRoute(RouteInfoResponse route) {
            this.route = Objects.requireNonNull(route);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setVpnGateway(VpnGatewayInfoResponse vpnGateway) {
            this.vpnGateway = Objects.requireNonNull(vpnGateway);
            return this;
        }

        public Builder setVpnTunnel(VpnTunnelInfoResponse vpnTunnel) {
            this.vpnTunnel = Objects.requireNonNull(vpnTunnel);
            return this;
        }
        public StepResponse build() {
            return new StepResponse(abort, causesDrop, cloudSqlInstance, deliver, description, drop, endpoint, firewall, forward, forwardingRule, gkeMaster, instance, loadBalancer, network, project, route, state, vpnGateway, vpnTunnel);
        }
    }
}
