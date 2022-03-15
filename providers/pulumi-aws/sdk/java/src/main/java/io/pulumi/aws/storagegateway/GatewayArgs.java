// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @Import(name="activationKey")
      private final @Nullable Output<String> activationKey;

    public Output<String> getActivationKey() {
        return this.activationKey == null ? Output.empty() : this.activationKey;
    }

    /**
     * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @Import(name="averageDownloadRateLimitInBitsPerSec")
      private final @Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec;

    public Output<Integer> getAverageDownloadRateLimitInBitsPerSec() {
        return this.averageDownloadRateLimitInBitsPerSec == null ? Output.empty() : this.averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @Import(name="averageUploadRateLimitInBitsPerSec")
      private final @Nullable Output<Integer> averageUploadRateLimitInBitsPerSec;

    public Output<Integer> getAverageUploadRateLimitInBitsPerSec() {
        return this.averageUploadRateLimitInBitsPerSec == null ? Output.empty() : this.averageUploadRateLimitInBitsPerSec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
     * 
     */
    @Import(name="cloudwatchLogGroupArn")
      private final @Nullable Output<String> cloudwatchLogGroupArn;

    public Output<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn == null ? Output.empty() : this.cloudwatchLogGroupArn;
    }

    /**
     * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @Import(name="gatewayIpAddress")
      private final @Nullable Output<String> gatewayIpAddress;

    public Output<String> getGatewayIpAddress() {
        return this.gatewayIpAddress == null ? Output.empty() : this.gatewayIpAddress;
    }

    /**
     * Name of the gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
      private final Output<String> gatewayName;

    public Output<String> getGatewayName() {
        return this.gatewayName;
    }

    /**
     * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
     * 
     */
    @Import(name="gatewayTimezone", required=true)
      private final Output<String> gatewayTimezone;

    public Output<String> getGatewayTimezone() {
        return this.gatewayTimezone;
    }

    /**
     * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_FSX_SMB`, `FILE_S3`, `STORED`, `VTL`.
     * 
     */
    @Import(name="gatewayType")
      private final @Nullable Output<String> gatewayType;

    public Output<String> getGatewayType() {
        return this.gatewayType == null ? Output.empty() : this.gatewayType;
    }

    /**
     * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running this provider. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
     * 
     */
    @Import(name="gatewayVpcEndpoint")
      private final @Nullable Output<String> gatewayVpcEndpoint;

    public Output<String> getGatewayVpcEndpoint() {
        return this.gatewayVpcEndpoint == null ? Output.empty() : this.gatewayVpcEndpoint;
    }

    /**
     * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`, `IBM-03584L32-0402`.
     * 
     */
    @Import(name="mediumChangerType")
      private final @Nullable Output<String> mediumChangerType;

    public Output<String> getMediumChangerType() {
        return this.mediumChangerType == null ? Output.empty() : this.mediumChangerType;
    }

    /**
     * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * 
     */
    @Import(name="smbActiveDirectorySettings")
      private final @Nullable Output<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings;

    public Output<GatewaySmbActiveDirectorySettingsArgs> getSmbActiveDirectorySettings() {
        return this.smbActiveDirectorySettings == null ? Output.empty() : this.smbActiveDirectorySettings;
    }

    /**
     * Specifies whether the shares on this gateway appear when listing shares.
     * 
     */
    @Import(name="smbFileShareVisibility")
      private final @Nullable Output<Boolean> smbFileShareVisibility;

    public Output<Boolean> getSmbFileShareVisibility() {
        return this.smbFileShareVisibility == null ? Output.empty() : this.smbFileShareVisibility;
    }

    /**
     * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
     * 
     */
    @Import(name="smbGuestPassword")
      private final @Nullable Output<String> smbGuestPassword;

    public Output<String> getSmbGuestPassword() {
        return this.smbGuestPassword == null ? Output.empty() : this.smbGuestPassword;
    }

    /**
     * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
     * 
     */
    @Import(name="smbSecurityStrategy")
      private final @Nullable Output<String> smbSecurityStrategy;

    public Output<String> getSmbSecurityStrategy() {
        return this.smbSecurityStrategy == null ? Output.empty() : this.smbSecurityStrategy;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
     * 
     */
    @Import(name="tapeDriveType")
      private final @Nullable Output<String> tapeDriveType;

    public Output<String> getTapeDriveType() {
        return this.tapeDriveType == null ? Output.empty() : this.tapeDriveType;
    }

    public GatewayArgs(
        @Nullable Output<String> activationKey,
        @Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec,
        @Nullable Output<Integer> averageUploadRateLimitInBitsPerSec,
        @Nullable Output<String> cloudwatchLogGroupArn,
        @Nullable Output<String> gatewayIpAddress,
        Output<String> gatewayName,
        Output<String> gatewayTimezone,
        @Nullable Output<String> gatewayType,
        @Nullable Output<String> gatewayVpcEndpoint,
        @Nullable Output<String> mediumChangerType,
        @Nullable Output<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings,
        @Nullable Output<Boolean> smbFileShareVisibility,
        @Nullable Output<String> smbGuestPassword,
        @Nullable Output<String> smbSecurityStrategy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> tapeDriveType) {
        this.activationKey = activationKey;
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.gatewayIpAddress = gatewayIpAddress;
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.gatewayTimezone = Objects.requireNonNull(gatewayTimezone, "expected parameter 'gatewayTimezone' to be non-null");
        this.gatewayType = gatewayType;
        this.gatewayVpcEndpoint = gatewayVpcEndpoint;
        this.mediumChangerType = mediumChangerType;
        this.smbActiveDirectorySettings = smbActiveDirectorySettings;
        this.smbFileShareVisibility = smbFileShareVisibility;
        this.smbGuestPassword = smbGuestPassword;
        this.smbSecurityStrategy = smbSecurityStrategy;
        this.tags = tags;
        this.tapeDriveType = tapeDriveType;
    }

    private GatewayArgs() {
        this.activationKey = Output.empty();
        this.averageDownloadRateLimitInBitsPerSec = Output.empty();
        this.averageUploadRateLimitInBitsPerSec = Output.empty();
        this.cloudwatchLogGroupArn = Output.empty();
        this.gatewayIpAddress = Output.empty();
        this.gatewayName = Output.empty();
        this.gatewayTimezone = Output.empty();
        this.gatewayType = Output.empty();
        this.gatewayVpcEndpoint = Output.empty();
        this.mediumChangerType = Output.empty();
        this.smbActiveDirectorySettings = Output.empty();
        this.smbFileShareVisibility = Output.empty();
        this.smbGuestPassword = Output.empty();
        this.smbSecurityStrategy = Output.empty();
        this.tags = Output.empty();
        this.tapeDriveType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activationKey;
        private @Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec;
        private @Nullable Output<Integer> averageUploadRateLimitInBitsPerSec;
        private @Nullable Output<String> cloudwatchLogGroupArn;
        private @Nullable Output<String> gatewayIpAddress;
        private Output<String> gatewayName;
        private Output<String> gatewayTimezone;
        private @Nullable Output<String> gatewayType;
        private @Nullable Output<String> gatewayVpcEndpoint;
        private @Nullable Output<String> mediumChangerType;
        private @Nullable Output<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings;
        private @Nullable Output<Boolean> smbFileShareVisibility;
        private @Nullable Output<String> smbGuestPassword;
        private @Nullable Output<String> smbSecurityStrategy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> tapeDriveType;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.averageDownloadRateLimitInBitsPerSec = defaults.averageDownloadRateLimitInBitsPerSec;
    	      this.averageUploadRateLimitInBitsPerSec = defaults.averageUploadRateLimitInBitsPerSec;
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.gatewayName = defaults.gatewayName;
    	      this.gatewayTimezone = defaults.gatewayTimezone;
    	      this.gatewayType = defaults.gatewayType;
    	      this.gatewayVpcEndpoint = defaults.gatewayVpcEndpoint;
    	      this.mediumChangerType = defaults.mediumChangerType;
    	      this.smbActiveDirectorySettings = defaults.smbActiveDirectorySettings;
    	      this.smbFileShareVisibility = defaults.smbFileShareVisibility;
    	      this.smbGuestPassword = defaults.smbGuestPassword;
    	      this.smbSecurityStrategy = defaults.smbSecurityStrategy;
    	      this.tags = defaults.tags;
    	      this.tapeDriveType = defaults.tapeDriveType;
        }

        public Builder activationKey(@Nullable Output<String> activationKey) {
            this.activationKey = activationKey;
            return this;
        }

        public Builder activationKey(@Nullable String activationKey) {
            this.activationKey = Output.ofNullable(activationKey);
            return this;
        }

        public Builder averageDownloadRateLimitInBitsPerSec(@Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec) {
            this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
            return this;
        }

        public Builder averageDownloadRateLimitInBitsPerSec(@Nullable Integer averageDownloadRateLimitInBitsPerSec) {
            this.averageDownloadRateLimitInBitsPerSec = Output.ofNullable(averageDownloadRateLimitInBitsPerSec);
            return this;
        }

        public Builder averageUploadRateLimitInBitsPerSec(@Nullable Output<Integer> averageUploadRateLimitInBitsPerSec) {
            this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
            return this;
        }

        public Builder averageUploadRateLimitInBitsPerSec(@Nullable Integer averageUploadRateLimitInBitsPerSec) {
            this.averageUploadRateLimitInBitsPerSec = Output.ofNullable(averageUploadRateLimitInBitsPerSec);
            return this;
        }

        public Builder cloudwatchLogGroupArn(@Nullable Output<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        public Builder cloudwatchLogGroupArn(@Nullable String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Output.ofNullable(cloudwatchLogGroupArn);
            return this;
        }

        public Builder gatewayIpAddress(@Nullable Output<String> gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }

        public Builder gatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = Output.ofNullable(gatewayIpAddress);
            return this;
        }

        public Builder gatewayName(Output<String> gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder gatewayName(String gatewayName) {
            this.gatewayName = Output.of(Objects.requireNonNull(gatewayName));
            return this;
        }

        public Builder gatewayTimezone(Output<String> gatewayTimezone) {
            this.gatewayTimezone = Objects.requireNonNull(gatewayTimezone);
            return this;
        }

        public Builder gatewayTimezone(String gatewayTimezone) {
            this.gatewayTimezone = Output.of(Objects.requireNonNull(gatewayTimezone));
            return this;
        }

        public Builder gatewayType(@Nullable Output<String> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder gatewayType(@Nullable String gatewayType) {
            this.gatewayType = Output.ofNullable(gatewayType);
            return this;
        }

        public Builder gatewayVpcEndpoint(@Nullable Output<String> gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = gatewayVpcEndpoint;
            return this;
        }

        public Builder gatewayVpcEndpoint(@Nullable String gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = Output.ofNullable(gatewayVpcEndpoint);
            return this;
        }

        public Builder mediumChangerType(@Nullable Output<String> mediumChangerType) {
            this.mediumChangerType = mediumChangerType;
            return this;
        }

        public Builder mediumChangerType(@Nullable String mediumChangerType) {
            this.mediumChangerType = Output.ofNullable(mediumChangerType);
            return this;
        }

        public Builder smbActiveDirectorySettings(@Nullable Output<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = smbActiveDirectorySettings;
            return this;
        }

        public Builder smbActiveDirectorySettings(@Nullable GatewaySmbActiveDirectorySettingsArgs smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = Output.ofNullable(smbActiveDirectorySettings);
            return this;
        }

        public Builder smbFileShareVisibility(@Nullable Output<Boolean> smbFileShareVisibility) {
            this.smbFileShareVisibility = smbFileShareVisibility;
            return this;
        }

        public Builder smbFileShareVisibility(@Nullable Boolean smbFileShareVisibility) {
            this.smbFileShareVisibility = Output.ofNullable(smbFileShareVisibility);
            return this;
        }

        public Builder smbGuestPassword(@Nullable Output<String> smbGuestPassword) {
            this.smbGuestPassword = smbGuestPassword;
            return this;
        }

        public Builder smbGuestPassword(@Nullable String smbGuestPassword) {
            this.smbGuestPassword = Output.ofNullable(smbGuestPassword);
            return this;
        }

        public Builder smbSecurityStrategy(@Nullable Output<String> smbSecurityStrategy) {
            this.smbSecurityStrategy = smbSecurityStrategy;
            return this;
        }

        public Builder smbSecurityStrategy(@Nullable String smbSecurityStrategy) {
            this.smbSecurityStrategy = Output.ofNullable(smbSecurityStrategy);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tapeDriveType(@Nullable Output<String> tapeDriveType) {
            this.tapeDriveType = tapeDriveType;
            return this;
        }

        public Builder tapeDriveType(@Nullable String tapeDriveType) {
            this.tapeDriveType = Output.ofNullable(tapeDriveType);
            return this;
        }
        public GatewayArgs build() {
            return new GatewayArgs(activationKey, averageDownloadRateLimitInBitsPerSec, averageUploadRateLimitInBitsPerSec, cloudwatchLogGroupArn, gatewayIpAddress, gatewayName, gatewayTimezone, gatewayType, gatewayVpcEndpoint, mediumChangerType, smbActiveDirectorySettings, smbFileShareVisibility, smbGuestPassword, smbSecurityStrategy, tags, tapeDriveType);
        }
    }
}
