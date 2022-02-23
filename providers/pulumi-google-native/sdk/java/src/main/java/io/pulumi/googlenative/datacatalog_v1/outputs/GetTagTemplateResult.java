// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTagTemplateResult {
    /**
     * Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum length is 200 characters.
     * 
     */
    private final String displayName;
    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
     * 
     */
    private final Map<String,String> fields;
    /**
     * Indicates whether this is a public tag template. Every user has view access to a *public* tag template by default. This means that: * Every user can use this tag template to tag an entry. * If an entry is tagged using the tag template, the tag is always shown in the response to ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you need view access either on the project or the organization the tag template resides in but no other permission is needed. * Operations on the tag template other than viewing (for example, editing IAM policies) follow standard IAM structures. Tags created with a public tag template are referred to as public tags. You can search for a public tag by value with a simple search query instead of using a ``tag:`` predicate. Public tag templates may not appear in search results depending on scope, see: include_public_tag_templates Note: If an [IAM domain restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-domains) is configured in the tag template's location, the public access will not be enabled but the simple search for tag values will still work.
     * 
     */
    private final Boolean isPubliclyReadable;
    /**
     * The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"displayName","fields","isPubliclyReadable","name"})
    private GetTagTemplateResult(
        String displayName,
        Map<String,String> fields,
        Boolean isPubliclyReadable,
        String name) {
        this.displayName = Objects.requireNonNull(displayName);
        this.fields = Objects.requireNonNull(fields);
        this.isPubliclyReadable = Objects.requireNonNull(isPubliclyReadable);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum length is 200 characters.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
     * 
     */
    public Map<String,String> getFields() {
        return this.fields;
    }
    /**
     * Indicates whether this is a public tag template. Every user has view access to a *public* tag template by default. This means that: * Every user can use this tag template to tag an entry. * If an entry is tagged using the tag template, the tag is always shown in the response to ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you need view access either on the project or the organization the tag template resides in but no other permission is needed. * Operations on the tag template other than viewing (for example, editing IAM policies) follow standard IAM structures. Tags created with a public tag template are referred to as public tags. You can search for a public tag by value with a simple search query instead of using a ``tag:`` predicate. Public tag templates may not appear in search results depending on scope, see: include_public_tag_templates Note: If an [IAM domain restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-domains) is configured in the tag template's location, the public access will not be enabled but the simple search for tag values will still work.
     * 
     */
    public Boolean getIsPubliclyReadable() {
        return this.isPubliclyReadable;
    }
    /**
     * The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
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
        private Boolean isPubliclyReadable;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.isPubliclyReadable = defaults.isPubliclyReadable;
    	      this.name = defaults.name;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setIsPubliclyReadable(Boolean isPubliclyReadable) {
            this.isPubliclyReadable = Objects.requireNonNull(isPubliclyReadable);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetTagTemplateResult build() {
            return new GetTagTemplateResult(displayName, fields, isPubliclyReadable, name);
        }
    }
}
