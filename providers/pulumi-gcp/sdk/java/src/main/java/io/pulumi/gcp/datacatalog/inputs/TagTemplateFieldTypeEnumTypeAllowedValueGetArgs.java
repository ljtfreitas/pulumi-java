// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TagTemplateFieldTypeEnumTypeAllowedValueGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeEnumTypeAllowedValueGetArgs Empty = new TagTemplateFieldTypeEnumTypeAllowedValueGetArgs();

    /**
     * The display name for this template.
     * 
     */
    @InputImport(name="displayName", required=true)
        private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    public TagTemplateFieldTypeEnumTypeAllowedValueGetArgs(Input<String> displayName) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private TagTemplateFieldTypeEnumTypeAllowedValueGetArgs() {
        this.displayName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeEnumTypeAllowedValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeEnumTypeAllowedValueGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }
        public TagTemplateFieldTypeEnumTypeAllowedValueGetArgs build() {
            return new TagTemplateFieldTypeEnumTypeAllowedValueGetArgs(displayName);
        }
    }
}
