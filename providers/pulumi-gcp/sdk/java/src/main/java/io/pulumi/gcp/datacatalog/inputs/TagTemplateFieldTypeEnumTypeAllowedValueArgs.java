// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TagTemplateFieldTypeEnumTypeAllowedValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeEnumTypeAllowedValueArgs Empty = new TagTemplateFieldTypeEnumTypeAllowedValueArgs();

    /**
     * The display name for this template.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    public TagTemplateFieldTypeEnumTypeAllowedValueArgs(Output<String> displayName) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private TagTemplateFieldTypeEnumTypeAllowedValueArgs() {
        this.displayName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeEnumTypeAllowedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeEnumTypeAllowedValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }        public TagTemplateFieldTypeEnumTypeAllowedValueArgs build() {
            return new TagTemplateFieldTypeEnumTypeAllowedValueArgs(displayName);
        }
    }
}
