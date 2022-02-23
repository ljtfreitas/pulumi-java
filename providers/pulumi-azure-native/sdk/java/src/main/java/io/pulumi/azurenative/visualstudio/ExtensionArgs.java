// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio;

import io.pulumi.azurenative.visualstudio.inputs.ExtensionResourcePlanArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * The name of the Visual Studio Team Services account resource.
     * 
     */
    @InputImport(name="accountResourceName", required=true)
        private final Input<String> accountResourceName;

    public Input<String> getAccountResourceName() {
        return this.accountResourceName;
    }

    /**
     * The name of the extension.
     * 
     */
    @InputImport(name="extensionResourceName")
        private final @Nullable Input<String> extensionResourceName;

    public Input<String> getExtensionResourceName() {
        return this.extensionResourceName == null ? Input.empty() : this.extensionResourceName;
    }

    /**
     * The Azure region of the Visual Studio account associated with this request (i.e 'southcentralus'.)
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Extended information about the plan being purchased for this extension resource.
     * 
     */
    @InputImport(name="plan")
        private final @Nullable Input<ExtensionResourcePlanArgs> plan;

    public Input<ExtensionResourcePlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    /**
     * A dictionary of extended properties. This property is currently unused.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A dictionary of user-defined tags to be stored with the extension resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ExtensionArgs(
        Input<String> accountResourceName,
        @Nullable Input<String> extensionResourceName,
        @Nullable Input<String> location,
        @Nullable Input<ExtensionResourcePlanArgs> plan,
        @Nullable Input<Map<String,String>> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.accountResourceName = Objects.requireNonNull(accountResourceName, "expected parameter 'accountResourceName' to be non-null");
        this.extensionResourceName = extensionResourceName;
        this.location = location;
        this.plan = plan;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ExtensionArgs() {
        this.accountResourceName = Input.empty();
        this.extensionResourceName = Input.empty();
        this.location = Input.empty();
        this.plan = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountResourceName;
        private @Nullable Input<String> extensionResourceName;
        private @Nullable Input<String> location;
        private @Nullable Input<ExtensionResourcePlanArgs> plan;
        private @Nullable Input<Map<String,String>> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountResourceName = defaults.accountResourceName;
    	      this.extensionResourceName = defaults.extensionResourceName;
    	      this.location = defaults.location;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAccountResourceName(Input<String> accountResourceName) {
            this.accountResourceName = Objects.requireNonNull(accountResourceName);
            return this;
        }

        public Builder setAccountResourceName(String accountResourceName) {
            this.accountResourceName = Input.of(Objects.requireNonNull(accountResourceName));
            return this;
        }

        public Builder setExtensionResourceName(@Nullable Input<String> extensionResourceName) {
            this.extensionResourceName = extensionResourceName;
            return this;
        }

        public Builder setExtensionResourceName(@Nullable String extensionResourceName) {
            this.extensionResourceName = Input.ofNullable(extensionResourceName);
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

        public Builder setPlan(@Nullable Input<ExtensionResourcePlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable ExtensionResourcePlanArgs plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ExtensionArgs build() {
            return new ExtensionArgs(accountResourceName, extensionResourceName, location, plan, properties, resourceGroupName, tags);
        }
    }
}
