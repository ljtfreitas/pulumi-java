// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayArgs Empty = new CustomerGatewayArgs();

    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    @InputImport(name="bgpAsn", required=true)
    private final Input<String> bgpAsn;

    public Input<String> getBgpAsn() {
        return this.bgpAsn;
    }

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    @InputImport(name="certificateArn")
    private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * A name for the customer gateway device.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * The IP address of the gateway's Internet-routable external interface.
     * 
     */
    @InputImport(name="ipAddress", required=true)
    private final Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CustomerGatewayArgs(
        Input<String> bgpAsn,
        @Nullable Input<String> certificateArn,
        @Nullable Input<String> deviceName,
        Input<String> ipAddress,
        @Nullable Input<Map<String,String>> tags,
        Input<String> type) {
        this.bgpAsn = Objects.requireNonNull(bgpAsn, "expected parameter 'bgpAsn' to be non-null");
        this.certificateArn = certificateArn;
        this.deviceName = deviceName;
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CustomerGatewayArgs() {
        this.bgpAsn = Input.empty();
        this.certificateArn = Input.empty();
        this.deviceName = Input.empty();
        this.ipAddress = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bgpAsn;
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<String> deviceName;
        private Input<String> ipAddress;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.deviceName = defaults.deviceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setBgpAsn(Input<String> bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }

        public Builder setBgpAsn(String bgpAsn) {
            this.bgpAsn = Input.of(Objects.requireNonNull(bgpAsn));
            return this;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setIpAddress(Input<String> ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Input.of(Objects.requireNonNull(ipAddress));
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public CustomerGatewayArgs build() {
            return new CustomerGatewayArgs(bgpAsn, certificateArn, deviceName, ipAddress, tags, type);
        }
    }
}
