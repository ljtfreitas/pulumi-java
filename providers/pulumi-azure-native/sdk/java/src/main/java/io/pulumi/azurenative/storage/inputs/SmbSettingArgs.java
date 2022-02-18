// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.MultichannelArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="authenticationMethods")
    private final @Nullable Input<String> authenticationMethods;

    public Input<String> getAuthenticationMethods() {
        return this.authenticationMethods == null ? Input.empty() : this.authenticationMethods;
    }

    /**
     * SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter ';'.
     * 
     */
    @InputImport(name="channelEncryption")
    private final @Nullable Input<String> channelEncryption;

    public Input<String> getChannelEncryption() {
        return this.channelEncryption == null ? Input.empty() : this.channelEncryption;
    }

    /**
     * Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string with delimiter ';'
     * 
     */
    @InputImport(name="kerberosTicketEncryption")
    private final @Nullable Input<String> kerberosTicketEncryption;

    public Input<String> getKerberosTicketEncryption() {
        return this.kerberosTicketEncryption == null ? Input.empty() : this.kerberosTicketEncryption;
    }

    /**
     * Multichannel setting. Applies to Premium FileStorage only.
     * 
     */
    @InputImport(name="multichannel")
    private final @Nullable Input<MultichannelArgs> multichannel;

    public Input<MultichannelArgs> getMultichannel() {
        return this.multichannel == null ? Input.empty() : this.multichannel;
    }

    /**
     * SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a string with delimiter ';'.
     * 
     */
    @InputImport(name="versions")
    private final @Nullable Input<String> versions;

    public Input<String> getVersions() {
        return this.versions == null ? Input.empty() : this.versions;
    }

    public SmbSettingArgs(
        @Nullable Input<String> authenticationMethods,
        @Nullable Input<String> channelEncryption,
        @Nullable Input<String> kerberosTicketEncryption,
        @Nullable Input<MultichannelArgs> multichannel,
        @Nullable Input<String> versions) {
        this.authenticationMethods = authenticationMethods;
        this.channelEncryption = channelEncryption;
        this.kerberosTicketEncryption = kerberosTicketEncryption;
        this.multichannel = multichannel;
        this.versions = versions;
    }

    private SmbSettingArgs() {
        this.authenticationMethods = Input.empty();
        this.channelEncryption = Input.empty();
        this.kerberosTicketEncryption = Input.empty();
        this.multichannel = Input.empty();
        this.versions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmbSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authenticationMethods;
        private @Nullable Input<String> channelEncryption;
        private @Nullable Input<String> kerberosTicketEncryption;
        private @Nullable Input<MultichannelArgs> multichannel;
        private @Nullable Input<String> versions;

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

        public Builder setAuthenticationMethods(@Nullable Input<String> authenticationMethods) {
            this.authenticationMethods = authenticationMethods;
            return this;
        }

        public Builder setAuthenticationMethods(@Nullable String authenticationMethods) {
            this.authenticationMethods = Input.ofNullable(authenticationMethods);
            return this;
        }

        public Builder setChannelEncryption(@Nullable Input<String> channelEncryption) {
            this.channelEncryption = channelEncryption;
            return this;
        }

        public Builder setChannelEncryption(@Nullable String channelEncryption) {
            this.channelEncryption = Input.ofNullable(channelEncryption);
            return this;
        }

        public Builder setKerberosTicketEncryption(@Nullable Input<String> kerberosTicketEncryption) {
            this.kerberosTicketEncryption = kerberosTicketEncryption;
            return this;
        }

        public Builder setKerberosTicketEncryption(@Nullable String kerberosTicketEncryption) {
            this.kerberosTicketEncryption = Input.ofNullable(kerberosTicketEncryption);
            return this;
        }

        public Builder setMultichannel(@Nullable Input<MultichannelArgs> multichannel) {
            this.multichannel = multichannel;
            return this;
        }

        public Builder setMultichannel(@Nullable MultichannelArgs multichannel) {
            this.multichannel = Input.ofNullable(multichannel);
            return this;
        }

        public Builder setVersions(@Nullable Input<String> versions) {
            this.versions = versions;
            return this;
        }

        public Builder setVersions(@Nullable String versions) {
            this.versions = Input.ofNullable(versions);
            return this;
        }

        public SmbSettingArgs build() {
            return new SmbSettingArgs(authenticationMethods, channelEncryption, kerberosTicketEncryption, multichannel, versions);
        }
    }
}
