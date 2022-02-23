// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ConfigurationArgs;
import io.pulumi.azurenative.web.inputs.TemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerAppArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerAppArgs Empty = new ContainerAppArgs();

    /**
     * Non versioned Container App configuration properties.
     * 
     */
    @InputImport(name="configuration")
        private final @Nullable Input<ConfigurationArgs> configuration;

    public Input<ConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Resource ID of the Container App's KubeEnvironment.
     * 
     */
    @InputImport(name="kubeEnvironmentId")
        private final @Nullable Input<String> kubeEnvironmentId;

    public Input<String> getKubeEnvironmentId() {
        return this.kubeEnvironmentId == null ? Input.empty() : this.kubeEnvironmentId;
    }

    /**
     * Resource Location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the Container App.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Container App versioned application definition.
     * 
     */
    @InputImport(name="template")
        private final @Nullable Input<TemplateArgs> template;

    public Input<TemplateArgs> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    public ContainerAppArgs(
        @Nullable Input<ConfigurationArgs> configuration,
        @Nullable Input<String> kind,
        @Nullable Input<String> kubeEnvironmentId,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<TemplateArgs> template) {
        this.configuration = configuration;
        this.kind = kind;
        this.kubeEnvironmentId = kubeEnvironmentId;
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.template = template;
    }

    private ContainerAppArgs() {
        this.configuration = Input.empty();
        this.kind = Input.empty();
        this.kubeEnvironmentId = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigurationArgs> configuration;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> kubeEnvironmentId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<TemplateArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.kind = defaults.kind;
    	      this.kubeEnvironmentId = defaults.kubeEnvironmentId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.template = defaults.template;
        }

        public Builder setConfiguration(@Nullable Input<ConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setConfiguration(@Nullable ConfigurationArgs configuration) {
            this.configuration = Input.ofNullable(configuration);
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

        public Builder setKubeEnvironmentId(@Nullable Input<String> kubeEnvironmentId) {
            this.kubeEnvironmentId = kubeEnvironmentId;
            return this;
        }

        public Builder setKubeEnvironmentId(@Nullable String kubeEnvironmentId) {
            this.kubeEnvironmentId = Input.ofNullable(kubeEnvironmentId);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setTemplate(@Nullable Input<TemplateArgs> template) {
            this.template = template;
            return this;
        }

        public Builder setTemplate(@Nullable TemplateArgs template) {
            this.template = Input.ofNullable(template);
            return this;
        }
        public ContainerAppArgs build() {
            return new ContainerAppArgs(configuration, kind, kubeEnvironmentId, location, name, resourceGroupName, tags, template);
        }
    }
}
