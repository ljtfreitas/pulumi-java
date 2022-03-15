// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.MultichannelArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Setting for SMB protocol
 * 
 */
public final class SmbSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SmbSettingArgs Empty = new SmbSettingArgs();

    /**
     * SMB authentication methods supported by server. Valid values are NTLMv2, Kerberos. Should be passed as a string with delimiter ';'.
     * 
     */
    @Import(name="authenticationMethods")
      private final @Nullable Output<String> authenticationMethods;

    public Output<String> getAuthenticationMethods() {
        return this.authenticationMethods == null ? Output.empty() : this.authenticationMethods;
    }

    /**
     * SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter ';'.
     * 
     */
    @Import(name="channelEncryption")
      private final @Nullable Output<String> channelEncryption;

    public Output<String> getChannelEncryption() {
        return this.channelEncryption == null ? Output.empty() : this.channelEncryption;
    }

    /**
     * Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string with delimiter ';'
     * 
     */
    @Import(name="kerberosTicketEncryption")
      private final @Nullable Output<String> kerberosTicketEncryption;

    public Output<String> getKerberosTicketEncryption() {
        return this.kerberosTicketEncryption == null ? Output.empty() : this.kerberosTicketEncryption;
    }

    /**
     * Multichannel setting. Applies to Premium FileStorage only.
     * 
     */
    @Import(name="multichannel")
      private final @Nullable Output<MultichannelArgs> multichannel;

    public Output<MultichannelArgs> getMultichannel() {
        return this.multichannel == null ? Output.empty() : this.multichannel;
    }

    /**
     * SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a string with delimiter ';'.
     * 
     */
    @Import(name="versions")
      private final @Nullable Output<String> versions;

    public Output<String> getVersions() {
        return this.versions == null ? Output.empty() : this.versions;
    }

    public SmbSettingArgs(
        @Nullable Output<String> authenticationMethods,
        @Nullable Output<String> channelEncryption,
        @Nullable Output<String> kerberosTicketEncryption,
        @Nullable Output<MultichannelArgs> multichannel,
        @Nullable Output<String> versions) {
        this.authenticationMethods = authenticationMethods;
        this.channelEncryption = channelEncryption;
        this.kerberosTicketEncryption = kerberosTicketEncryption;
        this.multichannel = multichannel;
        this.versions = versions;
    }

    private SmbSettingArgs() {
        this.authenticationMethods = Output.empty();
        this.channelEncryption = Output.empty();
        this.kerberosTicketEncryption = Output.empty();
        this.multichannel = Output.empty();
        this.versions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmbSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authenticationMethods;
        private @Nullable Output<String> channelEncryption;
        private @Nullable Output<String> kerberosTicketEncryption;
        private @Nullable Output<MultichannelArgs> multichannel;
        private @Nullable Output<String> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SmbSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMethods = defaults.authenticationMethods;
    	      this.channelEncryption = defaults.channelEncryption;
    	      this.kerberosTicketEncryption = defaults.kerberosTicketEncryption;
    	      this.multichannel = defaults.multichannel;
    	      this.versions = defaults.versions;
        }

        public Builder authenticationMethods(@Nullable Output<String> authenticationMethods) {
            this.authenticationMethods = authenticationMethods;
            return this;
        }

        public Builder authenticationMethods(@Nullable String authenticationMethods) {
            this.authenticationMethods = Output.ofNullable(authenticationMethods);
            return this;
        }

        public Builder channelEncryption(@Nullable Output<String> channelEncryption) {
            this.channelEncryption = channelEncryption;
            return this;
        }

        public Builder channelEncryption(@Nullable String channelEncryption) {
            this.channelEncryption = Output.ofNullable(channelEncryption);
            return this;
        }

        public Builder kerberosTicketEncryption(@Nullable Output<String> kerberosTicketEncryption) {
            this.kerberosTicketEncryption = kerberosTicketEncryption;
            return this;
        }

        public Builder kerberosTicketEncryption(@Nullable String kerberosTicketEncryption) {
            this.kerberosTicketEncryption = Output.ofNullable(kerberosTicketEncryption);
            return this;
        }

        public Builder multichannel(@Nullable Output<MultichannelArgs> multichannel) {
            this.multichannel = multichannel;
            return this;
        }

        public Builder multichannel(@Nullable MultichannelArgs multichannel) {
            this.multichannel = Output.ofNullable(multichannel);
            return this;
        }

        public Builder versions(@Nullable Output<String> versions) {
            this.versions = versions;
            return this;
        }

        public Builder versions(@Nullable String versions) {
            this.versions = Output.ofNullable(versions);
            return this;
        }
        public SmbSettingArgs build() {
            return new SmbSettingArgs(authenticationMethods, channelEncryption, kerberosTicketEncryption, multichannel, versions);
        }
    }
}
