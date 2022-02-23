// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsFileSystemSelfManagedActiveDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsFileSystemSelfManagedActiveDirectoryArgs Empty = new WindowsFileSystemSelfManagedActiveDirectoryArgs();

    /**
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     * 
     */
    @InputImport(name="dnsIps", required=true)
    private final Input<List<String>> dnsIps;

    public Input<List<String>> getDnsIps() {
        return this.dnsIps;
    }

    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    @InputImport(name="fileSystemAdministratorsGroup")
    private final @Nullable Input<String> fileSystemAdministratorsGroup;

    public Input<String> getFileSystemAdministratorsGroup() {
        return this.fileSystemAdministratorsGroup == null ? Input.empty() : this.fileSystemAdministratorsGroup;
    }

    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    @InputImport(name="organizationalUnitDistinguishedName")
    private final @Nullable Input<String> organizationalUnitDistinguishedName;

    public Input<String> getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName == null ? Input.empty() : this.organizationalUnitDistinguishedName;
    }

    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public WindowsFileSystemSelfManagedActiveDirectoryArgs(
        Input<List<String>> dnsIps,
        Input<String> domainName,
        @Nullable Input<String> fileSystemAdministratorsGroup,
        @Nullable Input<String> organizationalUnitDistinguishedName,
        Input<String> password,
        Input<String> username) {
        this.dnsIps = Objects.requireNonNull(dnsIps, "expected parameter 'dnsIps' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private WindowsFileSystemSelfManagedActiveDirectoryArgs() {
        this.dnsIps = Input.empty();
        this.domainName = Input.empty();
        this.fileSystemAdministratorsGroup = Input.empty();
        this.organizationalUnitDistinguishedName = Input.empty();
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFileSystemSelfManagedActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> dnsIps;
        private Input<String> domainName;
        private @Nullable Input<String> fileSystemAdministratorsGroup;
        private @Nullable Input<String> organizationalUnitDistinguishedName;
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFileSystemSelfManagedActiveDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsIps = defaults.dnsIps;
    	      this.domainName = defaults.domainName;
    	      this.fileSystemAdministratorsGroup = defaults.fileSystemAdministratorsGroup;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setDnsIps(Input<List<String>> dnsIps) {
            this.dnsIps = Objects.requireNonNull(dnsIps);
            return this;
        }

        public Builder setDnsIps(List<String> dnsIps) {
            this.dnsIps = Input.of(Objects.requireNonNull(dnsIps));
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setFileSystemAdministratorsGroup(@Nullable Input<String> fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            return this;
        }

        public Builder setFileSystemAdministratorsGroup(@Nullable String fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = Input.ofNullable(fileSystemAdministratorsGroup);
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedName(@Nullable Input<String> organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = Input.ofNullable(organizationalUnitDistinguishedName);
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public WindowsFileSystemSelfManagedActiveDirectoryArgs build() {
            return new WindowsFileSystemSelfManagedActiveDirectoryArgs(dnsIps, domainName, fileSystemAdministratorsGroup, organizationalUnitDistinguishedName, password, username);
        }
    }
}
