// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentBindingPropertiesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentChildArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentCollectionPropertiesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentOverridesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentPropertiesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentTagsArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentVariantArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @Import(name="bindingProperties")
      private final @Nullable Output<ComponentBindingPropertiesArgs> bindingProperties;

    public Output<ComponentBindingPropertiesArgs> getBindingProperties() {
        return this.bindingProperties == null ? Output.empty() : this.bindingProperties;
    }

    @Import(name="children")
      private final @Nullable Output<List<ComponentChildArgs>> children;

    public Output<List<ComponentChildArgs>> getChildren() {
        return this.children == null ? Output.empty() : this.children;
    }

    @Import(name="collectionProperties")
      private final @Nullable Output<ComponentCollectionPropertiesArgs> collectionProperties;

    public Output<ComponentCollectionPropertiesArgs> getCollectionProperties() {
        return this.collectionProperties == null ? Output.empty() : this.collectionProperties;
    }

    @Import(name="componentType")
      private final @Nullable Output<String> componentType;

    public Output<String> getComponentType() {
        return this.componentType == null ? Output.empty() : this.componentType;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="overrides")
      private final @Nullable Output<ComponentOverridesArgs> overrides;

    public Output<ComponentOverridesArgs> getOverrides() {
        return this.overrides == null ? Output.empty() : this.overrides;
    }

    @Import(name="properties")
      private final @Nullable Output<ComponentPropertiesArgs> properties;

    public Output<ComponentPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    @Import(name="sourceId")
      private final @Nullable Output<String> sourceId;

    public Output<String> getSourceId() {
        return this.sourceId == null ? Output.empty() : this.sourceId;
    }

    @Import(name="tags")
      private final @Nullable Output<ComponentTagsArgs> tags;

    public Output<ComponentTagsArgs> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="variants")
      private final @Nullable Output<List<ComponentVariantArgs>> variants;

    public Output<List<ComponentVariantArgs>> getVariants() {
        return this.variants == null ? Output.empty() : this.variants;
    }

    public ComponentArgs(
        @Nullable Output<ComponentBindingPropertiesArgs> bindingProperties,
        @Nullable Output<List<ComponentChildArgs>> children,
        @Nullable Output<ComponentCollectionPropertiesArgs> collectionProperties,
        @Nullable Output<String> componentType,
        @Nullable Output<String> name,
        @Nullable Output<ComponentOverridesArgs> overrides,
        @Nullable Output<ComponentPropertiesArgs> properties,
        @Nullable Output<String> sourceId,
        @Nullable Output<ComponentTagsArgs> tags,
        @Nullable Output<List<ComponentVariantArgs>> variants) {
        this.bindingProperties = bindingProperties;
        this.children = children;
        this.collectionProperties = collectionProperties;
        this.componentType = componentType;
        this.name = name;
        this.overrides = overrides;
        this.properties = properties;
        this.sourceId = sourceId;
        this.tags = tags;
        this.variants = variants;
    }

    private ComponentArgs() {
        this.bindingProperties = Output.empty();
        this.children = Output.empty();
        this.collectionProperties = Output.empty();
        this.componentType = Output.empty();
        this.name = Output.empty();
        this.overrides = Output.empty();
        this.properties = Output.empty();
        this.sourceId = Output.empty();
        this.tags = Output.empty();
        this.variants = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ComponentBindingPropertiesArgs> bindingProperties;
        private @Nullable Output<List<ComponentChildArgs>> children;
        private @Nullable Output<ComponentCollectionPropertiesArgs> collectionProperties;
        private @Nullable Output<String> componentType;
        private @Nullable Output<String> name;
        private @Nullable Output<ComponentOverridesArgs> overrides;
        private @Nullable Output<ComponentPropertiesArgs> properties;
        private @Nullable Output<String> sourceId;
        private @Nullable Output<ComponentTagsArgs> tags;
        private @Nullable Output<List<ComponentVariantArgs>> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingProperties = defaults.bindingProperties;
    	      this.children = defaults.children;
    	      this.collectionProperties = defaults.collectionProperties;
    	      this.componentType = defaults.componentType;
    	      this.name = defaults.name;
    	      this.overrides = defaults.overrides;
    	      this.properties = defaults.properties;
    	      this.sourceId = defaults.sourceId;
    	      this.tags = defaults.tags;
    	      this.variants = defaults.variants;
        }

        public Builder bindingProperties(@Nullable Output<ComponentBindingPropertiesArgs> bindingProperties) {
            this.bindingProperties = bindingProperties;
            return this;
        }

        public Builder bindingProperties(@Nullable ComponentBindingPropertiesArgs bindingProperties) {
            this.bindingProperties = Output.ofNullable(bindingProperties);
            return this;
        }

        public Builder children(@Nullable Output<List<ComponentChildArgs>> children) {
            this.children = children;
            return this;
        }

        public Builder children(@Nullable List<ComponentChildArgs> children) {
            this.children = Output.ofNullable(children);
            return this;
        }

        public Builder collectionProperties(@Nullable Output<ComponentCollectionPropertiesArgs> collectionProperties) {
            this.collectionProperties = collectionProperties;
            return this;
        }

        public Builder collectionProperties(@Nullable ComponentCollectionPropertiesArgs collectionProperties) {
            this.collectionProperties = Output.ofNullable(collectionProperties);
            return this;
        }

        public Builder componentType(@Nullable Output<String> componentType) {
            this.componentType = componentType;
            return this;
        }

        public Builder componentType(@Nullable String componentType) {
            this.componentType = Output.ofNullable(componentType);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder overrides(@Nullable Output<ComponentOverridesArgs> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder overrides(@Nullable ComponentOverridesArgs overrides) {
            this.overrides = Output.ofNullable(overrides);
            return this;
        }

        public Builder properties(@Nullable Output<ComponentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable ComponentPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder sourceId(@Nullable Output<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(@Nullable String sourceId) {
            this.sourceId = Output.ofNullable(sourceId);
            return this;
        }

        public Builder tags(@Nullable Output<ComponentTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable ComponentTagsArgs tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder variants(@Nullable Output<List<ComponentVariantArgs>> variants) {
            this.variants = variants;
            return this;
        }

        public Builder variants(@Nullable List<ComponentVariantArgs> variants) {
            this.variants = Output.ofNullable(variants);
            return this;
        }
        public ComponentArgs build() {
            return new ComponentArgs(bindingProperties, children, collectionProperties, componentType, name, overrides, properties, sourceId, tags, variants);
        }
    }
}
