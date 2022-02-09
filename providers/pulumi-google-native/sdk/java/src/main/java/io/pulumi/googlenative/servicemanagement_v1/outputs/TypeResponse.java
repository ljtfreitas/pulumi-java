// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.FieldResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TypeResponse {
    private final List<FieldResponse> fields;
    private final String name;
    private final List<String> oneofs;
    private final List<OptionResponse> options;
    private final SourceContextResponse sourceContext;
    private final String syntax;

    @OutputCustomType.Constructor({"fields","name","oneofs","options","sourceContext","syntax"})
    private TypeResponse(
        List<FieldResponse> fields,
        String name,
        List<String> oneofs,
        List<OptionResponse> options,
        SourceContextResponse sourceContext,
        String syntax) {
        this.fields = Objects.requireNonNull(fields);
        this.name = Objects.requireNonNull(name);
        this.oneofs = Objects.requireNonNull(oneofs);
        this.options = Objects.requireNonNull(options);
        this.sourceContext = Objects.requireNonNull(sourceContext);
        this.syntax = Objects.requireNonNull(syntax);
    }

    public List<FieldResponse> getFields() {
        return this.fields;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getOneofs() {
        return this.oneofs;
    }
    public List<OptionResponse> getOptions() {
        return this.options;
    }
    public SourceContextResponse getSourceContext() {
        return this.sourceContext;
    }
    public String getSyntax() {
        return this.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FieldResponse> fields;
        private String name;
        private List<String> oneofs;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.oneofs = defaults.oneofs;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder setFields(List<FieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOneofs(List<String> oneofs) {
            this.oneofs = Objects.requireNonNull(oneofs);
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

        public TypeResponse build() {
            return new TypeResponse(fields, name, oneofs, options, sourceContext, syntax);
        }
    }
}