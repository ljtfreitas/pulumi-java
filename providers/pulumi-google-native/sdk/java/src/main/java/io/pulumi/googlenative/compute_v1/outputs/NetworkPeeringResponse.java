// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkPeeringResponse {
    /**
     * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    private final Boolean autoCreateRoutes;
    /**
     * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    private final Boolean exchangeSubnetRoutes;
    /**
     * Whether to export the custom routes to peer network. The default value is false.
     * 
     */
    private final Boolean exportCustomRoutes;
    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. IPv4 special-use ranges are always exported to peers and are not controlled by this field.
     * 
     */
    private final Boolean exportSubnetRoutesWithPublicIp;
    /**
     * Whether to import the custom routes from peer network. The default value is false.
     * 
     */
    private final Boolean importCustomRoutes;
    /**
     * Whether subnet routes with public IP range are imported. The default value is false. IPv4 special-use ranges are always imported from peers and are not controlled by this field.
     * 
     */
    private final Boolean importSubnetRoutesWithPublicIp;
    /**
     * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
     * 
     */
    private final String network;
    /**
     * Maximum Transmission Unit in bytes.
     * 
     */
    private final Integer peerMtu;
    /**
     * State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network.
     * 
     */
    private final String state;
    /**
     * Details about the current state of the peering.
     * 
     */
    private final String stateDetails;

    @OutputCustomType.Constructor({"autoCreateRoutes","exchangeSubnetRoutes","exportCustomRoutes","exportSubnetRoutesWithPublicIp","importCustomRoutes","importSubnetRoutesWithPublicIp","name","network","peerMtu","state","stateDetails"})
    private NetworkPeeringResponse(
        Boolean autoCreateRoutes,
        Boolean exchangeSubnetRoutes,
        Boolean exportCustomRoutes,
        Boolean exportSubnetRoutesWithPublicIp,
        Boolean importCustomRoutes,
        Boolean importSubnetRoutesWithPublicIp,
        String name,
        String network,
        Integer peerMtu,
        String state,
        String stateDetails) {
        this.autoCreateRoutes = Objects.requireNonNull(autoCreateRoutes);
        this.exchangeSubnetRoutes = Objects.requireNonNull(exchangeSubnetRoutes);
        this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes);
        this.exportSubnetRoutesWithPublicIp = Objects.requireNonNull(exportSubnetRoutesWithPublicIp);
        this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes);
        this.importSubnetRoutesWithPublicIp = Objects.requireNonNull(importSubnetRoutesWithPublicIp);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.peerMtu = Objects.requireNonNull(peerMtu);
        this.state = Objects.requireNonNull(state);
        this.stateDetails = Objects.requireNonNull(stateDetails);
    }

    /**
     * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    public Boolean getAutoCreateRoutes() {
        return this.autoCreateRoutes;
    }
    /**
     * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    public Boolean getExchangeSubnetRoutes() {
        return this.exchangeSubnetRoutes;
    }
    /**
     * Whether to export the custom routes to peer network. The default value is false.
     * 
     */
    public Boolean getExportCustomRoutes() {
        return this.exportCustomRoutes;
    }
    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. IPv4 special-use ranges are always exported to peers and are not controlled by this field.
     * 
     */
    public Boolean getExportSubnetRoutesWithPublicIp() {
        return this.exportSubnetRoutesWithPublicIp;
    }
    /**
     * Whether to import the custom routes from peer network. The default value is false.
     * 
     */
    public Boolean getImportCustomRoutes() {
        return this.importCustomRoutes;
    }
    /**
     * Whether subnet routes with public IP range are imported. The default value is false. IPv4 special-use ranges are always imported from peers and are not controlled by this field.
     * 
     */
    public Boolean getImportSubnetRoutesWithPublicIp() {
        return this.importSubnetRoutesWithPublicIp;
    }
    /**
     * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Maximum Transmission Unit in bytes.
     * 
     */
    public Integer getPeerMtu() {
        return this.peerMtu;
    }
    /**
     * State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Details about the current state of the peering.
     * 
     */
    public String getStateDetails() {
        return this.stateDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPeeringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateRoutes;
        private Boolean exchangeSubnetRoutes;
        private Boolean exportCustomRoutes;
        private Boolean exportSubnetRoutesWithPublicIp;
        private Boolean importCustomRoutes;
        private Boolean importSubnetRoutesWithPublicIp;
        private String name;
        private String network;
        private Integer peerMtu;
        private String state;
        private String stateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPeeringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateRoutes = defaults.autoCreateRoutes;
    	      this.exchangeSubnetRoutes = defaults.exchangeSubnetRoutes;
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.exportSubnetRoutesWithPublicIp = defaults.exportSubnetRoutesWithPublicIp;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.importSubnetRoutesWithPublicIp = defaults.importSubnetRoutesWithPublicIp;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerMtu = defaults.peerMtu;
    	      this.state = defaults.state;
    	      this.stateDetails = defaults.stateDetails;
        }

        public Builder setAutoCreateRoutes(Boolean autoCreateRoutes) {
            this.autoCreateRoutes = Objects.requireNonNull(autoCreateRoutes);
            return this;
        }

        public Builder setExchangeSubnetRoutes(Boolean exchangeSubnetRoutes) {
            this.exchangeSubnetRoutes = Objects.requireNonNull(exchangeSubnetRoutes);
            return this;
        }

        public Builder setExportCustomRoutes(Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes);
            return this;
        }

        public Builder setExportSubnetRoutesWithPublicIp(Boolean exportSubnetRoutesWithPublicIp) {
            this.exportSubnetRoutesWithPublicIp = Objects.requireNonNull(exportSubnetRoutesWithPublicIp);
            return this;
        }

        public Builder setImportCustomRoutes(Boolean importCustomRoutes) {
            this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes);
            return this;
        }

        public Builder setImportSubnetRoutesWithPublicIp(Boolean importSubnetRoutesWithPublicIp) {
            this.importSubnetRoutesWithPublicIp = Objects.requireNonNull(importSubnetRoutesWithPublicIp);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPeerMtu(Integer peerMtu) {
            this.peerMtu = Objects.requireNonNull(peerMtu);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateDetails(String stateDetails) {
            this.stateDetails = Objects.requireNonNull(stateDetails);
            return this;
        }
        public NetworkPeeringResponse build() {
            return new NetworkPeeringResponse(autoCreateRoutes, exchangeSubnetRoutes, exportCustomRoutes, exportSubnetRoutesWithPublicIp, importCustomRoutes, importSubnetRoutesWithPublicIp, name, network, peerMtu, state, stateDetails);
        }
    }
}
