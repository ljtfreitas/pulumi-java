// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagValueResult {
    /**
     * Creation time.
     * 
     */
    private final String createTime;
    /**
     * Optional. User-assigned description of the TagValue. Must not exceed 256 characters. Read-write.
     * 
     */
    private final String description;
    /**
     * Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagValueRequest for details.
     * 
     */
    private final String etag;
    /**
     * Immutable. Resource name for TagValue in the format `tagValues/456`.
     * 
     */
    private final String name;
    /**
     * Namespaced name of the TagValue. Must be in the format `{organization_id}/{tag_key_short_name}/{short_name}`.
     * 
     */
    private final String namespacedName;
    /**
     * Immutable. The resource name of the new TagValue's parent TagKey. Must be of the form `tagKeys/{tag_key_id}`.
     * 
     */
    private final String parent;
    /**
     * Immutable. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey. The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    private final String shortName;
    /**
     * Update time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetTagValueResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespacedName") String namespacedName,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("shortName") String shortName,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.name = name;
        this.namespacedName = namespacedName;
        this.parent = parent;
        this.shortName = shortName;
        this.updateTime = updateTime;
    }

    /**
     * Creation time.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. User-assigned description of the TagValue. Must not exceed 256 characters. Read-write.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagValueRequest for details.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Immutable. Resource name for TagValue in the format `tagValues/456`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Namespaced name of the TagValue. Must be in the format `{organization_id}/{tag_key_short_name}/{short_name}`.
     * 
    */
    public String getNamespacedName() {
        return this.namespacedName;
    }
    /**
     * Immutable. The resource name of the new TagValue's parent TagKey. Must be of the form `tagKeys/{tag_key_id}`.
     * 
    */
    public String getParent() {
        return this.parent;
    }
    /**
     * Immutable. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey. The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
    */
    public String getShortName() {
        return this.shortName;
    }
    /**
     * Update time.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String etag;
        private String name;
        private String namespacedName;
        private String parent;
        private String shortName;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.namespacedName = defaults.namespacedName;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder namespacedName(String namespacedName) {
            this.namespacedName = Objects.requireNonNull(namespacedName);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder shortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetTagValueResult build() {
            return new GetTagValueResult(createTime, description, etag, name, namespacedName, parent, shortName, updateTime);
        }
    }
}
