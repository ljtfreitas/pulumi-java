// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.aws.servicediscovery.inputs.ServiceDnsConfigDnsRecordArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceDnsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDnsConfigArgs Empty = new ServiceDnsConfigArgs();

    /**
     * An array that contains one DnsRecord object for each resource record set.
     * 
     */
    @InputImport(name="dnsRecords", required=true)
    private final Input<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords;

    public Input<List<ServiceDnsConfigDnsRecordArgs>> getDnsRecords() {
        return this.dnsRecords;
    }

    /**
     * The ID of the namespace to use for DNS configuration.
     * 
     */
    @InputImport(name="namespaceId", required=true)
    private final Input<String> namespaceId;

    public Input<String> getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
     * 
     */
    @InputImport(name="routingPolicy")
    private final @Nullable Input<String> routingPolicy;

    public Input<String> getRoutingPolicy() {
        return this.routingPolicy == null ? Input.empty() : this.routingPolicy;
    }

    public ServiceDnsConfigArgs(
        Input<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords,
        Input<String> namespaceId,
        @Nullable Input<String> routingPolicy) {
        this.dnsRecords = Objects.requireNonNull(dnsRecords, "expected parameter 'dnsRecords' to be non-null");
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.routingPolicy = routingPolicy;
    }

    private ServiceDnsConfigArgs() {
        this.dnsRecords = Input.empty();
        this.namespaceId = Input.empty();
        this.routingPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords;
        private Input<String> namespaceId;
        private @Nullable Input<String> routingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDnsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRecords = defaults.dnsRecords;
    	      this.namespaceId = defaults.namespaceId;
    	      this.routingPolicy = defaults.routingPolicy;
        }

        public Builder setDnsRecords(Input<List<ServiceDnsConfigDnsRecordArgs>> dnsRecords) {
            this.dnsRecords = Objects.requireNonNull(dnsRecords);
            return this;
        }

        public Builder setDnsRecords(List<ServiceDnsConfigDnsRecordArgs> dnsRecords) {
            this.dnsRecords = Input.of(Objects.requireNonNull(dnsRecords));
            return this;
        }

        public Builder setNamespaceId(Input<String> namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }

        public Builder setNamespaceId(String namespaceId) {
            this.namespaceId = Input.of(Objects.requireNonNull(namespaceId));
            return this;
        }

        public Builder setRoutingPolicy(@Nullable Input<String> routingPolicy) {
            this.routingPolicy = routingPolicy;
            return this;
        }

        public Builder setRoutingPolicy(@Nullable String routingPolicy) {
            this.routingPolicy = Input.ofNullable(routingPolicy);
            return this;
        }
        public ServiceDnsConfigArgs build() {
            return new ServiceDnsConfigArgs(dnsRecords, namespaceId, routingPolicy);
        }
    }
}
