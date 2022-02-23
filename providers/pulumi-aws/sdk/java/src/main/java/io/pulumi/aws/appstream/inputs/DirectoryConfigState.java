// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryConfigState extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryConfigState Empty = new DirectoryConfigState();

    /**
     * Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * Fully qualified name of the directory.
     * 
     */
    @InputImport(name="directoryName")
    private final @Nullable Input<String> directoryName;

    public Input<String> getDirectoryName() {
        return this.directoryName == null ? Input.empty() : this.directoryName;
    }

    /**
     * Distinguished names of the organizational units for computer accounts.
     * 
     */
    @InputImport(name="organizationalUnitDistinguishedNames")
    private final @Nullable Input<List<String>> organizationalUnitDistinguishedNames;

    public Input<List<String>> getOrganizationalUnitDistinguishedNames() {
        return this.organizationalUnitDistinguishedNames == null ? Input.empty() : this.organizationalUnitDistinguishedNames;
    }

    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    @InputImport(name="serviceAccountCredentials")
    private final @Nullable Input<DirectoryConfigServiceAccountCredentialsGetArgs> serviceAccountCredentials;

    public Input<DirectoryConfigServiceAccountCredentialsGetArgs> getServiceAccountCredentials() {
        return this.serviceAccountCredentials == null ? Input.empty() : this.serviceAccountCredentials;
    }

    public DirectoryConfigState(
        @Nullable Input<String> createdTime,
        @Nullable Input<String> directoryName,
        @Nullable Input<List<String>> organizationalUnitDistinguishedNames,
        @Nullable Input<DirectoryConfigServiceAccountCredentialsGetArgs> serviceAccountCredentials) {
        this.createdTime = createdTime;
        this.directoryName = directoryName;
        this.organizationalUnitDistinguishedNames = organizationalUnitDistinguishedNames;
        this.serviceAccountCredentials = serviceAccountCredentials;
    }

    private DirectoryConfigState() {
        this.createdTime = Input.empty();
        this.directoryName = Input.empty();
        this.organizationalUnitDistinguishedNames = Input.empty();
        this.serviceAccountCredentials = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createdTime;
        private @Nullable Input<String> directoryName;
        private @Nullable Input<List<String>> organizationalUnitDistinguishedNames;
        private @Nullable Input<DirectoryConfigServiceAccountCredentialsGetArgs> serviceAccountCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.directoryName = defaults.directoryName;
    	      this.organizationalUnitDistinguishedNames = defaults.organizationalUnitDistinguishedNames;
    	      this.serviceAccountCredentials = defaults.serviceAccountCredentials;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setDirectoryName(@Nullable Input<String> directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public Builder setDirectoryName(@Nullable String directoryName) {
            this.directoryName = Input.ofNullable(directoryName);
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedNames(@Nullable Input<List<String>> organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames = organizationalUnitDistinguishedNames;
            return this;
        }

        public Builder setOrganizationalUnitDistinguishedNames(@Nullable List<String> organizationalUnitDistinguishedNames) {
            this.organizationalUnitDistinguishedNames = Input.ofNullable(organizationalUnitDistinguishedNames);
            return this;
        }

        public Builder setServiceAccountCredentials(@Nullable Input<DirectoryConfigServiceAccountCredentialsGetArgs> serviceAccountCredentials) {
            this.serviceAccountCredentials = serviceAccountCredentials;
            return this;
        }

        public Builder setServiceAccountCredentials(@Nullable DirectoryConfigServiceAccountCredentialsGetArgs serviceAccountCredentials) {
            this.serviceAccountCredentials = Input.ofNullable(serviceAccountCredentials);
            return this;
        }
        public DirectoryConfigState build() {
            return new DirectoryConfigState(createdTime, directoryName, organizationalUnitDistinguishedNames, serviceAccountCredentials);
        }
    }
}