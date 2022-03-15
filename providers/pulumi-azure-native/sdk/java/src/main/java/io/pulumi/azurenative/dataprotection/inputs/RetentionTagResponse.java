// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Retention tag
 * 
 */
public final class RetentionTagResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetentionTagResponse Empty = new RetentionTagResponse();

    /**
     * Retention Tag version.
     * 
     */
    @Import(name="eTag", required=true)
      private final String eTag;

    public String getETag() {
        return this.eTag;
    }

    /**
     * Retention Tag version.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Retention Tag Name to relate it to retention rule.
     * 
     */
    @Import(name="tagName", required=true)
      private final String tagName;

    public String getTagName() {
        return this.tagName;
    }

    public RetentionTagResponse(
        String eTag,
        String id,
        String tagName) {
        this.eTag = Objects.requireNonNull(eTag, "expected parameter 'eTag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.tagName = Objects.requireNonNull(tagName, "expected parameter 'tagName' to be non-null");
    }

    private RetentionTagResponse() {
        this.eTag = null;
        this.id = null;
        this.tagName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eTag;
        private String id;
        private String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.tagName = defaults.tagName;
        }

        public Builder eTag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }
        public RetentionTagResponse build() {
            return new RetentionTagResponse(eTag, id, tagName);
        }
    }
}
