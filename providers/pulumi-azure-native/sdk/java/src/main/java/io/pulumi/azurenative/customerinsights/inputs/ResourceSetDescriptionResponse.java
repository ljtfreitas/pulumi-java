// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceSetDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceSetDescriptionResponse Empty = new ResourceSetDescriptionResponse();

    @InputImport(name="elements")
    private final @Nullable List<String> elements;

    public List<String> getElements() {
        return this.elements == null ? List.of() : this.elements;
    }

    @InputImport(name="exceptions")
    private final @Nullable List<String> exceptions;

    public List<String> getExceptions() {
        return this.exceptions == null ? List.of() : this.exceptions;
    }

    public ResourceSetDescriptionResponse(
        @Nullable List<String> elements,
        @Nullable List<String> exceptions) {
        this.elements = elements;
        this.exceptions = exceptions;
    }

    private ResourceSetDescriptionResponse() {
        this.elements = List.of();
        this.exceptions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> elements;
        private @Nullable List<String> exceptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elements = defaults.elements;
    	      this.exceptions = defaults.exceptions;
        }

        public Builder setElements(@Nullable List<String> elements) {
            this.elements = elements;
            return this;
        }

        public Builder setExceptions(@Nullable List<String> exceptions) {
            this.exceptions = exceptions;
            return this;
        }

        public ResourceSetDescriptionResponse build() {
            return new ResourceSetDescriptionResponse(elements, exceptions);
        }
    }
}