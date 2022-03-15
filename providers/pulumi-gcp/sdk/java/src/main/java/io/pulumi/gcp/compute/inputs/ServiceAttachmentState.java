// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="connectedEndpoints")
      private final @Nullable Output<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints;

    public Output<List<ServiceAttachmentConnectedEndpointGetArgs>> getConnectedEndpoints() {
        return this.connectedEndpoints == null ? Output.empty() : this.connectedEndpoints;
    }

    /**
     * The connection preference to use for this service attachment. Valid
     * values include "ACCEPT_AUTOMATIC", "ACCEPT_MANUAL".
     * 
     */
    @Import(name="connectionPreference")
      private final @Nullable Output<String> connectionPreference;

    public Output<String> getConnectionPreference() {
        return this.connectionPreference == null ? Output.empty() : this.connectionPreference;
    }

    /**
     * An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * 
     */
    @Import(name="consumerAcceptLists")
      private final @Nullable Output<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists;

    public Output<List<ServiceAttachmentConsumerAcceptListGetArgs>> getConsumerAcceptLists() {
        return this.consumerAcceptLists == null ? Output.empty() : this.consumerAcceptLists;
    }

    /**
     * An array of projects that are not allowed to connect to this service
     * attachment.
     * 
     */
    @Import(name="consumerRejectLists")
      private final @Nullable Output<List<String>> consumerRejectLists;

    public Output<List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists == null ? Output.empty() : this.consumerRejectLists;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP
     * address data in TCP connections that traverse proxies on their way to
     * destination servers.
     * 
     */
    @Import(name="enableProxyProtocol")
      private final @Nullable Output<Boolean> enableProxyProtocol;

    public Output<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol == null ? Output.empty() : this.enableProxyProtocol;
    }

    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Output.empty() : this.fingerprint;
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
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * An array of subnets that is provided for NAT in this service attachment.
     * 
     */
    @Import(name="natSubnets")
      private final @Nullable Output<List<String>> natSubnets;

    public Output<List<String>> getNatSubnets() {
        return this.natSubnets == null ? Output.empty() : this.natSubnets;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * URL of the region where the resource resides.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * The URL of a forwarding rule that represents the service identified by
     * this service attachment.
     * 
     */
    @Import(name="targetService")
      private final @Nullable Output<String> targetService;

    public Output<String> getTargetService() {
        return this.targetService == null ? Output.empty() : this.targetService;
    }

    public ServiceAttachmentState(
        @Nullable Output<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints,
        @Nullable Output<String> connectionPreference,
        @Nullable Output<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists,
        @Nullable Output<List<String>> consumerRejectLists,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableProxyProtocol,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> natSubnets,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> targetService) {
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
        this.connectedEndpoints = Output.empty();
        this.connectionPreference = Output.empty();
        this.consumerAcceptLists = Output.empty();
        this.consumerRejectLists = Output.empty();
        this.description = Output.empty();
        this.enableProxyProtocol = Output.empty();
        this.fingerprint = Output.empty();
        this.name = Output.empty();
        this.natSubnets = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.selfLink = Output.empty();
        this.targetService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints;
        private @Nullable Output<String> connectionPreference;
        private @Nullable Output<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists;
        private @Nullable Output<List<String>> consumerRejectLists;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableProxyProtocol;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> natSubnets;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> targetService;

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

        public Builder connectedEndpoints(@Nullable Output<List<ServiceAttachmentConnectedEndpointGetArgs>> connectedEndpoints) {
            this.connectedEndpoints = connectedEndpoints;
            return this;
        }

        public Builder connectedEndpoints(@Nullable List<ServiceAttachmentConnectedEndpointGetArgs> connectedEndpoints) {
            this.connectedEndpoints = Output.ofNullable(connectedEndpoints);
            return this;
        }

        public Builder connectionPreference(@Nullable Output<String> connectionPreference) {
            this.connectionPreference = connectionPreference;
            return this;
        }

        public Builder connectionPreference(@Nullable String connectionPreference) {
            this.connectionPreference = Output.ofNullable(connectionPreference);
            return this;
        }

        public Builder consumerAcceptLists(@Nullable Output<List<ServiceAttachmentConsumerAcceptListGetArgs>> consumerAcceptLists) {
            this.consumerAcceptLists = consumerAcceptLists;
            return this;
        }

        public Builder consumerAcceptLists(@Nullable List<ServiceAttachmentConsumerAcceptListGetArgs> consumerAcceptLists) {
            this.consumerAcceptLists = Output.ofNullable(consumerAcceptLists);
            return this;
        }

        public Builder consumerRejectLists(@Nullable Output<List<String>> consumerRejectLists) {
            this.consumerRejectLists = consumerRejectLists;
            return this;
        }

        public Builder consumerRejectLists(@Nullable List<String> consumerRejectLists) {
            this.consumerRejectLists = Output.ofNullable(consumerRejectLists);
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

        public Builder enableProxyProtocol(@Nullable Output<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        public Builder enableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Output.ofNullable(enableProxyProtocol);
            return this;
        }

        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Output.ofNullable(fingerprint);
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

        public Builder natSubnets(@Nullable Output<List<String>> natSubnets) {
            this.natSubnets = natSubnets;
            return this;
        }

        public Builder natSubnets(@Nullable List<String> natSubnets) {
            this.natSubnets = Output.ofNullable(natSubnets);
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }

        public Builder targetService(@Nullable Output<String> targetService) {
            this.targetService = targetService;
            return this;
        }

        public Builder targetService(@Nullable String targetService) {
            this.targetService = Output.ofNullable(targetService);
            return this;
        }
        public ServiceAttachmentState build() {
            return new ServiceAttachmentState(connectedEndpoints, connectionPreference, consumerAcceptLists, consumerRejectLists, description, enableProxyProtocol, fingerprint, name, natSubnets, project, region, selfLink, targetService);
        }
    }
}
