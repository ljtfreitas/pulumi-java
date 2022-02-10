// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.FormatTypes;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorMappingFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingFormatArgs Empty = new ConnectorMappingFormatArgs();

    @InputImport(name="acceptLanguage")
    private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    @InputImport(name="arraySeparator")
    private final @Nullable Input<String> arraySeparator;

    public Input<String> getArraySeparator() {
        return this.arraySeparator == null ? Input.empty() : this.arraySeparator;
    }

    @InputImport(name="columnDelimiter")
    private final @Nullable Input<String> columnDelimiter;

    public Input<String> getColumnDelimiter() {
        return this.columnDelimiter == null ? Input.empty() : this.columnDelimiter;
    }

    @InputImport(name="formatType", required=true)
    private final Input<FormatTypes> formatType;

    public Input<FormatTypes> getFormatType() {
        return this.formatType;
    }

    @InputImport(name="quoteCharacter")
    private final @Nullable Input<String> quoteCharacter;

    public Input<String> getQuoteCharacter() {
        return this.quoteCharacter == null ? Input.empty() : this.quoteCharacter;
    }

    @InputImport(name="quoteEscapeCharacter")
    private final @Nullable Input<String> quoteEscapeCharacter;

    public Input<String> getQuoteEscapeCharacter() {
        return this.quoteEscapeCharacter == null ? Input.empty() : this.quoteEscapeCharacter;
    }

    public ConnectorMappingFormatArgs(
        @Nullable Input<String> acceptLanguage,
        @Nullable Input<String> arraySeparator,
        @Nullable Input<String> columnDelimiter,
        Input<FormatTypes> formatType,
        @Nullable Input<String> quoteCharacter,
        @Nullable Input<String> quoteEscapeCharacter) {
        this.acceptLanguage = acceptLanguage;
        this.arraySeparator = arraySeparator;
        this.columnDelimiter = columnDelimiter;
        this.formatType = Objects.requireNonNull(formatType, "expected parameter 'formatType' to be non-null");
        this.quoteCharacter = quoteCharacter;
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    private ConnectorMappingFormatArgs() {
        this.acceptLanguage = Input.empty();
        this.arraySeparator = Input.empty();
        this.columnDelimiter = Input.empty();
        this.formatType = Input.empty();
        this.quoteCharacter = Input.empty();
        this.quoteEscapeCharacter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private @Nullable Input<String> arraySeparator;
        private @Nullable Input<String> columnDelimiter;
        private Input<FormatTypes> formatType;
        private @Nullable Input<String> quoteCharacter;
        private @Nullable Input<String> quoteEscapeCharacter;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arraySeparator = defaults.arraySeparator;
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.formatType = defaults.formatType;
    	      this.quoteCharacter = defaults.quoteCharacter;
    	      this.quoteEscapeCharacter = defaults.quoteEscapeCharacter;
        }

        public Builder setAcceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder setArraySeparator(@Nullable Input<String> arraySeparator) {
            this.arraySeparator = arraySeparator;
            return this;
        }

        public Builder setArraySeparator(@Nullable String arraySeparator) {
            this.arraySeparator = Input.ofNullable(arraySeparator);
            return this;
        }

        public Builder setColumnDelimiter(@Nullable Input<String> columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }

        public Builder setColumnDelimiter(@Nullable String columnDelimiter) {
            this.columnDelimiter = Input.ofNullable(columnDelimiter);
            return this;
        }

        public Builder setFormatType(Input<FormatTypes> formatType) {
            this.formatType = Objects.requireNonNull(formatType);
            return this;
        }

        public Builder setFormatType(FormatTypes formatType) {
            this.formatType = Input.of(Objects.requireNonNull(formatType));
            return this;
        }

        public Builder setQuoteCharacter(@Nullable Input<String> quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            return this;
        }

        public Builder setQuoteCharacter(@Nullable String quoteCharacter) {
            this.quoteCharacter = Input.ofNullable(quoteCharacter);
            return this;
        }

        public Builder setQuoteEscapeCharacter(@Nullable Input<String> quoteEscapeCharacter) {
            this.quoteEscapeCharacter = quoteEscapeCharacter;
            return this;
        }

        public Builder setQuoteEscapeCharacter(@Nullable String quoteEscapeCharacter) {
            this.quoteEscapeCharacter = Input.ofNullable(quoteEscapeCharacter);
            return this;
        }

        public ConnectorMappingFormatArgs build() {
            return new ConnectorMappingFormatArgs(acceptLanguage, arraySeparator, columnDelimiter, formatType, quoteCharacter, quoteEscapeCharacter);
        }
    }
}