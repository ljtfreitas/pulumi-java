// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DirectoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryConfigArgs Empty = new DirectoryConfigArgs();

    /**
     * Fully qualified name of the directory.
     * 
     */
    @InputImport(name="directoryName", required=true)
    private final Input<String> directoryName;

    public Input<String> getDirectoryName() {
        return this.directoryName;
    }

    /**
     * Distinguished names of the organizational units for computer accounts.
     * 
     */
    @InputImport(name="organizationalUnitDistinguishedNames", required=true)
    private final Input<List<String>> organizationalUnitDistinguishedNames;

    public Input<List<String>> getOrganizationalUnitDistinguishedNames() {
        return this.organizationalUnitDistinguishedNames;
    }

    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    @InputImport(name="serviceAccountCredentials", required=true)
    private final Input<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials;

    public Input<DirectoryConfigServiceAccountCredentialsArgs> getServiceAccountCredentials() {
        return this.serviceAccountCredentials;
    }

    public DirectoryConfigArgs(
        Input<String> directoryName,
        Input<List<String>> organizationalUnitDistinguishedNames,
        Input<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials) {
        this.directoryName = Objects.requireNonNull(directoryName, "expected parameter 'directoryName' to be non-null");
        this.organizationalUnitDistinguishedNames = Objects.requireNonNull(organizationalUnitDistinguishedNames, "expected parameter 'organizationalUnitDistinguishedNames' to be non-null");
        this.serviceAccountCredentials = Objects.requireNonNull(serviceAccountCredentials, "expected parameter 'serviceAccountCredentials' to be non-null");
    }

    private DirectoryConfigArgs() {
        this.directoryName = Input.empty();
        this.organizationalUnitDistinguishedNames = Input.empty();
        this.serviceAccountCredentials = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> directoryName;
        private Input<List<String>> organizationalUnitDistinguishedNames;
        private Input<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.organizationalUnitDistinguishedNames = defaults.organizationalUnitDistinguishedNames;
    	      this.serviceAccountCredentials = defaults.serviceAccountCredentials;
        }

        public Builder setDirectoryName(Input<String> directoryName) {
            this.directoryName = Objects.requireNonNull(directoryName);
            return this;
        }

        public Builder setDirectoryName(String directoryName) {
            this.directoryName = Input.of(Objects.requireNonNull(directoryName));
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedNames(Input<List<String>> organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames = Objects.requireNonNull(organizationalUnitDistinguishedNames);
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedNames(List<String> organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames = Input.of(Objects.requireNonNull(organizationalUnitDistinguishedNames));
            return this;
        }

        public Builder setServiceAccountCredentials(Input<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials) {
            this.serviceAccountCredentials = Objects.requireNonNull(serviceAccountCredentials);
            return this;
        }

        public Builder setServiceAccountCredentials(DirectoryConfigServiceAccountCredentialsArgs serviceAccountCredentials) {
            this.serviceAccountCredentials = Input.of(Objects.requireNonNull(serviceAccountCredentials));
            return this;
        }
        public DirectoryConfigArgs build() {
            return new DirectoryConfigArgs(directoryName, organizationalUnitDistinguishedNames, serviceAccountCredentials);
        }
    }
}