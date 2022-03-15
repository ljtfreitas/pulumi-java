// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.CacheActiveDirectorySettingsResponseCredentials;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Active Directory settings used to join a cache to a domain.
 * 
 */
public final class CacheActiveDirectorySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheActiveDirectorySettingsResponse Empty = new CacheActiveDirectorySettingsResponse();

    /**
     * The NetBIOS name to assign to the HPC Cache when it joins the Active Directory domain as a server. Length must 1-15 characters from the class [-0-9a-zA-Z].
     * 
     */
    @Import(name="cacheNetBiosName", required=true)
      private final String cacheNetBiosName;

    public String getCacheNetBiosName() {
        return this.cacheNetBiosName;
    }

    /**
     * Active Directory admin credentials used to join the HPC Cache to a domain.
     * 
     */
    @Import(name="credentials")
      private final @Nullable CacheActiveDirectorySettingsResponseCredentials credentials;

    public Optional<CacheActiveDirectorySettingsResponseCredentials> getCredentials() {
        return this.credentials == null ? Optional.empty() : Optional.ofNullable(this.credentials);
    }

    /**
     * True if the HPC Cache is joined to the Active Directory domain.
     * 
     */
    @Import(name="domainJoined", required=true)
      private final String domainJoined;

    public String getDomainJoined() {
        return this.domainJoined;
    }

    /**
     * The fully qualified domain name of the Active Directory domain controller.
     * 
     */
    @Import(name="domainName", required=true)
      private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The Active Directory domain's NetBIOS name.
     * 
     */
    @Import(name="domainNetBiosName", required=true)
      private final String domainNetBiosName;

    public String getDomainNetBiosName() {
        return this.domainNetBiosName;
    }

    /**
     * Primary DNS IP address used to resolve the Active Directory domain controller's fully qualified domain name.
     * 
     */
    @Import(name="primaryDnsIpAddress", required=true)
      private final String primaryDnsIpAddress;

    public String getPrimaryDnsIpAddress() {
        return this.primaryDnsIpAddress;
    }

    /**
     * Secondary DNS IP address used to resolve the Active Directory domain controller's fully qualified domain name.
     * 
     */
    @Import(name="secondaryDnsIpAddress")
      private final @Nullable String secondaryDnsIpAddress;

    public Optional<String> getSecondaryDnsIpAddress() {
        return this.secondaryDnsIpAddress == null ? Optional.empty() : Optional.ofNullable(this.secondaryDnsIpAddress);
    }

    public CacheActiveDirectorySettingsResponse(
        String cacheNetBiosName,
        @Nullable CacheActiveDirectorySettingsResponseCredentials credentials,
        String domainJoined,
        String domainName,
        String domainNetBiosName,
        String primaryDnsIpAddress,
        @Nullable String secondaryDnsIpAddress) {
        this.cacheNetBiosName = Objects.requireNonNull(cacheNetBiosName, "expected parameter 'cacheNetBiosName' to be non-null");
        this.credentials = credentials;
        this.domainJoined = Objects.requireNonNull(domainJoined, "expected parameter 'domainJoined' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainNetBiosName = Objects.requireNonNull(domainNetBiosName, "expected parameter 'domainNetBiosName' to be non-null");
        this.primaryDnsIpAddress = Objects.requireNonNull(primaryDnsIpAddress, "expected parameter 'primaryDnsIpAddress' to be non-null");
        this.secondaryDnsIpAddress = secondaryDnsIpAddress;
    }

    private CacheActiveDirectorySettingsResponse() {
        this.cacheNetBiosName = null;
        this.credentials = null;
        this.domainJoined = null;
        this.domainName = null;
        this.domainNetBiosName = null;
        this.primaryDnsIpAddress = null;
        this.secondaryDnsIpAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheActiveDirectorySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheNetBiosName;
        private @Nullable CacheActiveDirectorySettingsResponseCredentials credentials;
        private String domainJoined;
        private String domainName;
        private String domainNetBiosName;
        private String primaryDnsIpAddress;
        private @Nullable String secondaryDnsIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheActiveDirectorySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheNetBiosName = defaults.cacheNetBiosName;
    	      this.credentials = defaults.credentials;
    	      this.domainJoined = defaults.domainJoined;
    	      this.domainName = defaults.domainName;
    	      this.domainNetBiosName = defaults.domainNetBiosName;
    	      this.primaryDnsIpAddress = defaults.primaryDnsIpAddress;
    	      this.secondaryDnsIpAddress = defaults.secondaryDnsIpAddress;
        }

        public Builder cacheNetBiosName(String cacheNetBiosName) {
            this.cacheNetBiosName = Objects.requireNonNull(cacheNetBiosName);
            return this;
        }

        public Builder credentials(@Nullable CacheActiveDirectorySettingsResponseCredentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder domainJoined(String domainJoined) {
            this.domainJoined = Objects.requireNonNull(domainJoined);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainNetBiosName(String domainNetBiosName) {
            this.domainNetBiosName = Objects.requireNonNull(domainNetBiosName);
            return this;
        }

        public Builder primaryDnsIpAddress(String primaryDnsIpAddress) {
            this.primaryDnsIpAddress = Objects.requireNonNull(primaryDnsIpAddress);
            return this;
        }

        public Builder secondaryDnsIpAddress(@Nullable String secondaryDnsIpAddress) {
            this.secondaryDnsIpAddress = secondaryDnsIpAddress;
            return this;
        }
        public CacheActiveDirectorySettingsResponse build() {
            return new CacheActiveDirectorySettingsResponse(cacheNetBiosName, credentials, domainJoined, domainName, domainNetBiosName, primaryDnsIpAddress, secondaryDnsIpAddress);
        }
    }
}
