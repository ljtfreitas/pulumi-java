// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.VICredentialArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VCenterArgs extends io.pulumi.resources.ResourceArgs {

    public static final VCenterArgs Empty = new VCenterArgs();

    /**
     * Username / Password Credentials to connect to vcenter.
     * 
     */
    @InputImport(name="credentials")
        private final @Nullable Input<VICredentialArgs> credentials;

    public Input<VICredentialArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * Gets or sets the extended location.
     * 
     */
    @InputImport(name="extendedLocation")
        private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * Gets or sets the FQDN/IPAddress of the vCenter.
     * 
     */
    @InputImport(name="fqdn", required=true)
        private final Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Gets or sets the location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Gets or sets the port of the vCenter.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Name of the vCenter.
     * 
     */
    @InputImport(name="vcenterName")
        private final @Nullable Input<String> vcenterName;

    public Input<String> getVcenterName() {
        return this.vcenterName == null ? Input.empty() : this.vcenterName;
    }

    public VCenterArgs(
        @Nullable Input<VICredentialArgs> credentials,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        Input<String> fqdn,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<Integer> port,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vcenterName) {
        this.credentials = credentials;
        this.extendedLocation = extendedLocation;
        this.fqdn = Objects.requireNonNull(fqdn, "expected parameter 'fqdn' to be non-null");
        this.kind = kind;
        this.location = location;
        this.port = port;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vcenterName = vcenterName;
    }

    private VCenterArgs() {
        this.credentials = Input.empty();
        this.extendedLocation = Input.empty();
        this.fqdn = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.port = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vcenterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VICredentialArgs> credentials;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private Input<String> fqdn;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> port;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vcenterName;

        public Builder() {
    	      // Empty
        }

        public Builder(VCenterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdn = defaults.fqdn;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.port = defaults.port;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vcenterName = defaults.vcenterName;
        }

        public Builder setCredentials(@Nullable Input<VICredentialArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable VICredentialArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setFqdn(Input<String> fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Input.of(Objects.requireNonNull(fqdn));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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

        public Builder setVcenterName(@Nullable Input<String> vcenterName) {
            this.vcenterName = vcenterName;
            return this;
        }

        public Builder setVcenterName(@Nullable String vcenterName) {
            this.vcenterName = Input.ofNullable(vcenterName);
            return this;
        }
        public VCenterArgs build() {
            return new VCenterArgs(credentials, extendedLocation, fqdn, kind, location, port, resourceGroupName, tags, vcenterName);
        }
    }
}
