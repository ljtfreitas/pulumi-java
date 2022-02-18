// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.m365securityandcompliance.enums.Kind;
import io.pulumi.azurenative.m365securityandcompliance.inputs.ServicesPropertiesArgs;
import io.pulumi.azurenative.m365securityandcompliance.inputs.ServicesResourceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkServicesForSCCPowershellArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServicesForSCCPowershellArgs Empty = new PrivateLinkServicesForSCCPowershellArgs();

    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<ServicesResourceIdentityArgs> identity;

    public Input<ServicesResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The kind of the service.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<Kind> kind;

    public Input<Kind> getKind() {
        return this.kind;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The common properties of a service.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<ServicesPropertiesArgs> properties;

    public Input<ServicesPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PrivateLinkServicesForSCCPowershellArgs(
        @Nullable Input<ServicesResourceIdentityArgs> identity,
        Input<Kind> kind,
        @Nullable Input<String> location,
        @Nullable Input<ServicesPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private PrivateLinkServicesForSCCPowershellArgs() {
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServicesForSCCPowershellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicesResourceIdentityArgs> identity;
        private Input<Kind> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<ServicesPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServicesForSCCPowershellArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder setIdentity(@Nullable Input<ServicesResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ServicesResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(Input<Kind> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Kind kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setProperties(@Nullable Input<ServicesPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ServicesPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
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

        public PrivateLinkServicesForSCCPowershellArgs build() {
            return new PrivateLinkServicesForSCCPowershellArgs(identity, kind, location, properties, resourceGroupName, resourceName, tags);
        }
    }
}
