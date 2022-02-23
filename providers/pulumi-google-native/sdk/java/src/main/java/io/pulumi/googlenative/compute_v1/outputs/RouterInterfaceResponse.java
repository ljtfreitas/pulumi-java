// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouterInterfaceResponse {
    /**
     * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
     * 
     */
    private final String ipRange;
    /**
     * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    private final String linkedInterconnectAttachment;
    /**
     * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    private final String linkedVpnTunnel;
    /**
     * The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    private final String managementType;
    /**
     * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
     * 
     */
    private final String privateIpAddress;
    /**
     * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String redundantInterface;
    /**
     * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor({"ipRange","linkedInterconnectAttachment","linkedVpnTunnel","managementType","name","privateIpAddress","redundantInterface","subnetwork"})
    private RouterInterfaceResponse(
        String ipRange,
        String linkedInterconnectAttachment,
        String linkedVpnTunnel,
        String managementType,
        String name,
        String privateIpAddress,
        String redundantInterface,
        String subnetwork) {
        this.ipRange = Objects.requireNonNull(ipRange);
        this.linkedInterconnectAttachment = Objects.requireNonNull(linkedInterconnectAttachment);
        this.linkedVpnTunnel = Objects.requireNonNull(linkedVpnTunnel);
        this.managementType = Objects.requireNonNull(managementType);
        this.name = Objects.requireNonNull(name);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.redundantInterface = Objects.requireNonNull(redundantInterface);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    /**
     * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
     * 
     */
    public String getIpRange() {
        return this.ipRange;
    }
    /**
     * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    public String getLinkedInterconnectAttachment() {
        return this.linkedInterconnectAttachment;
    }
    /**
     * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    public String getLinkedVpnTunnel() {
        return this.linkedVpnTunnel;
    }
    /**
     * The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    public String getManagementType() {
        return this.managementType;
    }
    /**
     * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
     * 
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getRedundantInterface() {
        return this.redundantInterface;
    }
    /**
     * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipRange;
        private String linkedInterconnectAttachment;
        private String linkedVpnTunnel;
        private String managementType;
        private String name;
        private String privateIpAddress;
        private String redundantInterface;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRange = defaults.ipRange;
    	      this.linkedInterconnectAttachment = defaults.linkedInterconnectAttachment;
    	      this.linkedVpnTunnel = defaults.linkedVpnTunnel;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.redundantInterface = defaults.redundantInterface;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setLinkedInterconnectAttachment(String linkedInterconnectAttachment) {
            this.linkedInterconnectAttachment = Objects.requireNonNull(linkedInterconnectAttachment);
            return this;
        }

        public Builder setLinkedVpnTunnel(String linkedVpnTunnel) {
            this.linkedVpnTunnel = Objects.requireNonNull(linkedVpnTunnel);
            return this;
        }

        public Builder setManagementType(String managementType) {
            this.managementType = Objects.requireNonNull(managementType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setRedundantInterface(String redundantInterface) {
            this.redundantInterface = Objects.requireNonNull(redundantInterface);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public RouterInterfaceResponse build() {
            return new RouterInterfaceResponse(ipRange, linkedInterconnectAttachment, linkedVpnTunnel, managementType, name, privateIpAddress, redundantInterface, subnetwork);
        }
    }
}
