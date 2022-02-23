// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.EnumValueResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Enum type definition.
 * 
 */
public final class EnumResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnumResponse Empty = new EnumResponse();

    /**
     * Enum value definitions.
     * 
     */
    @InputImport(name="enumvalue", required=true)
      private final List<EnumValueResponse> enumvalue;

    public List<EnumValueResponse> getEnumvalue() {
        return this.enumvalue;
    }

    /**
     * Enum type name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Protocol buffer options.
     * 
     */
    @InputImport(name="options", required=true)
      private final List<OptionResponse> options;

    public List<OptionResponse> getOptions() {
        return this.options;
    }

    /**
     * The source context.
     * 
     */
    @InputImport(name="sourceContext", required=true)
      private final SourceContextResponse sourceContext;

    public SourceContextResponse getSourceContext() {
        return this.sourceContext;
    }

    /**
     * The source syntax.
     * 
     */
    @InputImport(name="syntax", required=true)
      private final String syntax;

    public String getSyntax() {
        return this.syntax;
    }

    public EnumResponse(
        List<EnumValueResponse> enumvalue,
        String name,
        List<OptionResponse> options,
        SourceContextResponse sourceContext,
        String syntax) {
        this.enumvalue = Objects.requireNonNull(enumvalue, "expected parameter 'enumvalue' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.sourceContext = Objects.requireNonNull(sourceContext, "expected parameter 'sourceContext' to be non-null");
        this.syntax = Objects.requireNonNull(syntax, "expected parameter 'syntax' to be non-null");
    }

    private EnumResponse() {
        this.enumvalue = List.of();
        this.name = null;
        this.options = List.of();
        this.sourceContext = null;
        this.syntax = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnumResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EnumValueResponse> enumvalue;
        private String name;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(EnumResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumvalue = defaults.enumvalue;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder setEnumvalue(List<EnumValueResponse> enumvalue) {
            this.enumvalue = Objects.requireNonNull(enumvalue);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setSourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }

        public Builder setSyntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }
        public EnumResponse build() {
            return new EnumResponse(enumvalue, name, options, sourceContext, syntax);
        }
    }
}
