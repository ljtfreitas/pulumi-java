// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ServiceAttachmentConnectedEndpointGetArgs;
import io.pulumi.gcp.compute.inputs.ServiceAttachmentConsumerAcceptListGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentState Empty = new ServiceAttachmentState();

    /**
     * An array of the consumer forwarding rules connected to this service attachment.
     * 
     */
    @InputImport(name="connectedEndpoints")
        private final @Nullable Input<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints;

    public Input<List<ServiceAttachmentConnectedEndpointGetArgs>> getConnectedEndpoints() {
        return this.connectedEndpoints == null ? Input.empty() : this.connectedEndpoints;
    }

    /**
     * The connection preference to use for this service attachment. Valid
     * values include "ACCEPT_AUTOMATIC", "ACCEPT_MANUAL".
     * 
     */
    @InputImport(name="connectionPreference")
        private final @Nullable Input<String> connectionPreference;

    public Input<String> getConnectionPreference() {
        return this.connectionPreference == null ? Input.empty() : this.connectionPreference;
    }

    /**
     * An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * 
     */
    @InputImport(name="consumerAcceptLists")
        private final @Nullable Input<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists;

    public Input<List<ServiceAttachmentConsumerAcceptListGetArgs>> getConsumerAcceptLists() {
        return this.consumerAcceptLists == null ? Input.empty() : this.consumerAcceptLists;
    }

    /**
     * An array of projects that are not allowed to connect to this service
     * attachment.
     * 
     */
    @InputImport(name="consumerRejectLists")
        private final @Nullable Input<List<String>> consumerRejectLists;

    public Input<List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists == null ? Input.empty() : this.consumerRejectLists;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP
     * address data in TCP connections that traverse proxies on their way to
     * destination servers.
     * 
     */
    @InputImport(name="enableProxyProtocol")
        private final @Nullable Input<Boolean> enableProxyProtocol;

    public Input<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol == null ? Input.empty() : this.enableProxyProtocol;
    }

    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    @InputImport(name="fingerprint")
        private final @Nullable Input<String> fingerprint;

    public Input<String> getFingerprint() {
        return this.fingerprint == null ? Input.empty() : this.fingerprint;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of subnets that is provided for NAT in this service attachment.
     * 
     */
    @InputImport(name="natSubnets")
        private final @Nullable Input<List<String>> natSubnets;

    public Input<List<String>> getNatSubnets() {
        return this.natSubnets == null ? Input.empty() : this.natSubnets;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * URL of the region where the resource resides.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
        private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * The URL of a forwarding rule that represents the service identified by
     * this service attachment.
     * 
     */
    @InputImport(name="targetService")
        private final @Nullable Input<String> targetService;

    public Input<String> getTargetService() {
        return this.targetService == null ? Input.empty() : this.targetService;
    }

    public ServiceAttachmentState(
        @Nullable Input<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints,
        @Nullable Input<String> connectionPreference,
        @Nullable Input<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists,
        @Nullable Input<List<String>> consumerRejectLists,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableProxyProtocol,
        @Nullable Input<String> fingerprint,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> natSubnets,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> targetService) {
        this.connectedEndpoints = connectedEndpoints;
        this.connectionPreference = connectionPreference;
        this.consumerAcceptLists = consumerAcceptLists;
        this.consumerRejectLists = consumerRejectLists;
        this.description = description;
        this.enableProxyProtocol = enableProxyProtocol;
        this.fingerprint = fingerprint;
        this.name = name;
        this.natSubnets = natSubnets;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.targetService = targetService;
    }

    private ServiceAttachmentState() {
        this.connectedEndpoints = Input.empty();
        this.connectionPreference = Input.empty();
        this.consumerAcceptLists = Input.empty();
        this.consumerRejectLists = Input.empty();
        this.description = Input.empty();
        this.enableProxyProtocol = Input.empty();
        this.fingerprint = Input.empty();
        this.name = Input.empty();
        this.natSubnets = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.selfLink = Input.empty();
        this.targetService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints;
        private @Nullable Input<String> connectionPreference;
        private @Nullable Input<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists;
        private @Nullable Input<List<String>> consumerRejectLists;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableProxyProtocol;
        private @Nullable Input<String> fingerprint;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> natSubnets;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> targetService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedEndpoints = defaults.connectedEndpoints;
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.consumerAcceptLists = defaults.consumerAcceptLists;
    	      this.consumerRejectLists = defaults.consumerRejectLists;
    	      this.description = defaults.description;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
    	      this.natSubnets = defaults.natSubnets;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.targetService = defaults.targetService;
        }

        public Builder setConnectedEndpoints(@Nullable Input<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints) {
            this.connectedEndpoints = connectedEndpoints;
            return this;
        }

        public Builder setConnectedEndpoints(@Nullable List<ServiceAttachmentConnectedEndpointGetArgs> connectedEndpoints) {
            this.connectedEndpoints = Input.ofNullable(connectedEndpoints);
            return this;
        }

        public Builder setConnectionPreference(@Nullable Input<String> connectionPreference) {
            this.connectionPreference = connectionPreference;
            return this;
        }

        public Builder setConnectionPreference(@Nullable String connectionPreference) {
            this.connectionPreference = Input.ofNullable(connectionPreference);
            return this;
        }

        public Builder setConsumerAcceptLists(@Nullable Input<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists) {
            this.consumerAcceptLists = consumerAcceptLists;
            return this;
        }

        public Builder setConsumerAcceptLists(@Nullable List<ServiceAttachmentConsumerAcceptListGetArgs> consumerAcceptLists) {
            this.consumerAcceptLists = Input.ofNullable(consumerAcceptLists);
            return this;
        }

        public Builder setConsumerRejectLists(@Nullable Input<List<String>> consumerRejectLists) {
            this.consumerRejectLists = consumerRejectLists;
            return this;
        }

        public Builder setConsumerRejectLists(@Nullable List<String> consumerRejectLists) {
            this.consumerRejectLists = Input.ofNullable(consumerRejectLists);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Input<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Input.ofNullable(enableProxyProtocol);
            return this;
        }

        public Builder setFingerprint(@Nullable Input<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder setFingerprint(@Nullable String fingerprint) {
            this.fingerprint = Input.ofNullable(fingerprint);
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

        public Builder setNatSubnets(@Nullable Input<List<String>> natSubnets) {
            this.natSubnets = natSubnets;
            return this;
        }

        public Builder setNatSubnets(@Nullable List<String> natSubnets) {
            this.natSubnets = Input.ofNullable(natSubnets);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setTargetService(@Nullable Input<String> targetService) {
            this.targetService = targetService;
            return this;
        }

        public Builder setTargetService(@Nullable String targetService) {
            this.targetService = Input.ofNullable(targetService);
            return this;
        }
        public ServiceAttachmentState build() {
            return new ServiceAttachmentState(connectedEndpoints, connectionPreference, consumerAcceptLists, consumerRejectLists, description, enableProxyProtocol, fingerprint, name, natSubnets, project, region, selfLink, targetService);
        }
    }
}
