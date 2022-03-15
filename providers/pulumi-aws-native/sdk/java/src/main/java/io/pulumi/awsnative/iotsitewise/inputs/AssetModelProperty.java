// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.enums.AssetModelDataType;
import io.pulumi.awsnative.iotsitewise.enums.AssetModelDataTypeSpec;
import io.pulumi.awsnative.iotsitewise.inputs.AssetModelPropertyType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about an asset model property.
 * 
 */
public final class AssetModelProperty extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelProperty Empty = new AssetModelProperty();

    /**
     * The data type of the asset model property.
     * 
     */
    @Import(name="dataType", required=true)
      private final AssetModelDataType dataType;

    public AssetModelDataType getDataType() {
        return this.dataType;
    }

    /**
     * The data type of the structure for this property.
     * 
     */
    @Import(name="dataTypeSpec")
      private final @Nullable AssetModelDataTypeSpec dataTypeSpec;

    public Optional<AssetModelDataTypeSpec> getDataTypeSpec() {
        return this.dataTypeSpec == null ? Optional.empty() : Optional.ofNullable(this.dataTypeSpec);
    }

    /**
     * Customer provided ID for property.
     * 
     */
    @Import(name="logicalId", required=true)
      private final String logicalId;

    public String getLogicalId() {
        return this.logicalId;
    }

    /**
     * The name of the asset model property.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The property type
     * 
     */
    @Import(name="type", required=true)
      private final AssetModelPropertyType type;

    public AssetModelPropertyType getType() {
        return this.type;
    }

    /**
     * The unit of the asset model property, such as Newtons or RPM.
     * 
     */
    @Import(name="unit")
      private final @Nullable String unit;

    public Optional<String> getUnit() {
        return this.unit == null ? Optional.empty() : Optional.ofNullable(this.unit);
    }

    public AssetModelProperty(
        AssetModelDataType dataType,
        @Nullable AssetModelDataTypeSpec dataTypeSpec,
        String logicalId,
        String name,
        AssetModelPropertyType type,
        @Nullable String unit) {
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.dataTypeSpec = dataTypeSpec;
        this.logicalId = Objects.requireNonNull(logicalId, "expected parameter 'logicalId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.unit = unit;
    }

    private AssetModelProperty() {
        this.dataType = null;
        this.dataTypeSpec = null;
        this.logicalId = null;
        this.name = null;
        this.type = null;
        this.unit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetModelDataType dataType;
        private @Nullable AssetModelDataTypeSpec dataTypeSpec;
        private String logicalId;
        private String name;
        private AssetModelPropertyType type;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.dataTypeSpec = defaults.dataTypeSpec;
    	      this.logicalId = defaults.logicalId;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder dataType(AssetModelDataType dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder dataTypeSpec(@Nullable AssetModelDataTypeSpec dataTypeSpec) {
            this.dataTypeSpec = dataTypeSpec;
            return this;
        }

        public Builder logicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(AssetModelPropertyType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public AssetModelProperty build() {
            return new AssetModelProperty(dataType, dataTypeSpec, logicalId, name, type, unit);
        }
    }
}
