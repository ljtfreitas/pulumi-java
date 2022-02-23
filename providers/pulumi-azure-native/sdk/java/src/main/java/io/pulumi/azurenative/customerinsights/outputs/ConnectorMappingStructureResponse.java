// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorMappingStructureResponse {
    /**
     * The column name of the import file.
     * 
     */
    private final String columnName;
    /**
     * Custom format specifier for input parsing.
     * 
     */
    private final @Nullable String customFormatSpecifier;
    /**
     * Indicates if the column is encrypted.
     * 
     */
    private final @Nullable Boolean isEncrypted;
    /**
     * The property name of the mapping entity.
     * 
     */
    private final String propertyName;

    @OutputCustomType.Constructor({"columnName","customFormatSpecifier","isEncrypted","propertyName"})
    private ConnectorMappingStructureResponse(
        String columnName,
        @Nullable String customFormatSpecifier,
        @Nullable Boolean isEncrypted,
        String propertyName) {
        this.columnName = Objects.requireNonNull(columnName);
        this.customFormatSpecifier = customFormatSpecifier;
        this.isEncrypted = isEncrypted;
        this.propertyName = Objects.requireNonNull(propertyName);
    }

    /**
     * The column name of the import file.
     * 
     */
    public String getColumnName() {
        return this.columnName;
    }
    /**
     * Custom format specifier for input parsing.
     * 
     */
    public Optional<String> getCustomFormatSpecifier() {
        return Optional.ofNullable(this.customFormatSpecifier);
    }
    /**
     * Indicates if the column is encrypted.
     * 
     */
    public Optional<Boolean> getIsEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }
    /**
     * The property name of the mapping entity.
     * 
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingStructureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private @Nullable String customFormatSpecifier;
        private @Nullable Boolean isEncrypted;
        private String propertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingStructureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.customFormatSpecifier = defaults.customFormatSpecifier;
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.propertyName = defaults.propertyName;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setCustomFormatSpecifier(@Nullable String customFormatSpecifier) {
            this.customFormatSpecifier = customFormatSpecifier;
            return this;
        }

        public Builder setIsEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }

        public Builder setPropertyName(String propertyName) {
            this.propertyName = Objects.requireNonNull(propertyName);
            return this;
        }
        public ConnectorMappingStructureResponse build() {
            return new ConnectorMappingStructureResponse(columnName, customFormatSpecifier, isEncrypted, propertyName);
        }
    }
}
