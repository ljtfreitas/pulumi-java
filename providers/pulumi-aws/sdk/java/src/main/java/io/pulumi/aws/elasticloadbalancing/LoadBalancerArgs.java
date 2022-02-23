// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.aws.elasticloadbalancing.inputs.LoadBalancerAccessLogsArgs;
import io.pulumi.aws.elasticloadbalancing.inputs.LoadBalancerHealthCheckArgs;
import io.pulumi.aws.elasticloadbalancing.inputs.LoadBalancerListenerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @InputImport(name="accessLogs")
    private final @Nullable Input<LoadBalancerAccessLogsArgs> accessLogs;

    public Input<LoadBalancerAccessLogsArgs> getAccessLogs() {
        return this.accessLogs == null ? Input.empty() : this.accessLogs;
    }

    /**
     * The AZ's to serve traffic in.
     * 
     */
    @InputImport(name="availabilityZones")
    private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    /**
     * Boolean to enable connection draining. Default: `false`
     * 
     */
    @InputImport(name="connectionDraining")
    private final @Nullable Input<Boolean> connectionDraining;

    public Input<Boolean> getConnectionDraining() {
        return this.connectionDraining == null ? Input.empty() : this.connectionDraining;
    }

    /**
     * The time in seconds to allow for connections to drain. Default: `300`
     * 
     */
    @InputImport(name="connectionDrainingTimeout")
    private final @Nullable Input<Integer> connectionDrainingTimeout;

    public Input<Integer> getConnectionDrainingTimeout() {
        return this.connectionDrainingTimeout == null ? Input.empty() : this.connectionDrainingTimeout;
    }

    /**
     * Enable cross-zone load balancing. Default: `true`
     * 
     */
    @InputImport(name="crossZoneLoadBalancing")
    private final @Nullable Input<Boolean> crossZoneLoadBalancing;

    public Input<Boolean> getCrossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing == null ? Input.empty() : this.crossZoneLoadBalancing;
    }

    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @InputImport(name="desyncMitigationMode")
    private final @Nullable Input<String> desyncMitigationMode;

    public Input<String> getDesyncMitigationMode() {
        return this.desyncMitigationMode == null ? Input.empty() : this.desyncMitigationMode;
    }

    /**
     * A health_check block. Health Check documented below.
     * 
     */
    @InputImport(name="healthCheck")
    private final @Nullable Input<LoadBalancerHealthCheckArgs> healthCheck;

    public Input<LoadBalancerHealthCheckArgs> getHealthCheck() {
        return this.healthCheck == null ? Input.empty() : this.healthCheck;
    }

    /**
     * The time in seconds that the connection is allowed to be idle. Default: `60`
     * 
     */
    @InputImport(name="idleTimeout")
    private final @Nullable Input<Integer> idleTimeout;

    public Input<Integer> getIdleTimeout() {
        return this.idleTimeout == null ? Input.empty() : this.idleTimeout;
    }

    /**
     * A list of instance ids to place in the ELB pool.
     * 
     */
    @InputImport(name="instances")
    private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * If true, ELB will be an internal ELB.
     * 
     */
    @InputImport(name="internal")
    private final @Nullable Input<Boolean> internal;

    public Input<Boolean> getInternal() {
        return this.internal == null ? Input.empty() : this.internal;
    }

    /**
     * A list of listener blocks. Listeners documented below.
     * 
     */
    @InputImport(name="listeners", required=true)
    private final Input<List<LoadBalancerListenerArgs>> listeners;

    public Input<List<LoadBalancerListenerArgs>> getListeners() {
        return this.listeners;
    }

    /**
     * The name of the ELB. By default generated by this provider.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * A list of security group IDs to assign to the ELB.
     * Only valid if creating an ELB within a VPC
     * 
     */
    @InputImport(name="securityGroups")
    private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The name of the security group that you can use as
     * part of your inbound rules for your load balancer's back-end application
     * instances. Use this for Classic or Default VPC only.
     * 
     */
    @InputImport(name="sourceSecurityGroup")
    private final @Nullable Input<String> sourceSecurityGroup;

    public Input<String> getSourceSecurityGroup() {
        return this.sourceSecurityGroup == null ? Input.empty() : this.sourceSecurityGroup;
    }

    /**
     * A list of subnet IDs to attach to the ELB.
     * 
     */
    @InputImport(name="subnets")
    private final @Nullable Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LoadBalancerArgs(
        @Nullable Input<LoadBalancerAccessLogsArgs> accessLogs,
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<Boolean> connectionDraining,
        @Nullable Input<Integer> connectionDrainingTimeout,
        @Nullable Input<Boolean> crossZoneLoadBalancing,
        @Nullable Input<String> desyncMitigationMode,
        @Nullable Input<LoadBalancerHealthCheckArgs> healthCheck,
        @Nullable Input<Integer> idleTimeout,
        @Nullable Input<List<String>> instances,
        @Nullable Input<Boolean> internal,
        Input<List<LoadBalancerListenerArgs>> listeners,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<String> sourceSecurityGroup,
        @Nullable Input<List<String>> subnets,
        @Nullable Input<Map<String,String>> tags) {
        this.accessLogs = accessLogs;
        this.availabilityZones = availabilityZones;
        this.connectionDraining = connectionDraining;
        this.connectionDrainingTimeout = connectionDrainingTimeout;
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
        this.desyncMitigationMode = desyncMitigationMode;
        this.healthCheck = healthCheck;
        this.idleTimeout = idleTimeout;
        this.instances = instances;
        this.internal = internal;
        this.listeners = Objects.requireNonNull(listeners, "expected parameter 'listeners' to be non-null");
        this.name = name;
        this.namePrefix = namePrefix;
        this.securityGroups = securityGroups;
        this.sourceSecurityGroup = sourceSecurityGroup;
        this.subnets = subnets;
        this.tags = tags;
    }

    private LoadBalancerArgs() {
        this.accessLogs = Input.empty();
        this.availabilityZones = Input.empty();
        this.connectionDraining = Input.empty();
        this.connectionDrainingTimeout = Input.empty();
        this.crossZoneLoadBalancing = Input.empty();
        this.desyncMitigationMode = Input.empty();
        this.healthCheck = Input.empty();
        this.idleTimeout = Input.empty();
        this.instances = Input.empty();
        this.internal = Input.empty();
        this.listeners = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.securityGroups = Input.empty();
        this.sourceSecurityGroup = Input.empty();
        this.subnets = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LoadBalancerAccessLogsArgs> accessLogs;
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<Boolean> connectionDraining;
        private @Nullable Input<Integer> connectionDrainingTimeout;
        private @Nullable Input<Boolean> crossZoneLoadBalancing;
        private @Nullable Input<String> desyncMitigationMode;
        private @Nullable Input<LoadBalancerHealthCheckArgs> healthCheck;
        private @Nullable Input<Integer> idleTimeout;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<Boolean> internal;
        private Input<List<LoadBalancerListenerArgs>> listeners;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<String> sourceSecurityGroup;
        private @Nullable Input<List<String>> subnets;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.connectionDrainingTimeout = defaults.connectionDrainingTimeout;
    	      this.crossZoneLoadBalancing = defaults.crossZoneLoadBalancing;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.healthCheck = defaults.healthCheck;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.instances = defaults.instances;
    	      this.internal = defaults.internal;
    	      this.listeners = defaults.listeners;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceSecurityGroup = defaults.sourceSecurityGroup;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessLogs(@Nullable Input<LoadBalancerAccessLogsArgs> accessLogs) {
            this.accessLogs = accessLogs;
            return this;
        }

        public Builder setAccessLogs(@Nullable LoadBalancerAccessLogsArgs accessLogs) {
            this.accessLogs = Input.ofNullable(accessLogs);
            return this;
        }

        public Builder setAvailabilityZones(@Nullable Input<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Input.ofNullable(availabilityZones);
            return this;
        }

        public Builder setConnectionDraining(@Nullable Input<Boolean> connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }

        public Builder setConnectionDraining(@Nullable Boolean connectionDraining) {
            this.connectionDraining = Input.ofNullable(connectionDraining);
            return this;
        }

        public Builder setConnectionDrainingTimeout(@Nullable Input<Integer> connectionDrainingTimeout) {
            this.connectionDrainingTimeout = connectionDrainingTimeout;
            return this;
        }

        public Builder setConnectionDrainingTimeout(@Nullable Integer connectionDrainingTimeout) {
            this.connectionDrainingTimeout = Input.ofNullable(connectionDrainingTimeout);
            return this;
        }

        public Builder setCrossZoneLoadBalancing(@Nullable Input<Boolean> crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = crossZoneLoadBalancing;
            return this;
        }

        public Builder setCrossZoneLoadBalancing(@Nullable Boolean crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = Input.ofNullable(crossZoneLoadBalancing);
            return this;
        }

        public Builder setDesyncMitigationMode(@Nullable Input<String> desyncMitigationMode) {
            this.desyncMitigationMode = desyncMitigationMode;
            return this;
        }

        public Builder setDesyncMitigationMode(@Nullable String desyncMitigationMode) {
            this.desyncMitigationMode = Input.ofNullable(desyncMitigationMode);
            return this;
        }

        public Builder setHealthCheck(@Nullable Input<LoadBalancerHealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder setHealthCheck(@Nullable LoadBalancerHealthCheckArgs healthCheck) {
            this.healthCheck = Input.ofNullable(healthCheck);
            return this;
        }

        public Builder setIdleTimeout(@Nullable Input<Integer> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        public Builder setIdleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = Input.ofNullable(idleTimeout);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setInternal(@Nullable Input<Boolean> internal) {
            this.internal = internal;
            return this;
        }

        public Builder setInternal(@Nullable Boolean internal) {
            this.internal = Input.ofNullable(internal);
            return this;
        }

        public Builder setListeners(Input<List<LoadBalancerListenerArgs>> listeners) {
            this.listeners = Objects.requireNonNull(listeners);
            return this;
        }

        public Builder setListeners(List<LoadBalancerListenerArgs> listeners) {
            this.listeners = Input.of(Objects.requireNonNull(listeners));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSourceSecurityGroup(@Nullable Input<String> sourceSecurityGroup) {
            this.sourceSecurityGroup = sourceSecurityGroup;
            return this;
        }

        public Builder setSourceSecurityGroup(@Nullable String sourceSecurityGroup) {
            this.sourceSecurityGroup = Input.ofNullable(sourceSecurityGroup);
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<String> subnets) {
            this.subnets = Input.ofNullable(subnets);
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
        public LoadBalancerArgs build() {
            return new LoadBalancerArgs(accessLogs, availabilityZones, connectionDraining, connectionDrainingTimeout, crossZoneLoadBalancing, desyncMitigationMode, healthCheck, idleTimeout, instances, internal, listeners, name, namePrefix, securityGroups, sourceSecurityGroup, subnets, tags);
        }
    }
}
