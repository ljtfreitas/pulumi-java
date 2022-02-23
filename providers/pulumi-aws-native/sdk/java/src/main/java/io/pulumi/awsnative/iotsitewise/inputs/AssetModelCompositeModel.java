// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelProperty;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a composite model definition in an asset model. This composite model definition is applied to all assets created from the asset model.
 * 
 */
public final class AssetModelCompositeModel extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelCompositeModel Empty = new AssetModelCompositeModel();

    /**
     * The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    @InputImport(name="compositeModelProperties")
        private final @Nullable List<AssetModelProperty> compositeModelProperties;

    public List<AssetModelProperty> getCompositeModelProperties() {
        return this.compositeModelProperties == null ? List.of() : this.compositeModelProperties;
    }

    /**
     * A description for the asset composite model.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A unique, friendly name for the asset composite model.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public AssetModelCompositeModel(
        @Nullable List<AssetModelProperty> compositeModelProperties,
        @Nullable String description,
        String name,
        String type) {
        this.compositeModelProperties = compositeModelProperties;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssetModelCompositeModel() {
        this.compositeModelProperties = List.of();
        this.description = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelCompositeModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AssetModelProperty> compositeModelProperties;
        private @Nullable String description;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelCompositeModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeModelProperties = defaults.compositeModelProperties;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCompositeModelProperties(@Nullable List<AssetModelProperty> compositeModelProperties) {
            this.compositeModelProperties = compositeModelProperties;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AssetModelCompositeModel build() {
            return new AssetModelCompositeModel(compositeModelProperties, description, name, type);
        }
    }
}
