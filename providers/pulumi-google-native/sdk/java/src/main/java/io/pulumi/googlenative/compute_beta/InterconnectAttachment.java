// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.InterconnectAttachmentArgs;
import io.pulumi.googlenative.compute_beta.outputs.InterconnectAttachmentPartnerMetadataResponse;
import io.pulumi.googlenative.compute_beta.outputs.InterconnectAttachmentPrivateInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an InterconnectAttachment in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:InterconnectAttachment")
public class InterconnectAttachment extends io.pulumi.resources.CustomResource {
    /**
     * Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
     * 
     */
    @Export(name="adminEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> adminEnabled;

    /**
     * @return Determines whether this Attachment will carry packets. Not present for PARTNER_PROVIDER.
     * 
     */
    public Output<Boolean> getAdminEnabled() {
        return this.adminEnabled;
    }
    /**
     * Provisioned bandwidth capacity for the interconnect attachment. For attachments of type DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth. Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: - BPS_50M: 50 Mbit/s - BPS_100M: 100 Mbit/s - BPS_200M: 200 Mbit/s - BPS_300M: 300 Mbit/s - BPS_400M: 400 Mbit/s - BPS_500M: 500 Mbit/s - BPS_1G: 1 Gbit/s - BPS_2G: 2 Gbit/s - BPS_5G: 5 Gbit/s - BPS_10G: 10 Gbit/s - BPS_20G: 20 Gbit/s - BPS_50G: 50 Gbit/s
     * 
     */
    @Export(name="bandwidth", type=String.class, parameters={})
    private Output<String> bandwidth;

    /**
     * @return Provisioned bandwidth capacity for the interconnect attachment. For attachments of type DEDICATED, the user can set the bandwidth. For attachments of type PARTNER, the Google Partner that is operating the interconnect must set the bandwidth. Output only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED, and can take one of the following values: - BPS_50M: 50 Mbit/s - BPS_100M: 100 Mbit/s - BPS_200M: 200 Mbit/s - BPS_300M: 300 Mbit/s - BPS_400M: 400 Mbit/s - BPS_500M: 500 Mbit/s - BPS_1G: 1 Gbit/s - BPS_2G: 2 Gbit/s - BPS_5G: 5 Gbit/s - BPS_10G: 10 Gbit/s - BPS_20G: 20 Gbit/s - BPS_50G: 50 Gbit/s
     * 
     */
    public Output<String> getBandwidth() {
        return this.bandwidth;
    }
    /**
     * Up to 16 candidate prefixes that control the allocation of cloudRouterIpv6Address and customerRouterIpv6Address for this attachment. Each prefix must be in the Global Unique Address (GUA) space. It is highly recommended that it be in a range owned by the requestor. A GUA in a range owned by Google will cause the request to fail. Google will select an available prefix from the supplied candidates or fail the request. If not supplied, a /125 from a Google-owned GUA block will be selected.
     * 
     */
    @Export(name="candidateIpv6Subnets", type=List.class, parameters={String.class})
    private Output<List<String>> candidateIpv6Subnets;

    /**
     * @return Up to 16 candidate prefixes that control the allocation of cloudRouterIpv6Address and customerRouterIpv6Address for this attachment. Each prefix must be in the Global Unique Address (GUA) space. It is highly recommended that it be in a range owned by the requestor. A GUA in a range owned by Google will cause the request to fail. Google will select an available prefix from the supplied candidates or fail the request. If not supplied, a /125 from a Google-owned GUA block will be selected.
     * 
     */
    public Output<List<String>> getCandidateIpv6Subnets() {
        return this.candidateIpv6Subnets;
    }
    /**
     * Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request will fail if all possible /29s are in use on Google's edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
     * 
     */
    @Export(name="candidateSubnets", type=List.class, parameters={String.class})
    private Output<List<String>> candidateSubnets;

    /**
     * @return Up to 16 candidate prefixes that can be used to restrict the allocation of cloudRouterIpAddress and customerRouterIpAddress for this attachment. All prefixes must be within link-local address space (169.254.0.0/16) and must be /29 or shorter (/28, /27, etc). Google will attempt to select an unused /29 from the supplied candidate prefix(es). The request will fail if all possible /29s are in use on Google's edge. If not supplied, Google will randomly select an unused /29 from all of link-local space.
     * 
     */
    public Output<List<String>> getCandidateSubnets() {
        return this.candidateSubnets;
    }
    /**
     * IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
     * 
     */
    @Export(name="cloudRouterIpAddress", type=String.class, parameters={})
    private Output<String> cloudRouterIpAddress;

    /**
     * @return IPv4 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
     * 
     */
    public Output<String> getCloudRouterIpAddress() {
        return this.cloudRouterIpAddress;
    }
    /**
     * IPv6 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
     * 
     */
    @Export(name="cloudRouterIpv6Address", type=String.class, parameters={})
    private Output<String> cloudRouterIpv6Address;

    /**
     * @return IPv6 address + prefix length to be configured on Cloud Router Interface for this interconnect attachment.
     * 
     */
    public Output<String> getCloudRouterIpv6Address() {
        return this.cloudRouterIpv6Address;
    }
    /**
     * If supplied, the interface id (index within the subnet) to be used for the cloud router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    @Export(name="cloudRouterIpv6InterfaceId", type=String.class, parameters={})
    private Output<String> cloudRouterIpv6InterfaceId;

    /**
     * @return If supplied, the interface id (index within the subnet) to be used for the cloud router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    public Output<String> getCloudRouterIpv6InterfaceId() {
        return this.cloudRouterIpv6InterfaceId;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
     * 
     */
    @Export(name="customerRouterIpAddress", type=String.class, parameters={})
    private Output<String> customerRouterIpAddress;

    /**
     * @return IPv4 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
     * 
     */
    public Output<String> getCustomerRouterIpAddress() {
        return this.customerRouterIpAddress;
    }
    /**
     * IPv6 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
     * 
     */
    @Export(name="customerRouterIpv6Address", type=String.class, parameters={})
    private Output<String> customerRouterIpv6Address;

    /**
     * @return IPv6 address + prefix length to be configured on the customer router subinterface for this interconnect attachment.
     * 
     */
    public Output<String> getCustomerRouterIpv6Address() {
        return this.customerRouterIpv6Address;
    }
    /**
     * If supplied, the interface id (index within the subnet) to be used for the customer router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    @Export(name="customerRouterIpv6InterfaceId", type=String.class, parameters={})
    private Output<String> customerRouterIpv6InterfaceId;

    /**
     * @return If supplied, the interface id (index within the subnet) to be used for the customer router address. The id must be in the range of 1 to 6. If a subnet mask is supplied, it must be /125, and the subnet should either be 0 or match the selected subnet.
     * 
     */
    public Output<String> getCustomerRouterIpv6InterfaceId() {
        return this.customerRouterIpv6InterfaceId;
    }
    /**
     * [Output only for types PARTNER and DEDICATED. Not present for PARTNER_PROVIDER.] Dataplane version for this InterconnectAttachment. This field is only present for Dataplane version 2 and higher. Absence of this field in the API output indicates that the Dataplane is version 1.
     * 
     */
    @Export(name="dataplaneVersion", type=Integer.class, parameters={})
    private Output<Integer> dataplaneVersion;

    /**
     * @return [Output only for types PARTNER and DEDICATED. Not present for PARTNER_PROVIDER.] Dataplane version for this InterconnectAttachment. This field is only present for Dataplane version 2 and higher. Absence of this field in the API output indicates that the Dataplane is version 1.
     * 
     */
    public Output<Integer> getDataplaneVersion() {
        return this.dataplaneVersion;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY - AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    @Export(name="edgeAvailabilityDomain", type=String.class, parameters={})
    private Output<String> edgeAvailabilityDomain;

    /**
     * @return Desired availability domain for the attachment. Only available for type PARTNER, at creation time, and can take one of the following values: - AVAILABILITY_DOMAIN_ANY - AVAILABILITY_DOMAIN_1 - AVAILABILITY_DOMAIN_2 For improved reliability, customers should configure a pair of attachments, one per availability domain. The selected availability domain will be provided to the Partner via the pairing key, so that the provisioned circuit will lie in the specified domain. If not specified, the value will default to AVAILABILITY_DOMAIN_ANY.
     * 
     */
    public Output<String> getEdgeAvailabilityDomain() {
        return this.edgeAvailabilityDomain;
    }
    /**
     * Indicates the user-supplied encryption option of this VLAN attachment (interconnectAttachment). Can only be specified at attachment creation for PARTNER or DEDICATED attachments. Possible values are: - NONE - This is the default value, which means that the VLAN attachment carries unencrypted traffic. VMs are able to send traffic to, or receive traffic from, such a VLAN attachment. - IPSEC - The VLAN attachment carries only encrypted traffic that is encrypted by an IPsec device, such as an HA VPN gateway or third-party IPsec VPN. VMs cannot directly send traffic to, or receive traffic from, such a VLAN attachment. To use *IPsec-encrypted Cloud Interconnect*, the VLAN attachment must be created with this option. Not currently available publicly.
     * 
     */
    @Export(name="encryption", type=String.class, parameters={})
    private Output<String> encryption;

    /**
     * @return Indicates the user-supplied encryption option of this VLAN attachment (interconnectAttachment). Can only be specified at attachment creation for PARTNER or DEDICATED attachments. Possible values are: - NONE - This is the default value, which means that the VLAN attachment carries unencrypted traffic. VMs are able to send traffic to, or receive traffic from, such a VLAN attachment. - IPSEC - The VLAN attachment carries only encrypted traffic that is encrypted by an IPsec device, such as an HA VPN gateway or third-party IPsec VPN. VMs cannot directly send traffic to, or receive traffic from, such a VLAN attachment. To use *IPsec-encrypted Cloud Interconnect*, the VLAN attachment must be created with this option. Not currently available publicly.
     * 
     */
    public Output<String> getEncryption() {
        return this.encryption;
    }
    /**
     * URL of the underlying Interconnect object that this attachment's traffic will traverse through.
     * 
     */
    @Export(name="interconnect", type=String.class, parameters={})
    private Output<String> interconnect;

    /**
     * @return URL of the underlying Interconnect object that this attachment's traffic will traverse through.
     * 
     */
    public Output<String> getInterconnect() {
        return this.interconnect;
    }
    /**
     * A list of URLs of addresses that have been reserved for the VLAN attachment. Used only for the VLAN attachment that has the encryption option as IPSEC. The addresses must be regional internal IP address ranges. When creating an HA VPN gateway over the VLAN attachment, if the attachment is configured to use a regional internal IP address, then the VPN gateway's IP address is allocated from the IP address range specified here. For example, if the HA VPN gateway's interface 0 is paired to this VLAN attachment, then a regional internal IP address for the VPN gateway interface 0 will be allocated from the IP address specified for this VLAN attachment. If this field is not specified when creating the VLAN attachment, then later on when creating an HA VPN gateway on this VLAN attachment, the HA VPN gateway's IP address is allocated from the regional external IP address pool. Not currently available publicly.
     * 
     */
    @Export(name="ipsecInternalAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> ipsecInternalAddresses;

    /**
     * @return A list of URLs of addresses that have been reserved for the VLAN attachment. Used only for the VLAN attachment that has the encryption option as IPSEC. The addresses must be regional internal IP address ranges. When creating an HA VPN gateway over the VLAN attachment, if the attachment is configured to use a regional internal IP address, then the VPN gateway's IP address is allocated from the IP address range specified here. For example, if the HA VPN gateway's interface 0 is paired to this VLAN attachment, then a regional internal IP address for the VPN gateway interface 0 will be allocated from the IP address specified for this VLAN attachment. If this field is not specified when creating the VLAN attachment, then later on when creating an HA VPN gateway on this VLAN attachment, the HA VPN gateway's IP address is allocated from the regional external IP address pool. Not currently available publicly.
     * 
     */
    public Output<List<String>> getIpsecInternalAddresses() {
        return this.ipsecInternalAddresses;
    }
    /**
     * Type of the resource. Always compute#interconnectAttachment for interconnect attachments.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#interconnectAttachment for interconnect attachments.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this InterconnectAttachment, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an InterconnectAttachment.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Maximum Transmission Unit (MTU), in bytes, of packets passing through this interconnect attachment. Only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
     * 
     */
    @Export(name="mtu", type=Integer.class, parameters={})
    private Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit (MTU), in bytes, of packets passing through this interconnect attachment. Only 1440 and 1500 are allowed. If not specified, the value will default to 1440.
     * 
     */
    public Output<Integer> getMtu() {
        return this.mtu;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current status of whether or not this interconnect attachment is functional, which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and is ready to use. - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.
     * 
     */
    @Export(name="operationalStatus", type=String.class, parameters={})
    private Output<String> operationalStatus;

    /**
     * @return The current status of whether or not this interconnect attachment is functional, which can take one of the following values: - OS_ACTIVE: The attachment has been turned up and is ready to use. - OS_UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete.
     * 
     */
    public Output<String> getOperationalStatus() {
        return this.operationalStatus;
    }
    /**
     * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a selected partner. Of the form "XXXXX/region/domain"
     * 
     */
    @Export(name="pairingKey", type=String.class, parameters={})
    private Output<String> pairingKey;

    /**
     * @return [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not present for DEDICATED]. The opaque identifier of an PARTNER attachment used to initiate provisioning with a selected partner. Of the form "XXXXX/region/domain"
     * 
     */
    public Output<String> getPairingKey() {
        return this.pairingKey;
    }
    /**
     * Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    @Export(name="partnerAsn", type=String.class, parameters={})
    private Output<String> partnerAsn;

    /**
     * @return Optional BGP ASN for the router supplied by a Layer 3 Partner if they configured BGP on behalf of the customer. Output only for PARTNER type, input only for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    public Output<String> getPartnerAsn() {
        return this.partnerAsn;
    }
    /**
     * Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    @Export(name="partnerMetadata", type=InterconnectAttachmentPartnerMetadataResponse.class, parameters={})
    private Output<InterconnectAttachmentPartnerMetadataResponse> partnerMetadata;

    /**
     * @return Informational metadata about Partner attachments from Partners to display to customers. Output only for for PARTNER type, mutable for PARTNER_PROVIDER, not available for DEDICATED.
     * 
     */
    public Output<InterconnectAttachmentPartnerMetadataResponse> getPartnerMetadata() {
        return this.partnerMetadata;
    }
    /**
     * Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached to is of type DEDICATED.
     * 
     */
    @Export(name="privateInterconnectInfo", type=InterconnectAttachmentPrivateInfoResponse.class, parameters={})
    private Output<InterconnectAttachmentPrivateInfoResponse> privateInterconnectInfo;

    /**
     * @return Information specific to an InterconnectAttachment. This property is populated if the interconnect that this is attached to is of type DEDICATED.
     * 
     */
    public Output<InterconnectAttachmentPrivateInfoResponse> getPrivateInterconnectInfo() {
        return this.privateInterconnectInfo;
    }
    /**
     * URL of the region where the regional interconnect attachment resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the regional interconnect attachment resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect the Interconnect to the network & region within which the Cloud Router is configured.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return URL of the Cloud Router to be used for dynamic routing. This router must be in the same region as this InterconnectAttachment. The InterconnectAttachment will automatically connect the Interconnect to the network & region within which the Cloud Router is configured.
     * 
     */
    public Output<String> getRouter() {
        return this.router;
    }
    /**
     * Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The stack type for this interconnect attachment to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at interconnect attachments creation and update interconnect attachment operations.
     * 
     */
    @Export(name="stackType", type=String.class, parameters={})
    private Output<String> stackType;

    /**
     * @return The stack type for this interconnect attachment to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at interconnect attachments creation and update interconnect attachment operations.
     * 
     */
    public Output<String> getStackType() {
        return this.stackType;
    }
    /**
     * The current state of this attachment's functionality. Enum values ACTIVE and UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take one of the following values: - ACTIVE: The attachment has been turned up and is ready to use. - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete. - PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the Partner side. - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of provisioning after a PARTNER_PROVIDER attachment was created that references it. - PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to activate it. - DEFUNCT: The attachment was deleted externally and is no longer functional. This could be because the associated Interconnect was removed, or because the other side of a Partner attachment was deleted.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of this attachment's functionality. Enum values ACTIVE and UNPROVISIONED are shared by DEDICATED/PRIVATE, PARTNER, and PARTNER_PROVIDER interconnect attachments, while enum values PENDING_PARTNER, PARTNER_REQUEST_RECEIVED, and PENDING_CUSTOMER are used for only PARTNER and PARTNER_PROVIDER interconnect attachments. This state can take one of the following values: - ACTIVE: The attachment has been turned up and is ready to use. - UNPROVISIONED: The attachment is not ready to use yet, because turnup is not complete. - PENDING_PARTNER: A newly-created PARTNER attachment that has not yet been configured on the Partner side. - PARTNER_REQUEST_RECEIVED: A PARTNER attachment is in the process of provisioning after a PARTNER_PROVIDER attachment was created that references it. - PENDING_CUSTOMER: A PARTNER or PARTNER_PROVIDER attachment that is waiting for a customer to activate it. - DEFUNCT: The attachment was deleted externally and is no longer functional. This could be because the associated Interconnect was removed, or because the other side of a Partner attachment was deleted.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The type of interconnect attachment this is, which can take one of the following values: - DEDICATED: an attachment to a Dedicated Interconnect. - PARTNER: an attachment to a Partner Interconnect, created by the customer. - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of interconnect attachment this is, which can take one of the following values: - DEDICATED: an attachment to a Dedicated Interconnect. - PARTNER: an attachment to a Partner Interconnect, created by the customer. - PARTNER_PROVIDER: an attachment to a Partner Interconnect, created by the partner.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time.
     * 
     */
    @Export(name="vlanTag8021q", type=Integer.class, parameters={})
    private Output<Integer> vlanTag8021q;

    /**
     * @return The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only specified at creation time.
     * 
     */
    public Output<Integer> getVlanTag8021q() {
        return this.vlanTag8021q;
    }

    public interface BuilderApplicator {
        public void apply(InterconnectAttachmentArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_beta.InterconnectAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_beta.InterconnectAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InterconnectAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InterconnectAttachment(String name) {
        this(name, InterconnectAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InterconnectAttachment(String name, InterconnectAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InterconnectAttachment(String name, InterconnectAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:InterconnectAttachment", name, args == null ? InterconnectAttachmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InterconnectAttachment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:InterconnectAttachment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InterconnectAttachment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InterconnectAttachment(name, id, options);
    }
}
