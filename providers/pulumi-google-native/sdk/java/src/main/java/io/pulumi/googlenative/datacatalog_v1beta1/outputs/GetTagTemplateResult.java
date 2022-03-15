// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTagTemplateResult {
    /**
     * The display name for this template. Defaults to an empty string.
     * 
     */
    private final String displayName;
    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. This map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9) and underscores (_). Field IDs must be at least 1 character long and at most 64 characters long. Field IDs must start with a letter or underscore.
     * 
     */
    private final Map<String,String> fields;
    /**
     * The resource name of the tag template in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} Note that this TagTemplate and its child resources may not actually be stored in the location in this name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetTagTemplateResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fields") Map<String,String> fields,
        @CustomType.Parameter("name") String name) {
        this.displayName = displayName;
        this.fields = fields;
        this.name = name;
    }

    /**
     * The display name for this template. Defaults to an empty string.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. This map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9) and underscores (_). Field IDs must be at least 1 character long and at most 64 characters long. Field IDs must start with a letter or underscore.
     * 
    */
    public Map<String,String> getFields() {
        return this.fields;
    }
    /**
     * The resource name of the tag template in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} Note that this TagTemplate and its child resources may not actually be stored in the location in this name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Map<String,String> fields;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder fields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetTagTemplateResult build() {
            return new GetTagTemplateResult(displayName, fields, name);
        }
    }
}
