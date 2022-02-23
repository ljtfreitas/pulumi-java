// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointServiceState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceState Empty = new VpcEndpointServiceState();

    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    @InputImport(name="acceptanceRequired")
    private final @Nullable Input<Boolean> acceptanceRequired;

    public Input<Boolean> getAcceptanceRequired() {
        return this.acceptanceRequired == null ? Input.empty() : this.acceptanceRequired;
    }

    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     * 
     */
    @InputImport(name="allowedPrincipals")
    private final @Nullable Input<List<String>> allowedPrincipals;

    public Input<List<String>> getAllowedPrincipals() {
        return this.allowedPrincipals == null ? Input.empty() : this.allowedPrincipals;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Availability Zones in which the service is available.
     * 
     */
    @InputImport(name="availabilityZones")
    private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    /**
     * The DNS names for the service.
     * 
     */
    @InputImport(name="baseEndpointDnsNames")
    private final @Nullable Input<List<String>> baseEndpointDnsNames;

    public Input<List<String>> getBaseEndpointDnsNames() {
        return this.baseEndpointDnsNames == null ? Input.empty() : this.baseEndpointDnsNames;
    }

    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     * 
     */
    @InputImport(name="gatewayLoadBalancerArns")
    private final @Nullable Input<List<String>> gatewayLoadBalancerArns;

    public Input<List<String>> getGatewayLoadBalancerArns() {
        return this.gatewayLoadBalancerArns == null ? Input.empty() : this.gatewayLoadBalancerArns;
    }

    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    @InputImport(name="managesVpcEndpoints")
    private final @Nullable Input<Boolean> managesVpcEndpoints;

    public Input<Boolean> getManagesVpcEndpoints() {
        return this.managesVpcEndpoints == null ? Input.empty() : this.managesVpcEndpoints;
    }

    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     * 
     */
    @InputImport(name="networkLoadBalancerArns")
    private final @Nullable Input<List<String>> networkLoadBalancerArns;

    public Input<List<String>> getNetworkLoadBalancerArns() {
        return this.networkLoadBalancerArns == null ? Input.empty() : this.networkLoadBalancerArns;
    }

    /**
     * The private DNS name for the service.
     * 
     */
    @InputImport(name="privateDnsName")
    private final @Nullable Input<String> privateDnsName;

    public Input<String> getPrivateDnsName() {
        return this.privateDnsName == null ? Input.empty() : this.privateDnsName;
    }

    /**
     * List of objects containing information about the endpoint service private DNS name configuration.
     * 
     */
    @InputImport(name="privateDnsNameConfigurations")
    private final @Nullable Input<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations;

    public Input<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> getPrivateDnsNameConfigurations() {
        return this.privateDnsNameConfigurations == null ? Input.empty() : this.privateDnsNameConfigurations;
    }

    /**
     * The service name.
     * 
     */
    @InputImport(name="serviceName")
    private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * The service type, `Gateway` or `Interface`.
     * 
     */
    @InputImport(name="serviceType")
    private final @Nullable Input<String> serviceType;

    public Input<String> getServiceType() {
        return this.serviceType == null ? Input.empty() : this.serviceType;
    }

    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public VpcEndpointServiceState(
        @Nullable Input<Boolean> acceptanceRequired,
        @Nullable Input<List<String>> allowedPrincipals,
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<List<String>> baseEndpointDnsNames,
        @Nullable Input<List<String>> gatewayLoadBalancerArns,
        @Nullable Input<Boolean> managesVpcEndpoints,
        @Nullable Input<List<String>> networkLoadBalancerArns,
        @Nullable Input<String> privateDnsName,
        @Nullable Input<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations,
        @Nullable Input<String> serviceName,
        @Nullable Input<String> serviceType,
        @Nullable Input<String> state,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.acceptanceRequired = acceptanceRequired;
        this.allowedPrincipals = allowedPrincipals;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.baseEndpointDnsNames = baseEndpointDnsNames;
        this.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
        this.managesVpcEndpoints = managesVpcEndpoints;
        this.networkLoadBalancerArns = networkLoadBalancerArns;
        this.privateDnsName = privateDnsName;
        this.privateDnsNameConfigurations = privateDnsNameConfigurations;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcEndpointServiceState() {
        this.acceptanceRequired = Input.empty();
        this.allowedPrincipals = Input.empty();
        this.arn = Input.empty();
        this.availabilityZones = Input.empty();
        this.baseEndpointDnsNames = Input.empty();
        this.gatewayLoadBalancerArns = Input.empty();
        this.managesVpcEndpoints = Input.empty();
        this.networkLoadBalancerArns = Input.empty();
        this.privateDnsName = Input.empty();
        this.privateDnsNameConfigurations = Input.empty();
        this.serviceName = Input.empty();
        this.serviceType = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> acceptanceRequired;
        private @Nullable Input<List<String>> allowedPrincipals;
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<List<String>> baseEndpointDnsNames;
        private @Nullable Input<List<String>> gatewayLoadBalancerArns;
        private @Nullable Input<Boolean> managesVpcEndpoints;
        private @Nullable Input<List<String>> networkLoadBalancerArns;
        private @Nullable Input<String> privateDnsName;
        private @Nullable Input<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations;
        private @Nullable Input<String> serviceName;
        private @Nullable Input<String> serviceType;
        private @Nullable Input<String> state;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptanceRequired = defaults.acceptanceRequired;
    	      this.allowedPrincipals = defaults.allowedPrincipals;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.baseEndpointDnsNames = defaults.baseEndpointDnsNames;
    	      this.gatewayLoadBalancerArns = defaults.gatewayLoadBalancerArns;
    	      this.managesVpcEndpoints = defaults.managesVpcEndpoints;
    	      this.networkLoadBalancerArns = defaults.networkLoadBalancerArns;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateDnsNameConfigurations = defaults.privateDnsNameConfigurations;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setAcceptanceRequired(@Nullable Input<Boolean> acceptanceRequired) {
            this.acceptanceRequired = acceptanceRequired;
            return this;
        }

        public Builder setAcceptanceRequired(@Nullable Boolean acceptanceRequired) {
            this.acceptanceRequired = Input.ofNullable(acceptanceRequired);
            return this;
        }

        public Builder setAllowedPrincipals(@Nullable Input<List<String>> allowedPrincipals) {
            this.allowedPrincipals = allowedPrincipals;
            return this;
        }

        public Builder setAllowedPrincipals(@Nullable List<String> allowedPrincipals) {
            this.allowedPrincipals = Input.ofNullable(allowedPrincipals);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder setBaseEndpointDnsNames(@Nullable Input<List<String>> baseEndpointDnsNames) {
            this.baseEndpointDnsNames = baseEndpointDnsNames;
            return this;
        }

        public Builder setBaseEndpointDnsNames(@Nullable List<String> baseEndpointDnsNames) {
            this.baseEndpointDnsNames = Input.ofNullable(baseEndpointDnsNames);
            return this;
        }

        public Builder setGatewayLoadBalancerArns(@Nullable Input<List<String>> gatewayLoadBalancerArns) {
            this.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
            return this;
        }

        public Builder setGatewayLoadBalancerArns(@Nullable List<String> gatewayLoadBalancerArns) {
            this.gatewayLoadBalancerArns = Input.ofNullable(gatewayLoadBalancerArns);
            return this;
        }

        public Builder setManagesVpcEndpoints(@Nullable Input<Boolean> managesVpcEndpoints) {
            this.managesVpcEndpoints = managesVpcEndpoints;
            return this;
        }

        public Builder setManagesVpcEndpoints(@Nullable Boolean managesVpcEndpoints) {
            this.managesVpcEndpoints = Input.ofNullable(managesVpcEndpoints);
            return this;
        }

        public Builder setNetworkLoadBalancerArns(@Nullable Input<List<String>> networkLoadBalancerArns) {
            this.networkLoadBalancerArns = networkLoadBalancerArns;
            return this;
        }

        public Builder setNetworkLoadBalancerArns(@Nullable List<String> networkLoadBalancerArns) {
            this.networkLoadBalancerArns = Input.ofNullable(networkLoadBalancerArns);
            return this;
        }

        public Builder setPrivateDnsName(@Nullable Input<String> privateDnsName) {
            this.privateDnsName = privateDnsName;
            return this;
        }

        public Builder setPrivateDnsName(@Nullable String privateDnsName) {
            this.privateDnsName = Input.ofNullable(privateDnsName);
            return this;
        }

        public Builder setPrivateDnsNameConfigurations(@Nullable Input<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations) {
            this.privateDnsNameConfigurations = privateDnsNameConfigurations;
            return this;
        }

        public Builder setPrivateDnsNameConfigurations(@Nullable List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs> privateDnsNameConfigurations) {
            this.privateDnsNameConfigurations = Input.ofNullable(privateDnsNameConfigurations);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setServiceType(@Nullable Input<String> serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setServiceType(@Nullable String serviceType) {
            this.serviceType = Input.ofNullable(serviceType);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public VpcEndpointServiceState build() {
            return new VpcEndpointServiceState(acceptanceRequired, allowedPrincipals, arn, availabilityZones, baseEndpointDnsNames, gatewayLoadBalancerArns, managesVpcEndpoints, networkLoadBalancerArns, privateDnsName, privateDnsNameConfigurations, serviceName, serviceType, state, tags, tagsAll);
        }
    }
}
